package bjtu.edu.weibo.service;

import java.util.List;

import bjtu.edu.weibo.model.User;

public interface SameAttentionService {
	public List<User> getSameAttention(User user1,User user2);

}
