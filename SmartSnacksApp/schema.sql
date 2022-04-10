CREATE DATABASE IF NOT EXISTS smartsnacks;
USE smartsnacks;

CREATE TABLE Item(
item_id int4  AUTO_INCREMENT,
item_name varchar(255),
exp_date date,
quantity int,
PRIMARY KEY (item_id)
);

CREATE TABLE Pantry(
pItem_id int4 AUTO_INCREMENT,
item varchar(255),
FOREIGN KEY (pItem_id) REFERENCES Item(item_id)
);

CREATE TABLE Necessities(
nItem_id int4 AUTO_INCREMENT,
item varchar(255),
FOREIGN KEY (nItem_id) REFERENCES Item(item_id)
);

CREATE TABLE Recipe(
recipe_id int4 AUTO_INCREMENT,
recipe text,
item varchar(255),
PRIMARY KEY (recipe_id)
);
