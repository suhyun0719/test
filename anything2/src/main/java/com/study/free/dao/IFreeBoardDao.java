package com.study.free.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.free.vo.FreeBoardVO;

@Mapper
public interface IFreeBoardDao {
	public List<FreeBoardVO> getBoardList();
	public FreeBoardVO getBoard(int boNo);
	public int updateBoard(FreeBoardVO freeBoard); //����
	public int deleteBoard(FreeBoardVO freeBoard); //����
	public int insertBoard(FreeBoardVO freeBoard); //����
	
}
