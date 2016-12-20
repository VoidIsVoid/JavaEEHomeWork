package bjtu.edu.weibo.service;

import java.util.List;

import bjtu.edu.weibo.model.Topic;

public interface SearchTopicService {
	public List<Topic> SearchTopic(String topic);
}
