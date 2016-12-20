package cn.edu.bjtu.weibo.dao;

import java.util.List;
/**
 * this interface  is  about report the user and weibo
 */
public interface ReportDAO{
	/**
	 * report user 
	 * @param UserId by report
	 * @param UserId who report others
	 */
	boolean ReportUser(String UserId,String reportedfromuserId);
	/**
	 * report weibo
	 * @param WeiboId by report
	 * @param UserId who report weibo
	 */
	boolean ReportWeibo(String WeiboId,String reportedfromuserId);
	/**
	 * the number of report User
	 */
	int ReportUserNumber(String ReportUserId);
	/**
	 * the number of report weibo
	 */
	int ReportWeiboNumber(String ReportWeiboId);
	/**
	 * the listUser of report a user
	 */
	List<String> ReportedUserfromuserList(String UserId,int pageIndex, int pagePerNumber);
	/**
	 * the listUser of report a weibo
	 */
	List<String> ReportedWeibofromuserList(String WeiboId,int pageIndex, int pagePerNumber);
	/**
	 * the list of  user reported
	 */
	List<String> ReportUserList(int pageIndex, int pagePerNumber);
	/**
	 * the list of weibo reported
	 */
	List<String> ReportWeiboList(int pageIndex, int pagePerNumber);
	
}