package cn.edu.bjtu.weibo.dao;

import java.util.List;

import cn.edu.bjtu.weibo.model.User;

public interface UserDAO {
	String insertNewUser(User user);
	
	
	boolean setState(String id, boolean s);
	
	List<String> getUserId();
	
	/**
	 * user profile related
	 */
	
	String getUserName(String userId);
	boolean updateUserName(String userId, String userName);
	
	String getUserIntroduction(String userId);
	boolean updateUserIntroduction(String userId, String introduction);
	
	String getUserPhoneNumber(String userId);
	boolean updateUserPhoneNumber(String userId, String phoneNumber);
	
	String getUserAge(String userId);
	boolean updateUserAge(String userId, String age);
	
	String getUserEmail(String userId);
	boolean updateUserEmail(String userId, String email);
	
	String getUserQQ(String userId);
	boolean updateUserQQ(String userId, String qq);
	
	String getUserEducation(String userId);
	boolean updateUserEducation(String userId, String education);
	
	String getLocation(String userId);
	String updateLocation(String userId, String location);
	
	String getBirthday(String userId);
	String updateBirthday(String userId, String birthday);
	
	String getSex(String userId);
	String updateSex(String userId, String sex);
	
	String getLastWeiboId(String userId);
	String updateLastWeiboId(String userId, String weiboId);
	
	/*
	 * Weibo number related
	 */
	
	String getWeiboNumber(String userId);
	String updateWeiboNumber(String userId, String weiboNumber);
	
	/*
	 * Weibo related
	 */
	
	List<String> getWeibo(String userId, int pageIndex, int pagePerNumber);
	boolean insertWeibo(String userId, String weiboId);
	boolean deleteWeibo(String userId, String weiboId);
	
	/**
	 * followerNumber related
	 */
	
	String getFollowerNumber(String userId);
	String updateFollowerNumber(String userId, String followerNumber);
	
	/**
	 * following related
	 */
	
	String getFollowingNumber(String userId);
	String updateFollowingNumber(String userId, String followeingNumber);
	
	/**
	 * follower related 
	 */
	
	List<String> getFollowers(String userId, int pageIndex, int pagePerNumber); 
	boolean insertFollower(String userId, String followerId);
	boolean deleteFollower(String userId, String followerId);
	
	/**
	 * following related
	 */
	
	List<String> getFollowing(String userId, int pageIndex, int pagePerNumber);  
	boolean insertFollowing(String userId, String followingId);
	boolean deleteFollowing(String userId, String followingId);
	
	/**
	 * forward weibo related
	 */
	
	List<String> getForwordWeibo(String userId, int pageIndex, int pagePerNumber);  
	boolean insertForwordWeibo(String userId, String weiboId);
	boolean deleteForwordWeibo(String userId, String weiboId);
	
	/**
	 * like weibo related
	 */
	
	List<String> getLikeWeibo(String userId, int pageIndex, int pagePerNumber);  
	boolean insertLikeWeibo(String userId, String weiboId);
	boolean deleteLikeWeibo(String userId, String weiboId);
	
	/**
	 * comment on weibo related
	 */
	List<String> getCommentOnWeibo(String userId, int pageIndex, int pagePerNumber);  
	boolean insertCommentOnWeibo(String userId, String weiboId);
	boolean deleteCommentOnWeibo(String userId, String weiboId);
	
	/**
	 * comment on comment related
	 */
	List<String> getCommentOnComment(String userId, int pageIndex, int pagePerNumber);  
	boolean insertCommentOnComment(String userId, String commentId);
	boolean deleteCommentOnComment(String userId, String commentId);
	
	
	/**
	 * favorite info related
	 */
	List<String> getFavoriteWeibo(String userId, int pageIndex, int pagePerNumber);
	boolean insertFavoriteWeibo(String userId, String weiboId);
	boolean deleteFavoriteWeibo(String userId, String weiboId);
	
	/**
	 * Group info related
	 */
	List<String> getGroups(String userId, int pageIndex, int pagePerNumber);
	boolean insertNewGroup(String userId, String group);
	boolean deleteGroup(String userId, String group);
	List<String> getUsersByGroup(String userId, String group, int pageIndex, int pagePerNumber);
	boolean insertUserToGroup(String userId, String group, String followingUserId);
	boolean deleteUserFromGroup(String userId, String group, String followingUserId);
	
	/*
	 * User msg @ me related
	 */
	List<String> getWeiboAtMeMessage(String userId, int pageIndex, int pagePerNumber);
	List<String> getCommentAtMeMessage(String userId, int pageIndex, int pagePerNumber);
	String getNewComingContentAtMeMessageNumber(String userId);
	boolean insertWeiboAtMe(String fromUserId, String toUserId, String weiboId);
	boolean insertCommentAtMe(String userId, String commentId);
	boolean deleteWeiboAtMe(String userId, String weiboId);
	boolean deleteCommentAtMe(String userId, String commentId);
	
	/*
	 * User msg comment me related
	 */
	List<String> getWeiboCommentMeMessage(String userId, int pageIndex, int pagePerNumber);
	List<String> getCommentCommentMeMessage(String userId, int pageIndex, int pagePerNumber);
	String getNewComingContentCommentMeMessageNumber(String userId);
	boolean insertWeiboCommentMe(String userId, String weiboId);
	boolean insertCommentCommentMe(String userId, String commentId);
	boolean deleteWeiboCommentMe(String userId, String weiboId);
	boolean deleteCommentCommentMe(String userId, String commentId);
	
	/*
	 * User msg like me related
	 */
	List<String> getWeiboLikeMeMessage(String userId, int pageIndex, int pagePerNumber);
	List<String> getCommentLikeMeMessage(String userId, int pageIndex, int pagePerNumber);
	String getNewComingContentLikeMeMessageNumber(String userId);
	boolean insertWeiboLikeMe(String fromUserId, String toUserId, String weiboId);
	boolean insertCommentLikeMe(String fromUserId, String toUserId, String commentId);
	boolean deleteWeiboLikeMe(String fromUserId, String toUserId, String weiboId);
	boolean deleteCommentLikeMe(String fromUserId, String toUserId, String commentId);
	
	/*
	 * user avatar related
	 */
	
	List<String> getUserAvatars(String userId, int pageIndex, int pagePerNumber);
	String getCurrentUserAvatar(String userId);
	boolean insertUserAvatar(String userId, String picId);
	boolean deleteUserAvatar(String userId, String picId);
}
