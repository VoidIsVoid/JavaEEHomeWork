package bjtu.edu.weibo.service;

import bjtu.edu.weibo.model.User;
import bjtu.edu.weibo.model.Weibo;

public interface BanWeiboService {
	public boolean BanUser(User user,Weibo weibo);
}
