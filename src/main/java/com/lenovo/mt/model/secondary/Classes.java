package com.lenovo.mt.model.secondary;

import javax.persistence.*;

@Entity
@Table(name = "Classes")
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ClsName")
    private String clsname;

    private Integer grade;

    @OneToOne(targetEntity = Grade.class,fetch = FetchType.EAGER)
    @JoinColumn(name = "Grade",referencedColumnName = "ID")
    private Grade gradeDetail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClsname() {
        return clsname;
    }

    public void setClsname(String clsname) {
        this.clsname = clsname == null ? null : clsname.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Grade getGradeDetail() {
        return gradeDetail;
    }

    public void setGradeDetail(Grade gradeDetail) {
        this.gradeDetail = gradeDetail;
    }
}