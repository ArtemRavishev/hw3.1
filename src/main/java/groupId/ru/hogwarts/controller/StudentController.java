package groupId.ru.hogwarts.controller;

import groupId.ru.hogwarts.model.Student;
import groupId.ru.hogwarts.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("student")
@RestController
public class StudentController {

    @GetMapping
    public String testApi() {
        return "Я вас категорически приветсвую в школе магии";
    }

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping("{id}")
    public Student getStudent(@PathVariable Long id) {
        return studentService.getStudent(id);

    }

    @PutMapping()
    public Student updateStudent(@RequestBody  Student student) {
        return studentService.updateStudent( student);
    }

    @DeleteMapping("{id}")
    public Student deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }

    @GetMapping("/{age}")
    public Student getAgeStudent(@PathVariable int age) {
        return studentService.getAgeStudent(age);
    }
}


