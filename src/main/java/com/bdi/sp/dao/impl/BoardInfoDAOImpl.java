package com.bdi.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.sp.dao.BoardInfoDAO;
import com.bdi.sp.vo.BoardInfo;

@Repository
public class BoardInfoDAOImpl implements BoardInfoDAO {

	@Autowired
	private SqlSession ss;
	
	
	@Override
	public List<BoardInfo> getBoardList(BoardInfo bi) {
		// TODO Auto-generated method stub
		return ss.selectList("SQL.BOARDINFO.selectBoardInfoList",bi);
	}

	@Override
	public int deleteBoard(int binum) {
		// TODO Auto-generated method stub
		return ss.delete("SQL.BOARDINFO.deleteBoardInfo",binum);
	}

	@Override
	public int updateBoard(BoardInfo bi) {
		// TODO Auto-generated method stub
		return ss.update("SQL.BOARDINFO.updateBoardInfo",bi);
	}

	@Override
	public BoardInfo getBoard(int binum) {
		// TODO Auto-generated method stub
		return ss.selectOne("SQL.BOARDINFO.selectBoardInfo",binum);
	}

	@Override
	public Integer insertBoard(BoardInfo bi) {
		// TODO Auto-generated method stub
		return ss.insert("SQL.BOARDINFO.insertBoardInfo",bi);
	}

}
