package com.lenovo.mt.handler;

import com.lenovo.mt.handler.api.IStudentsHander;
import com.lenovo.mt.model.primary.Students;
import com.lenovo.mt.repository.primary.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsHandler implements IStudentsHander {

    @Autowired
    private StudentsRepository studentsRepository;


    @Override
    public Page<Students> getAllStudents(Pageable pageable) {
        return studentsRepository.findAll(pageable);
    }

    @Override
    public List<Students> getAllStudentsSort(Sort sort) {
        return studentsRepository.findAll(sort);
    }

    @Override
    public List<Students> findByName(String name) {
        return studentsRepository.findByName(name);
    }


    @Override
    public int insertOne(Students student) {
        return 0;
    }

    @Override
    public List<Students> getbyAge(Short start, Short e) {
        return studentsRepository.getbyAge(start,e);
    }

}
