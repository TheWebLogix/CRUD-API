package com.example.studentinformation;

import com.example.studentinformation.Student.Department;
import com.example.studentinformation.Student.Student;
import com.example.studentinformation.Student.StudentRepository;
import com.example.studentinformation.Student.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentInformationApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository repo;
    @Autowired
    private StudentServiceImpl service;

    public static void main(String[] args){
        SpringApplication.run(StudentInformationApplication.class);
    }
    @Override
    public void run(String... args) throws Exception {

//        Student student = new Student();
//        student.setFirstName("c2xzd");
//        student.setLastName("ka6ASd");
//        student.setEmail("sa6Sd");
//        Department department = new Department();
//        department.setName("AS9dsS");
//        department.setStudent(student);
//        student.setDepartment(department);
//        Student save = repo.save(student);
//        logger.info("saved student");
    }
}
