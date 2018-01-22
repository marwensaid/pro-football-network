
delete from tags;
delete from comments;
delete from posts;
delete from users;

insert into users(user_id, email, password, name, role) values(1,'admin@admin.com','admin','Administrator','ROLE_ADMIN');
insert into users(user_id, email, password, name, role) values(2,'marwensaidi1@gmail.com','marwen','Marwen Saidi','ROLE_USER');

insert into tags(tag_id, name, description) values
(1,'offre 1','cherche attaquant pour Nice'),
(2,'offre milieu de terrain','pour OM')
;

insert into posts(post_id, title, content, created_on, updated_on) values(1, 'attaquant','recherche attaquant de préférance gauché ...', '2017-01-20', null);
insert into posts(post_id, title, content, created_on, updated_on) values(2, 'ligue 2','club de ligue 2 cherche ....', '2017-01-25', null);

insert into comments(comment_id, post_id, email, name, content, created_on, updated_on) values(1, 1, 'guest@gmail.com', 'Guest','sample comment 1', now(), null);
insert into comments(comment_id, post_id, email, name, content, created_on, updated_on) values(2, 2, 'test@gmail.com', 'Test','sample comment 2', now(), null);
insert into comments(comment_id, post_id, email, name, content, created_on, updated_on) values(3, 2, 'test@gmail.com', 'Test','sample comment 3', now(), now());

