package bjtu.edu.weibo.dao;

import java.util.List;

import bjtu.edu.weibo.model.Topic;

public interface TopicDAOInterface {
	public boolean insertNewTopic(Topic t);
	
	List<String> getUserList(String topicid);
	
	String getContent(String topicid);
	String getTopicUserNumber(String topicid);
	String getOwner(String topicid);
	String getTine(String topicid);
}
 