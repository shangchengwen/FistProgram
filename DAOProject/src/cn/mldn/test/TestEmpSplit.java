package cn.mldn.test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import cn.mldn.factory.ServiceFactory;
import cn.mldn.vo.Emp;

public class TestEmpSplit {

	public static void main(String[] args) {
		Map<String, Object> map;
		try {
			map = ServiceFactory.getIEmpServiceInstance().list(2,5,"ename","");
			int count = (Integer)map.get("empCount");
			System.out.println("��������"+count);
			@SuppressWarnings("unchecked")
			List<Emp> all = (List<Emp>)map.get("allEmps");
			Iterator<Emp> iter = all.iterator();
			while(iter.hasNext()){
				Emp vo = iter.next();
				System.out.println(vo.getEname()+","+vo.getJob());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
