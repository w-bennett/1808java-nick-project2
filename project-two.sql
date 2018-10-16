select * from "user";
drop table "user";

create table "engineers" (
    userid serial primary key not null,
    username text unique not null,
    password text not null,
    role text not null,
    email text not null,
    upvotes integer not null,
    downvotes integer not null,
    stars integer not null
);

select * from "engineers";
insert into "engineers" ("username", "password", "role", "email", "upvotes", "downvotes", "stars")
    values ('tadrill', 'tadrill', 'ge', 'tadrill@gmail.com', '0', '0', '0');
