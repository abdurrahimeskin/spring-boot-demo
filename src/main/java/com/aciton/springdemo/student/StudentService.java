package com.aciton.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "StudentOne",
                        "theFirst",
                        LocalDate.now(),
                        "contact_me@action.com",
                        28
                ),
                new Student(
                        "StudentTwo",
                        "theSecond",
                        LocalDate.now(),
                        "contact_me@action.com",
                        29
                )
        );
    }
}
