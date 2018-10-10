package com.bdi.sp;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bdi.sp.vo.BoardInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardInfoTest {

	@Autowired
	private SqlSession ss;
	
//	@Test
//	public void selectListTest() {
//		List<BoardInfo> biList = ss.selectList("SQL.BOARDINFO.selectBoardInfoList");
//		System.out.println(biList);
//	}
	
//	@Test
//	public void selectTest() {
//		BoardInfo b = new BoardInfo();
//		b.setBinum(1);
//		BoardInfo bi = ss.selectOne("SQL.BOARDINFO.selectBoardInfo", b);
//		System.out.println(bi);
//	}
	
//	@Test
//	public void updateTest() {
//		BoardInfo j = new BoardInfo();
//		j.setBinum(3);
//		j.setBititle("수정테스트");
//		int rCnt = ss.update("SQL.BOARDINFO.updateBoard",j);
//		assertEquals(rCnt, 1);
//	}
	
	@Test
	public void deleteTest() {
		BoardInfo j = new BoardInfo();
		j.setBinum(10);
		int rCnt = ss.delete("SQL.BOARDINFO.deleteBoardInfo",10);
		assertEquals(rCnt, 1);
	}
	
}
