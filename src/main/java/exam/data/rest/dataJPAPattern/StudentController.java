package exam.data.rest.dataJPAPattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RepositoryRestController
public class StudentController {

    @Autowired
    StudentRepository repository;

    @RequestMapping(method = RequestMethod.GET, value = "/student/get/{id}")
    public @ResponseBody ResponseEntity<StudentEntity> student(@PathVariable Integer id) {
        Optional<StudentEntity> student = repository.findById(id);
        return ResponseEntity.of(student);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        repository.deleteById(id);
    }

}
