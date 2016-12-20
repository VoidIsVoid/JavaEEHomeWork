package bjtu.edu.weibo.service;

import bjtu.edu.weibo.model.User;

public interface RelationService {
	public boolean	followAction(User user1,User user2);
	public boolean	unfollowAction(User user1,User user2);
	public boolean	deletefansAction(User user1,User user2);

}
