package cn.edu.bjtu.weibo.model;

/**
 * Comment is one special case of BaseContent
 * 
 * currently, we leave it as it should be.
 * 
 * @author Liu Jinfeng
 *
 */
public class Comment extends BaseContent{
	/*
	 * the comment must comment on some weibo or comment, that is why this variable stay here.
	 */
	private String commentOrWeiboId;

	public String getCommentOrWeiboId() {
		return commentOrWeiboId;
	}

	public void setCommentOrWeiboId(String commentOrWeiboId) {
		this.commentOrWeiboId = commentOrWeiboId;
	}
	
}
