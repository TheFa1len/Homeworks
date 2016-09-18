CREATE DATABASE newspaper;
USE newspaper;
CREATE TABLE `news` (
	`headtext` VARCHAR(50) NOT NULL,
	`annotation` VARCHAR(50) NOT NULL,
	`author` VARCHAR(50) NOT NULL,
	`release` DATE NULL DEFAULT NULL,
	`maintext` LONGTEXT NOT NULL,
	`id_categories` INT(11) NOT NULL,
	PRIMARY KEY (`headtext`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;
CREATE TABLE `news` (
	`headtext` VARCHAR(50) NOT NULL,
	`annotation` VARCHAR(50) NOT NULL,
	`author` VARCHAR(50) NOT NULL,
	`release` DATE NULL DEFAULT NULL,
	`maintext` LONGTEXT NOT NULL,
	`id_categories` INT(11) NOT NULL,
	PRIMARY KEY (`headtext`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;
CREATE TABLE `users` (
	`email` VARCHAR(50) NOT NULL COLLATE 'utf8_general_ci',
	`name` VARCHAR(50) NOT NULL COLLATE 'utf8_general_ci',
	`surname` VARCHAR(50) NOT NULL COLLATE 'utf8_general_ci',
	`pass` VARCHAR(50) NOT NULL COLLATE 'utf8_general_ci',
	PRIMARY KEY (`email`)
)
COLLATE='utf8_unicode_ci'
ENGINE=InnoDB
;
