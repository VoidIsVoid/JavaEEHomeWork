package cn.edu.bjtu.weibo.service;

/**
 * When a user want to show his interest for some picture, he can use this service.
 * 
 * the logic for it I need to clarify here. when some one like some picture,
 * then the weibo which the picture belongs to will be in the user favorite weibo list,
 * there is no favorite picture list, and for each picture, they will maintain the like number by itself,
 * at meantime, the weibo total like number will increase, if you are in charge of implementing this service,
 * I strongly recommend you to use weibo and do some test, then you will find hints yourself.
 * 
 * @author Liu Jinfeng
 *
 */
public interface LikePictureService {
	/**
	 * 
	 * @param userId
	 * @param picId
	 * @return
	 */
	boolean LikePictureAction(String userId, String weiboId, String picId);
}
