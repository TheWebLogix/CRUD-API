package com.example.studentinformation.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl {
@Autowired StudentRepository repo;

//    public void save(Student student) {
//    repo.save(student);
//    }
//
//    public List<Student> listAll() {
//    return (List<Student>) repo.findAll();
//    }
//
//    public Student get(Integer id) throws UserNotFoundException{
//        Optional<Student> result= repo.findById(id);
//        if (result.isPresent()){
//            return result.get();
//        }
//        throw new UserNotFoundException("Could not find any users with this ID"+id);
//    }
//
//    public void delete(Integer id){
//        repo.deleteById(id);
//    }


}
