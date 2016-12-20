package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.BaseContent;

/**
 * When a user want to know all the weibo or Comment(means we need to use BaseContent) which reply to him.
 * 
 * @author Liu Jinfeng
 *
 */

public interface CommentMeService {
	/**
	 * content include weibo and comment, so reply can reply to weibo and comment
	 * @param userId
	 * @param pageIndex
	 * @param numberPerPage
	 * @return
	 */
	List<BaseContent> getCommentMeContentList(String userId, int pageIndex, int numberPerPage);
}
