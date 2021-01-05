/*CREATE TABLE `author_1` (
  	`AUTHOR_ID` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  	`AUTHOR_NAME` VARCHAR(50) NOT NULL,
  	PRIMARY KEY (`AUTHOR_ID`)
  );

CREATE TABLE `book_1` (
	`BOOK_ID` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
	`BOOK_NAME` VARCHAR(50) NOT NULL,
	`BOOK_PRICE` DOUBLE NOT NULL,
	PRIMARY KEY (`BOOK_ID`)
);
CREATE TABLE `author_book_1` (
	`AUTHOR_BOOK_ID` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
	`AUTHOR_ID` INT(10) UNSIGNED NOT NULL,
	`BOOK_ID` INT(10) UNSIGNED NOT NULL,
	PRIMARY KEY (`AUTHOR_BOOK_ID`),
	INDEX `AUTHOR_ID` (`AUTHOR_ID`),
	INDEX `BOOK_ID` (`BOOK_ID`),
	CONSTRAINT `AUTHOR_FK` FOREIGN KEY (`AUTHOR_ID`) REFERENCES `author_1` (`author_id`),
	CONSTRAINT `BOOK_FK` FOREIGN KEY (`BOOK_ID`) REFERENCES `book_1` (`book_id`)
);

Session is created
Hibernate: insert into AUTHOR_1 (AUTHOR_NAME) values (?)
Hibernate: insert into BOOK_1 (BOOK_NAME, BOOK_PRICE) values (?, ?)
Hibernate: insert into BOOK_1 (BOOK_NAME, BOOK_PRICE) values (?, ?)
Hibernate: insert into BOOK_1 (BOOK_NAME, BOOK_PRICE) values (?, ?)
Hibernate: insert into author_book_1 (AUTHOR_ID, BOOK_ID) values (?, ?)
Hibernate: insert into author_book_1 (AUTHOR_ID, BOOK_ID) values (?, ?)
Hibernate: insert into author_book_1 (AUTHOR_ID, BOOK_ID) values (?, ?)
Session is closed

*/
