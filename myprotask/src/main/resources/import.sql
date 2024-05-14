INSERT INTO roles (name) VALUES ('admin');
INSERT INTO roles (name) VALUES ('employee');
INSERT INTO roles (name) VALUES ('manager');
INSERT INTO roles (name) VALUES ('member');

INSERT INTO caracteristics (name) VALUES ('Characteristic 1');

INSERT INTO projects (name, description, start_date, finish_date, vacancies, is_active) VALUES ('Project 1', 'Description 1', '2024-05-10', '2025-06-10', 5, 1);

INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_active, role_id) VALUES ('Laura', 'Jimenez', 'MPT000001', 'laura.jimenez@mpt.com', 'Abcdefg1!', 'profile_pic.png', 'cv.pdf', 1, 1);

INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Task 1', 'Description 1', '2024-07-10', '2024-08-10', 1, 'HIGH', 1);

INSERT INTO user_projects (project_id, user_id, is_active, join_date, exit_date, role_id) VALUES (1, 1, 1, '2024-05-11', '2024-12-10', 1);

INSERT INTO user_tasks (task_id, user_id, is_active) VALUES (1, 1, 1);

INSERT INTO requests (message, project_id, user_id) VALUES ('Request message 1', 1, 1);

INSERT INTO project_caracteristics (caracteristic_id, project_id) VALUES (1, 1);

INSERT INTO user_caracteristics (caracteristic_id, user_id) VALUES (1, 1);