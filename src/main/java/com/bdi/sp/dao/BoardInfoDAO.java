package com.bdi.sp.dao;

import java.util.List;

import com.bdi.sp.vo.BoardInfo;

public interface BoardInfoDAO {
	
	public List<BoardInfo> getBoardList(BoardInfo bi);

	public int deleteBoard(int binum);
	public int updateBoard(BoardInfo bi);
	public BoardInfo getBoard(int binum);
	
	public Integer insertBoard(BoardInfo bi);
	
}
