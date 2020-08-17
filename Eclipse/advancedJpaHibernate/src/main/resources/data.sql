insert into Course(id, name) values(10001, 'first course Maybe');
insert into Course(id, name) values(10002, 'second course ');
insert into Course(id, name) values(10003, 'third course');

insert into Passport(id, number) values(40001 ,'k123456');
insert into Passport(id, number) values(40002 ,'J123456');
insert into Passport(id, number) values(40003 ,'E123456');


insert into student(id, name, passport_id) values(20001 ,'nikhil', 40001);
insert into student(id, name, passport_id) values(20002 ,'Adaam', 40002);
insert into student(id, name, passport_id) values(20003 ,'James', 40003);


insert into review(id, rating, description, course_id) values (50001, '5', 'Great Course', 10001);
insert into review(id, rating, description, course_id) values (50002, '3', 'Average', 10002);
insert into review(id, rating, description, course_id) values (50003, '4', 'great', 10003);

