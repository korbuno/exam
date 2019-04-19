INSERT INTO school_entity (name) VALUES
    ('test1'),
    ('test2'),
    ('test3'),
    ('test4'),
    ('test5'),
    ('test6'),
    ('test7'),
    ('test8'),
    ('test9'),
    ('test10');

INSERT INTO student_entity (first_name, last_name, major, school_id) VALUES
    ('test1', 'test1', 'exam-major1', 1),
    ('test2', 'test2', 'exam-major2', 2),
    ('test3', 'test3', 'exam-major3', 2),
    ('test4', 'test4', 'exam-major4', 3),
    ('test5', 'test5', 'exam-major5', 3),
    ('test6', 'test6', 'exam-major6', 3),
    ('test7', 'test7', 'exam-major7', 4),
    ('test8', 'test8', 'exam-major8', 4),
    ('test9', 'test9', 'exam-major9', 4),
    ('test10', 'test10', 'exam-major10', 4);

INSERT INTO privilege_entity (name) VALUES
    ('READ_PRIVILGE'),
    ('WRITE_PRIVILGE');

INSERT INTO role_entity (name) VALUES
    ('ROLE_ADMIN'),
    ('ROLE_USER');

INSERT INTO user_entity (username, password) VALUES
    ('test', 'test'),
    ('test2', 'test2');

INSERT INTO users_roles (user_entity_id, role_entity_id) VALUES
    (1, 1);

INSERT INTO roles_privileges (role_entity_id, privilege_entity_id) VALUES
    (1, 1);
