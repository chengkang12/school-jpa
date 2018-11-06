package com.lenovo.mt;

import com.lenovo.mt.handler.api.IStudentsHander;
import com.lenovo.mt.model.primary.Students;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShcoolJpaApplicationTests {

    @Autowired
    private IStudentsHander studentsHander;

    @Test
    public void contextLoads() {
    }


    @Test
    public void getAllStudents() {
        List<Students> students = studentsHander.getAllStudentsSort(new Sort(Sort.Direction.DESC,"id"));
    }

    @Test
    public void getAllStudentsPage() {
        Page<Students> students = studentsHander.getAllStudents(PageRequest.of(1,2));
    }


    @Test
    public void getbetweenStudents() {
        List<Students> students = studentsHander.getbyAge((short)9,(short)13);
    }

    @Test
    public void getStudentsByName() {
        List<Students> students = studentsHander.findByName("小明2");
    }

}
