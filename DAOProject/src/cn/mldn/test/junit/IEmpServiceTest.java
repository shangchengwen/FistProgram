package cn.mldn.test.junit;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import org.junit.Test;

import cn.mldn.factory.ServiceFactory;
import cn.mldn.vo.Emp;

public class IEmpServiceTest {

	@Test
	public void testInsert() {
		Emp vo = new Emp();
		vo.setEmpno(8889);
		vo.setEname("Joshua");
		vo.setJob("Teacher");
		vo.setHiredate(new Date());
		vo.setSal(10.2);
		vo.setComm(0.5);
		try {
			TestCase.assertTrue(ServiceFactory.getIEmpServiceInstance().insert(vo));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	@Test
//	public void testUpdate() {
//		fail("Not yet implemented");
//	}
//
	@Test
	public void testDelete() {
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(8889);
		try {
			TestCase.assertTrue(ServiceFactory.getIEmpServiceInstance().delete(ids));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//
//	@Test
//	public void testGet() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testList() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testListIntIntStringString() {
//		fail("Not yet implemented");
//	}

}
