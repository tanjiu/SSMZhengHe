package com.tanjiu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: 叹久
 * @date 2021/1/23 12:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Books {
    private int bookID;
    private  String bookName;
    private int bookCounts;
    private String detail;

}
