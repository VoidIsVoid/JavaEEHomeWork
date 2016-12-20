package bjtu.edu.weibo.service;

import java.util.List;

import bjtu.edu.weibo.model.User;
import bjtu.edu.weibo.model.Weibo;

public interface UserHotWeiboService {
	public List<Weibo> UserHotWeibo(User user);
}
