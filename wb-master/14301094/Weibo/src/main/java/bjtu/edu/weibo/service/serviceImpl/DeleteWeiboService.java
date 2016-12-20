package bjtu.edu.weibo.service;

import bjtu.edu.weibo.model.User;
import bjtu.edu.weibo.model.Weibo;

public interface DeleteWeiboService {
	public boolean DeleteWeibo(User user,Weibo weibo);
}
