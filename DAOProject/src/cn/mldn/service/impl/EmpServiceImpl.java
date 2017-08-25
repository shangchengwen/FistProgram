package cn.mldn.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.mldn.dbc.DatabaseConnection;
import cn.mldn.factory.DAOFactory;
import cn.mldn.service.IEmpService;
import cn.mldn.vo.Emp;

public class EmpServiceImpl implements IEmpService {

	private DatabaseConnection dbc = new DatabaseConnection();
	
	@Override
	public boolean insert(Emp vo) throws Exception {
		try{
			if(DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).findById(vo.getEmpno())==null){
				return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).doCreate(vo);
			}
			return false;
		}catch(Exception e){
			throw e;
		}finally{
			dbc.close();
		}
	}

	@Override
	public boolean update(Emp vo) throws Exception {
		try{
			return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).doUpdate(vo);
		}catch(Exception e){
			throw e;
		}finally{
			dbc.close();
		}
	}

	@Override
	public boolean delete(Set<Integer> ids) throws Exception {
		try{
			return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).doRemoveBatch(ids);
		}catch(Exception e){
			throw e;
		}finally{
			dbc.close();
		}
	}

	@Override
	public Emp get(int ids) throws Exception {
		try{
			return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).findById(ids);
		}catch(Exception e){
			throw e;
		}finally{
			dbc.close();
		}
	}

	@Override
	public List<Emp> list() throws Exception {
		try{
			return DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).findAll();
		}catch(Exception e){
			throw e;
		}finally{
			dbc.close();
		}
	}

	@Override
	public Map<String, Object> list(int currentPage, int lineSize,
			String column, String keyWord) throws Exception {
		try{
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("allEmps", DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).findAllSplit(currentPage, lineSize, column, keyWord));
			map.put("empCount", DAOFactory.getIEmpDAOInstance(this.dbc.getConnection()).getAllCount(column, keyWord));
			return map;
		}catch(Exception e){
			throw e;
		}finally{
			dbc.close();
		}
	}

}
