package groupId.ru.hogwarts.controller;


import groupId.ru.hogwarts.model.Faculty;
import groupId.ru.hogwarts.model.Student;
import groupId.ru.hogwarts.service.FacultyService;
import groupId.ru.hogwarts.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("faculty")
public class FacultyController {

    @GetMapping
    public String testApi() {
        return "Я распределяющая шляпа и я здесь решаю в каком факультете вам учиться хе-хе";
    }

    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }


    @PostMapping
    public Faculty createFaculty(@RequestBody Faculty faculty) {
        return facultyService.createFaculty(faculty);
    }

    @GetMapping("{id}")
    public Faculty getFaculty(@PathVariable Long id) {
        return facultyService.getFaculty(id);

    }

    @PutMapping()
    public Faculty updateFaculty(@RequestBody  Faculty faculty) {
        return facultyService.updateFaculty(faculty);
    }

    @DeleteMapping("{id}")
    public Faculty deleteFaculty(@PathVariable Long id) {
        return facultyService.deleteFaculty(id);
    }

    @GetMapping("faculty/{color}")
   public Faculty getColorFaculty(@PathVariable String color) {
        return facultyService.getColorFaculty(color);
    }
}