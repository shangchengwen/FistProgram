package cn.mldn.factory;

import java.sql.Connection;

import cn.mldn.dao.IEmpDAO;
import cn.mldn.dao.impl.EmpDAOImpl;

public class DAOFactory {
	public static IEmpDAO getIEmpDAOInstance(Connection conn){
		return new EmpDAOImpl(conn);
	}
}
