-- phpMyAdmin SQL Dump
-- version 2.9.2
-- http://www.phpmyadmin.net
-- 
-- Host: localhost
-- Generation Time: Apr 12, 2017 at 02:56 PM
-- Server version: 5.0.27
-- PHP Version: 5.2.1
-- 
-- Database: `opas`
-- 

-- --------------------------------------------------------

-- 
-- Table structure for table `adminn`
-- 

DROP TABLE IF EXISTS `adminn`;
CREATE TABLE IF NOT EXISTS `adminn` (
  `user_name` varchar(20) NOT NULL,
  `user_id` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `mob_no` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `adminn`
-- 

INSERT INTO `adminn` (`user_name`, `user_id`, `email`, `mob_no`) VALUES 
('Richa', 'A1', 'richapandey@gmail.co', '9876254422'),
('udita', 'A2', 'udita@gmail.com', '9877654423'),
('sumi', 'A3', 'sumi@gmail.com', '1234567891'),
('disha', 'A4', 'disha@gamil.com', '2345678912'),
('szzjj', '5667', 'jjgjbh', '8676756'),
('shilpi', '7689', 'dHKHKK', '7676655'),
('PRAM', '8876', 'jfsjfsf@kfjkgfjh.com', '8766556555'),
('NIDHI', '45', 'shilpi@gmail.com', '7792964650');

-- --------------------------------------------------------

-- 
-- Table structure for table `appdb`
-- 

DROP TABLE IF EXISTS `appdb`;
CREATE TABLE IF NOT EXISTS `appdb` (
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `file` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `appdb`
-- 

INSERT INTO `appdb` (`first_name`, `last_name`, `file`) VALUES 
('hgjhv', 'knkjnk', ''),
('richa', 'pandey', 0x636f642e6a70),
('richa', 'pandey', 0x646f632e6a70);

-- --------------------------------------------------------

-- 
-- Table structure for table `company`
-- 

DROP TABLE IF EXISTS `company`;
CREATE TABLE IF NOT EXISTS `company` (
  `c_id` varchar(4) NOT NULL,
  `c_name` varchar(20) NOT NULL,
  `c_add` varchar(100) NOT NULL,
  `contact_no` decimal(10,0) NOT NULL,
  `package` decimal(5,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `company`
-- 

INSERT INTO `company` (`c_id`, `c_name`, `c_add`, `contact_no`, `package`) VALUES 
('c01', 'oracle', 'maharashtra', 9876543212, 50000),
('c02', 'tcs', 'delhi', 9876543234, 99999),
('c03', 'mahindra', 'goa', 9999999999, 99999),
('c04', 'accenture', 'pune', 9876598712, 99999);

-- --------------------------------------------------------

-- 
-- Table structure for table `course`
-- 

DROP TABLE IF EXISTS `course`;
CREATE TABLE IF NOT EXISTS `course` (
  `course_id` varchar(4) NOT NULL,
  `course_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `course`
-- 

INSERT INTO `course` (`course_id`, `course_name`) VALUES 
('c01', 'Btech'),
('c02', 'BCA'),
('c03', 'Mtech'),
('c04', 'MCA'),
('null', 'null'),
('null', 'null'),
('null', 'null'),
('null', 'null'),
('null', 'null'),
('null', 'null'),
('null', 'null'),
('null', 'null'),
('null', 'null'),
('null', 'null'),
('ku', 'b.tech'),
('AZ', 'b.tech'),
('bt', 'b.tech'),
('bt', 'b.tech'),
('dc', 'b.tech'),
('bnbn', 'b.tech'),
('', 'b.tech'),
('', 'b.tech'),
('', 'b.tech'),
('', 'b.tech'),
('', 'b.tech'),
('', 'b.tech'),
('', 'b.tech'),
('', 'b.tech'),
('', 'b.tech'),
('', 'b.tech'),
('', 'b.tech'),
('', 'b.tech'),
('', 'b.tech'),
('null', 'null'),
('', 'b.tech'),
('', 'b.tech'),
('', 'b.tech'),
('btbt', 'b.tech'),
('a', 'b.tech'),
('', 'b.tech'),
('a', 'b.tech'),
('c', 'b.tech'),
('', 'b.tech'),
('', 'b.tech'),
('', 'b.tech'),
('null', 'null'),
('null', 'null'),
('', 'b.tech'),
('', 'b.tech'),
('', 'b.tech'),
('', 'b.tech'),
('', 'b.tech');

-- --------------------------------------------------------

-- 
-- Table structure for table `login`
-- 

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `uid` varchar(20) NOT NULL,
  `role` varchar(10) NOT NULL,
  `pwd` varchar(20) NOT NULL,
  `q` varchar(20) NOT NULL,
  `a` varchar(20) NOT NULL,
  PRIMARY KEY  (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `login`
-- 

INSERT INTO `login` (`uid`, `role`, `pwd`, `q`, `a`) VALUES 
('disha', 'student', 'bhambo', 'ur bestfriend name', 'rb'),
('nidhi', 'student', '123', 'ur best frd name', 'shilpi'),
('prachi', 'student', 'sumi', 'ur bestfriend name', 'sumi'),
('pram', 'admin', '1111', 'ur best frd name', 'shilpi'),
('Richa', 'student', 'pd', 'ur bestfriend name', 'pd'),
('shilpi', 'student', '123', 'ur best frd name', 'shilpi'),
('udita', 'student', 'neha', 'ur bestfriend name', 'neha');

-- --------------------------------------------------------

-- 
-- Table structure for table `pg`
-- 

DROP TABLE IF EXISTS `pg`;
CREATE TABLE IF NOT EXISTS `pg` (
  `Stu_id` varchar(10) NOT NULL,
  `Course_id` varchar(10) NOT NULL,
  `year_10` varchar(10) NOT NULL,
  `Per_10` varchar(10) NOT NULL,
  `year_12` varchar(10) NOT NULL,
  `Per_12` varchar(10) NOT NULL,
  `UG_year` varchar(10) NOT NULL,
  `Per_UG` varchar(10) NOT NULL,
  `sem1` varchar(10) NOT NULL,
  `sem2` varchar(10) NOT NULL,
  `sem3` varchar(10) NOT NULL,
  `sem4` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `pg`
-- 

INSERT INTO `pg` (`Stu_id`, `Course_id`, `year_10`, `Per_10`, `year_12`, `Per_12`, `UG_year`, `Per_UG`, `sem1`, `sem2`, `sem3`, `sem4`) VALUES 
('BTBTI14461', 'cd1', '2011', '98', '2013', '98', '2014', '78', '61', '62', '78', '78'),
('BTBTI19873', 'cd2', '2011', '98', '2013', '76', '2014', '87', '87', '98', '65', '90'),
('BTBTI19865', 'cd3', '2011', '98', '2013', '76', '2014', '87', '87', '98', '65', '45'),
('BTBTI19567', 'cd4', '2011', '98', '2013', '76', '2014', '87', '87', '98', '65', '90'),
('btbti14473', 'btbti', 'null', '95', 'null', '89', 'null', 'null', '82', '79', '80', '85'),
('btbti14473', 'btbti', '2011', '95', '2013', '89', '2018', '85', '80', '85', '95', '95'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('576', 'bhg', 'null', '11', 'null', '1', 'null', 'null', '1', '1', '11', '1'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('45', 'C1', 'null', '1', 'null', '1', 'null', 'null', '1', '1', '1', '1'),
('1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null');

-- --------------------------------------------------------

-- 
-- Table structure for table `stud1`
-- 

DROP TABLE IF EXISTS `stud1`;
CREATE TABLE IF NOT EXISTS `stud1` (
  `id` varchar(20) NOT NULL,
  `dob` date NOT NULL,
  `fname` varchar(20) NOT NULL,
  `lname` varchar(20) NOT NULL,
  `faname` varchar(20) NOT NULL,
  `mbno` varchar(10) NOT NULL,
  `eid` varchar(20) NOT NULL,
  `tadd` varchar(50) NOT NULL,
  `padd` varchar(50) NOT NULL,
  `city` varchar(30) NOT NULL,
  `state` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `stud1`
-- 

INSERT INTO `stud1` (`id`, `dob`, `fname`, `lname`, `faname`, `mbno`, `eid`, `tadd`, `padd`, `city`, `state`) VALUES 
('5566', '2017-04-12', 'bhb', '', '', '', '', '', '', '', ''),
('299', '2017-04-19', 'SHILPI', 'Singh', 'ritesh', '1234567899', '', '', '', '', ''),
('1234', '2017-04-13', 'disha', 'drishti', 'rajesh', '1234321223', 'drishti@gmail.com', 'enter address: xyz', 'enter address: xyz', '', ''),
('2344', '2017-04-24', 'tiya', 'ghgh', 'asdf', '1234321234', 'vfg@gfhh.com', 'enter address: bggj', 'enter address: bggj', 'hjhjy', 'hjjj');

-- --------------------------------------------------------

-- 
-- Table structure for table `student_course`
-- 

DROP TABLE IF EXISTS `student_course`;
CREATE TABLE IF NOT EXISTS `student_course` (
  `stu_id` varchar(4) NOT NULL,
  `course_id` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `student_course`
-- 

INSERT INTO `student_course` (`stu_id`, `course_id`) VALUES 
('BTBT', 'c01'),
('BTBT', 'c02'),
('BTBT', 'c03'),
('BTBT', 'c04'),
('BTBT', 'c01');

-- --------------------------------------------------------

-- 
-- Table structure for table `student_placed_comp`
-- 

DROP TABLE IF EXISTS `student_placed_comp`;
CREATE TABLE IF NOT EXISTS `student_placed_comp` (
  `stu_id` varchar(4) NOT NULL,
  `comp_id` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `student_placed_comp`
-- 

INSERT INTO `student_placed_comp` (`stu_id`, `comp_id`) VALUES 
('btbt', 'c01'),
('BTBT', 'c02'),
('BTBT', 'c04');

-- --------------------------------------------------------

-- 
-- Table structure for table `ug`
-- 

DROP TABLE IF EXISTS `ug`;
CREATE TABLE IF NOT EXISTS `ug` (
  `stu_id` varchar(20) NOT NULL,
  `course_id` varchar(20) NOT NULL,
  `Year_of_10` varchar(10) NOT NULL,
  `tot_marks_10` varchar(10) NOT NULL,
  `max_marks_10th` varchar(10) NOT NULL,
  `per_10th` varchar(10) NOT NULL,
  `year_of_12th` varchar(10) NOT NULL,
  `tot_marks_12th` varchar(10) NOT NULL,
  `max_marks_12th` varchar(10) NOT NULL,
  `per_12th` varchar(10) NOT NULL,
  `sem1` varchar(10) NOT NULL,
  `sem2` varchar(10) NOT NULL,
  `sem3` varchar(10) NOT NULL,
  `sem4` varchar(10) NOT NULL,
  `sem5` varchar(10) NOT NULL,
  `sem6` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `ug`
-- 

INSERT INTO `ug` (`stu_id`, `course_id`, `Year_of_10`, `tot_marks_10`, `max_marks_10th`, `per_10th`, `year_of_12th`, `tot_marks_12th`, `max_marks_12th`, `per_12th`, `sem1`, `sem2`, `sem3`, `sem4`, `sem5`, `sem6`) VALUES 
('btbti', 'c01', '2011', '100', '90', '90', '2013', '1000', '900', '90', '60', '67', '80', '23', '45', '56'),
('btbti1', 'c02', '2011', '100', '80', '80', '2013', '1000', '900', '90', '60', '67', '80', '23', '45', '56'),
('btbti', 'c01', '2011', '100', '70', '70', '2013', '1000', '900', '90', '60', '70', '80', '23', '45', '56'),
('btbti14473', 'btbti', '2011', '600', '600', '95', '2013', '600', '600', '89', '82', '79', '80', '85', '85', '85'),
('', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('', '', 'null', 'null', 'null', '', 'null', 'null', 'null', '', '', '', '', '', 'null', 'null'),
('', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('576', 'bhg', '67', '1', '1', '11', '1', '1', '1', '1', '1', '1', '11', '1', '1', '1'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('45', 'C1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('1', '1', 'null', 'null', 'null', '1', 'null', 'null', 'null', '1', '1', '1', '1', '1', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
('null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null');
