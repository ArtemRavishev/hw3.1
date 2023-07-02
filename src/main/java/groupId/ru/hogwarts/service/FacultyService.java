package groupId.ru.hogwarts.service;

import groupId.ru.hogwarts.model.Faculty;
import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class FacultyService {


    private final HashMap<Long,Faculty>faculties= new HashMap<>();
    private long lastId=0;


    public Faculty createFaculty(Faculty faculty) {
        faculty.setId(++lastId);
        faculties.put(lastId,faculty);
        return faculty;
    }

    public Faculty getFaculty(long id) {
        return faculties.get(id);
    }

    public Faculty updateFaculty(Faculty faculty) {
        faculties.put(faculty.getId(),faculty);
        return faculty;
    }

    public Faculty deleteFaculty(long id) {
        return faculties.remove(id);
    }

    public Faculty getColorFaculty(String color) {
       return faculties.get(color);
   }
}
