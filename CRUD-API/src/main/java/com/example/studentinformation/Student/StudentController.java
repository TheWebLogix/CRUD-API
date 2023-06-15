package com.example.studentinformation.Student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@RestController
    public class StudentController {
    @Autowired
    private StudentServiceImpl service;
    @Autowired StudentRepository repo;

    @GetMapping("/student")
    public List<Student> showStudent(Model model){
        return repo.findAll();
    }


    @PostMapping("/student")
    public  Student savedStudent(@RequestBody Student student){
            return repo.save(student);
    }

    @GetMapping("student/{id}")
    public Optional<Student> showEditForm(@PathVariable Integer id){
        return repo.findById(id);
    }

    @PutMapping("student/edit/{id}")
    public Student updateForm(@RequestBody Student student, @PathVariable Integer id){
        student.setId(id);
        return repo.save(student);
    }

    @DeleteMapping("student/delete/{id}")
    public void deleteStudent(@PathVariable Integer id){
        repo.deleteById(id);
    }


//    @GetMapping("student/delete/{id}")
//    public String deleteUser(@PathVariable("id") Integer id){
//            service.delete(id);
//        return "redirect:/student";
//    }

}
