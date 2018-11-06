package com.lenovo.mt.handler.api;

import com.lenovo.mt.model.primary.Students;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * @author chengkang
 */
public interface IStudentsHander {
    Page<Students> getAllStudents(Pageable pageable);

    List<Students> getAllStudentsSort(Sort sort);

    List<Students> findByName(String name);

    int insertOne(Students student);

    List<Students> getbyAge(Short start,Short e);
}
