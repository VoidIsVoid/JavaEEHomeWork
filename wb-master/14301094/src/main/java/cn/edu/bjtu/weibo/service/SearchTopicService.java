package cn.edu.bjtu.weibo.service;

import java.util.List;

import cn.edu.bjtu.weibo.model.BaseContentSR;;
/**
 * This service will be used be general search.
 * 
 * @author Liu Jinfeng
 *
 */
public interface SearchTopicService {
	/**
	 * Given the keyword, search the keyword only in topic, then return all the contents contain the topic
	 * @param keyword
	 * @param pageIndex
	 * @param numberPerPage
	 * @return
	 */
	List<BaseContentSR> getSearchedContentWithTopicList(String keyword, int pageIndex, int numberPerPage);
}
