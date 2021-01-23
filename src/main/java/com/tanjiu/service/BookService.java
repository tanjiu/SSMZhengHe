package com.tanjiu.service;

import com.tanjiu.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: 叹久
 * @date 2021/1/23 13:39
 */
@Service
public interface BookService {
    //增加一本书
    int addBook(Books book);

    //删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books book);
    // 查询一本书
    Books queryBookById(int id);
    // 查询全部的书
    List<Books> queryAllBook();
}
