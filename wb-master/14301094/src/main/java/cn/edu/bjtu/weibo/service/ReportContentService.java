package cn.edu.bjtu.weibo.service;

/**
 * When some weibo or comment contain illegal or unreal content, you can use this service to report this weibo to Admin
 * 
 * @author Liu Jinfeng
 *
 */
public interface ReportContentService {
	/**
	 * 
	 * @param userId
	 * @param weiboId
	 * @return
	 */
	boolean reportWeibo(String userId,String weiboId);
	
	/**
	 * 
	 * @param userId
	 * @param commentId
	 * @return
	 */
	
	boolean reportComment(String userId, String commentId);
}
