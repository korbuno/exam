package exam.data.rest.dataJPAPattern;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "student", path = "student")
@Api(tags = "Spring Data JPA Pattern")
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

    @ApiOperation("첫번째 이름으로 학생 조회")
    List<StudentEntity> findByFirstName(@ApiParam("학생의 첫번째 이름") String firstName);
}
