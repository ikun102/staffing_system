package com.iweb.DAO;

import com.iweb.pojo.Department;

import java.util.List;

/**
 * @author MA
 * @date 2023/6/11 14:20
 */
public  interface DepartmentDao {
    /**查询所有的部门信息
     * @return 返回所有的部门信息
     */
    List<Department> selectAllDepartment();


    /**根据部门名字模糊查询
     * @param key 模糊查询关键词
     * @return 返回模糊查询结果
     */
    List<Department> selectDNameLike(String key);

    /**修改部门名字
     * @param did 需要修改的部门id
     * @param dName 需要修改的目标部门名字
     */
    void updateDName(int did,String dName);

    /**删除部门
     * @param dName 需要删除的部门名字，若该部门下有员工，将这些员工的部门改为待分配部门
     */
    void deleteDepartment(String dName);

    /**添加部门
     * @param department 需要添加的部门信息
     */
    void insertDepartment(Department department);
}
