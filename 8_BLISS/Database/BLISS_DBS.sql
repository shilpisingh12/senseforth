-- phpMyAdmin SQL Dump
-- version 2.9.2
-- http://www.phpmyadmin.net
-- 
-- Host: localhost
-- Generation Time: Apr 13, 2017 at 04:28 AM
-- Server version: 5.0.27
-- PHP Version: 5.2.1
-- 
-- Database: `bliss`
-- 

-- --------------------------------------------------------

-- 
-- Table structure for table `attach`
-- 

DROP TABLE IF EXISTS `attach`;
CREATE TABLE IF NOT EXISTS `attach` (
  `uid` varchar(20) NOT NULL,
  `path` varchar(100) NOT NULL,
  `year` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `attach`
-- 

INSERT INTO `attach` (`uid`, `path`, `year`) VALUES 
('TABCF12345', 'frequancy words.txt', 2016),
('TABCH67890', 'frequancy words.txt', 2016),
('TABCD21750', 'sentences.txt', 2016),
('TABCF12345', 'sentences.txt', 2014),
('TABCH67890', 'sentences.txt', 2014),
('TABCF12345', 'use of if.txt', 2015),
('TABCH67890', 'use of if.txt', 2015),
('TABCD21750', 'use of if.txt', 2014),
('TABCD21750', 'use of if.txt', 2015);

-- --------------------------------------------------------

-- 
-- Table structure for table `continuous`
-- 

DROP TABLE IF EXISTS `continuous`;
CREATE TABLE IF NOT EXISTS `continuous` (
  `uid` varchar(20) NOT NULL,
  `class` varchar(30) NOT NULL,
  `course` varchar(20) NOT NULL,
  `nos` int(10) NOT NULL,
  `cont_ass` varchar(50) NOT NULL,
  `Year` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `continuous`
-- 

INSERT INTO `continuous` (`uid`, `class`, `course`, `nos`, `cont_ass`, `Year`) VALUES 
('TABCF12345', 'Mca 3rd year', 'SE', 120, 'Home Assignment', 2014),
('TABCH67890', 'Mca 2nd year', 'OS', 95, 'Viva', 2014),
('TABCF12345', 'Btech 2nd year(CS) ', 'MM', 116, 'Viva,Assignment', 2015),
('TABCF12345', 'Btech 2nd year(CS)', 'SAD', 100, 'Home Assignment', 2016),
('TABCH67890', 'Btech 3rd year(IT)', 'OT', 116, 'Viva', 2015),
('TABCH67890', 'Btech 2nd year(IT)', 'DAA', 100, 'Presentation', 2016),
('TABCF12345', 'BCA 2nd year', 'BDP & SAD', 120, 'Viva', 2014),
('TABCF12345', 'Btech 2nd year(IT)', 'CAO', 95, 'Home Assignment', 2015),
('TABCF12345', 'Btech 3rd year(IT)', 'SE', 97, 'Viva,Assignment', 2016),
('TABCH67890', 'Btech 2nd year(IT)', 'DAA', 96, 'Viva', 2014),
('TABCH67890', 'Btech 3rd year(IT)', 'OS', 100, 'Presentation', 2015),
('TABCH67890', 'Btech 1st year(CS)', 'CFP', 117, 'Viva,Assignment', 2016),
('TABCF58670', 'Btech 2nd year(CS)', 'DS', 100, 'Home Assignment', 2014),
('TABCF58670', 'Btech 3rd year(CS)', 'DCN', 116, 'Presentation', 2015),
('TABCF58670', 'Mca 2nd year', 'DAA', 95, 'Viva,Presentation', 2016),
('TABCF42521', 'Btech 2nd year(IT)', 'OOP', 100, 'Home Assignment', 2014),
('TABCF42521', 'Mca 2nd year', 'CFP', 97, 'Home Assignment', 2015),
('TABCF42521', 'Btech 3rd year(IT)', 'IWT', 116, 'Viva', 2016),
('TABCD21750', 'BCA 1st year', 'TOC', 116, 'Home Assignment', 2014),
('TABCD21750', 'Btech 3rd year(CS) ', 'MM', 110, 'Viva', 2015),
('TABCD21750', 'Btech 2nd year(IT)', 'DAA', 100, 'Assignment', 2016),
('TABCF12345', 'Mca 3rd year', 'OS', 120, 'Viva', 2014);

-- --------------------------------------------------------

-- 
-- Table structure for table `departmental_respo`
-- 

DROP TABLE IF EXISTS `departmental_respo`;
CREATE TABLE IF NOT EXISTS `departmental_respo` (
  `uid` varchar(10) NOT NULL,
  `Details` varchar(30) NOT NULL,
  `Credit_Points` int(10) NOT NULL,
  `Year` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `departmental_respo`
-- 

INSERT INTO `departmental_respo` (`uid`, `Details`, `Credit_Points`, `Year`) VALUES 
('TABCF12345', 'Annual Report Committee', 4, 2014),
('TABCF12345', 'Cultural Committee', 5, 2015),
('TABCF12345', 'Student taken for Placement', 1, 2016),
('TABCH67890', 'Annual Report Committee', 3, 2014),
('TABCH67890', 'Student taken for Placement', 2, 2015),
('TABCH67890', 'Cultural Committee of Mayukh', 3, 2016),
('TABCF12345', 'Cultural Committee', 5, 2014),
('TABCF12345', 'Cultural Committee of Mayukh', 5, 2015),
('TABCF12345', 'Annual Report Committee', 4, 2016),
('TABCH67890', 'Cultural Committee of Mayukh', 5, 2014),
('TABCH67890', 'Annual Report Committee', 5, 2015),
('TABCH67890', 'Student taken for Placement', 5, 2016),
('TABCF58670', 'Decor Committee of Mayukh ', 3, 2014),
('TABCF58670', 'Annual Report Committee', 5, 2015),
('TABCF58670', 'Student taken for Placement', 4, 2016),
('TABCF42521', 'Cultural Committee of Mayukh', 4, 2014),
('TABCF42521', 'Annual Report Committee', 3, 2015),
('TABCF42521', 'Student taken for Placement', 4, 2016),
('TABCD21750', 'Workshop Conduct', 3, 2014),
('TABCD21750', 'Annual Report Committee', 4, 2015),
('TABCD21750', 'Coordinator of Placement', 5, 2016);

-- --------------------------------------------------------

-- 
-- Table structure for table `invigilation`
-- 

DROP TABLE IF EXISTS `invigilation`;
CREATE TABLE IF NOT EXISTS `invigilation` (
  `uid` varchar(20) NOT NULL,
  `exam` varchar(30) NOT NULL,
  `invig_duties` varchar(30) NOT NULL,
  `Duties_attend` int(10) NOT NULL,
  `Leave_taken` int(10) NOT NULL,
  `quality_invig` varchar(20) NOT NULL,
  `Full_cp` int(10) NOT NULL,
  `Obtained_cp` int(10) NOT NULL,
  `Year` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `invigilation`
-- 

INSERT INTO `invigilation` (`uid`, `exam`, `invig_duties`, `Duties_attend`, `Leave_taken`, `quality_invig`, `Full_cp`, `Obtained_cp`, `Year`) VALUES 
('TABCF12345', 'Btech 2nd yr semester exam', 'Class Room', 5, 0, 'Teacher', 5, 2, 2014),
('TABCF12345', 'Btech 3rd yr periodical 1', 'Class Room', 4, 0, 'Teacher', 5, 3, 2015),
('TABCF12345', 'Mca 2nd yr semester exam', 'Class Room', 3, 0, 'Teacher', 5, 4, 2016),
('TABCH67890', 'Btech 3rd yr periodical 1', 'Class Room', 3, 1, 'Teacher', 5, 2, 2014),
('TABCH67890', 'Btech 3rd yr semester exam', 'Class Room', 3, 1, 'Teacher', 5, 3, 2015),
('TABCH67890', 'Btech 1st yr periodical exam', 'Class Room', 3, 0, 'Teacher', 5, 4, 2016),
('TABCF12345', 'MCA 2nd yr semester exam', 'Class Room', 3, 0, 'Teacher', 5, 4, 2015),
('TABCF12345', 'BCA I yr semester exam', 'Class Room', 5, 0, 'Teacher', 5, 4, 2016),
('TABCH67890', 'BCA II yr periodical exam', 'Class Room', 5, 2, 'Teacher', 5, 4, 2014),
('TABCH67890', 'BCA II yr sem exam', 'Class Room', 5, 2, 'Teacher', 5, 4, 2015),
('TABCH67890', 'Btech IV yr semester exam', 'Class Room', 4, 1, 'Teacher', 5, 4, 2016),
('TABCF58670', 'Btech 3rd yr periodical 1', 'Class Room', 3, 1, 'Teacher', 5, 4, 2014),
('TABCF58670', 'Bca 2nd yr semester exam', 'Class Room', 4, 0, 'Teacher', 5, 4, 2015),
('TABCF58670', 'Btech 3rd yr semester exam', 'Class Room', 4, 0, 'Teacher', 5, 3, 2016),
('TABCF42521', 'Bca 1st yr semester exam', 'Class Room', 4, 1, 'Teacher', 5, 3, 2014),
('TABCF42521', 'Btech 3rd yr periodical 2', 'Class Room', 4, 0, 'Teacher', 5, 4, 2015),
('TABCF42521', 'Mca 1st yr periodical 1', 'Class Room', 4, 0, 'Teacher', 5, 4, 2016);

-- --------------------------------------------------------

-- 
-- Table structure for table `login`
-- 

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `uid` varchar(20) NOT NULL,
  `pwd` varchar(20) NOT NULL,
  PRIMARY KEY  (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `login`
-- 

INSERT INTO `login` (`uid`, `pwd`) VALUES 
('TABCA52140', '52140'),
('TABCD21750', '21750'),
('TABCE19976', '19976'),
('TABCF12345', '12345'),
('TABCF42521', '42521'),
('TABCF58670', '58670'),
('TABCH67890', '67890'),
('TABCL12367', '12367'),
('TABCO123456', '123456'),
('TABCT15446', '15446');

-- --------------------------------------------------------

-- 
-- Table structure for table `login1`
-- 

DROP TABLE IF EXISTS `login1`;
CREATE TABLE IF NOT EXISTS `login1` (
  `uid` varchar(20) NOT NULL,
  `Medical` varchar(3) NOT NULL,
  `Earn` varchar(3) NOT NULL,
  `Casual` varchar(3) NOT NULL,
  `Total` varchar(3) NOT NULL,
  `Year` int(20) NOT NULL,
  PRIMARY KEY  (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `login1`
-- 

INSERT INTO `login1` (`uid`, `Medical`, `Earn`, `Casual`, `Total`, `Year`) VALUES 
('TABCF12345', '6', '3', '5', '14', 2014);

-- --------------------------------------------------------

-- 
-- Table structure for table `login2`
-- 

DROP TABLE IF EXISTS `login2`;
CREATE TABLE IF NOT EXISTS `login2` (
  `Days` varchar(50) NOT NULL,
  `9:00-10:00` varchar(50) NOT NULL,
  `10:00-11:00` varchar(50) NOT NULL,
  `11:00-12:00` varchar(50) NOT NULL,
  `12:00-1:00` varchar(50) NOT NULL,
  `1:00-3:00` varchar(50) NOT NULL,
  `3:00-4:00` varchar(50) NOT NULL,
  `4:00-5:00` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `login2`
-- 

INSERT INTO `login2` (`Days`, `9:00-10:00`, `10:00-11:00`, `11:00-12:00`, `12:00-1:00`, `1:00-3:00`, `3:00-4:00`, `4:00-5:00`) VALUES 
('Fri', 'CFP Btech I year', 'SP Btech(CS) III year', 'DAA Btech(IT) II year', 'OS Mca II year', 'Break', 'CFP lab Batch-A Btech I year', 'CFP lab Batch-A Btech I year');

-- --------------------------------------------------------

-- 
-- Table structure for table `other_academic_respo`
-- 

DROP TABLE IF EXISTS `other_academic_respo`;
CREATE TABLE IF NOT EXISTS `other_academic_respo` (
  `uid` varchar(20) NOT NULL,
  `Academic_body` varchar(20) NOT NULL,
  `Meeting_attend` varchar(20) NOT NULL,
  `role_respo` varchar(20) NOT NULL,
  `quality_parti` varchar(20) NOT NULL,
  `Full_cp` int(10) NOT NULL,
  `Obtained_cp` int(10) NOT NULL,
  `Year` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `other_academic_respo`
-- 

INSERT INTO `other_academic_respo` (`uid`, `Academic_body`, `Meeting_attend`, `role_respo`, `quality_parti`, `Full_cp`, `Obtained_cp`, `Year`) VALUES 
('TABCF12345', 'BOS(remotequery)', 'Attended', 'Syallbus Designed', 'Member', 5, 1, 2014),
('TABCF12345', 'BOS', 'Attended', 'Syllabus Discussion', 'Teacher', 5, 3, 2015),
('TABCF12345', 'BOS', 'Attended', 'Time Table Design', 'Member', 5, 4, 2016),
('TABCH67890', 'BOS', 'Attended', 'Syllabus Disscussion', 'Teacher', 5, 4, 2014),
('TABCF67890', 'BOS', 'Attended', 'Syllabus Designed', 'Teacher', 5, 3, 2015),
('TABCH67890', 'BOS', 'Attended', 'Syllabus disscussion', 'Teacher', 5, 3, 2016),
('TABCF12345', 'BOS', 'Attended', 'Syllabus Discussion', 'Member', 5, 4, 2014),
('TABCF12345', 'BOS', 'Attended', 'Syllabus designed', 'Member', 5, 4, 2015),
('TABCF12345', 'BOS', 'Attended', 'Syllabus Designed', 'Teacher', 5, 3, 2016),
('TABCH67890', 'BOS', 'Attended', 'Time Table Design', 'Member', 5, 4, 2014),
('TABCH67890', 'BOS', 'Attended', 'Time Table Design', 'Member', 5, 4, 2015),
('TABCH67890', 'BOS', 'Attended', 'Syllabus Discussion', 'Member', 5, 4, 2016),
('TABCF42521', 'BOS', 'Attended', 'Time Table Design', 'Member', 5, 3, 2014),
('TABCF42521', 'BOS', 'Attended', 'Syllabus Discussion', 'Teacher', 5, 4, 2015),
('TABCF42521', 'BOS', 'Attended', 'Syllabus Designed', 'Member', 5, 4, 2016),
('TABCF58670', 'BOS', 'Attended', 'Time Table Design', 'Member', 5, 4, 2014),
('TABCF58670', 'BOS', 'Attended', 'Syllabus Discussion', 'Teacher', 5, 3, 2015),
('TABCF58670', 'BOS', 'Attended', 'Syllabus Designed', 'Member', 5, 4, 2016),
('TABCD21750', 'BOS', 'Attended', 'Syllabus Discussion', 'Member', 5, 4, 2014),
('TABCD21750', 'BOS', 'Attended', 'Time Table Discussio', 'Head', 5, 5, 2015),
('TABCD21750', 'BOS', 'Attended', 'Syllabus Discussion', 'Head', 5, 5, 2016);

-- --------------------------------------------------------

-- 
-- Table structure for table `other_insti_respo`
-- 

DROP TABLE IF EXISTS `other_insti_respo`;
CREATE TABLE IF NOT EXISTS `other_insti_respo` (
  `uid` varchar(20) NOT NULL,
  `Responsibilities` varchar(30) NOT NULL,
  `Quality` varchar(30) NOT NULL,
  `Full_cp` int(10) NOT NULL,
  `Obtained_cp` int(10) NOT NULL,
  `Year` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `other_insti_respo`
-- 

INSERT INTO `other_insti_respo` (`uid`, `Responsibilities`, `Quality`, `Full_cp`, `Obtained_cp`, `Year`) VALUES 
('TABCF12345', 'Convocation Degree', 'Member', 5, 1, 2014),
('TABCF12345', 'Apaji-Mela Dinner Duty', 'Member', 5, 5, 2015),
('TABCF12345', 'Admission Duty', 'Member', 5, 4, 2016),
('TABCH67890', 'Annual Function Duty', 'Member', 5, 3, 2014),
('TABCF67890', 'Admission Duty', 'Member', 5, 4, 2015),
('TABCH67890', 'Workshop Conduct', 'Member', 5, 3, 2016),
('TABCF12345', 'Workshop Conduct', 'Member', 5, 4, 2014),
('TABCF12345', 'Convocation Duty', 'Member', 5, 5, 2015),
('TABCF12345', 'Apaji-Mela Duty', 'Member', 5, 4, 2016),
('TABCH67890', 'Workshop Conduct', 'Member', 5, 4, 2014),
('TABCH67890', 'Convocation Duty', 'Member', 5, 4, 2015),
('TABCH67890', 'Apaji-Mela Duty', 'Member', 5, 5, 2016),
('TABCF58670', 'Convocation Duty', 'Member', 5, 4, 2014),
('TABCF58670', 'Apaji-Mela Duty', 'Member', 5, 3, 2015),
('TABCF58670', 'Workshop Duty', 'Member', 5, 4, 2016),
('TABCF42521', 'Placement Duty', 'Member', 5, 4, 2014),
('TABCF42521', 'Convocation Duty', 'Member', 5, 3, 2015),
('TABCF42521', 'Workshop Duty', 'Member', 5, 3, 2016),
('TABCD21750', 'Workshop Conduct', 'Head', 5, 5, 2014),
('TABCD21750', 'Convocation Duty', 'Member', 5, 5, 2015),
('TABCD21750', 'Apaji-Mela Duty', 'Head', 5, 5, 2016);

-- --------------------------------------------------------

-- 
-- Table structure for table `personal_details`
-- 

DROP TABLE IF EXISTS `personal_details`;
CREATE TABLE IF NOT EXISTS `personal_details` (
  `uid` varchar(20) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Desig` varchar(50) NOT NULL,
  `Salary` float NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Year` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `personal_details`
-- 

INSERT INTO `personal_details` (`uid`, `Name`, `Desig`, `Salary`, `Gender`, `Year`) VALUES 
('TABCF12345', 'Rita Gupta', 'Professor', 100000, 'Female', 2014),
('TABCH67890', 'Suhana Malik', 'Assistent Professor', 50000, 'Female', 2014),
('TABCF12345', 'Rita Gupta', 'Professor', 90000, 'Female', 2015),
('TABCF12345', 'Rita Gupta', 'Professor', 90000, 'Female', 2016),
('TABCH67890', 'Suhana Malik', 'Assistent Professor', 50000, 'Female', 2015),
('TABCH67890', 'Suhana Malik', 'Assistent Professor', 50000, 'Female', 2016),
('TABCF58670', 'Vijay Kumar', 'Professor', 80000, 'Male', 2014),
('TABCF58670', 'Vijay Kumar', 'Professor', 80000, 'Male', 2015),
('TABCF58670', 'Vijay Kumar', 'Professor', 80000, 'Male', 2016),
('TABCF42521', 'Amit Trivedi', 'Assistent Professor', 60000, 'Male', 2014),
('TABCF42521', 'Amit Trivedi', 'Assistent Professor', 60000, 'Male', 2015),
('TABCF42521', 'Amit Trivedi', 'Assistent Professor', 60000, 'Male', 2016),
('TABCD21750', 'Anant Mathur', 'Dean', 100000, 'Male', 2014),
('TABCD21750', 'Anant Mathur', 'Dean', 100000, 'Male', 2015),
('TABCD21750', 'Anant Mathur', 'Dean', 100000, 'Male', 2016),
('TABCA52140', 'Aditya Shastri', 'Vice Chancellor', 500000, 'Male', 2014),
('TABCF90213', 'Ashok Kumar', 'Professor', 90000, 'Male', 2014);

-- --------------------------------------------------------

-- 
-- Table structure for table `security_que`
-- 

DROP TABLE IF EXISTS `security_que`;
CREATE TABLE IF NOT EXISTS `security_que` (
  `uid` varchar(20) NOT NULL,
  `que` varchar(100) NOT NULL,
  `ans` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `security_que`
-- 

INSERT INTO `security_que` (`uid`, `que`, `ans`) VALUES 
('TABCF12345', 'What is your pet name?', 'Tommy'),
('TABCH67890', 'What is your hobby?', 'Dancing'),
('TABCF58670', 'What is your father''s name?', 'Raman Malya'),
('TABCF42521', 'Where are you from?', 'Delhi');

-- --------------------------------------------------------

-- 
-- Table structure for table `timetable`
-- 

DROP TABLE IF EXISTS `timetable`;
CREATE TABLE IF NOT EXISTS `timetable` (
  `Days` varchar(15) NOT NULL,
  `_9_to_10` varchar(100) NOT NULL,
  `_10_to_11` varchar(50) NOT NULL,
  `_11_to_12` varchar(50) NOT NULL,
  `_12_to_1` varchar(50) NOT NULL,
  `_1_to_3` varchar(20) NOT NULL,
  `_3_to_4` varchar(50) NOT NULL,
  `_4_to_5` varchar(50) NOT NULL,
  PRIMARY KEY  (`Days`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `timetable`
-- 

INSERT INTO `timetable` (`Days`, `_9_to_10`, `_10_to_11`, `_11_to_12`, `_12_to_1`, `_1_to_3`, `_3_to_4`, `_4_to_5`) VALUES 
('Fri', 'CFP Btech I year', 'SP Btech(CS) III year', 'DAA Btech(IT) II year', 'OS Mca II year', 'Break	', 'CFP lab Batch-A Btech I year', 'CFP lab Batch-A Btech I year'),
('Mon', 'JAVA Mca III year', 'OOP Btech(CS) II year', 'JAVA Lab batch-B Mca III year', 'JAVA Lab batch-B Mca III year', 'Break', 'SAD Btech I year', 'DBMS Btech(IT) II year'),
('Sat', 'CFP Btech I year', 'SP Btech(CS) III year', 'DAA Btech(IT) II year', 'OS Mca II year', 'Break', 'CFP lab batch-B Btech I year', 'CFP lab batch-B Btech I year'),
('Sun', 'JAVA Mca III year', 'OOP Btech(CS) II year', 'Java Lab batch-A Mca III year', 'Java Lab batch-A Mca III year', 'Break', 'SAD Btech I year', 'DBMS Btech(IT) II year'),
('Thu', 'DAA Btech(IT) II year', 'OS Mca II year', 'DAA lab batch-B Btech(IT) II year', 'DAA lab batch-B Btech(IT) II year', 'Break', 'CFP Btech I year', 'SP Btech(CS) III year'),
('Wed', 'DAA Btech(IT) II year', 'OS Mca II year', 'DAA lab batch-A Btech(IT) II year', 'DAA lab batch-A Btech(IT) II year', 'Break', 'CFP Btech I year', 'SP Btech(CS) III year');

-- --------------------------------------------------------

-- 
-- Table structure for table `timetable1`
-- 

DROP TABLE IF EXISTS `timetable1`;
CREATE TABLE IF NOT EXISTS `timetable1` (
  `Days` varchar(50) NOT NULL,
  `_9_to_10` varchar(50) NOT NULL,
  `_10_to_11` varchar(50) NOT NULL,
  `_11_to_12` varchar(50) NOT NULL,
  `_12_to_1` varchar(50) NOT NULL,
  `_1_to_3` varchar(50) NOT NULL,
  `_3_to_4` varchar(50) NOT NULL,
  `_4_to_5` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `timetable1`
-- 

INSERT INTO `timetable1` (`Days`, `_9_to_10`, `_10_to_11`, `_11_to_12`, `_12_to_1`, `_1_to_3`, `_3_to_4`, `_4_to_5`) VALUES 
('Wed', 'CFP Btech I year', 'DBMS Btech(CS) II year', 'CFP lab Batch-A Btech I year', 'CFP lab Batch-A Btech I year', 'Break', 'SAD Btech(IT) II year', 'OS Mca II year'),
('Thu', 'CFP Btech I year', 'DBMS Btech(CS) II year', 'CFP lab Batch-B Btech I year', 'CFP lab Batch-B Btech I year', 'Break', 'SAD Btech(IT) II year', 'OS Mca II year'),
('Fri', 'CAO Btech(IT) II year', 'Break', 'MM Btech(CS) III year', 'TOC Btech(IT) III year', 'Break', 'MM Lab batch-B Btech III year', 'MM Lab batch-B Btech III year'),
('Sat', 'CAO Btech(IT) II year', 'Break', 'MM Btech(CS) III year', 'TOC Btech(IT) III year', 'Break', 'MM Lab batch-A Btech III year', 'MM Lab batch-A Btech III year'),
('Sun', 'DBMS Btech(CS) II year', 'CAO Btech(IT) II year', 'TOC Btech(IT) III year', 'OS Mca II year', 'Break', 'SAD Btech(IT) II year', 'CFP Btech I year'),
('Mon', 'DBMS Btech(CS) II year', 'CAO Btech(IT) II year', 'TOC Btech(IT) III year', 'OS Mca II year', 'Break', 'SAD Btech(IT) II year', 'CFP Btech I year');

-- --------------------------------------------------------

-- 
-- Table structure for table `workshop`
-- 

DROP TABLE IF EXISTS `workshop`;
CREATE TABLE IF NOT EXISTS `workshop` (
  `uid` varchar(20) NOT NULL,
  `title` varchar(30) NOT NULL,
  `place` varchar(30) NOT NULL,
  `date` date NOT NULL,
  `details` varchar(50) NOT NULL,
  `Year` varchar(10) NOT NULL,
  `credit` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `workshop`
-- 

INSERT INTO `workshop` (`uid`, `title`, `place`, `date`, `details`, `Year`, `credit`) VALUES 
('TABCF12345', 'Attended', 'Banasthali', '2001-12-14', 'Big Data Hadoop', '2014', '1'),
('TABCF12345', 'Attended', 'Banasthali', '2014-07-14', 'Networking', '2014', '5'),
('TABCH67890', 'Attended', 'Lucknow', '2015-02-01', 'Ethical Hacking', '2015', '5'),
('TABCF67890', 'Attended', 'Lucknow', '2015-02-11', 'Ethical Hacking', '2015', '5'),
('TABCF12345', 'Attended', 'Banasthali', '2015-06-09', 'App Development', '2015', '5'),
('TABCF12345', 'Attended', 'Jaipur', '2015-04-01', 'App Development', '2015', '4'),
('TABCH67890', 'Attended', 'Banasthali', '2014-02-08', 'Big Data', '2014', '5'),
('TABCH67890', 'Attended', 'Delhi', '2014-02-08', 'App Development', '2014', '4'),
('TABCD21750', 'Attended', 'Banasthali', '2014-02-05', 'Networking', '2014', '5'),
('TABCD21750', 'Attended', 'Banasthali', '2015-05-06', 'IOT', '2015', '4');
