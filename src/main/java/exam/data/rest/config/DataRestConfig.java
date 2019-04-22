package exam.data.rest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class DataRestConfig implements RepositoryRestConfigurer{

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.setBasePath("/_api");
//        TODO : 요청된 포트에 따라 설정을 바꿔갈수는 없을까
//        config.setDefaultMediaType(MediaType.APPLICATION_JSON);
//        config.useHalAsDefaultJsonMediaType(false);
    }
}
