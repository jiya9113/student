pacakage com.example.demo.controller;

import com.example.demo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    public final Map<String,StudentModel> mapIdToStudent = new HashMap<>();
    public final Map<String,List<StudentModel>> mapUniversityToStudent = new HashMap<>();

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody string name, @RequestBody int age, @RequestBody String adhar, @RequestBody String University){
        String id = UUID.randomUUID().toString();
        StudentModel student = new StudentModel(id,name,age,adhar,university);
        List<StudentModel> students=mapUniversityToStudent.getOrDefault(university,new ArrayList<>());
        students.add(student);
        mapIdToStudent.put(id,student);
        mapUniversityToStudent.put(university,students);
        return id;
    }

    @GetMapping("/getStudentsByUniversity/{university}")
    public List<StudentModel> getStudentsByUniversity(String university){
        return mapUniversityToStudent.getOrDefault(university,null);
    }

    @GetMapping("/getStudentById/{id}")
    public StudentModel getStudentsByUniversity(String id){
        return mapIdToStudent.getOrDefault(id,null);
    }
}

