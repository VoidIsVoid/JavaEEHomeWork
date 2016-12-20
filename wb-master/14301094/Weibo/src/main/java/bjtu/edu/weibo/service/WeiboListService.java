package bjtu.edu.weibo.service;

import java.util.List;

import bjtu.edu.weibo.model.User;
import bjtu.edu.weibo.model.Weibo;

public interface WeiboListService {
	public List<Weibo> WeiboList(User user);
	public List<Weibo> WeiboList();
}
