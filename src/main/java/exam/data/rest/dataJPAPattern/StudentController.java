package exam.data.rest.dataJPAPattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentRepository repository;

    @GetMapping("/student/{id}")
    public StudentEntity student(@PathVariable Integer id) {
        return repository.findById(id).get();
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        repository.deleteById(id);
    }

}
