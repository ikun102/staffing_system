package com.iweb.DAO;

import com.iweb.pojo.Notice;

import java.util.List;

/**
 * @author MA
 * @date 2023/6/11 14:20
 */
public interface NoticeDao {
    /**用于添加公告
     * @param notice 要添加的公告信息，包括公告id，公告标题，公告内容
     */
    void insertNotice(Notice notice);

    /**删除公告
     * @param nid 根据公告id删除公告
     */
    void deleteNotice(int nid);

    /**修改公告信息
     * @param headline 修改的公告标题，如果为null则默认不用改标题
     * @param details 修改的公告内容，如果为null则默认不用改内容
     */
    void updateNotice(int nid,String headline,String details);

    /**查看所有的公告
     * @return 返回所有公告的数据
     */
    List<Notice> selectAllNotice();

    /**根据公告标题模糊查询公告
     * @param key 模糊查询的公告标题关键字
     * @return 返回查询到的信息
     */
    List<Notice> selectHeadLineLike(String key);

    /**根据公告的内容模糊查询
     * @param key 模糊查询的公告内容关键字
     * @return 返回查询结构
     */
    List<Notice> selectDetailsLike(String key);
}
