create database MPB;
use MPB;
create table CD(COD_CD int not null, CODIGO_GRAVADORA int, NOME_cd  varchar(60), primary key (COD_CD));
create table GRAVADORA (CODIGO_GRAVADORA int not null, NOME_GRAVADORA varchar(60), primary key(CODIGO_GRAVADORA));
alter table CD add constraint FK_RELATIONSHIP_1 foreign key (CODIGO_GRAVADORA) references GRAVADORA (CODIGO_GRAVADORA) on delete restrict on update restrict;
select * from gravadora;
select * from cd;
insert into gravadora values (1, 'Polygran');
insert into gravadora values (2, 'Som livre');
insert into CD values (1, 1, 'Capital Inicial');
insert into CD values (2, 2, 'Legião Urbana');
select * from cd, gravadora;
select cd.NOME_CD, gravadora.codigo_gravadora, gravadora.NOME_GRAVADORA  from cd, gravadora;
select cd.nome_cd from cd;
select * from cd where COD_CD = 2;
select cd.cod_cd, cd.NOME_CD, gravadora.codigo_gravadora, gravadora.NOME_GRAVADORA  from cd, gravadora where cd.cod_cd = 1 and gravadora.codigo_gravadora = 1;
select cd.cod_cd, cd.NOME_CD, gravadora.codigo_gravadora, gravadora.NOME_GRAVADORA  from cd, gravadora where cd.cod_cd = gravadora.codigo_gravadora;