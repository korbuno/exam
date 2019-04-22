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

    // 왜 안되냐ㅠㅠ
    // TODO : 유저정보 입력 > 권한 정보 삽입 > 역할 삽입 > 유저정보 저장
    @HandleBeforeCreate
    public void handleUserEntityBeforeCreate(UserEntity user) {
        List<RoleEntity> defaultRoles = new ArrayList<RoleEntity>();
        RoleEntity defaultRole = roleRepository.findByName("ROLE_USER");
        defaultRole.setPrivileges(privilegeRepository.findAll());
        defaultRoles.add(defaultRole);
        user.setRoles(defaultRoles);
    }
}
