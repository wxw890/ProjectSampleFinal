package com.hta.book.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hta.book.repository.BookDto;
import com.hta.book.service.BookService;

@Controller
public class BookInputController {
	private BookService bookService;
	
	
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	//book ����������
	@RequestMapping(value="/bookinput", method=RequestMethod.GET)
	public String bookinhandle(){
		
		return "bookinput";
		
	}
	
	//book ����
	@RequestMapping(value="/bookinput", method=RequestMethod.POST)
	public String booksubmit(@ModelAttribute BookDto dto) {
		try {
			
			bookService.bookinput(dto);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return "redirect:bookinput";//å �߰� �Ұ� ���� ��� ����ؼ� �ٽ� ���� �ȴ�.
		
	}
	
	//��ü ��� �����ֱ� 
	@RequestMapping("/success.book")
	public ModelAndView pageHandler(){
		ModelAndView mav = new ModelAndView("successbook");
		try {
			
			List list = bookService.getList();
			System.out.println("input size :"+list.size());
			mav.addObject("list", list);
		} catch (Exception err) {
			System.out.println("ListController:pageHandler():" + err);
		}
	
		return mav;
		
	}
	
	//���� ����� å ��� �����ֱ�
	@RequestMapping("/today.book")
	public ModelAndView pageHandler1(){
		ModelAndView mav = new ModelAndView("todaybook");
		try {
				
			List list = bookService.todayList();
				
			mav.addObject("list", list);
		} catch (Exception err) {
			System.out.println("ListController:pageHandler():" + err);
		}
	
		return mav;
			
	}
	
	
}
