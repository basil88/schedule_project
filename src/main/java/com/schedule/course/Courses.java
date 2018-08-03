package com.schedule.course;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
@Data
public class Courses {

    @Id
    @Column(name = "course_num")
    private int courseNumb;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_credit")
    private int creditPoints;

}
