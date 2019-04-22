package exam.data.rest.config;

import exam.data.rest.securityTest.UserEntity;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

@Configuration
public class DataRestConfig implements RepositoryRestConfigurer{

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.setBasePath("/_api");
//        TODO : 요청된 포트에 따라 설정을 바꿔갈수는 없을까
//        config.setDefaultMediaType(MediaType.APPLICATION_JSON);
//        config.useHalAsDefaultJsonMediaType(false);

        // Data Repository 노출 메서드에 Http method 제한걸기
        config.getExposureConfiguration()
                .forDomainType(UserEntity.class)
                    .withItemExposure(((metdata, httpMethods) -> httpMethods.disable(HttpMethod.DELETE, HttpMethod.PATCH)))
                    .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(HttpMethod.DELETE))
                    .withAssociationExposure(((metdata, httpMethods) -> httpMethods.disable(HttpMethod.DELETE, HttpMethod.PATCH)));
    }
}
