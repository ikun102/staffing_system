package com.iweb.DAO;

import com.iweb.pojo.Employee;

import java.util.List;

/**
 * @author MA
 * @date 2023/6/11 14:18
 */
public interface UserDao {
    /**根据id查询指定的员工
     * @param eid 员工id
     * @return 返回该员工的信息
     */
    Employee selectSpecifiedEmployee(int eid);

    /**查询所有员工信息
     * @return 返回所有员工信息的集合
     */
    List<Employee> selectAllEmployee();

    /**根据id修改员工名
     * @param eid 需要修改名字的员工id
     * @param eName 员工改的目标名字
     */
    void updateEName(int eid,String eName);

    /**根据id修改员工密码
     * @param eid 需要修改密码的员工id
     * @param password 员工改的目标密码
     */
    void updatePassword(int eid,String password);

    /**根据id修改员工的身份证号
     * @param eid 需要修改身份证号的员工id
     * @param idNumber 员工改的目标身份证号
     */
    void updateIdNumber(int eid,String idNumber);

    /**根据idx修改手机号
     * @param eid 需要修改手机号的员工id
     * @param phone 员工改的目标手机号
     */
    void updatePhone(int eid,String phone);

    /**根据id修改员工的职位
     * @param eid 需要修改职位的员工id
     * @param jName 员工改的职位的目标职位名字
     */
    void updateJName(int eid,String jName);

    /**根据id修改员工的部门
     * @param eid 需要修改部门名字的员工id
     * @param dName 员工改的部门的目标部门名字
     */
    void updateDName(int eid,String dName);

    /**根据id修改员工的性别
     * @param eid 需要修改性别的员工id
     * @param sex 员工改的性别的目标性别名字
     */
    void updateSex(int eid,String sex);

    /**根据员工姓名模糊查询员工信息
     * @param key 模糊查询姓名关键字
     * @return 返回所有满足名字模糊查询的员工信息
     */
    List<Employee> selectENameLike(String key);

    /**根据职位模糊查询员工信息
     * @param key 模糊查询职位关键字
     * @return 返回所有满足职位模糊查询的员工信息
     */
    List<Employee> selectJNameLike(String key);

    /**根据部门模糊查询员工信息
     * @param key 模糊查询部门关键字
     * @return 返回所有满足部门模糊查询的员工信息
     */
    List<Employee> selectDNameLike(String key);

    /**根据性别模糊查询员工信息
     * @param key 模糊查询性别关键字
     * @return 返回所有满足性别模糊查询的员工信息
     */
    List<Employee> selectSexLike(String key);

    /**根据id删除员工信息
     * @param eid 需要删除的员工id
     */
    void deleteEmployee(int eid);

    /**添加用户
     * @param employee 添加用户的信息
     */
    void insertEmployee(Employee employee);

}
