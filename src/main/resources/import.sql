/* Populate tables */
INSERT INTO clientes (id, nombre, apellido, email, create_at) VALUES(1, 'Andres', 'Guzman', 'profesor@bolsadeideas.com', '2017-08-28');
INSERT INTO clientes (id, nombre, apellido, email, create_at) VALUES(2, 'John', 'Doe', 'john.doe@gmail.com', '2017-08-28');


INSERT INTO pacientes (id, nombre, apellido, usuario, contraseña) VALUES(1, 'Manuel', 'Muñoz', 'maMu', '7777');
INSERT INTO pacientes (id, nombre, apellido, usuario, contraseña) VALUES(2, 'Gabriela', 'Ruiz', 'gaRu', '8888');




/* Creamos algunos usuarios con sus roles */
INSERT INTO `users` (username, password, enabled) VALUES ('andres','$10$O9wxmH/AeyZZzIS09Wp8YOEMvFnbRVJ8B4dmAMVSGloR62lj.yqXG',1);
INSERT INTO `users` (username, password, enabled) VALUES ('admin','$2a$10$DOMDxjYyfZ/e7RcBfUpzqeaCs8pLgcizuiQWXPkU35nOhZlFcE9MS',1);


INSERT INTO `authorities` (user_id, authority) VALUES (1,'ROLE_USER');
INSERT INTO `authorities` (user_id, authority) VALUES (2,'ROLE_ADMIN');
INSERT INTO `authorities` (user_id, authority) VALUES (2,'ROLE_USER');