package com.yongjin.mybatisss.dao;

import java.util.ArrayList;

import com.yongjin.mybatisss.dto.BoardDto;

public interface IDao {
	
	public void writeDao(String mwriter, String mcontent); // 게시판 글쓰기 메서드
	public ArrayList<BoardDto> listDao(); // 게시판 리스트 가져오기.

}
