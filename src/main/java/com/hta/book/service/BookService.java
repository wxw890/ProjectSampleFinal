package com.hta.book.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.hta.board.repository.BoardDto;
import com.hta.book.repository.BookDto;
import com.hta.book.repository.BookResDto;
import com.hta.book.repository.BookandRentalDto;
import com.hta.book.repository.ConditionDto;
import com.hta.book.repository.RentalInfoDto;


public interface BookService {

		//å �߰�
		public void bookinput(BookDto dto) throws SQLException;
		//��ü ��¸���Ʈ
		public List getList() throws SQLException;
		//å����
		public BookDto findBynum(int book_num);
		//���ó�¥�� ���
		public List todayList() throws SQLException;
		//����
		public void bookdelete(int book_num);
		//����
		public void updatebook(BookDto dto);
		//���ǰ˻�
		public List samelist(String book_title);
		//���ǰ˻�1
		public List condition1(ConditionDto dto);
		//���ǰ˻�2
		public List condition2(ConditionDto dto);
		//���ǰ˻�3
		public List condition3(ConditionDto dto);
		//å �뿩
		public void bookrental(BookDto dto, RentalInfoDto infodto);
		
		public List mylist(BookandRentalDto joindto);
		
		public void bookreturn(int rental_num, int book_num);
		
		public void bookres(int book_num, BookResDto resdto);
		
		public List myreslist(BookandRentalDto joindto);
		
		public void bookextension(int book_num);
		
		public void bookrescancel(int book_num, int res_num);

		
		
		
}