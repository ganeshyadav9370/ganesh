package com.studentDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/students")
public class AppController {

      @GetMapping("/student")
      public Student getStudent() {

            Student student = new Student(1, "Ganesh", "Pune");

            return student;
      }
}
