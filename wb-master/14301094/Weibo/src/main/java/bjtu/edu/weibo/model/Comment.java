package bjtu.edu.weibo.model;

public class Comment {
	private String date;
	private int like;
	private int commentNumber;
	
	public int getCommentNumber() {
		return commentNumber;
	}

	public void setCommentNumber(int commentNumber) {
		this.commentNumber = commentNumber;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	private String Comment;

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}
}
