package cn.edu.bjtu.weibo.service.impl;

import cn.edu.bjtu.weibo.dao.WeiboDAO;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * Delete weibo then it just remove the weiboId from the weiboId list under a specified userId
 * 
 * @author Liu Jinfeng
 *
 */
@Service
public class DeleteWeiboService {
	
	@Autowired
	WeiboDAO weiboDAO;
	/**
	 * 
	 * @param userId
	 * @param weiboId
	 * @return
	 */
	boolean deleteWeibo(String userId,String weiboId){
		String forwordNum = weiboDAO.getForwardNumber(weiboId);
		Integer num = Integer.parseInt(forwordNum);
		if(num!=0){
			List<String> wbs = weiboDAO.getForwardList(weiboId, 0, num);
			for(String wb:wbs){
				deleteWeibo(userId, wb);
			}
		}
		return true;
	}
}
