package com.tanjiu.service;

import com.tanjiu.dao.BookMapper;
import com.tanjiu.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: 叹久
 * @date 2021/1/23 13:40
 */
@Service
public class BookServiceImpl implements BookService {

    // service层调用dao层
    private BookMapper bookMapper;
    @Autowired
    public void setBookMapper(BookMapper bookMapper){
        this.bookMapper=bookMapper;
    }
    @Override
    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
