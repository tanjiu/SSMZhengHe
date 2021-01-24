package com.tanjiu.controller;

import com.tanjiu.pojo.Books;
import com.tanjiu.service.BookService;
import com.tanjiu.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description:
 * @Author: 叹久
 * @date 2021/1/23 18:46
 */
@Controller
@RequestMapping("/book")
public class BookController {
    //spring4.0以后就不推荐直接在属性字段上使用@Autowired注解了，推荐使用构造器或者setter方法注入
    private BookService bookService;
    @Autowired
    public void setBookService(BookServiceImpl bookService){
        // 属性字段的接口，函数的参数的子类
        this.bookService=bookService;
    }

    // 查询全部的书籍，并且返回一个书籍展示页面
    @RequestMapping("/allbook")
    public String list(Model model){
        System.out.println("==================================================执行了=====================");

        List<Books> list=bookService.queryAllBook();
        model.addAttribute("list",list
        );
        return "allbook";
    }
}
