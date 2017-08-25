package cn.mldn.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 本类扶着数据的连接与关闭操作
 * @author shangchengwen
 *
 */

public class DatabaseConnection {
	private static final String DBDIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DBURL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String DBUSE = "scott";
	private static final String PASSWORD = "tiger";
	Connection conn = null;
	
	public DatabaseConnection(){
		try{
			Class.forName(DBDIVER);
			this.conn = DriverManager.getConnection(DBURL,DBUSE,PASSWORD);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public Connection getConnection(){
		return conn;
	}
	
	public void close(){
		if(this.conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
