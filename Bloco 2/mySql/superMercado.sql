
create database db_rh;

use db_rh;

create table tb_colaboradores(
id bigint auto_increment,
nome char(255) not null,
cpf bigint not null,
codigoFuncionario bigint not null,
cargo char(255) not null,
salario double not null,
primary key (id)
);

select * from tb_colaboradores;

drop table tb_colaboradores;

insert into tb_colaboradores (nome,cpf,codigoFuncionario,cargo,salario)
values ("Kamila",123145569856,123,"Desenvolvedora",5000);

insert into tb_colaboradores (nome,cpf,codigoFuncionario,cargo,salario)
values ("Marlon",234567899654,234,"Desenvolvedor",7000);

insert into tb_colaboradores (nome,cpf,codigoFuncionario,cargo,salario)
values ("Luiza", 78965412301,364,"Recepcionista",1500);

insert into tb_colaboradores (nome,cpf,codigoFuncionario,cargo,salario)
values ("Gabriela",85536974100,001,"Líder",12000);

insert into tb_colaboradores (nome,cpf,codigoFuncionario,cargo,salario)
values ("Fernanda",45612300022,999,"Psicóloga",3000);

select * from tb_colaboradores where salario > 2000;

select * from tb_colaboradores where salario < 2000;

update tb_colaboradores set nome = "Luiza" where id = 3; 