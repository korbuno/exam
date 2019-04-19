package exam.data.rest.dataRestPattern;

import exam.data.rest.dataJPAPattern.StudentEntity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class SchoolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "schoolId")
    private Collection<StudentEntity> studentEntity;

    public Collection<StudentEntity> getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(Collection<StudentEntity> studentEntity) {
        this.studentEntity = studentEntity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
