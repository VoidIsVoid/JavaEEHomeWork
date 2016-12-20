package cn.edu.bjtu.weibo.service;

import cn.edu.bjtu.weibo.model.Comment;
import cn.edu.bjtu.weibo.model.Weibo;

/**
 * this work for both weibo and comment, usually some one like to upload some picture in the same time
 * but it is uploadweibopicture`s responsibility.
 * @author Liu Jinfeng
 *
 */
public interface SendContentSevice {
	/**
	 * 
	 * @param userId
	 * @param weibo
	 * @return
	 */
	boolean sendWeibo(String userId, Weibo weibo);
	/**
	 * 
	 * @param userId
	 * @param comment
	 * @return
	 */
	boolean sendComment(String userId, Comment comment);
}
