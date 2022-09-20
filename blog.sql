use blog;

CREATE TABLE author(
id_author int auto_increment,
author_name varchar(255),
id_post int,
PRIMARY KEY (id_author),
FOREIGN KEY (id_post) references post(id_post)
);

CREATE TABLE post(
id_post int auto_increment,
id_author int,
title varchar(255),
word_count int,
view int,
PRIMARY KEY (id_post),
FOREIGN KEY (id_author) references author(id_author)
);

insert into author (author_name) values 
('Maria Charlotte'),
('Juan Perez'),
('Gemma Alcocer');

insert into post (id_author, title, word_count, view) values 
(1, 'Best Paint Colors', 814, 14),
(1, 'Hot Accessories', 986, 105),
(1, 'Mixing Textures', 765, 22),
(1, 'Homemade Art Hacks', 1002, 193),
(2, 'Small Space Decorating Tips', 1146, 221),
(2, 'Kitchen Refresh', 1242, 307),
(3, 'Refinishing Wood Floors', 1571, 7542);

insert into user(id, password, username) values
(1, '$2a$10$O6KFR8LOh//KwEYwYXzrVeUJHvcWwpFoB1gi3cwvF0GhJ26BV.2Ou', 'irene');

insert into role(id, name, user_id) values
(1, "ADMIN", 1);

select * from author;
