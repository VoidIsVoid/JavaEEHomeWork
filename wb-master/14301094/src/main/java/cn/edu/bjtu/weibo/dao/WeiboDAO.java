package cn.edu.bjtu.weibo.dao;

import java.util.List;

public interface WeiboDAO {
	 String getOwner(String weiboId);
	
	 /**
	  * weibo content related
	  * @param weiboId
	  * @return
	  */
	 
	 String getContent(String weiboId);
	 boolean updateContent(String weiboId, String content);
	
	 String getTime(String weiboId);
	 
	 /**
	  * weibo attached picture related operation
	  * @param weiboId
	  * @return
	  */
	 
	 List<String> getWeiboPicurlOr(String weiboId);
	
	 List<String> getWeiboPicurlTh(String weiboId);
	 
	 boolean insertWeiboPicture(String weiboId, String picId);
	 
	 boolean deleteWeiboPicture(String weiboId, String picId);
	
	 /**
	  * weibo profile related
	  * @param weiboId
	  * @return
	  */
	 
	 String getLikeNumber(String weiboId);
	
	 String getCommentNumber(String weiboId);
	
	 String getForwardNumber(String weiboId);
	
	 /**
	  * weibo like, forward, comment related 
	  * @param weiboId
	  * @param pageIndex
	  * @param numberPerPage
	  * @return
	  */
	 
	 List<String> getLikeLst(String weiboId, int pageIndex, int numberPerPage);
	
	 List<String> getForwardList(String weiboId, int pageIndex, int numberPerPage);
	
	 List<String> getCommentList(String weiboId, int pageIndex, int numberPerPage);
	
	 boolean deleteWeibo(String weiboId);
	 
	 boolean deleteCommentFromWeibo(String fromWeiboId, String commentId);
}
