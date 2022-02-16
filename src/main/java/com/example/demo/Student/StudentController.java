//API Layer
package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    //injecting StudentService into the constructor using annotation
    @Autowired //with autowired studentService will be magically instantiated
                //and injected into the constructor
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping
    public void setStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }

}
