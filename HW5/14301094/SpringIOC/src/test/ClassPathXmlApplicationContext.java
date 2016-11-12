package test;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

@SuppressWarnings("unchecked")
public class ClassPathXmlApplicationContext implements ApplicationContext {

	Element root;
	Map<String, Bean> unInitbeans = new HashMap<>();
	Map<String, Object> initBeans = new HashMap<>();

	public ClassPathXmlApplicationContext(String xmlFile) throws Exception {

		// TODO Auto-generated constructor stub
		SAXReader reader = new SAXReader();
		File file = new File("src/" + xmlFile);
		Document document = reader.read(file);
		root = document.getRootElement();
		parseXML();
		scanCompent();
		tryToInitBean();
	}

	private void parseXML() {
		List<Element> childElements = root.elements();
		for (Element childElement : childElements) {
			Bean bean = new Bean();
			for (Attribute a : (List<Attribute>) childElement.attributes()) {
				if ("id".equals(a.getName())) {
					bean.setId(a.getValue());
				} else if ("class".equals(a.getName())) {
					bean.setClassName(a.getValue());
				}
			}
			List<Property> properties = new ArrayList<>();
			for (Element e : (List<Element>) childElement.elements()) {
				Property property = new Property();
				for (Attribute a : (List<Attribute>) e.attributes()) {
					if ("name".equals(a.getName())) {
						property.setName(a.getValue());
					} else if ("ref".equals(a.getName())) {
						property.setRef(a.getValue());
					} else if ("value".equals(a.getName())) {
						property.setValue(a.getValue());
					}

				}
				properties.add(property);
			}
			bean.setProperties(properties);
			unInitbeans.put(bean.getId(), bean);
		}
	}

	private void scanCompent() throws Exception {
		File basePackge = new File("src");
		ScanDir(basePackge);
	}

	private void ScanDir(File dir) throws Exception {
		if (dir.isDirectory()) {
			File[] files = dir.listFiles();
			for (File file : files) {
				if (file.getName().endsWith(".java")) {
					String classname = file.getPath().substring(4, file.getPath().length() - 5).replaceAll("\\\\", ".");
					Class c = Class.forName(classname);
					if (c.isAnnotationPresent(Component.class)) {
						Component com = (Component) c.getAnnotation(Component.class);
						// 假定所有被@Component备注的类都能被实例化
						if (com.value().equals("")) {
							// 若未指定bean名则默认使用bean类型的全限定名称
							initBeans.put(c.getName(), c.newInstance());
						} else {
							initBeans.put(com.value(), c.newInstance());
						}
					}
				} else if (file.isDirectory()) {
					ScanDir(file);
				}
			}
		}
	}

	private void tryToInitBean() throws Exception {

		while (!unInitbeans.isEmpty()) {
			for (Bean id : unInitbeans.values()) {
				boolean flag = true;
				for (Property p : unInitbeans.get(id.getId()).getProperties()) {
					if (p.getRef() == null) {

					} else if (initBeans.get(p.getRef()) == null) {
						flag = false;
					}
				}
				if (flag == true) {
					Class c = null;
					Object o = null;
					try {
						c = Class.forName(id.getClassName());
						o = c.newInstance();
						for (Property p : unInitbeans.get(id.getId()).getProperties()) {
							if (p.getRef() == null) {
								Field[] fields = c.getDeclaredFields();
								for (Field field : fields) {
									field.setAccessible(true);
									if (field.getName().equals(p.getName())) {
										field.set(o, p.getValue());
									}
								}
							} else {
								Field[] fields = c.getDeclaredFields();
								for (Field field : fields) {
									if (field.getName().equals(p.getName())) {
										field.setAccessible(true);
										field.set(c, initBeans.get(p.getRef()));
									}
								}
							}
						}
					} catch (InstantiationException e) {
						// TODO: handle exception
						Constructor[] cs = c.getConstructors();
						for (Constructor constructor : cs) {
							if (constructor.isAnnotationPresent(Autowired.class)) {
								int parmaNum = constructor.getParameterTypes().length;
								Object[] parmas = new Object[parmaNum];
								for (int j = 0; j < parmaNum; j++) {
									for (Property p : unInitbeans.get(id.getId()).getProperties()) {
										if (initBeans.get(p.getRef()).getClass()
												.equals(constructor.getParameterTypes()[j])) {
											parmas[j] = initBeans.get(p.getRef());
										}
									}
								}
								o = constructor.newInstance(null, null);
							}
						}

					}
					unInitbeans.remove(id.getId());
					initBeans.put(id.getId(), o);
				}
			}
		}
	}

	public Object getBean(String id) {
		return initBeans.get(id);
	}
}
