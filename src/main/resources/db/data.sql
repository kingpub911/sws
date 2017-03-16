
INSERT INTO `account` (`id`, `name`, `email`, `hash_password`) VALUES
	(1, 'Calvin', 'calvin.xiao@springside.io', '+2MunThvGcEfdYIFlT4NQQHt6z4='),
	(2, 'David', 'david.wang@springside.io', '+2MunThvGcEfdYIFlT4NQQHt6z4=');
INSERT INTO `book` (`id`, `douban_id`, `title`, `url`, `description`, `owner_id`, `onboard_date`, `status`, `borrower_id`, `borrow_date`) VALUES
	(1, '25984046', 'Big Data日知录', 'http://book.douban.com/subject/25984046/', '', 1, '2015-01-01 00:00:00', 'idle', 0, '0000-00-00 00:00:00'),
	(2, '25900156', 'Redis设计与实现', 'http://book.douban.com/subject/25900156/', '', 1, '2015-01-02 00:00:00', 'idle', 0, '0000-00-00 00:00:00'),
	(3, '25741352', 'DSL实战', 'http://book.douban.com/subject/25741352/', '', 2, '2015-01-03 00:00:00', 'idle', 0, '0000-00-00 00:00:00');
