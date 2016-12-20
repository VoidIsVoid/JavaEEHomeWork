package bjtu.edu.weibo.model;

public class Weibo {
	private String date;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	private String content;
	private int like;
	private int Forward;
	private int id;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public int getForward() {
		return Forward;
	}
	public void setForward(int forward) {
		Forward = forward;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
