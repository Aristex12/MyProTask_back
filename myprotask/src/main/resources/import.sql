INSERT INTO roles (name) VALUES ('admin');
INSERT INTO roles (name) VALUES ('employee');
INSERT INTO roles (name) VALUES ('manager');
INSERT INTO roles (name) VALUES ('member');

INSERT INTO characteristics (name) VALUES ('Java');
INSERT INTO characteristics (name) VALUES ('Python');
INSERT INTO characteristics (name) VALUES ('JavaScript');
INSERT INTO characteristics (name) VALUES ('C++');
INSERT INTO characteristics (name) VALUES ('HTML');
INSERT INTO characteristics (name) VALUES ('CSS');
INSERT INTO characteristics (name) VALUES ('SQL');
INSERT INTO characteristics (name) VALUES ('React');
INSERT INTO characteristics (name) VALUES ('Angular');
INSERT INTO characteristics (name) VALUES ('Node.js');
INSERT INTO characteristics (name) VALUES ('Kotlin');
INSERT INTO characteristics (name) VALUES ('PHP');
INSERT INTO characteristics (name) VALUES ('ASP.NET');

INSERT INTO users (name, last_name,das, email, password, profile_pic,cv, is_active, role_id) VALUES ('Laura', 'Jimenez', 'MPT000001', 'laura.jimenez@mpt.com', 'Abcdefg1!', 'profile_pic.png', 'cv.pdf', 1, 1);
INSERT INTO users (name, last_name,das, email, password, profile_pic,cv, is_active, role_id) VALUES ('Juan', 'Perez', 'MPT000002', 'juan.perez@mpt.com', 'Abcdefg1!', 'profile_pic.png', 'cv.pdf', 1, 2);

INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (1, 1, 8);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (9, 1, 5);