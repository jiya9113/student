package com.example.demo.repoistory;

import com.example.demo.model.StudentDataModel;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class StudentDataRepo {
    private Map<String, StudentDataModel> studentDataMap;

    public StudentDataRepo() {
        studentDataMap = new HashMap<>();
    }

    public StudentDataModel getStudentById(final String id) {
        return studentDataMap.getOrDefault(id, null);
    }

    public void deleteEmployee(final String id) {
        employeeDataMap.remove(id);
    }

    public EmployeeDataModel updateEmployee(final String id, final String name, final String age) {
        EmployeeDataModel newEmployeeDataModel = getEmployeeById(id);
        newEmployeeDataModel.setAge(age);
        newEmployeeDataModel.setName(name);
        return newEmployeeDataModel;
    }

    public EmployeeDataModel createEmployee(final String id, final String name, final String age) {
        EmployeeDataModel newEmployeeDataModel = new EmployeeDataModel(id, name, age);
        employeeDataMap.put(id, newEmployeeDataModel);
        return newEmployeeDataModel;
    }
}
