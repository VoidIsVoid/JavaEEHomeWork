package bjtu.edu.weibo.service;

import java.util.List;

import bjtu.edu.weibo.model.User;

public interface RecommendUserService {
	public List<User> getRecommend(User user);
}
