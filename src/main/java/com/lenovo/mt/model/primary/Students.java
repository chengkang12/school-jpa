package com.lenovo.mt.model.primary;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name="Age")
    private Short age;

    private Integer cls;

    @OneToOne(targetEntity = Classes.class,fetch = FetchType.EAGER)
    @JoinColumn(name = "Cls",referencedColumnName = "ID")
    private Classes classes;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }


    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Integer getCls() {
        return cls;
    }

    public void setCls(Integer cls) {
        this.cls = cls;
    }
}