package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.Picture;

/**
 * When some user try to see some user`s picture(all the picture), he can use it.
 * 
 * @author Liu Jinfeng
 *
 */

public interface UserSendedPictureService {
	/**
	 * Get all the picture sended by this user
	 * @param userId
	 * @return
	 */
	List<Picture> getUserSendedPicture(String userId, int pageIndex, int numberPerPage);
}
