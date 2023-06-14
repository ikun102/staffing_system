package com.iweb.DAO;

import com.iweb.pojo.Job;
import com.iweb.pojo.Notice;

import java.util.List;

/**
 * @author MA
 * @date 2023/6/11 14:19
 */
public interface JobDao {

    /**查询所有的职位
     * @return 返回所有的职位信息
     */
     List<Job> selectAllJob();

    /**根据职位名称模糊查询职位
     * @param key  模糊查询职位名称关键字
     * @return 返回查询结果
     */
    List<Job> selectJNameLike(String key);

    /**修改职位名称
     * 对应的员工表中的职位名字也要修改
     * @param jid 需要修改的职位id
     * @param jName 需要修改的目标职位名字
     */
    void updateJName(int jid,String jName);

    /**根据职位名字删除职位
     * @param jName 需要删除的职位名字，如果该职位下有员工的话将这些员工的职位改为待分配职位
     */
    void deleteJob(String jName);

    /**添加职位
     * @param job 添加的职位信息
     */
    void insertJob(Job job);
}
