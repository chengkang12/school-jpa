package com.lenovo.mt.repository.primary;

import com.lenovo.mt.model.primary.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentsRepository extends JpaRepository<Students,Integer> {
    List<Students> findByName(String name);

    @Query("SELECT s FROM Students s WHERE s.age BETWEEN :start AND :e")
    List<Students> getbyAge(@Param("start") Short start, @Param("e") Short e);
}
