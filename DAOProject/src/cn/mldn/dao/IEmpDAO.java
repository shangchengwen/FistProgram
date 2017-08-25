package cn.mldn.dao;

import java.util.List;
import java.util.Set;

import cn.mldn.vo.Emp;

/**
 * ����emp������ݲ�Ĳ�����׼
 * @author shangchengwen
 *
 */
public interface IEmpDAO {
	/**
	 * ʵ�����ݵ����Ӳ���
	 * @param vo ������Ҫ�������ݵ�VO����
	 * @return ���ݱ���ɹ�����true�����򷵻�false
	 * @throws Exception SQLִ���쳣
	 */
	public boolean doCreate(Emp vo)throws Exception;
	/**
	 * ʵ�����ݵ��޸Ĳ����������޸��Ǹ���id����ȫ���ֶ����ݵ��޸�
	 * @param vo ������Ҫ�޸ĵ�������Ϣ��һ��Ҫ�ṩID����
	 * @return �����޸ĳɹ�����true�����򷵻�false
	 * @throws Exception SQLִ���쳣
	 */
	public boolean doUpdate(Emp vo)throws Exception;
	/**
	 * ִ�����ݵ�����ɾ������������Ҫɾ����������Set���ϵ���ʽ����
	 * @param ids ����������Ҫɾ��������ID�����������ظ�����
	 * @return ɾ���ɹ�����true��ɾ�������ݸ�����Ҫɾ�������ݸ�����ͬ�������򷵻�false
	 * @throws Exception SQLִ���쳣
	 */
	public boolean doRemoveBatch(Set<Integer> ids)throws Exception;
	
	
	/**
	 * ���ݹ�Ա��Ų�ѯָ���Ĺ�Ա��Ϣ
	 * @param id Ҫ��ѯ�Ĺ�Ա���
	 * @return �����Ա���ڣ���������VO��������ʽ���أ������Ա�����ڣ��򷵻�null
	 * @throws Exception SQLִ���쳣
	 */
	public Emp findById(Integer id)throws Exception;
	/**
	 * ��ѯָ�����ݱ��ȫ����¼�������Լ��ϵ���ʽ����
	 * @return ������������ݣ������е����ݻ��װΪVO�����������List���Ϸ���
	 * ���û�����ݣ���ô���ϵĳ���Ϊ0��size()==0,����null��
	 * @throws Exception SQLִ���쳣
	 */
	public List<Emp> findAll()throws Exception;
	/**
	 * ��ҳ�������ݵ�ģ����ѯ����ѯ����Լ��ϵ���ʽ����
	 * @param currentPage ��ǰ���ڵ�ҳ
	 * @param lineSize ÿҳ��ʾ����������
	 * @param column Ҫ���в�ѯ��������
	 * @param keyWord ģ����ѯ�Ĺؼ���
	 * @return ������������ݣ������е����ݻ��װΪVO�����������List���Ϸ���
	 * ���û�����ݣ���ô���ϵĳ���Ϊ0��size()==0,����null��
	 * @throws Exception SQLִ���쳣
	 */
	public List<Emp> findAllSplit(Integer currentPage,Integer lineSize,String column,String keyWord)throws Exception;
	/**
	 * ����ģ����ѯ��������ͳ�ƣ��������û�м�¼ͳ�ƣ��������0
	 * @param column Ҫ����ģ����ѯ��������
	 * @param keyWord ģ����ѯ�Ĺؼ���
	 * @return ���ر��е������������û�����ݷ���0
	 * @throws Exception SQLִ���쳣
	 */
	public Integer getAllCount(String column,String keyWord)throws Exception;
}
