package com.hengdong.metrostation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by wyy on 17-8-9.
 */
@Data
@AllArgsConstructor
public class PageResult<T> {
    long totalRecords;
    int totalPages;
    int currentPage;
    List<T> records;
}
