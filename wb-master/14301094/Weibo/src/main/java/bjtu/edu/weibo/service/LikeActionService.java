package bjtu.edu.weibo.service;

import bjtu.edu.weibo.model.User;
import bjtu.edu.weibo.model.Weibo;
public interface LikeActionService {
	public boolean Like(User user ,Weibo weibo);
}
