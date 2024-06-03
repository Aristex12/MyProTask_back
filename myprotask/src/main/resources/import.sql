INSERT INTO roles (name) VALUES ('admin');
INSERT INTO roles (name) VALUES ('employee');
INSERT INTO roles (name) VALUES ('manager');
INSERT INTO roles (name) VALUES ('member');
 
 
INSERT INTO categories (name, is_technical) VALUES ('Programming Language', 1);
INSERT INTO categories (name, is_technical) VALUES ('Technologies', 1);
INSERT INTO categories (name, is_technical) VALUES ('Languages', 0);


INSERT INTO characteristics (name, category_id) VALUES ('JavaScript', 1);
INSERT INTO characteristics (name, category_id) VALUES ('Python', 1);
INSERT INTO characteristics (name, category_id) VALUES ('Java', 1);
INSERT INTO characteristics (name, category_id) VALUES ('C#', 1);
INSERT INTO characteristics (name, category_id) VALUES ('Ruby', 1);
INSERT INTO characteristics (name, category_id) VALUES ('PHP', 1);
INSERT INTO characteristics (name, category_id) VALUES ('Swift', 1);
INSERT INTO characteristics (name, category_id) VALUES ('Kotlin', 1);
INSERT INTO characteristics (name, category_id) VALUES ('C++', 1);
INSERT INTO characteristics (name, category_id) VALUES ('TypeScript', 1);
 
INSERT INTO characteristics (name, category_id) VALUES ('ASP.NET', 2);
INSERT INTO characteristics (name, category_id) VALUES ('React', 2);
INSERT INTO characteristics (name, category_id) VALUES ('Angular', 2);
INSERT INTO characteristics (name, category_id) VALUES ('Vue.js', 2);
INSERT INTO characteristics (name, category_id) VALUES ('Django', 2);
INSERT INTO characteristics (name, category_id) VALUES ('Spring Boot', 2);
INSERT INTO characteristics (name, category_id) VALUES ('Ruby on Rails', 2);
INSERT INTO characteristics (name, category_id) VALUES ('Laravel', 2);
INSERT INTO characteristics (name, category_id) VALUES ('Node.js', 2);
INSERT INTO characteristics (name, category_id) VALUES ('Flask', 2);
 
INSERT INTO characteristics (name, category_id) VALUES ('Spanish', 3);
INSERT INTO characteristics (name, category_id) VALUES ('English', 3);
INSERT INTO characteristics (name, category_id) VALUES ('French', 3);
INSERT INTO characteristics (name, category_id) VALUES ('German', 3);
INSERT INTO characteristics (name, category_id) VALUES ('Italian', 3);
INSERT INTO characteristics (name, category_id) VALUES ('Portuguese', 3);
INSERT INTO characteristics (name, category_id) VALUES ('Chinese', 3);
INSERT INTO characteristics (name, category_id) VALUES ('Japanese', 3);
INSERT INTO characteristics (name, category_id) VALUES ('Russian', 3);
INSERT INTO characteristics (name, category_id) VALUES ('Arabic', 3);



INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Tresom', 'Development of an AI-driven customer service chatbot', '2023-10-08', '2028-05-12', 'projectpic.png', 86, 1);
INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Prodder', 'Building a scalable e-commerce platform', '2024-05-05', '2029-07-09', 'projectpic.png', 68, 1);
INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Bitchip', 'Implementing a secure blockchain payment system', '2024-04-13', '2027-05-08', 'projectpic.png', 34, 1);
INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Y-find', 'Creating an AI-powered search engine for enterprise data', '2023-07-18', '2028-04-28', 'projectpic.png', 21, 1);
INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Quo Lux', 'Developing a real-time analytics dashboard', '2024-03-15', '2027-09-23', 'projectpic.png', 30, 1);
INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Holdlamis', 'Building a cloud-based file storage solution', '2023-07-28', '2029-07-21', 'projectpic.png', 22, 1);
INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Pannier', 'Creating a mobile app for personal finance management', '2024-02-26', '2028-03-26', 'projectpic.png', 86, 1);
INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Tampflex', 'Developing a telehealth consultation platform', '2024-01-28', '2027-06-14', 'projectpic.png', 66, 1);
INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Zamit', 'Building a comprehensive CRM system for SMEs', '2024-02-17', '2027-12-31', 'projectpic.png', 58, 1);
INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Bamity', 'Developing an AI-based project management tool', '2024-04-30', '2027-07-31', 'projectpic.png', 40, 1);
INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Sonsing', 'Creating a cloud-native microservices architecture', '2024-04-26', '2026-09-15', 'projectpic.png', 45, 0);
INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Flexidy', 'Building an automated marketing email platform', '2024-12-28', '2030-07-02', 'projectpic.png', 58, 1);
INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Tamity', 'Implementing a next-gen firewall solution', '2024-05-02', '2025-09-06', 'projectpic.png', 20, 0);
INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Latlux', 'Developing a virtual reality training program', '2024-05-29', '2026-11-14', 'projectpic.png', 64, 1);
INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Otcom', 'Creating a mobile health tracking application', '2023-07-22', '2031-10-10', 'projectpic.png', 50, 0);
INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Stronghold', 'Building a robust cybersecurity framework', '2023-10-08', '2025-04-14', 'projectpic.png', 16, 0);
INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Voyatouch', 'Developing an advanced data analytics platform', '2022-11-21', '2027-05-30', 'projectpic.png', 56, 1);
INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Flowdesk', 'Creating an AI-driven supply chain management system', '2022-01-19', '2035-07-15', 'projectpic.png', 29, 0);
INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Overhold', 'Building an IoT-based home automation system', '2022-12-06', '2029-11-01', 'projectpic.png', 8, 1);
INSERT INTO projects (name, description, start_date, finish_date, project_pic, vacancies, is_active) VALUES ('Fintone', 'Developing a financial portfolio management app', '2022-07-03', '2028-04-06', 'projectpic.png', 18, 0);


INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Laura', 'Jimenez', 'MPT000001', 'laura.jimenez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'I am a dedicated team player and quick learner.', 'profile_pic.png', 'cv.pdf', 5, 1, 1);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Hugo', 'Crespo', 'MPT000002', 'hugo.crespo@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Creative thinker with a passion for problem-solving.', 'profile_pic.png', 'cv.pdf', 4, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Sergio', 'Ramos', 'MPT000003', 'sergio.ramos@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Responsible and committed to delivering quality work.', 'profile_pic.png', 'cv.pdf', 5, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Anas', 'Rami', 'MPT000004', 'anas.rami@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Team-oriented with excellent communication skills.', 'profile_pic.png', 'cv.pdf', 6, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Alejandro', 'Cuesta', 'MPT000005', 'alejandro.cuesta@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'I enjoy taking on challenges and learning new things.', 'profile_pic.png', 'cv.pdf', 0, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Aris', 'Khus', 'MPT000006', 'aris.khus@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Detail-oriented and committed to project success.', 'profile_pic.png', 'cv.pdf', 0, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Ivan', 'Garcia', 'MPT000007', 'ivan.garcia@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'I bring a positive attitude and high energy to the team.', 'profile_pic.png', 'cv.pdf', 0, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Manuel', 'Sanz', 'MPT000008', 'manuel.sanz@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Innovative thinker with a strong work ethic.', 'profile_pic.png', 'cv.pdf', 3, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Kevin Sebastián', 'Bayas', 'MPT000009', 'kevin.sebastian.bayas@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'I excel in fast-paced and dynamic environments.', 'profile_pic.png', 'cv.pdf', 3, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES('Miguel', 'Garcia', 'MPT000010', 'miguel.garcia@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'I am a proactive and resourceful team member.', 'profile_pic.png', 'cv.pdf', 3, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Elena', 'Ramirez', 'MPT000011', 'elena.ramirez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'I am a creative thinker and team collaborator.', 'profile_pic.png', 'cv.pdf', 3, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Javier', 'Torres', 'MPT000012', 'javier.torres@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Dedicated and detail-oriented professional.', 'profile_pic.png', 'cv.pdf', 4, 0, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Paula', 'Moreno', 'MPT000013', 'paula.moreno@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'I bring innovative solutions and a positive attitude.', 'profile_pic.png', 'cv.pdf', 4, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('David', 'Ruiz', 'MPT000014', 'david.ruiz@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Experienced in project management and teamwork.', 'profile_pic.png', 'cv.pdf', 4, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Carmen', 'Alvarez', 'MPT000015', 'carmen.alvarez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Passionate about technology and continuous learning.', 'profile_pic.png', 'cv.pdf', 5, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Adrián', 'Gómez', 'MPT000016', 'adrian.gomez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'I thrive in collaborative and fast-paced environments.', 'profile_pic.png', 'cv.pdf', 2, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Silvia', 'Hernandez', 'MPT000017', 'silvia.hernandez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Strong background in software development and teamwork.', 'profile_pic.png', 'cv.pdf', 2, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Alejandro', 'Muñoz', 'MPT000018', 'alejandro.munoz@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Proactive and highly motivated team member.', 'profile_pic.png', 'cv.pdf', 2, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Lucia', 'Vazquez', 'MPT000019', 'lucia.vazquez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'I excel in creative problem-solving and teamwork.', 'profile_pic.png', 'cv.pdf', 2, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Diego', 'Iglesias', 'MPT000020', 'diego.iglesias@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'I am a proactive and detail-oriented professional.', 'profile_pic.png', 'cv.pdf', 3, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Valeria', 'Santiago', 'MPT000021', 'valeria.santiago@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Creative problem-solver with a team spirit.', 'profile_pic.png', 'cv.pdf', 3, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Guillermo', 'Ortega', 'MPT000022', 'guillermo.ortega@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Passionate about technology and innovation.', 'profile_pic.png', 'cv.pdf', 4, 0, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Raquel', 'Jimenez', 'MPT000023', 'raquel.jimenez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Dedicated to continuous improvement and learning.', 'profile_pic.png', 'cv.pdf', 5, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Samuel', 'Perez', 'MPT000024', 'samuel.perez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'I excel in collaborative and dynamic environments.', 'profile_pic.png', 'cv.pdf', 2, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Isabel', 'Gonzalez', 'MPT000025', 'isabel.gonzalez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Team player with strong analytical skills.', 'profile_pic.png', 'cv.pdf', 1, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Natalia', 'Rodriguez', 'MPT000026', 'natalia.rodriguez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Creative and resourceful professional.', 'profile_pic.png', 'cv.pdf', 2, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Ruben', 'Martinez', 'MPT000027', 'ruben.martinez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Driven by results and continuous learning.', 'profile_pic.png', 'cv.pdf', 3, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Patricia', 'Sanchez', 'MPT000028', 'patricia.sanchez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'I bring innovation and creativity to my work.', 'profile_pic.png', 'cv.pdf', 4, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Sara', 'Lopez', 'MPT000029', 'sara.lopez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Committed to delivering high-quality results.', 'profile_pic.png', 'cv.pdf', 5, 0, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Alvaro', 'Fernandez', 'MPT000030', 'alvaro.fernandez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Enthusiastic about teamwork and innovation.', 'profile_pic.png', 'cv.pdf', 6, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('María', 'Martínez', 'MPT000031', 'maria.martinez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Dedicated to delivering high-quality solutions.', 'profile_pic.png', 'cv.pdf', 6, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Daniel', 'Gomez', 'MPT000032', 'daniel.gomez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Creative problem-solver with a strong work ethic.', 'profile_pic.png', 'cv.pdf', 3, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Andrea', 'Perez', 'MPT000033', 'andrea.perez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'I am a proactive team player with excellent communication skills.', 'profile_pic.png', 'cv.pdf', 4, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Jorge', 'Ruiz', 'MPT000034', 'jorge.ruiz@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Detail-oriented and committed to achieving project goals.', 'profile_pic.png', 'cv.pdf', 4, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Cristina', 'Hernández', 'MPT000035', 'cristina.hernandez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'I thrive in collaborative and dynamic environments.', 'profile_pic.png', 'cv.pdf', 3, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Sergio', 'Díaz', 'MPT000036', 'sergio.diaz@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Experienced professional with a passion for technology.', 'profile_pic.png', 'cv.pdf', 2, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Marta', 'Fernández', 'MPT000037', 'marta.fernandez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Innovative thinker with a strong analytical mindset.', 'profile_pic.png', 'cv.pdf', 2, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Pablo', 'Sánchez', 'MPT000038', 'pablo.sanchez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Committed to delivering high-quality results.', 'profile_pic.png', 'cv.pdf', 2, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Ana', 'López', 'MPT000039', 'ana.lopez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Dedicated to continuous improvement and learning.', 'profile_pic.png', 'cv.pdf', 3, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Carlos', 'García', 'MPT000040', 'carlos.garcia@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Passionate about technology and innovation.', 'profile_pic.png', 'cv.pdf', 3, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Eva', 'Martínez', 'MPT000041', 'eva.martinez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Detail-oriented and committed to achieving project goals.', 'profile_pic.png', 'cv.pdf', 4, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Santiago', 'Fernández', 'MPT000042', 'santiago.fernandez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'I thrive in collaborative and dynamic environments.', 'profile_pic.png', 'cv.pdf', 4, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Nerea', 'González', 'MPT000043', 'nerea.gonzalez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Experienced professional with a passion for technology.', 'profile_pic.png', 'cv.pdf', 4, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Iker', 'Martín', 'MPT000044', 'iker.martin@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Innovative thinker with a strong analytical mindset.', 'profile_pic.png', 'cv.pdf', 3, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Leire', 'Sánchez', 'MPT000045', 'leire.sanchez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Committed to delivering high-quality results.', 'profile_pic.png', 'cv.pdf', 4, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Jon', 'Hernández', 'MPT000046', 'jon.hernandez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Driven by results and continuous learning.', 'profile_pic.png', 'cv.pdf', 3, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Ainhoa', 'Martínez', 'MPT000047', 'ainhoa.martinez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Dedicated to continuous improvement and learning.', 'profile_pic.png', 'cv.pdf', 4, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Unai', 'García', 'MPT000048', 'unai.garcia@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Passionate about technology and innovation.', 'profile_pic.png', 'cv.pdf', 3, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Marina', 'Fernández', 'MPT000049', 'marina.fernandez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Experienced professional with a passion for technology.', 'profile_pic.png', 'cv.pdf', 4, 1, 2);
INSERT INTO users (name, last_name, das, email, password, description, profile_pic, cv, avg_last_eva, is_active, role_id) VALUES ('Lucas', 'González', 'MPT000050', 'lucas.gonzalez@mpt.com', '$2a$12$37NOeKZKSA0rbsgKoWQCOOO4pimzBup8c1ae9OwB5qTqMY/f7UC02', 'Innovative thinker with a strong analytical mindset.', 'profile_pic.png', 'cv.pdf', 3, 1, 2);


INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES('Requirement Analysis', 'Analyze and gather requirements for the AI-driven chatbot', '2023-10-10', '2023-12-10', 1, 'HIGH', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Design Chatbot Architecture', 'Design the overall architecture of the chatbot', '2023-12-11', '2024-02-10', 1, 'HIGH', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Collection', 'Collect customer service interaction data for training the chatbot', '2024-02-11', '2024-04-10', 1, 'MID', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Cleaning', 'Clean and preprocess the collected data', '2024-04-11', '2024-06-10', 1, 'LOW', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Model Selection', 'Select the appropriate machine learning model for the chatbot', '2024-06-11', '2024-08-10', 1, 'MID', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Model Training', 'Train the selected model with the preprocessed data', '2024-08-11', '2024-10-10', 1, 'MID', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Model Evaluation', 'Evaluate the performance of the trained model', '2024-10-11', '2024-12-10', 1, 'MID', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Improve Model Accuracy', 'Fine-tune the model to improve accuracy', '2024-12-11', '2025-02-10', 1, 'LOW', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Develop API', 'Develop an API to integrate the chatbot with customer service systems', '2025-02-11', '2025-04-10', 1, 'LOW', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Front-End Development', 'Create the front-end interface for the chatbot', '2025-04-11', '2025-06-10', 1, 'HIGH', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Back-End Development', 'Develop the back-end functionality for the chatbot', '2025-06-11', '2025-08-10', 1, 'HIGH', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Integrate API', 'Integrate the chatbot API with the front-end and back-end', '2025-08-11', '2025-10-10', 1, 'LOW', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Testing and Debugging', 'Test the chatbot and fix any bugs', '2025-10-11', '2025-12-10', 1, 'HIGH', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Acceptance Testing', 'Conduct user acceptance testing to meets requirements', '2025-12-11', '2026-02-10', 1, 'HIGH', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Deployment Preparation', 'Prepare the chatbot for deployment', '2026-02-11', '2026-04-10', 1, 'MID', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Deployment', 'Deploy the chatbot to the production environment', '2026-04-11', '2026-06-10', 1, 'HIGH', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Monitor Performance', 'Monitor the chatbot’s performance post-deployment', '2026-06-11', '2026-08-10', 1, 'HIGH', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Gather Feedback', 'Collect user feedback to identify areas for improvement', '2026-08-11', '2026-10-10', 1, 'HIGH', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Implement Improvements', 'Make improvements based on user feedback', '2026-10-11', '2027-12-10', 1, 'MID', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Final Review and Documentation', 'Conduct a final review and document', '2027-12-11', '2028-02-10', 1, 'HIGH', 1);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Requirement Analysis', 'Gathering and analyzing business requirements', '2024-05-06', '2024-08-01', 1, 'HIGH', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Design', 'Creating design documents and prototypes', '2024-08-02', '2024-12-31', 1, 'HIGH', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Development Phase 1', 'Developing core features and functionalities', '2025-01-01', '2026-06-30', 1, 'MID', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Development Phase 2', 'Developing additional features and integrations', '2026-07-01', '2027-12-31', 1, 'MID', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Testing', 'Performing unit, integration, and system testing', '2028-01-01', '2028-12-31', 1, 'HIGH', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Deployment', 'Deploying the platform to production environment', '2029-01-01', '2029-06-30', 1, 'HIGH', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Maintenance', 'Ongoing maintenance and support', '2029-07-01', '2029-07-08', 1, 'LOW', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Planning', 'Initial planning and scheduling', '2024-05-06', '2024-05-31', 1, 'HIGH', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES('Market Research', 'Conducting market analysis and research', '2024-06-01', '2024-08-31', 1, 'MID', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES('Prototype Development', 'Developing a prototype for the platform', '2024-09-01', '2024-12-31', 1, 'HIGH', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES('Backend Development', 'Building the backend infrastructure', '2025-01-01', '2025-06-30', 1, 'HIGH', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES('Frontend Development', 'Creating the frontend interfaces', '2025-07-01', '2025-12-31', 1, 'MID', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES('API Integration', 'Integrating third-party APIs', '2026-01-01', '2026-06-30', 1, 'MID', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES('User Testing', 'Conducting user testing sessions', '2026-07-01', '2026-12-31', 1, 'HIGH', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES('Performance Optimization', 'Optimizing platform performance', '2027-01-01', '2027-06-30', 1, 'MID', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES('Security Enhancements', 'Implementing security features', '2027-07-01', '2027-12-31', 1, 'HIGH', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES('Beta Release', 'Releasing beta version for selected users', '2028-01-01', '2028-03-31', 1, 'HIGH', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES('Feedback Collection', 'Collecting user feedback from beta release', '2028-04-01', '2028-06-30', 1, 'MID', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES('Bug Fixes', 'Fixing bugs reported during beta testing', '2028-07-01', '2028-09-30', 1, 'HIGH', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES('Final Release Preparation', 'Preparing for final release', '2028-10-01', '2028-12-31', 1, 'HIGH', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES('Training', 'Training internal teams on the new platform', '2029-01-01', '2029-03-31', 1, 'MID', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES('Launch Marketing', 'Marketing campaign for platform launch', '2029-04-01', '2029-06-30', 1, 'HIGH', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES('Post-Launch Support', 'Providing support post-launch', '2029-07-01', '2029-07-08', 1, 'LOW', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Content Creation', 'Creating content for the platform', '2024-05-15', '2024-09-15', 1, 'MID', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('SEO Optimization', 'Optimizing the platform for search engines', '2024-10-01', '2025-02-28', 1, 'HIGH', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Database Design', 'Designing the database schema', '2025-03-01', '2025-05-31', 1, 'HIGH', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Migration', 'Migrating data to the new platform', '2025-06-01', '2025-08-31', 1, 'MID', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('UI/UX Design', 'Designing user interfaces and experiences', '2025-09-01', '2025-12-31', 1, 'HIGH', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Customer Engagement', 'Engaging with potential customers', '2026-01-01', '2026-04-30', 1, 'MID', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Feature Expansion', 'Adding new features based on feedback', '2026-05-01', '2026-12-31', 1, 'HIGH', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('System Integration', 'Integrating with existing systems', '2027-01-01', '2027-06-30', 1, 'MID', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Quality Assurance', 'Ensuring the quality of the platform', '2027-07-01', '2027-12-31', 1, 'HIGH', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Training', 'Training users on new features', '2028-01-01', '2028-03-31', 1, 'MID', 2);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Initial Planning', 'Planning the project milestones and deliverables', '2024-04-14', '2024-05-30', 1, 'HIGH', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Requirement Analysis', 'Analyzing the requirements for the blockchain system', '2024-06-01', '2024-08-15', 1, 'HIGH', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('System Design', 'Designing the blockchain architecture', '2024-08-16', '2024-12-31', 1, 'HIGH', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Prototype Development', 'Developing a prototype for the payment system', '2025-01-01', '2025-03-31', 1, 'MID', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Analysis', 'Conducting a thorough security analysis', '2025-04-01', '2025-06-30', 1, 'HIGH', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Backend Development', 'Developing the backend for the payment system', '2025-07-01', '2025-12-31', 1, 'MID', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Frontend Development', 'Creating the frontend interfaces', '2026-01-01', '2026-04-30', 1, 'MID', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('API Integration', 'Integrating necessary APIs', '2026-05-01', '2026-08-31', 1, 'MID', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Internal Testing', 'Testing the system internally', '2026-09-01', '2026-12-31', 1, 'HIGH', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Testing', 'Conducting user testing and feedback sessions', '2027-01-01', '2027-02-28', 1, 'HIGH', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Bug Fixing', 'Fixing bugs found during testing', '2027-03-01', '2027-04-15', 1, 'HIGH', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Final Deployment', 'Deploying the system to production', '2027-04-16', '2027-05-07', 1, 'HIGH', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Post-Deployment Monitoring', 'Monitoring the system post-deployment', '2027-05-08', '2027-05-08', 1, 'LOW', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Blockchain Node Setup', 'Setting up blockchain nodes', '2024-05-01', '2024-06-30', 1, 'HIGH', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Smart Contract Development', 'Developing smart contracts', '2024-07-01', '2024-10-31', 1, 'HIGH', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Consensus Mechanism Implementation', 'Implementing the consensus mechanism', '2024-11-01', '2025-01-31', 1, 'HIGH', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Wallet Integration', 'Integrating wallets into the system', '2025-02-01', '2025-04-30', 1, 'MID', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Transaction Testing', 'Testing transaction flows', '2025-05-01', '2025-07-31', 1, 'HIGH', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Performance Tuning', 'Tuning the system for better performance', '2025-08-01', '2025-10-31', 1, 'MID', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Documentation', 'Creating documentation for the system', '2025-11-01', '2026-01-31', 1, 'LOW', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Training', 'Training users on the new system', '2026-02-01', '2026-04-30', 1, 'MID', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Marketing Campaign', 'Launching a marketing campaign', '2026-05-01', '2026-07-31', 1, 'HIGH', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Customer Support Setup', 'Setting up customer support', '2026-08-01', '2026-10-31', 1, 'MID', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Compliance Checks', 'Ensuring compliance with regulations', '2026-11-01', '2027-01-31', 1, 'HIGH', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Audit', 'Conducting an external audit', '2027-02-01', '2027-04-30', 1, 'HIGH', 3);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Project Kickoff', 'Initiating the project and setting up teams', '2023-07-19', '2023-08-15', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Requirement Gathering', 'Collecting requirements from stakeholders', '2023-08-16', '2023-10-31', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('System Architecture Design', 'Designing the system architecture', '2023-11-01', '2024-01-31', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Collection', 'Collecting and organizing enterprise data', '2024-02-01', '2024-05-31', 1, 'MID', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Algorithm Development', 'Developing search algorithms', '2024-06-01', '2024-12-31', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Backend Development', 'Developing the backend infrastructure', '2025-01-01', '2025-06-30', 1, 'MID', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Frontend Development', 'Creating the user interface', '2025-07-01', '2025-12-31', 1, 'MID', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('API Development', 'Building APIs for data access', '2026-01-01', '2026-03-31', 1, 'MID', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Internal Testing', 'Performing internal testing', '2026-04-01', '2026-06-30', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Beta Release', 'Releasing a beta version to select users', '2026-07-01', '2026-09-30', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Feedback', 'Collecting feedback from beta users', '2026-10-01', '2026-12-31', 1, 'MID', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Bug Fixing', 'Fixing issues reported by users', '2027-01-01', '2027-03-31', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Performance Optimization', 'Improving system performance', '2027-04-01', '2027-06-30', 1, 'MID', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Enhancements', 'Enhancing system security', '2027-07-01', '2027-09-30', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Full System Testing', 'Conducting full system testing', '2027-10-01', '2027-12-31', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Final Deployment', 'Deploying the final version', '2028-01-01', '2028-03-31', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Post-Deployment Monitoring', 'Monitoring the system after deployment', '2028-04-01', '2028-04-28', 1, 'LOW', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Interface Design', 'Designing the user interface', '2024-01-01', '2024-03-31', 1, 'MID', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Integration Testing', 'Testing the integration with other systems', '2024-04-01', '2024-06-30', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Indexing', 'Indexing collected data for search', '2024-07-01', '2024-09-30', 1, 'MID', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Natural Language Processing', 'Implementing NLP capabilities', '2024-10-01', '2024-12-31', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Machine Learning Model Training', 'Training ML models for search optimization', '2025-01-01', '2025-06-30', 1, 'MID', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Feature Testing', 'Testing new features for the search engine', '2025-07-01', '2025-09-30', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Scalability Testing', 'Testing the system for scalability', '2025-10-01', '2025-12-31', 1, 'MID', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Documentation', 'Creating user and technical documentation', '2026-01-01', '2026-03-31', 1, 'LOW', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Training', 'Training users on the new system', '2026-04-01', '2026-06-30', 1, 'MID', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Marketing and Launch', 'Planning marketing strategies and launch', '2026-07-01', '2026-09-30', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Prototype Development', 'Creating an initial prototype of the search engine', '2023-08-16', '2023-10-31', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Interviews', 'Conducting interviews with potential users', '2023-11-01', '2023-12-15', 1, 'MID', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('AI Model Selection', 'Selecting appropriate AI models', '2023-12-16', '2024-02-29', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Backend Infrastructure Setup', 'Setting up backend infrastructure', '2024-03-01', '2024-05-31', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Frontend Prototype', 'Developing a frontend prototype', '2024-06-01', '2024-08-31', 1, 'MID', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Cleaning', 'Cleaning and preparing data for analysis', '2024-09-01', '2024-11-30', 1, 'MID', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Algorithm Testing', 'Testing search algorithms for accuracy', '2024-12-01', '2025-02-28', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Feedback Analysis', 'Analyzing feedback from users', '2025-03-01', '2025-05-31', 1, 'MID', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Feature Development', 'Developing new features based on feedback', '2025-06-01', '2025-08-31', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Scalability Planning', 'Planning for system scalability', '2025-09-01', '2025-11-30', 1, 'MID', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Acceptance Testing', 'Conducting user acceptance testing', '2025-12-01', '2026-02-28', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('System Integration', 'Integrating with existing enterprise systems', '2026-03-01', '2026-05-31', 1, 'MID', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Search Optimization', 'Optimizing search performance', '2026-06-01', '2026-08-31', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Testing', 'Testing the system for security vulnerabilities', '2026-09-01', '2026-11-30', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Documentation Review', 'Reviewing and updating documentation', '2026-12-01', '2027-02-28', 1, 'LOW', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Training Material Creation', 'Creating training materials for users', '2027-03-01', '2027-05-31', 1, 'MID', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Encryption Implementation', 'Implementing data encryption', '2027-06-01', '2027-08-31', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Onboarding', 'Onboarding new users to the system', '2027-09-01', '2027-11-30', 1, 'MID', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Final System Audit', 'Conducting a final system audit', '2027-12-01', '2028-02-28', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Launch Preparation', 'Preparing for system launch', '2028-03-01', '2028-04-27', 1, 'HIGH', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Post-Launch Support', 'Providing support after launch', '2028-04-28', '2028-04-28', 1, 'LOW', 4);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Project Initialization', 'Setting up project goals and milestones', '2024-03-16', '2024-04-15', 1, 'HIGH', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Requirement Gathering', 'Gathering requirements from stakeholders', '2024-04-16', '2024-06-15', 1, 'HIGH', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('System Architecture Design', 'Designing the overall system architecture', '2024-06-16', '2024-09-15', 1, 'HIGH', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Technology Stack Selection', 'Choosing the technology stack for the project', '2024-09-16', '2024-10-15', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Prototype Development', 'Creating an initial prototype', '2024-10-16', '2024-12-31', 1, 'HIGH', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Backend Development', 'Developing the backend of the analytics dashboard', '2025-01-01', '2025-06-30', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Frontend Development', 'Developing the frontend user interface', '2025-07-01', '2025-12-31', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('API Development', 'Creating APIs for data integration', '2026-01-01', '2026-03-31', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Database Design', 'Designing the database schema', '2026-04-01', '2026-05-31', 1, 'HIGH', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Collection', 'Collecting data for analytics', '2026-06-01', '2026-08-31', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Cleaning', 'Cleaning and preprocessing collected data', '2026-09-01', '2026-11-30', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Algorithm Development', 'Developing algorithms for data analysis', '2026-12-01', '2027-02-28', 1, 'HIGH', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Internal Testing', 'Performing internal testing of the system', '2027-03-01', '2027-05-31', 1, 'HIGH', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Beta Release', 'Releasing a beta version for user feedback', '2027-06-01', '2027-07-31', 1, 'HIGH', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Feedback Analysis', 'Analyzing user feedback', '2027-08-01', '2027-08-31', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Bug Fixing', 'Fixing bugs identified during beta testing', '2027-09-01', '2027-09-15', 1, 'HIGH', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Final Deployment', 'Deploying the final version of the dashboard', '2027-09-16', '2027-09-23', 1, 'HIGH', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('UI/UX Design', 'Designing user-friendly interfaces', '2024-04-01', '2024-05-31', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Visualization', 'Creating data visualizations', '2024-06-01', '2024-08-31', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Authentication', 'Implementing user authentication mechanisms', '2024-09-01', '2024-11-30', 1, 'HIGH', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Performance Optimization', 'Optimizing system performance', '2025-01-01', '2025-03-31', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Implementation', 'Implementing security features', '2025-04-01', '2025-06-30', 1, 'HIGH', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Scalability Planning', 'Planning for system scalability', '2025-07-01', '2025-09-30', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Integration Testing', 'Testing system integrations', '2025-10-01', '2025-12-31', 1, 'HIGH', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Security Audit', 'Conducting a data security audit', '2026-01-01', '2026-03-31', 1, 'HIGH', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Load Testing', 'Performing load testing', '2026-04-01', '2026-06-30', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('System Monitoring', 'Setting up system monitoring tools', '2026-07-01', '2026-09-30', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Documentation', 'Documenting system features and usage', '2026-10-01', '2026-12-31', 1, 'LOW', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Training', 'Training users on the new system', '2027-01-01', '2027-03-31', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Marketing and Launch', 'Planning marketing strategies and launch', '2027-04-01', '2027-06-30', 1, 'HIGH', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Cloud Integration', 'Integrating with cloud services', '2024-03-16', '2024-05-31', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Role Management', 'Setting up user roles and permissions', '2024-06-01', '2024-08-31', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Pipeline Setup', 'Setting up data pipelines', '2024-09-01', '2024-11-30', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Real-time Data Processing', 'Implementing real-time data processing', '2025-01-01', '2025-03-31', 1, 'HIGH', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Widget Development', 'Developing customizable widgets for the dashboard', '2025-04-01', '2025-06-30', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Third-party Integration', 'Integrating with third-party tools', '2025-07-01', '2025-09-30', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Performance Benchmarking', 'Benchmarking system performance', '2025-10-01', '2025-12-31', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Backup Setup', 'Setting up data backup processes', '2026-01-01', '2026-03-31', 1, 'HIGH', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Interface Enhancements', 'Enhancing the user interface based on feedback', '2026-04-01', '2026-06-30', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('End-user Documentation', 'Creating documentation for end-users', '2026-07-01', '2026-09-30', 1, 'LOW', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Customer Support Setup', 'Setting up customer support mechanisms', '2026-10-01', '2026-12-31', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Post-launch Monitoring', 'Monitoring the system after launch', '2027-01-01', '2027-03-31', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Enhancement Planning', 'Planning for future enhancements', '2027-04-01', '2027-06-30', 1, 'MID', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Final Review', 'Conducting a final review of the project', '2027-07-01', '2027-09-23', 1, 'HIGH', 5);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Initial Planning', 'Setting up project goals and milestones', '2023-08-01', '2023-09-15', 1, 'HIGH', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Requirement Analysis', 'Analyzing requirements from stakeholders', '2023-09-16', '2023-11-30', 1, 'HIGH', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Architecture Design', 'Designing the system architecture', '2023-12-01', '2024-02-29', 1, 'HIGH', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Technology Stack Selection', 'Choosing the technology stack for the project', '2024-03-01', '2024-04-15', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Prototype Development', 'Creating an initial prototype', '2024-04-16', '2024-06-30', 1, 'HIGH', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Backend Development', 'Developing the backend infrastructure', '2024-07-01', '2024-12-31', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Frontend Development', 'Developing the frontend interface', '2025-01-01', '2025-06-30', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('API Development', 'Creating APIs for data interaction', '2025-07-01', '2025-09-30', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Database Design', 'Designing the database schema', '2025-10-01', '2025-12-31', 1, 'HIGH', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Collection', 'Collecting data for the system', '2026-01-01', '2026-03-31', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Cleaning', 'Cleaning and preprocessing data', '2026-04-01', '2026-06-30', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Algorithm Development', 'Developing data processing algorithms', '2026-07-01', '2026-09-30', 1, 'HIGH', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Internal Testing', 'Conducting internal system testing', '2026-10-01', '2026-12-31', 1, 'HIGH', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Beta Release', 'Releasing a beta version for user feedback', '2027-01-01', '2027-03-31', 1, 'HIGH', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Feedback Analysis', 'Analyzing user feedback', '2027-04-01', '2027-05-31', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Bug Fixing', 'Fixing bugs identified during beta testing', '2027-06-01', '2027-08-31', 1, 'HIGH', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Final Deployment', 'Deploying the final version', '2027-09-01', '2027-09-30', 1, 'HIGH', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('UI/UX Design', 'Designing user-friendly interfaces', '2024-03-01', '2024-05-31', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Visualization', 'Creating data visualizations', '2024-06-01', '2024-08-31', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Authentication', 'Implementing user authentication mechanisms', '2024-09-01', '2024-11-30', 1, 'HIGH', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Performance Optimization', 'Optimizing system performance', '2025-01-01', '2025-03-31', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Implementation', 'Implementing security features', '2025-04-01', '2025-06-30', 1, 'HIGH', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Scalability Planning', 'Planning for system scalability', '2025-07-01', '2025-09-30', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Integration Testing', 'Testing system integrations', '2025-10-01', '2025-12-31', 1, 'HIGH', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Security Audit', 'Conducting a data security audit', '2026-01-01', '2026-03-31', 1, 'HIGH', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Load Testing', 'Performing load testing', '2026-04-01', '2026-06-30', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('System Monitoring', 'Setting up system monitoring tools', '2026-07-01', '2026-09-30', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Documentation', 'Documenting system features and usage', '2026-10-01', '2026-12-31', 1, 'LOW', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Training', 'Training users on the new system', '2027-01-01', '2027-03-31', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Marketing and Launch', 'Planning marketing strategies and launch', '2027-04-01', '2027-06-30', 1, 'HIGH', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Cloud Integration', 'Integrating with cloud services', '2023-08-01', '2023-10-31', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Role Management', 'Setting up user roles and permissions', '2023-11-01', '2024-01-31', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Pipeline Setup', 'Setting up data pipelines', '2024-02-01', '2024-04-30', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Real-time Data Processing', 'Implementing real-time data processing', '2024-05-01', '2024-07-31', 1, 'HIGH', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Widget Development', 'Developing customizable widgets for the system', '2024-08-01', '2024-10-31', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Third-party Integration', 'Integrating with third-party tools', '2024-11-01', '2025-01-31', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Performance Benchmarking', 'Benchmarking system performance', '2025-02-01', '2025-04-30', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Backup Setup', 'Setting up data backup processes', '2025-05-01', '2025-07-31', 1, 'HIGH', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Interface Enhancements', 'Enhancing the user interface based on feedback', '2025-08-01', '2025-10-31', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('End-user Documentation', 'Creating documentation for end-users', '2025-11-01', '2026-01-31', 1, 'LOW', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Customer Support Setup', 'Setting up customer support mechanisms', '2026-02-01', '2026-04-30', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Post-launch Monitoring', 'Monitoring the system after launch', '2026-05-01', '2026-07-31', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Enhancement Planning', 'Planning for future enhancements', '2026-08-01', '2026-10-31', 1, 'MID', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Final Review', 'Conducting a final review of the project', '2026-11-01', '2026-12-31', 1, 'HIGH', 6);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Initial Planning', 'Setting up project goals and milestones', '2024-03-01', '2024-04-15', 1, 'HIGH', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Requirement Analysis', 'Analyzing requirements from stakeholders', '2024-04-16', '2024-06-30', 1, 'HIGH', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Architecture Design', 'Designing the system architecture', '2024-07-01', '2024-09-15', 1, 'HIGH', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Technology Stack Selection', 'Choosing the technology stack for the project', '2024-09-16', '2024-11-30', 1, 'MID', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Prototype Development', 'Creating an initial prototype', '2024-12-01', '2025-02-28', 1, 'HIGH', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Backend Development', 'Developing the backend infrastructure', '2025-03-01', '2025-08-31', 1, 'MID', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Frontend Development', 'Developing the frontend interface', '2025-09-01', '2026-02-28', 1, 'MID', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('API Development', 'Creating APIs for data interaction', '2026-03-01', '2026-05-31', 1, 'MID', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Database Design', 'Designing the database schema', '2026-06-01', '2026-08-31', 1, 'HIGH', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Collection', 'Collecting data for the system', '2026-09-01', '2026-11-30', 1, 'MID', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Cleaning', 'Cleaning and preprocessing data', '2026-12-01', '2027-02-28', 1, 'MID', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Algorithm Development', 'Developing data processing algorithms', '2027-03-01', '2027-05-31', 1, 'HIGH', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Internal Testing', 'Conducting internal system testing', '2027-06-01', '2027-08-31', 1, 'HIGH', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Beta Release', 'Releasing a beta version for user feedback', '2027-09-01', '2027-11-30', 1, 'HIGH', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Feedback Analysis', 'Analyzing user feedback', '2027-12-01', '2028-01-31', 1, 'MID', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Bug Fixing', 'Fixing bugs identified during beta testing', '2028-02-01', '2028-03-25', 1, 'HIGH', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Final Deployment', 'Deploying the final version', '2028-03-26', '2028-03-26', 1, 'HIGH', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('UI/UX Design', 'Designing user-friendly interfaces', '2024-03-01', '2024-05-31', 1, 'MID', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Visualization', 'Creating data visualizations', '2024-06-01', '2024-08-31', 1, 'MID', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Authentication', 'Implementing user authentication mechanisms', '2024-09-01', '2024-11-30', 1, 'HIGH', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Performance Optimization', 'Optimizing system performance', '2025-01-01', '2025-03-31', 1, 'MID', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Implementation', 'Implementing security features', '2025-04-01', '2025-06-30', 1, 'HIGH', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Scalability Planning', 'Planning for system scalability', '2025-07-01', '2025-09-30', 1, 'MID', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Integration Testing', 'Testing system integrations', '2025-10-01', '2025-12-31', 1, 'HIGH', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Security Audit', 'Conducting a data security audit', '2026-01-01', '2026-03-31', 1, 'HIGH', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Load Testing', 'Performing load testing', '2026-04-01', '2026-06-30', 1, 'MID', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('System Monitoring', 'Setting up system monitoring tools', '2026-07-01', '2026-09-30', 1, 'MID', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Documentation', 'Documenting system features and usage', '2026-10-01', '2026-12-31', 1, 'LOW', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Training', 'Training users on the new system', '2027-01-01', '2027-03-31', 1, 'MID', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Marketing and Launch', 'Planning marketing strategies and launch', '2027-04-01', '2027-06-30', 1, 'HIGH', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Cloud Integration', 'Integrating with cloud services', '2024-03-01', '2024-05-31', 1, 'MID', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Role Management', 'Setting up user roles and permissions', '2024-06-01', '2024-08-31', 1, 'MID', 7);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Initial Planning', 'Setting up project goals and milestones', '2024-02-01', '2024-03-15', 1, 'HIGH', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Requirement Analysis', 'Analyzing requirements from stakeholders', '2024-03-16', '2024-05-31', 1, 'HIGH', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Architecture Design', 'Designing the system architecture', '2024-06-01', '2024-08-15', 1, 'HIGH', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Technology Stack Selection', 'Choosing the technology stack for the project', '2024-08-16', '2024-10-31', 1, 'MID', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Prototype Development', 'Creating an initial prototype', '2024-11-01', '2025-01-31', 1, 'HIGH', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Backend Development', 'Developing the backend infrastructure', '2025-02-01', '2025-07-31', 1, 'MID', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Frontend Development', 'Developing the frontend interface', '2025-08-01', '2026-01-31', 1, 'MID', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('API Development', 'Creating APIs for data interaction', '2026-02-01', '2026-04-30', 1, 'MID', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Database Design', 'Designing the database schema', '2026-05-01', '2026-07-31', 1, 'HIGH', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Collection', 'Collecting data for the system', '2026-08-01', '2026-10-31', 1, 'MID', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Cleaning', 'Cleaning and preprocessing data', '2026-11-01', '2027-01-31', 1, 'MID', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Algorithm Development', 'Developing data processing algorithms', '2027-02-01', '2027-04-30', 1, 'HIGH', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Internal Testing', 'Conducting internal system testing', '2027-05-01', '2027-07-31', 1, 'HIGH', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Beta Release', 'Releasing a beta version for user feedback', '2027-08-01', '2027-10-31', 1, 'HIGH', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Feedback Analysis', 'Analyzing user feedback', '2027-11-01', '2027-12-31', 1, 'MID', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Bug Fixing', 'Fixing bugs identified during beta testing', '2028-01-01', '2028-06-14', 1, 'HIGH', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Final Deployment', 'Deploying the final version', '2028-06-15', '2028-06-14', 1, 'HIGH', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('UI/UX Design', 'Designing user-friendly interfaces', '2024-02-01', '2024-04-30', 1, 'MID', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Visualization', 'Creating data visualizations', '2024-05-01', '2024-07-31', 1, 'MID', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Authentication', 'Implementing user authentication mechanisms', '2024-08-01', '2024-10-31', 1, 'HIGH', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Performance Optimization', 'Optimizing system performance', '2025-01-01', '2025-03-31', 1, 'MID', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Implementation', 'Implementing security features', '2025-04-01', '2025-06-30', 1, 'HIGH', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Scalability Planning', 'Planning for system scalability', '2025-07-01', '2025-09-30', 1, 'MID', 8);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Initial Planning', 'Setting up project goals and milestones', '2024-03-01', '2024-04-15', 1, 'HIGH', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Requirement Analysis', 'Analyzing requirements from stakeholders', '2024-04-16', '2024-06-30', 1, 'HIGH', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Architecture Design', 'Designing the system architecture', '2024-07-01', '2024-09-15', 1, 'HIGH', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Technology Stack Selection', 'Choosing the technology stack for the project', '2024-09-16', '2024-11-30', 1, 'MID', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Prototype Development', 'Creating an initial prototype', '2024-12-01', '2025-02-28', 1, 'HIGH', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Backend Development', 'Developing the backend infrastructure', '2025-03-01', '2025-08-31', 1, 'MID', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Frontend Development', 'Developing the frontend interface', '2025-09-01', '2026-02-28', 1, 'MID', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('API Development', 'Creating APIs for data interaction', '2026-03-01', '2026-05-31', 1, 'MID', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Database Design', 'Designing the database schema', '2026-06-01', '2026-08-31', 1, 'HIGH', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Collection', 'Collecting data for the system', '2026-09-01', '2026-11-30', 1, 'MID', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Cleaning', 'Cleaning and preprocessing data', '2026-12-01', '2027-02-28', 1, 'MID', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Algorithm Development', 'Developing data processing algorithms', '2027-03-01', '2027-05-31', 1, 'HIGH', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Internal Testing', 'Conducting internal system testing', '2027-06-01', '2027-08-31', 1, 'HIGH', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Beta Release', 'Releasing a beta version for user feedback', '2027-09-01', '2027-11-30', 1, 'HIGH', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Feedback Analysis', 'Analyzing user feedback', '2027-12-01', '2027-12-31', 1, 'MID', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Bug Fixing', 'Fixing bugs identified during beta testing', '2028-01-01', '2028-01-01', 1, 'HIGH', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Interface Design', 'Designing intuitive user interfaces', '2024-03-01', '2024-05-31', 1, 'MID', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Feedback Incorporation', 'Incorporating user feedback into design', '2024-06-01', '2024-08-31', 1, 'MID', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Authentication Setup', 'Implementing user authentication mechanisms', '2024-09-01', '2024-11-30', 1, 'HIGH', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Performance Optimization', 'Optimizing system performance', '2025-01-01', '2025-03-31', 1, 'MID', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Implementation', 'Implementing security features', '2025-04-01', '2025-06-30', 1, 'HIGH', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Backup Setup', 'Setting up data backup processes', '2025-07-01', '2025-09-30', 1, 'MID', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Training', 'Providing training sessions for users', '2025-10-01', '2025-12-31', 1, 'MID', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Documentation', 'Documenting system features and usage', '2026-01-01', '2026-03-31', 1, 'LOW', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Integration Testing', 'Testing system integrations', '2026-04-01', '2026-06-30', 1, 'HIGH', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Deployment Planning', 'Planning for system deployment', '2026-07-01', '2026-09-30', 1, 'MID', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('System Monitoring Setup', 'Setting up system monitoring tools', '2026-10-01', '2026-12-31', 1, 'MID', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Beta Testing', 'Conducting beta testing with select users', '2027-01-01', '2027-03-31', 1, 'HIGH', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Bug Fixing', 'Addressing and fixing reported bugs', '2027-04-01', '2027-06-30', 1, 'HIGH', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Final Deployment', 'Deploying the finalized system', '2027-07-01', '2027-09-30', 1, 'HIGH', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Post-deployment Support', 'Providing support after system deployment', '2027-10-01', '2027-12-31', 1, 'MID', 9);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Initial Planning', 'Setting up project goals and milestones', '2024-05-01', '2024-06-15', 1, 'HIGH', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Requirement Analysis', 'Analyzing requirements from stakeholders', '2024-06-16', '2024-08-31', 1, 'HIGH', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Architecture Design', 'Designing the system architecture', '2024-09-01', '2024-11-15', 1, 'HIGH', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Technology Stack Selection', 'Choosing the technology stack for the project', '2024-11-16', '2025-01-31', 1, 'MID', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Prototype Development', 'Creating an initial prototype', '2025-02-01', '2025-04-30', 1, 'HIGH', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Backend Development', 'Developing the backend infrastructure', '2025-05-01', '2025-10-31', 1, 'MID', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Frontend Development', 'Developing the frontend interface', '2025-11-01', '2026-04-30', 1, 'MID', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('AI Model Development', 'Building AI models for project management', '2026-05-01', '2026-07-31', 1, 'HIGH', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Integration Testing', 'Testing system integrations', '2026-08-01', '2026-10-31', 1, 'HIGH', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Interface Refinement', 'Refining user interfaces based on feedback', '2026-11-01', '2027-01-31', 1, 'MID', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Performance Optimization', 'Optimizing system performance', '2027-02-01', '2027-04-30', 1, 'MID', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Enhancement', 'Enhancing system security measures', '2027-05-01', '2027-07-31', 1, 'HIGH', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Integration Setup', 'Setting up data integration pipelines', '2024-05-01', '2024-07-31', 1, 'MID', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Feedback Collection', 'Collecting user feedback for improvement', '2024-08-01', '2024-10-31', 1, 'LOW', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Documentation', 'Creating project documentation', '2024-11-01', '2025-01-31', 1, 'LOW', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Algorithm Optimization', 'Optimizing algorithms for efficiency', '2025-02-01', '2025-04-30', 1, 'MID', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Training Material Creation', 'Developing training material for users', '2025-05-01', '2025-07-31', 1, 'LOW', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Feature Expansion', 'Expanding project features based on demand', '2025-08-01', '2025-10-31', 1, 'MID', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Bug Fixing', 'Addressing reported bugs and issues', '2025-11-01', '2026-01-31', 1, 'HIGH', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Usability Testing', 'Conducting usability tests for user experience', '2026-02-01', '2026-04-30', 1, 'MID', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Analysis Module Development', 'Developing modules for data analysis', '2026-05-01', '2026-07-31', 1, 'HIGH', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Scaling Infrastructure', 'Scaling infrastructure to accommodate growth', '2026-08-01', '2026-10-31', 1, 'HIGH', 10);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Initial Planning', 'Setting up project goals and milestones', '2024-05-01', '2024-06-15', 0, 'HIGH', 11);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Requirement Analysis', 'Analyzing requirements from stakeholders', '2024-06-16', '2024-08-31', 0, 'HIGH', 11);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Architecture Design', 'Designing the microservices architecture', '2024-09-01', '2024-11-15', 0, 'HIGH', 11);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Technology Stack Selection', 'Choosing the technology stack for the project', '2024-11-16', '2025-01-31', 0, 'MID', 11);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Prototype Development', 'Creating initial prototypes for microservices', '2025-02-01', '2025-04-30', 0, 'HIGH', 11);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Microservice Implementation', 'Implementing microservices based on design', '2025-05-01', '2025-10-31', 0, 'MID', 11);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Integration Testing', 'Testing integration between microservices', '2025-11-01', '2026-03-31', 0, 'HIGH', 11);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Performance Optimization', 'Optimizing microservices performance', '2026-04-01', '2026-06-30', 0, 'MID', 11);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Implementation', 'Implementing security measures for microservices', '2026-07-01', '2026-09-15', 0, 'HIGH', 11);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Containerization Setup', 'Setting up containerization for microservices', '2024-05-01', '2024-07-31', 0, 'MID', 11);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Continuous Integration/Delivery', 'Implementing CI/CD pipelines', '2024-08-01', '2024-10-31', 0, 'HIGH', 11);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Service Discovery Configuration', 'Configuring service discovery mechanisms', '2024-11-01', '2025-01-31', 0, 'MID', 11);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Monitoring and Logging Setup', 'Setting up monitoring and logging', '2025-02-01', '2025-04-30', 0, 'MID', 11);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Load Balancing Configuration', 'Configuring load balancing for microservices', '2025-05-01', '2025-07-31', 0, 'MID', 11);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Auto Scaling Setup', 'Setting up auto-scaling for microservices', '2025-08-01', '2025-10-31', 0, 'MID', 11);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Fault Tolerance Implementation', 'Implementing fault tolerance mechanisms', '2025-11-01', '2026-03-31', 0, 'HIGH', 11);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Service Mesh Configuration', 'Configuring service mesh for microservices', '2026-04-01', '2026-06-30', 0, 'MID', 11);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Documentation', 'Creating documentation for microservices architecture', '2026-07-01', '2026-09-15', 0, 'LOW', 11);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Initial Planning', 'Setting up project goals and milestones', '2025-01-01', '2025-02-28', 1, 'HIGH', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Requirement Analysis', 'Analyzing requirements from stakeholders', '2025-03-01', '2025-04-30', 1, 'HIGH', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Architecture Design', 'Designing the platform architecture', '2025-05-01', '2025-07-31', 1, 'HIGH', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Technology Stack Selection', 'Choosing the technology stack for the platform', '2025-08-01', '2025-09-30', 1, 'MID', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Prototype Development', 'Creating an initial prototype', '2025-10-01', '2025-12-31', 1, 'HIGH', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Backend Development', 'Developing the backend infrastructure', '2026-01-01', '2026-06-30', 1, 'MID', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Frontend Development', 'Developing the frontend interface', '2026-07-01', '2027-01-31', 1, 'MID', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Email Template Design', 'Designing email templates for marketing campaigns', '2027-02-01', '2027-06-30', 1, 'MID', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Automation Logic Implementation', 'Implementing automation logic for email sending', '2027-07-01', '2028-01-31', 1, 'HIGH', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Integration Testing', 'Testing integration with marketing platforms', '2028-02-01', '2028-06-30', 1, 'HIGH', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Performance Optimization', 'Optimizing platform performance', '2028-07-01', '2028-12-31', 1, 'MID', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Training', 'Providing training sessions for platform users', '2029-01-01', '2029-06-30', 1, 'MID', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Documentation', 'Documenting platform features and usage', '2029-07-01', '2029-12-31', 1, 'LOW', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Support and Maintenance Setup', 'Setting up support and maintenance processes', '2030-01-01', '2030-07-02', 1, 'MID', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Integration Setup', 'Setting up data integration for marketing data', '2025-01-01', '2025-03-31', 1, 'MID', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Segmentation Logic Development', 'Developing logic for audience segmentation', '2025-04-01', '2025-06-30', 1, 'HIGH', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('A/B Testing Implementation', 'Implementing A/B testing functionality', '2025-07-01', '2025-09-30', 1, 'MID', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Campaign Performance Analysis', 'Analyzing performance metrics of marketing', '2025-10-01', '2025-12-31', 1, 'HIGH', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Opt-in/Opt-out Management', 'Implementing opt-in/opt-out management features', '2026-01-01', '2026-03-31', 1, 'MID', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Personalization Implementation', 'Implementing personalized email content features', '2026-04-01', '2026-06-30', 1, 'HIGH', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Email Delivery Optimization', 'Optimizing email delivery rates', '2026-07-01', '2026-09-30', 1, 'MID', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Reporting Module Development', 'Developing reporting modules for campaign analysis', '2026-10-01', '2027-01-31', 1, 'HIGH', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Feedback Collection', 'Collecting user feedback for platform improvement', '2027-02-01', '2027-05-31', 1, 'MID', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Subscription Management', 'Implementing subscription management features', '2027-06-01', '2027-09-30', 1, 'MID', 12);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Initial Assessment', 'Conducting initial assessment of network infrastructure', '2024-05-02', '2024-06-01', 0, 'HIGH', 13);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Requirement Gathering', 'Gathering requirements for the firewall solution', '2024-06-02', '2024-07-01', 0, 'HIGH', 13);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Vendor Evaluation', 'Evaluating vendors for the firewall solution', '2024-07-02', '2024-08-01', 0, 'MID', 13);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Hardware Procurement', 'Procuring hardware required for the firewall', '2024-08-02', '2024-09-01', 0, 'MID', 13);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Software Installation', 'Installing necessary software for the firewall', '2024-09-02', '2024-10-01', 0, 'MID', 13);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Configuration Setup', 'Setting up configurations for the firewall', '2024-10-02', '2024-11-01', 0, 'HIGH', 13);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Testing and Validation', 'Testing and validating the firewall solution', '2024-11-02', '2025-01-01', 0, 'HIGH', 13);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Integration with Network', 'Integrating firewall with existing network', '2025-01-02', '2025-02-01', 0, 'HIGH', 13);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Training and Documentation', 'Providing training and documentation for firewall usage', '2025-02-02', '2025-03-01', 0, 'MID', 13);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Go-Live', 'Deploying the firewall solution into production', '2025-03-02', '2025-04-01', 0, 'HIGH', 13);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Monitoring and Maintenance', 'Setting up monitoring and performing ongoing', '2025-04-02', '2025-05-01', 0, 'MID', 13);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Audit', 'Conducting security audit of the implemented solution', '2025-05-02', '2025-06-01', 0, 'HIGH', 13);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Conceptualization', 'Brainstorming and conceptualization of VR training modules', '2024-06-01', '2024-07-15', 1, 'HIGH', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Content Creation', 'Creating content for the VR training program', '2024-07-16', '2024-09-30', 1, 'HIGH', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Software Development', 'Developing the VR software application', '2024-10-01', '2025-01-31', 1, 'MID', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Hardware Setup', 'Setting up VR hardware infrastructure', '2025-02-01', '2025-04-30', 1, 'MID', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Testing and Debugging', 'Testing and debugging the VR application', '2025-05-01', '2025-07-31', 1, 'HIGH', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Experience Refinement', 'Refining user experience based on feedback', '2025-08-01', '2025-10-31', 1, 'MID', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Integration with Learning Management System', 'Integrating VR program with LMS', '2025-11-01', '2026-01-31', 1, 'MID', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Pilot Testing', 'Conducting pilot testing of the VR training program', '2026-02-01', '2026-04-30', 1, 'HIGH', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Content Expansion', 'Expanding content library of the VR program', '2026-05-01', '2026-07-31', 1, 'LOW', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Final Testing and Quality Assurance', 'Conducting final testing and QA checks', '2026-08-01', '2026-09-30', 1, 'HIGH', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Deployment', 'Deploying the VR training program for full usage', '2026-10-01', '2026-11-14', 1, 'HIGH', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Storyboard Creation', 'Creating storyboards for VR training scenarios', '2024-06-01', '2024-07-31', 1, 'MID', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('3D Model Creation', 'Developing 3D models for VR environment', '2024-08-01', '2024-09-30', 1, 'MID', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Interaction Design', 'Designing user interactions in the VR environment', '2024-10-01', '2024-12-31', 1, 'HIGH', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Programming Interfaces', 'Developing APIs for VR interactions', '2025-01-01', '2025-03-31', 1, 'MID', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Testing', 'Conducting user testing for VR experience', '2025-04-01', '2025-06-30', 1, 'HIGH', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Performance Optimization', 'Optimizing performance for smooth VR experience', '2025-07-01', '2025-09-30', 1, 'HIGH', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Accessibility Features', 'Implementing accessibility features for VR program', '2025-10-01', '2025-12-31', 1, 'MID', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Localization', 'Localizing content for different regions', '2026-01-01', '2026-03-31', 1, 'LOW', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Feedback Collection', 'Collecting feedback from users for program improvement', '2026-04-01', '2026-06-30', 1, 'MID', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Updates and Maintenance', 'Providing updates and ongoing maintenance for the program', '2026-07-01', '2026-09-30', 1, 'HIGH', 14);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Initial Conceptualization', 'Brainstorming and conceptualization of app features', '2023-08-01', '2023-09-15', 0, 'HIGH', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Requirements Gathering', 'Gathering requirements from potential users', '2023-09-16', '2023-10-31', 0, 'HIGH', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('UI/UX Design', 'Designing user interface and user experience', '2023-11-01', '2024-01-31', 0, 'HIGH', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Database Design', 'Designing the database architecture', '2024-02-01', '2024-03-31', 0, 'MID', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Backend Development', 'Developing the backend functionality', '2024-04-01', '2024-06-30', 0, 'HIGH', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Frontend Development', 'Developing the frontend interface', '2024-07-01', '2024-09-30', 0, 'HIGH', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Integration of Health Tracking Devices', 'Integrating with health tracking devices', '2024-10-01', '2024-12-31', 0, 'HIGH', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Testing and Bug Fixing', 'Testing the application and fixing bugs', '2025-01-01', '2025-03-31', 0, 'HIGH', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Testing and Feedback Collection', 'Conducting user testing', '2025-04-01', '2025-06-30', 0, 'HIGH', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Performance Optimization', 'Optimizing app performance for speed and efficiency', '2025-07-01', '2025-09-30', 0, 'HIGH', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Encryption Implementation', 'Implementing data encryption for user privacy', '2025-10-01', '2025-12-31', 0, 'HIGH', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Authentication Setup', 'Setting up user authentication and security measures', '2026-01-01', '2026-03-31', 0, 'HIGH', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Cloud Integration', 'Integrating with cloud services for data storage', '2026-04-01', '2026-06-30', 0, 'MID', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Multi-Language Support', 'Implementing support for multiple languages', '2026-07-01', '2026-09-30', 0, 'MID', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Accessibility Features', 'Incorporating accessibility features for all users', '2026-10-01', '2026-12-31', 0, 'MID', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Training Materials', 'Creating training materials for app usage', '2027-01-01', '2027-03-31', 0, 'LOW', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Documentation', 'Preparing comprehensive documentation for the app', '2027-04-01', '2027-06-30', 0, 'LOW', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('App Store Submission', 'Preparing and submitting the app to app stores', '2027-07-01', '2027-09-30', 0, 'HIGH', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Post-Launch Support', 'Providing support and addressing user feedback post-launch', '2027-10-01', '2027-12-31', 0, 'HIGH', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Continuous Updates and Maintenance', 'Ensuring continuous updates and maintenance', '2028-01-01', '2031-10-10', 0, 'HIGH', 15);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Threat Assessment', 'Conducting assessment of potential cybersecurity threats', '2023-10-15', '2023-11-30', 0, 'HIGH', 16);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Risk Analysis', 'Analyzing risks associated with cybersecurity vulnerabilities', '2023-12-01', '2024-01-31', 0, 'HIGH', 16);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Policy Development', 'Developing comprehensive security policies', '2024-02-01', '2024-03-31', 0, 'HIGH', 16);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Infrastructure Hardening', 'Implementing measures to cybersecurity infrastructure', '2024-04-01', '2024-05-31', 0, 'HIGH', 16);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Firewall Configuration', 'Configuring and optimizing firewall settings', '2024-06-01', '2024-07-31', 0, 'HIGH', 16);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Intrusion Detection System', 'Implementing an intrusion detection system', '2024-08-01', '2024-09-30', 0, 'HIGH', 16);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Training and Awareness', 'Providing cybersecurity training to staff', '2024-10-01', '2024-11-30', 0, 'MID', 16);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Vulnerability Assessment', 'Conducting regular vulnerability assessments', '2024-12-01', '2025-01-31', 0, 'HIGH', 16);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Incident Response Planning', 'Developing incident response plans', '2025-02-01', '2025-03-14', 0, 'HIGH', 16);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Patch Management', 'Implementing processes for timely patch management', '2025-03-15', '2025-04-14', 0, 'HIGH', 16);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Audit', 'Conducting regular security audits', '2025-04-15', '2025-05-15', 0, 'HIGH', 16);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Access Control', 'Implementing robust user access control measures', '2025-05-16', '2025-06-15', 0, 'HIGH', 16);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Encryption Implementation', 'Implementing encryption for sensitive data', '2025-06-16', '2025-07-15', 0, 'HIGH', 16);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Awareness Training', 'Conducting security awareness training sessions', '2025-07-16', '2025-08-15', 0, 'MID', 16);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Penetration Testing', 'Performing penetration testing to identify vulnerabilities', '2025-08-16', '2025-09-15', 0, 'HIGH', 16);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Continuous Monitoring', 'Implementing continuous monitoring systems', '2025-09-16', '2025-10-15', 0, 'HIGH', 16);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Incident Response', 'Establishing procedures for security incident response', '2025-10-16', '2025-11-15', 0, 'HIGH', 16);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Policy Review', 'Regular review and update of security policies', '2025-11-16', '2025-12-15', 0, 'MID', 16);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Documentation and Reporting', 'Maintaining comprehensive documentation and reporting', '2025-12-16', '2026-01-15', 0, 'LOW', 16);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Requirement Gathering', 'Gathering requirements for the data analytics platform', '2025-11-21', '2025-12-31', 1, 'HIGH', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Database Design', 'Designing the database architecture for data storage', '2026-01-01', '2026-02-28', 1, 'HIGH', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Integration', 'Integrating data sources into the analytics platform', '2026-03-01', '2026-04-30', 1, 'HIGH', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Platform Development', 'Developing the core functionality of the analytics platform', '2026-05-01', '2026-06-30', 1, 'HIGH', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Interface Design', 'Designing user-friendly interfaces for data visualization', '2026-07-01', '2026-08-31', 1, 'HIGH', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Machine Learning', 'Integrating machine learning algorithms for analytics', '2026-09-01', '2026-10-31', 1, 'HIGH', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Testing and Quality Assurance', 'Testing the platform and ensuring quality standards', '2026-11-01', '2026-12-31', 1, 'HIGH', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Deployment', 'Deploying the analytics platform for production use', '2027-01-01', '2027-02-28', 1, 'HIGH', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Training and Documentation', 'Training and documentation for platform users', '2027-03-01', '2027-04-30', 1, 'MID', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Continuous Improvement', 'Implementing continuous improvements based on user feedback', '2027-05-01', '2027-05-30', 1, 'LOW', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Cleansing', 'Cleaning and preprocessing raw data for analysis', '2025-11-21', '2025-12-15', 1, 'MID', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Feature Engineering', 'Engineering new features from existing data', '2025-12-16', '2026-01-10', 1, 'HIGH', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Visualization Design', 'Designing visualizations for data exploration', '2026-01-11', '2026-02-05', 1, 'HIGH', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Model Training', 'Training machine learning models on the data', '2026-02-06', '2026-03-02', 1, 'HIGH', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Model Evaluation', 'Evaluating the performance of trained models', '2026-03-03', '2026-03-27', 1, 'HIGH', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Model Deployment', 'Deploying trained models for real-time prediction', '2026-03-28', '2026-04-21', 1, 'HIGH', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Interface Testing', 'Testing user interface functionality', '2026-04-22', '2026-05-16', 1, 'MID', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Scalability Testing', 'Testing platform scalability under high loads', '2026-05-17', '2026-06-10', 1, 'HIGH', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Testing', 'Conducting security assessments and testing', '2026-06-11', '2026-07-05', 1, 'HIGH', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Acceptance Testing', 'Testing platform with end-users for acceptance', '2026-07-06', '2026-07-30', 1, 'MID', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Documentation Update', 'Updating documentation based on final platform features', '2026-07-31', '2026-08-24', 1, 'LOW', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Performance Optimization', 'Optimizing platform performance for efficiency', '2026-08-25', '2026-09-18', 1, 'HIGH', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Final Review and Approval', 'Final review and approval of the completed platform', '2026-09-19', '2026-10-13', 1, 'MID', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Platform Launch Preparation', 'Preparing for the official launch of the platform', '2026-10-14', '2026-11-07', 1, 'HIGH', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Launch and Marketing Campaign', 'Launching the platform and marketing to users', '2026-11-08', '2026-11-30', 1, 'HIGH', 17);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Requirement Analysis', 'Analyzing requirements for the  management system', '2026-01-19', '2026-02-28', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('System Design', 'Designing the architecture of the AI-driven system', '2026-03-01', '2026-04-30', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Integration', 'Integrating data sources into the system', '2026-05-01', '2026-06-30', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('AI Model Development', 'Developing AI models for predictive analytics', '2026-07-01', '2026-08-31', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Interface Design', 'Designing user interfaces for system interaction', '2026-09-01', '2026-10-31', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Backend Development', 'Developing the backend infrastructure for data processing', '2026-11-01', '2026-12-31', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Frontend Development', 'Developing the frontend interfaces for user interaction', '2027-01-01', '2027-02-28', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('AI Integration', 'Integrating AI models into the system architecture', '2027-03-01', '2027-04-30', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Database Implementation', 'Implementing databases for data storage and retrieval', '2027-05-01', '2027-06-30', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Authentication Setup', 'Setting up user authentication and access controls', '2027-07-01', '2027-08-31', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Visualization Development', 'Developing tools for data visualization', '2027-09-01', '2027-10-31', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Testing and Quality Assurance', 'Testing the system for functionality', '2027-11-01', '2027-12-31', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Performance Optimization', 'Optimizing system performance for scalability', '2028-01-01', '2028-02-28', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Implementation', 'Implementing security measures to protect data integrity', '2028-03-01', '2028-04-30', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Documentation and Training Materials', 'Documentation and training materials', '2028-05-01', '2028-06-30', 0, 'MID', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Acceptance Testing', 'Testing the system with end-users for acceptance', '2028-07-01', '2028-08-31', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Deployment Planning', 'Planning for the deployment of the system', '2028-09-01', '2028-10-31', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Deployment and Rollout', 'Deploying the system for operational use', '2028-11-01', '2028-12-31', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Post-Deployment Support', 'Providing support and maintenance after deployment', '2029-01-01', '2029-02-28', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Training Sessions', 'Conducting training sessions for system users', '2029-03-01', '2029-04-30', 0, 'MID', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Monitoring and Optimization', 'Monitoring system performance and optimizing', '2029-05-01', '2029-06-30', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Continuous Improvement', 'Implementing continuous improvements based on feedback', '2029-07-01', '2029-08-31', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Legacy System Migration', 'Migrating data and processes from legacy systems', '2029-09-01', '2029-10-31', 0, 'HIGH', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('End-of-Life Planning', 'Planning for the end-of-life of the system', '2029-11-01', '2029-12-31', 0, 'MID', 18);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Requirement Gathering', 'Gathering requirements for the home automation system', '2025-12-06', '2026-01-15', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('System Architecture Design', 'Designing the architecture of the IoT system', '2026-01-16', '2026-02-28', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Device Selection and Integration', 'Selecting and integrating IoT devices', '2026-03-01', '2026-04-15', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Sensor Calibration', 'Calibrating sensors for accurate data collection', '2026-04-16', '2026-05-31', 1, 'MID', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Backend Development', 'Developing the backend infrastructure for data processing', '2026-06-01', '2026-07-15', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Frontend Development', 'Developing the frontend interfaces for user control', '2026-07-16', '2026-08-31', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Mobile App Development', 'Developing a mobile app for remote control', '2026-09-01', '2026-10-15', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Voice Control Integration', 'Integrating voice control functionality', '2026-10-16', '2026-11-30', 1, 'MID', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Testing and Quality Assurance', 'Testing the system for functionality', '2026-12-01', '2027-01-15', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Acceptance Testing', 'Testing the system with end-users for acceptance', '2027-01-16', '2027-02-28', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Interface Design', 'Designing user interfaces for system control', '2027-03-01', '2027-04-15', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Implementation', 'Implementing security measures to protect user data', '2027-04-16', '2027-05-31', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Integration Testing', 'Testing the integration of all system components', '2027-06-01', '2027-07-15', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Mobile App Testing', 'Testing the mobile app for compatibility and usability', '2027-07-16', '2027-08-31', 1, 'MID', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Voice Control Testing', 'Testing voice control functionality for accuracy', '2027-09-01', '2027-10-15', 1, 'MID', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Performance Optimization', 'Optimizing system performance for efficiency', '2027-10-16', '2027-11-30', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Documentation', 'Documenting system architecture and usage guidelines', '2027-12-01', '2028-01-15', 1, 'LOW', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Training', 'Conducting training sessions for system users', '2028-01-16', '2028-02-29', 1, 'MID', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Deployment Planning', 'Planning for the deployment of the system', '2028-03-01', '2028-04-15', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Deployment and Rollout', 'Deploying the system for operational use', '2028-04-16', '2028-05-31', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Post-Deployment Support', 'Providing support and maintenance after deployment', '2028-06-01', '2028-07-15', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Feedback Collection', 'Collecting feedback from users for system improvement', '2028-07-16', '2028-08-31', 1, 'MID', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('System Monitoring', 'Setting up monitoring systems for system performance', '2028-09-01', '2028-10-15', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Continuous Improvement', 'Implementing continuous improvements based on feedback', '2028-10-16', '2028-11-30', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Legacy System Migration', 'Migrating data and processes from legacy systems', '2028-12-01', '2029-01-15', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('End-of-Life Planning', 'Planning for the end-of-life of the system', '2029-01-16', '2029-02-28', 1, 'MID', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Data Backup and Recovery', 'Implementing systems for data backup and recovery', '2029-03-01', '2029-04-15', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('System Security Audits', 'Conducting regular security audits for system integrity', '2029-04-16', '2029-05-31', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('System Upgrades', 'Planning and implementing upgrades for system performance', '2029-06-01', '2029-07-15', 1, 'HIGH', 19);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Requirement Analysis', 'Analyzing requirements for the financial app', '2026-07-03', '2026-07-31', 0, 'HIGH', 20);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('UI/UX Design', 'Designing the user interface and user experience', '2026-08-01', '2026-08-31', 0, 'HIGH', 20);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Database Design', 'Designing the database schema for storing financial data', '2026-09-01', '2026-09-30', 0, 'HIGH', 20);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Backend Development', 'Developing the backend logic and APIs', '2026-10-01', '2026-11-30', 0, 'HIGH', 20);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Frontend Development', 'Developing the frontend components of the app', '2026-12-01', '2027-01-31', 0, 'HIGH', 20);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Authentication', 'Implementing user authentication and authorization', '2027-02-01', '2027-02-28', 0, 'HIGH', 20);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Portfolio Tracking Module', 'Developing the module for tracking financial portfolios', '2027-03-01', '2027-04-30', 0, 'HIGH', 20);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Transaction History', 'Implementing transaction history functionality', '2027-05-01', '2027-05-31', 0, 'HIGH', 20);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Financial Analysis Tools', 'Developing tools for financial analysis and reporting', '2027-06-01', '2027-07-31', 0, 'HIGH', 20);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Security Features', 'Implementing security features to protect user data', '2027-08-01', '2027-08-31', 0, 'HIGH', 20);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Testing and Quality Assurance', 'Testing the app for functionality and reliability', '2027-09-01', '2027-10-31', 0, 'HIGH', 20);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('User Acceptance Testing', 'Testing the app with end-users for acceptance', '2027-11-01', '2027-12-31', 0, 'HIGH', 20);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Documentation', 'Documenting app features and usage guidelines', '2028-01-01', '2028-02-28', 0, 'MID', 20);
INSERT INTO tasks (name, description, start_date, finish_date, is_active, priority, project_id) VALUES ('Deployment Planning', 'Planning for the deployment of the app', '2028-03-01', '2028-04-06', 0, 'HIGH', 20);



INSERT INTO requests (message, is_accepted, project_id, user_id) VALUES ('Request message 1', 0, 1, 1);
INSERT INTO requests (message, is_accepted, project_id, user_id) VALUES ('Request message 2', 1, 2, 2);
INSERT INTO requests (message, is_accepted, project_id, user_id) VALUES ('Request message 3', 1, 3, 3);
INSERT INTO requests (message, is_accepted, project_id, user_id) VALUES ('Request message 4', 1, 4, 4);
INSERT INTO requests (message, is_accepted, project_id, user_id) VALUES ('Request message 5', 1, 5, 5);



INSERT INTO events (title, description, finish_date, user_id) VALUES ('Meeting with Don Alejandro', 'We will discuss the development of the MyProTask backend', '2024-05-25 14:30', 1);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Team Meeting', 'Discussing quarterly goals and objectives', '2024-05-26 10:00', 2);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Project Kickoff', 'Initial meeting to start the new project', '2024-05-27 09:30', 3);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Client Presentation', 'Presenting the project proposal to the client', '2024-05-28 11:00', 4);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Code Review', 'Reviewing code for the latest sprint', '2024-05-29 13:00', 5);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Sprint Planning', 'Planning tasks for the next sprint', '2024-05-30 15:00', 6);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Design Review', 'Reviewing the latest design prototypes', '2024-05-31 16:00', 7);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Product Demo', 'Demonstrating the product to stakeholders', '2024-06-01 14:00', 8);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Training Session', 'Training new team members', '2024-06-02 10:30', 9);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Marketing Strategy Meeting', 'Discussing the marketing strategy for Q1', '2024-06-03 11:30', 10);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Budget Review', 'Reviewing the budget for the next quarter', '2024-06-04 09:00', 11);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Performance Review', 'Annual performance review meeting', '2024-06-05 10:00', 12);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Networking Event', 'Meeting industry professionals and expanding network', '2024-06-06 18:00', 13);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Tech Conference', 'Attending the annual technology conference', '2024-06-07 09:00', 14);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Workshop', 'Participating in a workshop on new software tools', '2024-06-08 13:00', 15);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Strategy Session', 'Planning the business strategy for the next year', '2024-06-09 14:00', 16);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Team Building Activity', 'Team building exercises and activities', '2024-06-10 15:00', 17);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Sales Meeting', 'Discussing sales targets and strategies', '2024-06-11 16:00', 18);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Product Launch', 'Launching the new product to the market', '2024-06-12 10:00', 19);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Holiday Party', 'Celebrating the end of the year with the team', '2024-06-13 19:00', 20);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Board Meeting', 'Quarterly meeting with the board of directors', '2024-06-14 09:30', 21);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Market Research', 'Analyzing market trends and opportunities', '2024-06-15 11:00', 22);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Competitive Analysis', 'Reviewing competitor activities and strategies', '2024-06-16 13:00', 23);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Customer Feedback Session', 'Gathering feedback from key customers', '2024-06-17 15:00', 24);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Webinar', 'Attending an online webinar on industry trends', '2024-06-18 17:00', 25);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Internal Training', 'Training on new internal processes', '2024-06-19 10:00', 26);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Ad Campaign Planning', 'Planning the next advertising campaign', '2024-06-20 14:00', 27);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Customer Support Training', 'Training customer support staff', '2024-06-21 11:00', 28);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('HR Meeting', 'Discussing HR policies and procedures', '2024-06-22 15:00', 29);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Quarterly Review', 'Reviewing the performance of the last quarter', '2024-06-23 10:30', 30);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Meeting with Maria', 'Discussion on project deadlines', '2024-05-26 09:00', 1);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Development Workshop', 'Learning new programming techniques', '2024-05-27 14:00', 1);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Team Bonding Activity', 'Team-building exercises in the park', '2024-05-27 11:00', 2);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Client Meeting', 'Discussing project requirements', '2024-05-29 15:30', 2);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Project Planning Session', 'Creating roadmap for the project', '2024-05-28 10:00', 3);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Product Demo', 'Demonstrating new features to stakeholders', '2024-05-30 13:00', 3);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Client Presentation', 'Presenting project updates to the client', '2024-05-29 09:30', 4);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Feedback Session', 'Gathering feedback on recent deliverables', '2024-05-31 14:00', 4);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Code Review', 'Reviewing code quality for upcoming release', '2024-05-30 11:00', 5);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Sprint Retrospective', 'Reflecting on the previous sprint and planning improvements', '2024-06-01 16:00', 5);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Design Review', 'Reviewing UX/UI designs for the new feature', '2024-05-31 13:00', 6);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Brainstorming Session', 'Generating ideas for marketing campaign', '2024-06-02 10:00', 6);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Product Demo', 'Demonstrating new features to stakeholders', '2024-06-01 15:00', 7);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Training Session', 'Training new team members on company policies', '2024-06-03 11:00', 7);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Marketing Strategy Meeting', 'Discussing marketing strategy for upcoming quarter', '2024-06-02 14:00', 8);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Feedback Session', 'Gathering feedback on recent marketing campaigns', '2024-06-04 16:00', 8);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Budget Review', 'Reviewing budget allocations for upcoming projects', '2024-06-03 09:00', 9);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Performance Review', 'Annual performance review meeting', '2024-06-05 10:00', 9);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Networking Event', 'Networking with industry professionals', '2024-06-04 18:00', 10);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Tech Conference', 'Attending technology conference', '2024-06-06 09:00', 10);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Project Kickoff', 'Starting the new project with team brainstorming', '2024-05-25 10:00', 11);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Client Meeting', 'Discussing project requirements with the client', '2024-05-27 13:30', 11);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Team Meeting', 'Reviewing progress on current tasks', '2024-05-26 09:00', 12);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Code Review', 'Reviewing code quality for upcoming release', '2024-05-28 11:00', 12);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Product Demo', 'Demonstrating new features to stakeholders', '2024-05-27 15:00', 13);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Training Session', 'Training new team members on company policies', '2024-05-29 11:00', 13);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Budget Review', 'Reviewing budget allocations for upcoming projects', '2024-05-28 09:00', 14);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Performance Review', 'Annual performance review meeting', '2024-05-30 10:00', 14);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Networking Event', 'Networking with industry professionals', '2024-05-29 18:00', 15);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Tech Conference', 'Attending technology conference', '2024-05-31 09:00', 15);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Project Kickoff', 'Starting the new project with team brainstorming', '2024-05-30 10:00', 16);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Client Meeting', 'Discussing project requirements with the client', '2024-06-01 13:30', 16);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Team Meeting', 'Reviewing progress on current tasks', '2024-05-31 09:00', 17);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Code Review', 'Reviewing code quality for upcoming release', '2024-06-02 11:00', 17);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Product Demo', 'Demonstrating new features to stakeholders', '2024-06-01 15:00', 18);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Training Session', 'Training new team members on company policies', '2024-06-03 11:00', 18);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Budget Review', 'Reviewing budget allocations for upcoming projects', '2024-06-02 09:00', 19);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Performance Review', 'Annual performance review meeting', '2024-06-04 10:00', 19);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Networking Event', 'Networking with industry professionals', '2024-06-03 18:00', 20);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Tech Conference', 'Attending technology conference', '2024-06-05 09:00', 20);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Project Kickoff', 'Starting the new project with team brainstorming', '2024-06-04 10:00', 21);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Client Meeting', 'Discussing project requirements with the client', '2024-06-06 13:30', 21);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Team Meeting', 'Reviewing progress on current tasks', '2024-06-05 09:00', 22);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Code Review', 'Reviewing code quality for upcoming release', '2024-06-07 11:00', 22);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Product Demo', 'Demonstrating new features to stakeholders', '2024-06-06 15:00', 23);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Training Session', 'Training new team members on company policies', '2024-06-08 11:00', 23);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Budget Review', 'Reviewing budget allocations for upcoming projects', '2024-06-07 09:00', 24);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Performance Review', 'Annual performance review meeting', '2024-06-09 10:00', 24);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Networking Event', 'Networking with industry professionals', '2024-06-08 18:00', 25);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Tech Conference', 'Attending technology conference', '2024-06-10 09:00', 25);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Project Kickoff', 'Starting the new project with team brainstorming', '2024-06-09 10:00', 26);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Project Status Meeting', 'Reviewing project progress and milestones', '2024-06-01 15:30', 26);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Strategy Planning Session', 'Strategizing for upcoming business challenges', '2024-05-28 10:00', 27);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Marketing Campaign Launch', 'Launching new marketing campaign', '2024-05-30 14:00', 27);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Product Development Meeting', 'Discussing product roadmap and features', '2024-05-29 09:00', 28);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Client Presentation', 'Presenting project updates to the client', '2024-05-31 11:30', 28);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Team Building Workshop', 'Engaging in team-building activities', '2024-05-30 13:00', 29);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Training Session', 'Training new team members on company policies', '2024-06-01 11:00', 29);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Budget Review', 'Reviewing budget allocations for upcoming projects', '2024-05-31 09:00', 30);
INSERT INTO events (title, description, finish_date, user_id) VALUES ('Performance Review', 'Annual performance review meeting', '2024-06-02 10:00', 30);


INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (1, 1, 15);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (2, 1, 35);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (7, 1, 25);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (23, 1, 8);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (3, 2, 6);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (4, 2, 78);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (5, 3, 52);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (6, 3, 22);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (7, 4, 15);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (8, 4, 13);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (9, 5, 12);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (10, 5, 16);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (11, 6, 5);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (12, 6, 8);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (13, 7, 10);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (1, 7, 12);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (2, 8, 65);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (3, 8, 78);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (4, 9, 21);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (5, 9, 32);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (6, 10, 22);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (7, 10, 12);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (8, 11, 55);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (9, 11, 16);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (10, 12, 8); 
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (11, 12, 10);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (12, 13, 3);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (13, 13, 5);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (1, 14, 45);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (2, 14, 55);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (3, 15, 78);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (4, 15, 21);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (5, 16, 55);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (6, 16, 52);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (7, 17, 27);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (8, 17, 14);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (9, 18, 12);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (10, 18, 78);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (11, 19, 5);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (12, 19, 9);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (13, 20, 10);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (1, 20, 24);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (2, 21, 63);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (3, 21, 25);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (4, 22, 12);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (5, 22, 44);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (6, 23, 32);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (7, 23, 69);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (8, 24, 34);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (9, 24, 19);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (10, 25, 20); 
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (11, 25, 7);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (12, 26, 7);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (13, 26, 10);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (1, 27, 65);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (2, 27, 32);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (3, 28, 12);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (4, 28, 78);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (5, 29, 52);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (6, 29, 45);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (7, 30, 12);
INSERT INTO user_characteristics (characteristic_id, user_id, experience) VALUES (8, 30, 33);

INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(1,1);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(1,2);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(1,3);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(2,3);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(2,4);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(2,7);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(3,5);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(3,6);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(3,11);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(4,7);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(4,8);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(4,15);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(5,9);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(5,10);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(5,19);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(6,11);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(6,12);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(6,5);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(7,13);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(7,14);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(7,9);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(8,15);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(8,16);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(8,11);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(9,17);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(9,18);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(9,15);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(10,19);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(10,20);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(10,12);

INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(11,3);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(11,4);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(11,7);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(12,1);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(12,2);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(12,3);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(13,19);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(13,20);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(13,12);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(14,5);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(14,6);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(14,4);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(15,8);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(15,9);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(15,20);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(16,5);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(16,6);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(16,11);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(17,10);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(17,11);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(17,12);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(18,13);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(18,14);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(18,19);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(19,15);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(19,16);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(19,9);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(20,17);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(20,18);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(20,20);

INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(21,14);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(21,15);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(21,19);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(21,20);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(22,1);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(22,2);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(22,3);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(22,4);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(22,5);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(22,6);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(22,7);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(22,8);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(22,9);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(22,10);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(22,11);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(22,12);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(22,13);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(22,14);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(22,15);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(22,16);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(22,17);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(22,18);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(23,1);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(23,2);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(24,3);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(24,4);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(24,5);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(25,6);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(26,7);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(26,8);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(27,9);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(27,10);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(28,11);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(29,12);
INSERT INTO project_characteristics(characteristic_id,project_id)VALUES(30,13);


INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (3, 1, '2023-10-08', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (4, 1, '2023-10-12', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (10, 1, '2023-11-20', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (15, 1, '2023-12-05', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (20, 1, '2023-11-25', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (25, 1, '2023-10-30', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (30, 1, '2023-11-15', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (35, 1, '2023-11-05', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (40, 1, '2024-01-18', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (45, 1, '2024-05-15', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (50, 1, '2023-11-25', NULL, true, 4);


INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (7, 2, '2024-05-05', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (4, 2, '2024-05-07', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (10, 2, '2024-05-12', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (15, 2, '2024-05-20', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (20, 2, '2024-05-18', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (25, 2, '2024-05-14', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (30, 2, '2024-05-10', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (35, 2, '2024-05-22', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (40, 2, '2024-05-25', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (45, 2, '2024-05-29', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (50, 2, '2024-05-08', NULL, true, 4);



INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id)VALUES (7, 3, '2024-04-13', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (4, 3, '2024-04-15', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (10, 3, '2024-04-20', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (15, 3, '2024-04-18', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (20, 3, '2024-04-25', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (7, 4, '2023-07-18', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (4, 4, '2023-07-19', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (10, 4, '2023-08-18', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (15, 4, '2023-09-05', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (20, 4, '2023-09-20', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (25, 4, '2023-10-12', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (30, 4, '2023-11-03', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (35, 4, '2023-12-15', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (40, 4, '2024-01-10', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (45, 4, '2024-02-25', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (50, 4, '2024-03-15', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (2, 5, '2024-03-15', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (5, 5, '2024-03-16', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (11, 5, '2024-03-20', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (16, 5, '2024-03-25', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (21, 5, '2024-04-02', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (7, 6, '2023-07-28', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (5, 6, '2023-07-29', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (11, 6, '2023-08-05', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (16, 6, '2023-08-12', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (21, 6, '2023-08-19', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (26, 6, '2023-08-26', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (31, 6, '2023-09-02', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (36, 6, '2023-09-09', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (41, 6, '2023-09-16', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id)VALUES (7, 7, '2024-02-26', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (5, 7, '2024-02-27', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (11, 7, '2024-02-28', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (16, 7, '2024-02-29', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (21, 7, '2024-03-01', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (26, 7, '2024-03-02', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (31, 7, '2024-03-03', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (36, 7, '2024-03-04', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (41, 7, '2024-03-05', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (2, 8, '2024-01-28', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (5, 8, '2024-01-29', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (11, 8, '2024-01-30', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (16, 8, '2024-01-31', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (21, 8, '2024-02-01', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (7, 9, '2024-02-17', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (6, 9, '2024-02-18', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (12, 9, '2024-02-19', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (17, 9, '2024-02-20', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (22, 9, '2024-02-21', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (27, 9, '2024-02-22', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (32, 9, '2024-02-23', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (37, 9, '2024-02-24', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (42, 9, '2024-02-25', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (7, 10, '2024-04-30', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (6, 10, '2024-05-01', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (12, 10, '2024-05-02', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (17, 10, '2024-05-03', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (22, 10, '2024-05-04', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (27, 10, '2024-05-05', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (32, 10, '2024-05-06', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (37, 10, '2024-05-07', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (42, 10, '2024-05-08', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (47, 10, '2024-05-09', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (7, 11, '2024-04-26', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (6, 11, '2024-04-27', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (12, 11, '2024-04-28', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (17, 11, '2024-04-29', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (22, 11, '2024-04-30', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (3, 12, '2024-12-28', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (6, 12, '2024-12-29', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (12, 12, '2024-12-30', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (17, 12, '2024-12-26', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (22, 12, '2025-01-01', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (27, 12, '2025-01-02', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (32, 12, '2025-01-03', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (37, 12, '2025-01-04', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (42, 12, '2025-01-05', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (7, 13, '2024-05-02', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (8, 13, '2024-05-03', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (13, 13, '2024-05-04', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (18, 13, '2024-05-05', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (23, 13, '2024-05-06', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (7, 14, '2024-05-29', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (8, 14, '2024-05-30', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (13, 14, '2024-05-30', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (18, 14, '2024-05-30', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (23, 14, '2024-05-31', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (28, 14, '2024-05-31', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (33, 14, '2024-05-31', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (38, 14, '2024-05-31', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (43, 14, '2024-05-30', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (48, 14, '2024-05-31', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (25, 14, '2024-05-29', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (30, 14, '2024-05-31', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (35, 14, '2024-05-30', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (40, 14, '2024-05-31', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (45, 14, '2024-05-31', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (50, 14, '2024-05-31', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (26, 14, '2024-05-29', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (31, 14, '2024-05-31', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (36, 14, '2024-05-29', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (41, 14, '2024-05-31', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (46, 14, '2024-05-31', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (1, 15, '2023-07-22', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (8, 15, '2023-07-31', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (13, 15, '2023-08-12', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (18, 15, '2023-08-20', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (23, 15, '2024-01-27', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (28, 15, '2024-02-12', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (33, 15, '2024-02-22', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (38, 15, '2024-03-19', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (43, 15, '2024-04-06', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (2, 16, '2023-10-08', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (8, 16, '2023-10-31', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (13, 16, '2023-11-11', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (18, 16, '2023-11-11', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (23, 16, '2024-01-21', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (28, 16, '2024-01-19', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (33, 16, '2024-02-11', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (38, 16, '2024-03-21', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (43, 16, '2024-03-27', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (1, 17, '2022-11-21', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (9, 17, '2022-11-22', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (14, 17, '2022-12-25', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (19, 17, '2023-02-24', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (24, 17, '2023-07-30', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (2, 18, '2022-01-19', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (9, 18, '2023-09-19', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (14, 18, '2023-08-12', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (19, 18, '2023-05-19', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (24, 18, '2023-10-24', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (29, 18, '2023-09-07', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (34, 18, '2024-05-09', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (39, 18, '2024-05-11', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (44, 18, '2024-05-17', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (3, 19, '2022-12-06', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (9, 19, '2022-12-21', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (14, 19, '2023-01-11', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (19, 19, '2023-01-21', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (24, 19, '2023-01-12', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (29, 19, '2023-02-01', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (34, 19, '2023-02-12', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (3, 20, '2022-07-03', NULL, true, 3);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (9, 20, '2022-07-30', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (14, 20, '2022-08-01', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (19, 20, '2022-08-30', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (24, 20, '2022-09-27', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (29, 20, '2022-10-21', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (34, 20, '2022-10-11', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (39, 20, '2022-10-11', NULL, true, 4);
INSERT INTO user_projects (user_id, project_id, join_date, exit_date, is_active, role_id) VALUES (44, 20, '2023-01-27', NULL, true, 4);

INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (5, 4, 6, 3, null, '2024-12-13', 1);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (3, 5, 3, 4, 'Good teamwork and problem solving', '2024-12-13', 2);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (4, 4, 1, 6, null, '2024-12-13', 3);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (2, 3, 2, 3, 'Demonstrates good teamwork and problem-solving skills', '2024-12-13', 4);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (1, 4, 5, 4, 'Strong communication and effective collaboration.', '2025-02-13', 5);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (2, 5, 4, 3, 'Strong communication and effective collaboration.', '2025-02-13', 6);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (4, 3, 5, 4, 'Consistently meets deadlines with quality work.', '2025-03-10', 7);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (5, 4, 3, 5, 'Highly adaptable and quick to learn new tasks.', '2024-10-22', 8);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (3, 4, 5, 2, 'Shows initiative and proactive in projects.', '2025-05-15', 9);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (4, 5, 4, 4, 'Excellent at multitasking and managing priorities.', '2024-11-10', 10);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (2, 3, 4, 5, 'Reliable and dependable team member.', '2025-07-18', 11);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (5, 5, 3, 3, 'Brings creative solutions to challenging problems.', '2025-08-25', 12);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (3, 4, 4, 5, 'Maintains a positive attitude under pressure.', '2025-09-14', 13);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (4, 3, 5, 4, 'Pays great attention to detail and accuracy.', '2025-10-30', 14);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (3, 5, 4, 3, 'Works well independently and within a team.', '2024-11-20', 15);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (4, 4, 5, 2, 'Always ready to assist colleagues when needed.', '2025-12-05', 16);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (5, 3, 4, 5, 'Exhibits strong organizational skills.', '2025-01-12', 17);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (3, 4, 4, 3, 'Maintains professionalism in all situations.', '2025-02-25', 18);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (4, 5, 3, 4, 'Demonstrates a high level of technical expertise.', '2025-03-17', 19);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (2, 4, 5, 4, 'Quick to grasp new concepts and tools.', '2025-04-10', 20);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (3, 5, 4, 5, 'Provides valuable feedback during meetings.', '2025-05-08', 21);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (4, 3, 5, 3, 'Committed to continuous improvement.', '2025-06-14', 22);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (5, 4, 4, 2, 'Effectively balances multiple responsibilities.', '2025-07-22', 23);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (4, 5, 3, 5, 'Strong analytical and critical thinking abilities.', '2025-08-30', 24);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (3, 4, 5, 4, 'Collaborates effectively and meets project goals.', '2025-09-17', 25);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (5, 4, 3, 4, 'Demonstrates flexibility and adaptability.', '2025-10-05', 26);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (4, 3, 4, 5, 'Handles tasks efficiently and effectively.', '2025-11-15', 27);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (3, 5, 4, 3, 'Displays strong leadership qualities.', '2025-12-25', 28);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (4, 4, 5, 4, 'Consistently exceeds performance expectations.', '2025-01-30', 29);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (5, 3, 4, 5, 'Brings a positive and motivating attitude.', '2025-02-14', 30);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (4, 4, 3, 4, 'Strong dedication and commitment to tasks.', '2025-03-22', 31);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (3, 5, 4, 5, 'Effectively communicates ideas and feedback.', '2025-04-18', 32);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (5, 4, 3, 4, 'Takes ownership and responsibility for work.', '2025-05-11', 33);
INSERT INTO evaluations (team_work, individual_work, initiative, problem_resolution, observation, date, user_project_id) VALUES (4, 3, 5, 5, 'Shows resilience and perseverance in tasks.', '2025-06-29', 34);



INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (4, 1, true);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (5, 2, false);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (6, 3, true);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (8, 4, false);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (9, 5, true);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (10, 6, false);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (11, 7, true);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (12, 8, false);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (13, 9, true);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (14, 10, false);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (15, 11, true);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (16, 12, false);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (17, 13, true);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (18, 14, false);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (19, 15, true);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (20, 16, false);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (21, 17, true);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (22, 18, false);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (23, 19, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (24, 20, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (25, 21, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (26, 22, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (27, 23, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (28, 24, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (29, 25, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (30, 26, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (31, 27, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (32, 28, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (33, 29, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (34, 30, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (35, 31, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (36, 32, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (37, 33, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (38, 34, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (39, 35, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (40, 36, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (41, 37, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (42, 38, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (43, 39, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (44, 40, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (45, 41, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (46, 42, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (47, 43, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (48, 44, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (49, 45, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (50, 46, false);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (4, 47, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (5, 48, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (6, 49, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (8, 50, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (9, 51, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (10, 52, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (11, 53, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (12, 54, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (13, 55, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (14, 56, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (15, 57, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (16, 58, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (17, 59, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (18, 60, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (19, 61, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (20, 62, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (21, 63, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (22, 64, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (23, 65, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (24, 66, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (25, 67, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (26, 68, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (27, 69, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (28, 70, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (29, 71, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (30, 72, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (31, 73, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (32, 74, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (33, 75, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (34, 76, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (35, 77, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (36, 78, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (37, 79, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (38, 80, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (39, 81, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (40, 82, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (41, 83, true);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (42, 84, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (43, 85, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (44, 86, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (45, 87, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (46, 88, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (47, 89, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (48, 90, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (49, 91, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (50, 92, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (4, 93, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (5, 94, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (6, 95, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (8, 96, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (9, 97, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (10, 98, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (11, 99, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (12, 100, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (13, 101, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (14, 102, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (15, 103, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (16, 104, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (17, 105, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (18, 106, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (19, 107, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (20, 108, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (21, 109, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (22, 110, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (23, 111, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (24, 112, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (25, 113, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (26, 114, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (27, 115, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (28, 116, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (29, 117, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (30, 118, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (31, 119, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (32, 120, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (33, 121, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (34, 122, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (35, 123, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (36, 124, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (37, 125, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (38, 126, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (39, 127, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (40, 128, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (41, 129, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (42, 130, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (43, 131, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (44, 132, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (45, 133, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (46, 134, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (47, 135, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (48, 136, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (49, 137, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (50, 138, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (4, 139, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (5, 140, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (6, 141, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (8, 142, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (9, 143, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (10, 144, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (11, 145, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (12, 146, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (13, 147, true);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (14, 148, false);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (15, 149, true);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (16, 150, false);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (17, 151, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (18, 152, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (19, 153, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (20, 154, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (21, 155, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (22, 156, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (23, 157, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (24, 158, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (25, 159, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (26, 160, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (27, 161, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (28, 162, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (29, 163, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (30, 164, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (31, 165, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (32, 166, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (33, 167, true);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (34, 168, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (35, 169, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (36, 170, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (37, 171, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (38, 172, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (39, 173, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (40, 174, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (41, 175, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (42, 176, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (43, 177, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (44, 178, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (45, 179, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (46, 180, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (47, 181, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (48, 182, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (49, 183, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (50, 184, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (4, 185, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (5, 186, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (6, 187, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (8, 188, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (9, 189, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (10, 190, false);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (11, 191, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (12, 192, false);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (46, 226, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (47, 227, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (48, 228, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (49, 229, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (50, 230, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (4, 231, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (5, 232, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (6, 233, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (8, 234, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (9, 235, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (10, 236, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (11, 237, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (12, 238, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (13, 239, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (14, 240, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (15, 241, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (16, 242, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (17, 243, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (18, 244, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (19, 245, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (20, 246, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (21, 247, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (22, 248, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (23, 249, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (24, 250, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (25, 251, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (26, 252, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (27, 253, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (28, 254, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (29, 255, true);
INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (30, 256, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (31, 257, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (32, 258, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (33, 259, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (34, 260, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (35, 261, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (36, 262, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (37, 263, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (38, 264, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (39, 265, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (40, 266, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (41, 267, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (42, 268, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (43, 269, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (44, 270, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (45, 271, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (46, 272, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (47, 273, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (48, 274, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (49, 275, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (50, 276, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (4, 277, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (5, 278, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (6, 279, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (8, 280, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (9, 281, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (10, 282, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (11, 283, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (12, 284, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (13, 285, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (14, 286, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (15, 287, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (16, 288, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (17, 289, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (18, 290, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (19, 291, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (20, 292, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (21, 293, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (22, 294, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (23, 295, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (24, 296, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (25, 297, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (26, 298, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (27, 299, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (28, 300, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (29, 301, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (30, 302, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (31, 303, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (32, 304, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (33, 305, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (34, 306, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (35, 307, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (36, 308, true);

INSERT INTO user_tasks (user_id, task_id, is_active) VALUES (37, 309, true);