create table orders
(
    id          bigint auto_increment,
    costumer_id bigint                             not null,
    status      varchar(20)                        not null,
    created_at  datetime default current_timestamp not null,
    total_price DECIMAL(10, 2)                     not null,
    constraint orders_pk
        primary key (id),
    constraint orders_user_fk
        foreign key (costumer_id) references users (id)
);

