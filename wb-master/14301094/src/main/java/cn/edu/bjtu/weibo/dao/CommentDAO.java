package cn.edu.bjtu.weibo.dao;

import java.util.List;

public interface CommentDAO {
	String getContent(String commentId);
	List<String> getAtUsersInComment(String commentId);
	List<String> getTpoicInComment(String commentId);
	String getBeCommentedWeiboOrCommentId(String commentId);
	String getLikeNumber(String commentId);
	String getCommentNumber(String commentId);
	
	List<String> getLikeList(String commentId);
	List<String> getCommentList(String commentId);
	
	boolean deleteComment(String commentId);
	
	boolean deleteCommentFromComment(String fromCommentId, String commentId);
	
	String getOwner(String commentid);
	String getTime(String commentid);
}
