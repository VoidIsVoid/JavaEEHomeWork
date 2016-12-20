package bjtu.edu.weibo.service;

import java.util.List;

import bjtu.edu.weibo.model.User;

public interface SearchUserService {
	public List<User> SearchUser(String user);
}
