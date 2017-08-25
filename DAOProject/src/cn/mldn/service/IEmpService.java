package cn.mldn.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.mldn.vo.Emp;

/**
 * ����emp���ҵ����ִ�б�׼������һ��Ҫ�������ݿ�Ĵ���رղ���
 * �������ͨ��DAOFactory��ȡ��IEmpDAO�ӿڶ���
 * @author shangchengwen
 *
 */
public interface IEmpService {
	
	/**
	 * ʵ�ֹ�Ա���ݵ����Ӳ��������β�������IEmpDAO�ӿڵ����·���<br>
	 * <li>��Ҫ����IEmpDAO.findById()�������ж�Ҫ���ӵ�����id�Ƿ��Ѿ�����
	 * <li>�������Ҫ���ӵ����ݱ�Ų����������IEmpDAO.doCreate()���������ز������
	 * @param vo ����Ҫ�������ݵ�VO����
	 * @return ������ӵ����ݵ�ID�ظ����߱���ʧ���򷵻�false�����򷵻�true��
	 * @throws Exception SQLִ���쳣
	 */
	public boolean insert(Emp vo)throws Exception;
	
	/**
	 * ʵ�ֹ�Ա�������޸Ĳ��������ε���IEmpDAO.doUpDate()�����������޸�����ȫ�����ݵ��޸ģ�
	 * @param vo ����Ҫ�������ݵ�VO����
	 * @return �޸ĳɹ�����true�����򷵻�false
	 * @throws Exception SQLִ���쳣
	 */
	public boolean update(Emp vo)throws Exception;
	
	/**
	 * ִ�й�Ա���ݵ�ɾ������������ɾ�������Ա��Ϣ������IEmp.doRemoveBatch()����
	 * @param ids ������ȫ��Ҫɾ�������ݼ��ϣ�û���ظ�����
	 * @return ɾ���ɹ�����true�����򷵻�false
	 * @throws Exception SQLִ���쳣
	 */
	public boolean delete(Set<Integer> ids)throws Exception;
	
	/**
	 * ���ݹ�Ա��Ų��ҹ�Աȫ����Ϣ������IEmpDAO.findById()����
	 * @param ids Ҫ���ҵĹ�Ա���
	 * @return ����ҵ������Ա��Ϣ��vo���󷵻أ����򷵻�null��
	 * @throws Exception SQLִ���쳣
	 */
	public Emp get(int ids) throws Exception;
	
	/**
	 * �鿴��Աȫ����Ϣ������IEmp.findAll()����
	 * @return ��ѯ�����List���ϵ���ʽ���أ����û�������򼯺ϵĳ���Ϊ0
	 * @throws Exception SQLִ���쳣
	 */
	public List<Emp> list() throws Exception;
	
	/**
	 * ʵ�����ݵ�ģ����ѯ������ͳ�ƣ�Ҫ����IEmpDAO����������<br>
	 * <li>����IEmpDAO.findAllSplit()��������ѯ�����еı����ݣ����ص�List<Emp>
	 * <li>����IEmpDAO.getAllCount()��������ѯ���е�������������Integer
	 * @param currentPage ��ǰ����ҳ
	 * @param lineSize ÿҳ��ʾ�ļ�¼��
	 * @param column ģ����ѯ��������
	 * @param keyWord ģ����ѯ�Ĺؼ���
	 * @return ���ض�����������
	 * <li>key = allEmps,value = IEmpDAO.findAllSplit()���ؽ��List<Emp>
	 * <li>key = empCount,value = IEmpDAO.getAllCount()���ؽ��Integer
	 * @throws Exception
	 */
	public Map<String,Object> list(int currentPage,int lineSize,String column,String keyWord)throws Exception;
}
