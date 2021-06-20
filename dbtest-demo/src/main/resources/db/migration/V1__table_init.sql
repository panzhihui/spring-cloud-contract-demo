create table person
(
    id             varchar(36)   not null
        primary key,
    name           varchar(20)   not null,
    age            int default 0 not null,
    address        varchar(128)  null,
    mobile         char(11)      not null,
    height         float         not null,
    weight         float         not null,
    marital_status tinyint(1)    not null
)
    comment '员工信息表';