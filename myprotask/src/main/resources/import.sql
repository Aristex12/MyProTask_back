INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('Laura','Jimenez','MPT000001','laura.jimenez@mpt.com','A@1abcdefgh','C:\\Users\\a926536\\Downloads\\myphoto.png','C:\\Desktop\\CV_Laura.pdf', 1);
INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('Juan','Perez','MPT000002','juan.perez@mpt.com','Z*9zyxwvu','C:\\Users\\a926536\\Downloads\\juan_photo.png','C:\\Desktop\\CV_Juan.pdf', 0);
INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('María','Garcia','MPT000003','maria.garcia@mpt.com','X#5tsrqpon','C:\\Users\\a926536\\Downloads\\maria_photo.png','C:\\Desktop\\CV_Maria.pdf', 0);
INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('Carlos','Martinez','MPT000004','carlos.martinez@mpt.com','H@6abcdefghijklm','C:\\Users\\a926536\\Downloads\\carlos_photo.png','C:\\Desktop\\CV_Carlos.pdf', 0);
INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('Ana','Lopez','MPT000005','ana.lopez@mpt.com','Y$7fghijklmnop','C:\\Users\\a926536\\Downloads\\ana_photo.png','C:\\Desktop\\CV_Ana.pdf', 0);
INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('Pedro','Rodriguez','MPT000006','pedro.rodriguez@mpt.com','P*8qrstuvwxyz','C:\\Users\\a926536\\Downloads\\pedro_photo.png','C:\\Desktop\\CV_Pedro.pdf', 0);
INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('Sofia','Fernandez','MPT000007','sofia.fernandez@mpt.com','Q!9ijklmnopqrstuv','C:\\Users\\a926536\\Downloads\\sofia_photo.png','C:\\Desktop\\CV_Sofia.pdf', 0);

INSERT INTO caracteristics (name) VALUES ('Characteristic 1');

INSERT INTO projects (name, description, start_date, finish_date, vacancies, is_active) VALUES ('Project 1', 'Description 1', '2024-05-10', '2025-06-10', 5, 1);

INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_active, role_id) VALUES ('Laura', 'Jimenez', 'MPT000001', 'laura.jimenez@mpt.com', 'Abcdefg1!', 'profile_pic.png', 'cv.pdf', 1, 1);

INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Task 1', 'Description 1', '2024-07-10', '2024-08-10', 1, 'HIGH', 1);

INSERT INTO user_projects (project_id, user_id, is_active, join_date, exit_date, role_id) VALUES (1, 1, 1, '2024-05-11', '2024-12-10', 1);

INSERT INTO user_tasks (task_id, user_id, is_active) VALUES (1, 1, 1);

INSERT INTO requests (message, project_id, user_id) VALUES ('Request message 1', 1, 1);

INSERT INTO project_caracteristics (caracteristic_id, project_id) VALUES (1, 1);

INSERT INTO user_caracteristics (caracteristic_id, user_id) VALUES (1, 1);