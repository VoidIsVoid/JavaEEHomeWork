package bjtu.edu.weibo.dao;

public interface CommentDAOInterface {
	String getComment(String commentid);
	String getTopicUserNumber(String commentid);
	String getOwner(String commentid);
	String getTime(String commentid);
}
