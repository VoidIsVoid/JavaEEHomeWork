package bjtu.edu.weibo.service;

import bjtu.edu.weibo.model.User;

public interface UsermanageService {
	public boolean banUser(User user);
	public boolean unbanUser(User user);

}
