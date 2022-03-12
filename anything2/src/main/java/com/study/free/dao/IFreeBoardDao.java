package com.study.free.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.free.vo.FreeBoardVO;

@Mapper
public interface IFreeBoardDao {
	public List<FreeBoardVO> getBoardList();
	public FreeBoardVO getBoard(int boNo);
	public int updateBoard(FreeBoardVO freeBoard); //수정
	public int deleteBoard(FreeBoardVO freeBoard); //삭제
	public int insertBoard(FreeBoardVO freeBoard); //삽입
	
}
