DROP DATABASE IF EXISTS ScoutDB;
CREATE DATABASE ScoutDB;
USE ScoutDB;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
	fName VARCHAR(50),
	lName VARCHAR(50),
	ad VARCHAR(200),
	phoneNumber int(50),
	email VARCHAR(50),
	birthdate VARCHAR(10),
	sex VARCHAR(10),
	xp VARCHAR(50),
	conPerson VARCHAR(50),
	conNum int(50),
	pw1 VARCHAR(20),
	pw2 VARCHAR(20)
	);

INSERT INTO users (fName, lName, ad, phoneNumber, email, birthdate, sex, xp, conPerson, conNum, pw1, pw2) VALUES (
	"des",
	"bel",
	"somewhere",
	"123",
	"hey@gmail.com",
	"11-09-1997",
	"female",
	"wala",
	"kahit sino",
	"123",
	"abc",
	"abc"
);
