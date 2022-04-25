CREATE DATABASE IF NOT EXISTS smartsnacks;
USE smartsnacks;

CREATE TABLE Category(
cid int4 AUTO_INCREMENT,
cat_name varchar(255),
PRIMARY KEY(cid)
);

CREATE TABLE Item(
Iid int4  AUTO_INCREMENT,
item_name varchar(255),
cid int4,
PRIMARY KEY (Iid),
FOREIGN KEY (cid) REFERENCES Category(cid)
);

CREATE TABLE Pantry(
pid int4 AUTO_INCREMENT,
item_id int4,
quantity double,
exp_date date,
PRIMARY KEY(pid),
FOREIGN KEY (item_id) REFERENCES Item(Iid)
);

CREATE TABLE Necessities(
nid int4 AUTO_INCREMENT,
item_id int4,
PRIMARY KEY(nid),
FOREIGN KEY(item_id) REFERENCES Item(Iid)
);

CREATE TABLE Recipe(
rid int4 AUTO_INCREMENT,
r_name varchar(255),
recipe text,
PRIMARY KEY (rid)
);
