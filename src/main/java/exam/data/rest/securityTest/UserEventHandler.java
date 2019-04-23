package exam.data.rest.securityTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import java.util.ArrayList;
import java.util.List;

@RepositoryEventHandler
public class UserEventHandler {

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PrivilegeRepository privilegeRepository;

    // 해당 객체를 빈으로 등록하니 해결됬음.
    @HandleBeforeCreate
    public void handleUserEntityBeforeCreate(UserEntity user) {
        List<RoleEntity> defaultRoles = new ArrayList<RoleEntity>();
        RoleEntity defaultRole = roleRepository.findByName("ROLE_USER");
        defaultRole.setPrivileges(privilegeRepository.findAll());
        defaultRoles.add(defaultRole);
        user.setRoles(defaultRoles);
    }
}
