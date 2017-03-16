-- --------------------------------------------------------
-- ����:                           192.168.3.104
-- �������汾:                        5.5.53-0ubuntu0.14.04.1 - (Ubuntu)
-- ����������ϵͳ:                      debian-linux-gnu
-- HeidiSQL �汾:                  9.3.0.4984
-- --------------------------------------------------------

-- ����  �� sws.account �ṹ
CREATE TABLE IF NOT EXISTS `account` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) NOT NULL,
  `email` varchar(128) DEFAULT NULL,
  `hash_password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ����  �� sws.book �ṹ
CREATE TABLE IF NOT EXISTS `book` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `douban_id` varchar(64) NOT NULL,
  `title` varchar(128) NOT NULL,
  `url` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `owner_id` bigint(20) NOT NULL,
  `onboard_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `status` varchar(32) NOT NULL,
  `borrower_id` bigint(20) NOT NULL,
  `borrow_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ����  �� sws.message �ṹ
CREATE TABLE IF NOT EXISTS `message` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `receiver_id` bigint(20) DEFAULT NULL,
  `message` varchar(256) DEFAULT NULL,
  `receive_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
