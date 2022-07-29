create sequence hibernate_sequence start with 1 increment by 1;
create table um_user (user_id bigint not null, first_name varchar(255), last_name varchar(255), mobile varchar(255), primary key (user_id));
