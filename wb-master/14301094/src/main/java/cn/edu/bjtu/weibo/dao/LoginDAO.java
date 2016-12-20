package cn.edu.bjtu.weibo.dao;

public interface LoginDAO {
	boolean updatePassword(String userLoginName, String oldPassword, String newPassword);
	String getUserId(String userLoginName, String password);
}
