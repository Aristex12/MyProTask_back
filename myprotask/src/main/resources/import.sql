INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('Laura','Jimenez','MPT000001','laura.jimenez@mpt.com','Abcdefg1!','C:\\Users\\a926536\\Downloads\\myphoto.png','C:\\Desktop\\CV_Laura.pdf', 1);
INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('Juan','Perez','MPT000002','juan.perez@mpt.com','Efgh123!','C:\\Users\\a926536\\Downloads\\juan_photo.png','C:\\Desktop\\CV_Juan.pdf', 0);
INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('María','Garcia','MPT000003','maria.garcia@mpt.com','Hijk456!','C:\\Users\\a926536\\Downloads\\maria_photo.png','C:\\Desktop\\CV_Maria.pdf', 0);
INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('Carlos','Martinez','MPT000004','carlos.martinez@mpt.com','Lmno789!','C:\\Users\\a926536\\Downloads\\carlos_photo.png','C:\\Desktop\\CV_Carlos.pdf', 0);
INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('Ana','Lopez','MPT000005','ana.lopez@mpt.com','Pqrs012!','C:\\Users\\a926536\\Downloads\\ana_photo.png','C:\\Desktop\\CV_Ana.pdf', 0);
INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('Pedro','Rodriguez','MPT000006','pedro.rodriguez@mpt.com','Tuvw345!','C:\\Users\\a926536\\Downloads\\pedro_photo.png','C:\\Desktop\\CV_Pedro.pdf', 0);
INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('Sofia','Fernandez','MPT000007','sofia.fernandez@mpt.com','Xyzw678!','C:\\Users\\a926536\\Downloads\\sofia_photo.png','C:\\Desktop\\CV_Sofia.pdf', 0);


INSERT INTO projects (name, description, start_date, finish_date, vacancies, status, manager_id) VALUES ('Project A', 'Description for Project A', '2024-05-10', '2024-12-31', 5, 'IN_PROGRESS', 1); 
INSERT INTO projects (name, description, start_date, finish_date, vacancies, status, manager_id) VALUES ('Project B', 'Description for Project B', '2024-06-01', '2024-11-30', 3, 'FINISHED', 2); 
INSERT INTO projects (name, description, start_date, finish_date, vacancies, status, manager_id) VALUES ('Project C', 'Description for Project C', '2024-07-15', '2025-01-15', 7, 'IN_PROGRESS', 3);

INSERT INTO caracteristics (name) VALUES ('PHP');
INSERT INTO caracteristics (name) VALUES ('Angular');
INSERT INTO caracteristics (name) VALUES ('Python');

INSERT INTO tasks (name, description, start_date, finish_date, project_id, status, priority) VALUES ('Task 1', 'Description for Task 1', '2024-05-15', '2024-06-15', 1, 'IN_PROGRESS', 'HIGH'); 
INSERT INTO tasks (name, description, start_date, finish_date, project_id, status, priority) VALUES ('Task 2', 'Description for Task 2', '2024-06-01', '2024-07-01', 1, 'IN_PROGRESS', 'LOW'); 
INSERT INTO tasks (name, description, start_date, finish_date, project_id, status, priority) VALUES ('Task 3', 'Description for Task 3', '2024-07-15', '2024-08-15', 2, 'FINISHED', 'MID');

INSERT INTO requests (message, status, user_id, project_id) VALUES ('I would like to join this project.', 'ACCEPTED', 2, 1); 
INSERT INTO requests (message, status, user_id, project_id) VALUES ('Can I get more information about this project?', 'DENIED', 3, 2); 
INSERT INTO requests (message, status, user_id, project_id) VALUES ('I have the necessary skills for this project.', 'ACCEPTED', 1, 3);

INSERT INTO members (user_id, project_id) VALUES (1, 1);
INSERT INTO members (user_id, project_id) VALUES (2, 1);
INSERT INTO members (user_id, project_id) VALUES (3, 2);

INSERT INTO history_projects (user_id, project_id) VALUES (1, 1);
INSERT INTO history_projects (user_id, project_id) VALUES (2, 1);
INSERT INTO history_projects (user_id, project_id) VALUES (3, 2);

INSERT INTO user_caracteristics (caracteristic_id, user_id) VALUES (1, 1);
INSERT INTO user_caracteristics (caracteristic_id, user_id) VALUES (2, 1);
INSERT INTO user_caracteristics (caracteristic_id, user_id) VALUES (3, 2);

INSERT INTO project_caracteristics (caracteristic_id, project_id) VALUES (1, 1);
INSERT INTO project_caracteristics (caracteristic_id, project_id) VALUES (2, 1);
INSERT INTO project_caracteristics (caracteristic_id, project_id) VALUES (3, 2);

INSERT INTO participants (user_id, task_id) VALUES (1, 1);
INSERT INTO participants (user_id, task_id) VALUES (2, 2);
INSERT INTO participants (user_id, task_id) VALUES (3, 3);

INSERT INTO history_tasks (user_id, task_id) VALUES (1, 1);
INSERT INTO history_tasks (user_id, task_id) VALUES (2, 2);
INSERT INTO history_tasks (user_id, task_id) VALUES (3, 3);
