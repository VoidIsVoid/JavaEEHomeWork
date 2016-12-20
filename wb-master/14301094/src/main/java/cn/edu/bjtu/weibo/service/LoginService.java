package cn.edu.bjtu.weibo.service;

/**
 * When user try to login weibo
 * @author Liu Jinfeng
 *
 */
public interface LoginService {
	/**
	 * 
	 * @param usename
	 * @param password
	 * @return
	 */
	String getLoginUserId(String usename, String password);
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	boolean isUserExisted(String username, String password);
}
