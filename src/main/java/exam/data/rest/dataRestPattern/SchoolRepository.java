package exam.data.rest.dataRestPattern;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "school", path = "school")
@Api(tags = "Spring Data Rest Pattern")
public interface SchoolRepository extends JpaRepository<SchoolEntity, Integer> {

    @ApiOperation("이름으로 학교 조회")
    Page<SchoolEntity> findByName(@ApiParam("학교 이름") String name, Pageable p);

    @ApiOperation("이름으로 시작되는 학교 조회")
    Page<SchoolEntity> findByNameStartsWith(@ApiParam("학교 이름") String name, Pageable p);

    @Override
    @RestResource(exported = false)
    void deleteById(Integer integer);

}
