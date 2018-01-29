
delete from tags;
delete from comments;
delete from posts;
delete from users;

insert into users(user_id, email, password, name, role) values(1,'admin@gmail.com','admin','Administrator','ROLE_ADMIN');
insert into users(user_id, email, password, name, role) values(2,'foot@gmail.com','foot','foot pro','ROLE_USER');

insert into tags(tag_id, name, description) values
(1,'OM','recrutement OM'),
(2,'PSG','recrutement PSG'),
(3,'Nice','recrutement OGCN'),
(4,'Lyon','recrutement OL'),
(5,'ASSE','recrutement ASSE'),
(6,'Lille','recrutement LOSC')
;

insert into posts(post_id, title, content, created_on, updated_on) values(1,'Attaquant de 18 ans','issu de centre de formation de Nice', '2018-01-20', null);
insert into posts(post_id, title, content, created_on, updated_on) values(2,'Gardien de but','issu de centre de formation de OM', '2018-01-25', null);


insert into comments(comment_id, post_id, email, name, content, created_on, updated_on) values(1, 1, 'guest@gmail.com', 'Guest','sample comment 1', now(), null);
insert into comments(comment_id, post_id, email, name, content, created_on, updated_on) values(2, 2, 'test@gmail.com', 'Test','sample comment 2', now(), null);
insert into comments(comment_id, post_id, email, name, content, created_on, updated_on) values(3, 2, 'test@gmail.com', 'Test','sample comment 3', now(), now());

