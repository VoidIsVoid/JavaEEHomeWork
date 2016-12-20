package bjtu.edu.weibo.service;

import java.util.List;

import bjtu.edu.weibo.model.User;
import bjtu.edu.weibo.model.Weibo;

public interface SearchUserWeiboservice {
	public List<Weibo> SearchUserWeibo(User user);
}
