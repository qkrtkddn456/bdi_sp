package com.bdi.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdi.sp.dao.BoardInfoDAO;
import com.bdi.sp.vo.BoardInfo;

@Controller
public class BoardInfoController {
	
	@Autowired
	private BoardInfoDAO bdao;
	
	@RequestMapping(value="/board",method=RequestMethod.GET)
	public @ResponseBody List<BoardInfo> BoardList(@ModelAttribute BoardInfo bi){
		return bdao.getBoardList(bi);
	}
	
	@RequestMapping(value="/board/{binum}",method=RequestMethod.GET)
	public @ResponseBody BoardInfo board(@PathVariable int binum) {
		return bdao.getBoard(binum);
	}
	
	@RequestMapping(value="/board",method=RequestMethod.POST)
	public @ResponseBody Integer insertBoard(@RequestBody BoardInfo bi) {
		return bdao.insertBoard(bi);
	}
	
	@RequestMapping(value="/board",method=RequestMethod.PUT)
	public @ResponseBody Integer updateBoard(@RequestBody BoardInfo bi) {
		return bdao.updateBoard(bi);
	}
	
	@RequestMapping(value="/board/{binum}",method=RequestMethod.DELETE)
	public @ResponseBody Integer deleteBoard(@PathVariable int binum) {
		return bdao.deleteBoard(binum);
	}
	
}
