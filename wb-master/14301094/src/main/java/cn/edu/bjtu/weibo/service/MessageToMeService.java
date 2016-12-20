package cn.edu.bjtu.weibo.service;

/**
 * When some action happened, notify the user in his message box
 * 
 * @author Liu Jinfeng
 *
 */

public interface MessageToMeService {
	/**
	 * when a weibo @ user, it will inform that user.
	 * @param weiboId
	 * @param userId
	 * @return
	 */
	boolean atMeInfromWeibo(String userId, String weiboId);
	
	/**
	 * when a comment @ user, it will inform that user.
	 * @param weiboId
	 * @param userId
	 * @return
	 */
	boolean atMeInfromComment(String userId, String commentId);
	
	/**
	 * When a user comment another user`s weibo or comment, that user should be notified
	 * @param userId
	 * @param commentId
	 * @return
	 */
	
	boolean commentMyWeiboInform(String userId, String weiboId);
	
	/**
	 * When a user comment another user`s weibo or comment, that user should be notified
	 * @param fromUserId
	 * @param toUserId
	 * @param commentId
	 * @param weiboId
	 * @return
	 */
	boolean commentMyCommentInform(String userId, String commentId);
	/**
	 * When a user like some user`s weibo or comments, that user should be notified
	 * @param fromUserId
	 * @param toUserId
	 * @param weiboId
	 * @return
	 */
	boolean likeMyWeiboInform(String fromUserId, String toUserId, String weiboId);
	/**
	 * When a user like some user`s weibo or comments, that user should be notified
	 * @param fromUserId
	 * @param toUserId
	 * @param weiboId
	 * @return
	 */
	boolean likeMyCommentInform(String fromUserId, String toUserId, String commentId);
}
