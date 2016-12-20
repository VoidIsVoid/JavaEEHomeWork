package bjtu.edu.weibo.service;

import java.util.List;

import bjtu.edu.weibo.model.User;
import bjtu.edu.weibo.model.Weibo;

public interface ForwardWeiboService {
	public int	getForwardNumber(Weibo weibo) ;//获取转发人数
	public List<User>	getForwardList(Weibo weibo); //转发列表
	public boolean	forwardWeiboAction(Weibo weibo,User user);//转发动作
}
