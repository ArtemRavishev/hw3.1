package groupId.ru.hogwarts.service;

import groupId.ru.hogwarts.model.Faculty;
import groupId.ru.hogwarts.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class StudentService {

    private final HashMap<Long, Student> students = new HashMap<>();
    private long lastId=0;

    public Student createStudent(Student student) {
        student.setId(++lastId);
        students.put(lastId,student);
        return student;
    }

    public Student getStudent(long id) {
        return students.get(id);
    }

    public Student updateStudent(Student student) {
        students.put(student.getId(),student);
        return student;
    }

    public Student deleteStudent(long id) {
        return students.remove(id);
    }

    public Student getAgeStudent(int age) {
        return students.get(age);
    }
}
