INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('Laura','Jiménez','A123456','laurajimenez@gmail.com','1234','C:\\Users\\a926536\\Downloads\\myphoto.png','C:\\Desktop\\CV_Laura.pdf', 1);
INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('Juan','Pérez','B789012','juanperez@gmail.com','5678','C:\\Users\\a926536\\Downloads\\juan_photo.png','C:\\Desktop\\CV_Juan.pdf', 0);
INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('María','García','C345678','mariagarcia@gmail.com','9012','C:\\Users\\a926536\\Downloads\\maria_photo.png','C:\\Desktop\\CV_Maria.pdf', 0);
INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('Carlos','Martínez','D901234','carlosmartinez@gmail.com','3456','C:\\Users\\a926536\\Downloads\\carlos_photo.png','C:\\Desktop\\CV_Carlos.pdf', 0);
INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('Ana','López','E567890','analorena@gmail.com','7890','C:\\Users\\a926536\\Downloads\\ana_photo.png','C:\\Desktop\\CV_Ana.pdf', 0);
INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('Pedro','Rodríguez','F123455','pedrorodriguez@gmail.com','2345','C:\\Users\\a926536\\Downloads\\pedro_photo.png','C:\\Desktop\\CV_Pedro.pdf', 0);
INSERT INTO users (name, last_name, das, email, password, profile_pic, cv, is_admin) VALUES ('Sofía','Fernández','G678901','sofiafernandez@gmail.com','6789','C:\\Users\\a926536\\Downloads\\sofia_photo.png','C:\\Desktop\\CV_Sofia.pdf', 0);

INSERT INTO projects (name, description, start_date, finish_date, vacancies, manager_id) VALUES ('Project A', 'Description for Project A', '2024-05-10', '2024-12-31', 5, 1); 
INSERT INTO projects (name, description, start_date, finish_date, vacancies, manager_id) VALUES ('Project B', 'Description for Project B', '2024-06-01', '2024-11-30', 3, 2); 
INSERT INTO projects (name, description, start_date, finish_date, vacancies, manager_id) VALUES ('Project C', 'Description for Project C', '2024-07-15', '2025-01-15', 7, 3);

INSERT INTO caracteristics (name) VALUES ('PHP');
INSERT INTO caracteristics (name) VALUES ('Angular');
INSERT INTO caracteristics (name) VALUES ('Python');

INSERT INTO tasks (name, description, start_date, finish_date, project_id, status) VALUES ('Task 1', 'Description for Task 1', '2024-05-15', '2024-06-15', 1, 'In Progress'); 
INSERT INTO tasks (name, description, start_date, finish_date, project_id, status) VALUES ('Task 2', 'Description for Task 2', '2024-06-01', '2024-07-01', 1, 'Pending'); 
INSERT INTO tasks (name, description, start_date, finish_date, project_id, status) VALUES ('Task 3', 'Description for Task 3', '2024-07-15', '2024-08-15', 2, 'Completed');

INSERT INTO requests (message, status, user_id, project_id) VALUES ('I would like to join this project.', 'Pending', 2, 1); 
INSERT INTO requests (message, status, user_id, project_id) VALUES ('Can I get more information about this project?', 'Pending', 3, 2); 
INSERT INTO requests (message, status, user_id, project_id) VALUES ('I have the necessary skills for this project.', 'Approved', 1, 3);

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
