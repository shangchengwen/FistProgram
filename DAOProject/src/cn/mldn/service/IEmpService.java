package cn.mldn.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.mldn.vo.Emp;

/**
 * 定义emp表的业务层的执行标准，此类一定要负责数据库的打开与关闭操作
 * 此类可以通过DAOFactory类取得IEmpDAO接口对象
 * @author shangchengwen
 *
 */
public interface IEmpService {
	
	/**
	 * 实现雇员数据的增加操作，本次操作调用IEmpDAO接口的如下方法<br>
	 * <li>需要调用IEmpDAO.findById()方法，判断要增加的数据id是否已经存在
	 * <li>如果现在要增加的数据编号不存在则调用IEmpDAO.doCreate()方法，返回操作结果
	 * @param vo 包含要增加数据的VO对象
	 * @return 如果增加的数据的ID重复或者保存失败则返回false，否则返回true；
	 * @throws Exception SQL执行异常
	 */
	public boolean insert(Emp vo)throws Exception;
	
	/**
	 * 实现雇员的数据修改操作，本次调用IEmpDAO.doUpDate()方法，本次修改属于全部内容的修改；
	 * @param vo 包含要增加数据的VO对象
	 * @return 修改成功返回true，否则返回false
	 * @throws Exception SQL执行异常
	 */
	public boolean update(Emp vo)throws Exception;
	
	/**
	 * 执行雇员数据的删除操作，可以删除多个雇员信息，调用IEmp.doRemoveBatch()方法
	 * @param ids 包含了全部要删除的数据集合，没有重复数据
	 * @return 删除成功返回true，否则返回false
	 * @throws Exception SQL执行异常
	 */
	public boolean delete(Set<Integer> ids)throws Exception;
	
	/**
	 * 根据雇员编号查找雇员全部信息，调用IEmpDAO.findById()方法
	 * @param ids 要查找的雇员编号
	 * @return 如果找到了则雇员信息以vo对象返回，否则返回null；
	 * @throws Exception SQL执行异常
	 */
	public Emp get(int ids) throws Exception;
	
	/**
	 * 查看雇员全部信息，调用IEmp.findAll()方法
	 * @return 查询结果以List集合的形式返回，如果没有数据则集合的长度为0
	 * @throws Exception SQL执行异常
	 */
	public List<Emp> list() throws Exception;
	
	/**
	 * 实现数据的模糊查询与数据统计，要调用IEmpDAO的两个方法<br>
	 * <li>调用IEmpDAO.findAllSplit()方法，查询出所有的表数据，返回的List<Emp>
	 * <li>调用IEmpDAO.getAllCount()方法，查询所有的数据量，返回Integer
	 * @param currentPage 当前所在页
	 * @param lineSize 每页显示的记录数
	 * @param column 模糊查询的数据列
	 * @param keyWord 模糊查询的关键字
	 * @return 返回多种数据类型
	 * <li>key = allEmps,value = IEmpDAO.findAllSplit()返回结果List<Emp>
	 * <li>key = empCount,value = IEmpDAO.getAllCount()返回结果Integer
	 * @throws Exception
	 */
	public Map<String,Object> list(int currentPage,int lineSize,String column,String keyWord)throws Exception;
}
