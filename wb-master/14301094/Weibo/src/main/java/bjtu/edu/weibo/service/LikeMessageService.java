package bjtu.edu.weibo.service;

import bjtu.edu.weibo.model.Comment;
import bjtu.edu.weibo.model.User;

public interface LikeMessageService {
	public boolean LikeMessage(User user ,Comment comment);
}
