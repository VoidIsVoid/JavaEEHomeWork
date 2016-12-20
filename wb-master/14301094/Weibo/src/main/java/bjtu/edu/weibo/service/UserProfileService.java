package bjtu.edu.weibo.service;

import bjtu.edu.weibo.model.User;

public interface UserProfileService {
	public void createUserInterface(User user);
	public User	getUserInterface(User user);
	public boolean	updateUserInterface(User user);

}
