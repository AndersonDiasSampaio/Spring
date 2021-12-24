create table CLIENTE (
ID integer primary key auto_increment, NOME varchar(100)
 );
create table PRODUTO (
ID integer primary key auto_increment, NOME varchar(100), PRECO_UNITARIO numeric(20,2)
 );
 create table PEDIDO (
ID integer primary key auto_increment,
CLIENTE_ID integer references CLIENTE(ID),
DATA_PEDIDO timestamp,
total numeric(20,2)

 );
 create table ITEM_PEDIDO(
 ID integer primary key auto_increment, 
 PEDIDO_ID integer references PEDIDO(ID),
 PRODUTO_ID integer references PRODUTO(ID),
 QUANTIDADE integer
 );