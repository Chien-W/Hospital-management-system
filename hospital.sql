USE [master]
GO
/****** Object:  Database [Hospital table]    Script Date: 07/10/2020 17:07:55 ******/
CREATE DATABASE [Hospital table] ON  PRIMARY 
( NAME = N'Hospital table', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\Hospital table.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'Hospital table_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\Hospital table_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [Hospital table] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Hospital table].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Hospital table] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [Hospital table] SET ANSI_NULLS OFF
GO
ALTER DATABASE [Hospital table] SET ANSI_PADDING OFF
GO
ALTER DATABASE [Hospital table] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [Hospital table] SET ARITHABORT OFF
GO
ALTER DATABASE [Hospital table] SET AUTO_CLOSE OFF
GO
ALTER DATABASE [Hospital table] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [Hospital table] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [Hospital table] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [Hospital table] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [Hospital table] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [Hospital table] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [Hospital table] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [Hospital table] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [Hospital table] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [Hospital table] SET  DISABLE_BROKER
GO
ALTER DATABASE [Hospital table] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [Hospital table] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [Hospital table] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [Hospital table] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [Hospital table] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [Hospital table] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [Hospital table] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [Hospital table] SET  READ_WRITE
GO
ALTER DATABASE [Hospital table] SET RECOVERY FULL
GO
ALTER DATABASE [Hospital table] SET  MULTI_USER
GO
ALTER DATABASE [Hospital table] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [Hospital table] SET DB_CHAINING OFF
GO
EXEC sys.sp_db_vardecimal_storage_format N'Hospital table', N'ON'
GO
USE [Hospital table]
GO
/****** Object:  Table [dbo].[员工工资信息表]    Script Date: 07/10/2020 17:07:56 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[员工工资信息表](
	[员工号] [nchar](50) NOT NULL,
	[工资] [nchar](50) NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[员工工资信息表] ([员工号], [工资]) VALUES (N'GC001                                             ', N'8000                                              ')
INSERT [dbo].[员工工资信息表] ([员工号], [工资]) VALUES (N'GC002                                             ', N'5000                                              ')
/****** Object:  Table [dbo].[医疗仪器信息表]    Script Date: 07/10/2020 17:07:56 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[医疗仪器信息表](
	[仪器代号] [nchar](50) NOT NULL,
	[仪器名称] [nchar](50) NOT NULL,
	[仪器价格] [nchar](10) NOT NULL,
	[仪器数量] [int] NOT NULL,
	[备注] [nchar](500) NOT NULL,
 CONSTRAINT [PK_医疗仪器信息表] PRIMARY KEY CLUSTERED 
(
	[仪器代号] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[医疗仪器信息表] ([仪器代号], [仪器名称], [仪器价格], [仪器数量], [备注]) VALUES (N'1                                                 ', N'棉签                                                ', N'2         ', 899, N'无                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ')
INSERT [dbo].[医疗仪器信息表] ([仪器代号], [仪器名称], [仪器价格], [仪器数量], [备注]) VALUES (N'2                                                 ', N'手套                                                ', N'5         ', 335, N'无                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ')
/****** Object:  Table [dbo].[药剂信息表]    Script Date: 07/10/2020 17:07:56 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[药剂信息表](
	[药剂代号] [nchar](50) NOT NULL,
	[药剂名称] [nchar](50) NOT NULL,
	[药剂价格] [nchar](50) NOT NULL,
	[药剂库存数量] [nchar](50) NOT NULL,
	[备注] [nchar](500) NOT NULL,
 CONSTRAINT [PK_药剂信息表] PRIMARY KEY CLUSTERED 
(
	[药剂代号] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[药剂信息表] ([药剂代号], [药剂名称], [药剂价格], [药剂库存数量], [备注]) VALUES (N'23                                                ', N'头孢                                                ', N'522                                               ', N'123                                               ', N'无                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ')
INSERT [dbo].[药剂信息表] ([药剂代号], [药剂名称], [药剂价格], [药剂库存数量], [备注]) VALUES (N'25                                                ', N'青霉素                                               ', N'222                                               ', N'123                                               ', N'无                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ')
/****** Object:  Table [dbo].[系统的用户口令表]    Script Date: 07/10/2020 17:07:56 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[系统的用户口令表](
	[用户名] [nchar](50) NOT NULL,
	[口令] [nchar](50) NOT NULL,
	[权限] [nchar](50) NOT NULL,
 CONSTRAINT [PK_系统的用户口令表] PRIMARY KEY CLUSTERED 
(
	[用户名] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[系统的用户口令表] ([用户名], [口令], [权限]) VALUES (N'admin                                             ', N'123456                                            ', N'root                                              ')
INSERT [dbo].[系统的用户口令表] ([用户名], [口令], [权限]) VALUES (N'doctor                                            ', N'123456                                            ', N'user                                              ')
INSERT [dbo].[系统的用户口令表] ([用户名], [口令], [权限]) VALUES (N'GC001                                             ', N'123456                                            ', N'user                                              ')
INSERT [dbo].[系统的用户口令表] ([用户名], [口令], [权限]) VALUES (N'GC002                                             ', N'123456                                            ', N'user                                              ')
INSERT [dbo].[系统的用户口令表] ([用户名], [口令], [权限]) VALUES (N'root                                              ', N'123456                                            ', N'root                                              ')
/****** Object:  Table [dbo].[工作岗位情况表]    Script Date: 07/10/2020 17:07:56 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[工作岗位情况表](
	[工作岗位代号] [nchar](50) NOT NULL,
	[工作岗位名称] [nchar](50) NOT NULL,
 CONSTRAINT [PK_工作岗位情况表] PRIMARY KEY CLUSTERED 
(
	[工作岗位代号] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[工作岗位情况表] ([工作岗位代号], [工作岗位名称]) VALUES (N'001                                               ', N'教授                                                ')
INSERT [dbo].[工作岗位情况表] ([工作岗位代号], [工作岗位名称]) VALUES (N'002                                               ', N'副教授                                               ')
INSERT [dbo].[工作岗位情况表] ([工作岗位代号], [工作岗位名称]) VALUES (N'003                                               ', N'主治医生                                              ')
INSERT [dbo].[工作岗位情况表] ([工作岗位代号], [工作岗位名称]) VALUES (N'004                                               ', N'助手                                                ')
/****** Object:  Table [dbo].[床位信息表]    Script Date: 07/10/2020 17:07:56 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[床位信息表](
	[床位号] [nchar](10) NOT NULL,
	[床位状态] [nchar](50) NOT NULL,
 CONSTRAINT [PK_床位信息表] PRIMARY KEY CLUSTERED 
(
	[床位号] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[床位信息表] ([床位号], [床位状态]) VALUES (N'001       ', N'有人                                                ')
INSERT [dbo].[床位信息表] ([床位号], [床位状态]) VALUES (N'002       ', N'有人                                                ')
INSERT [dbo].[床位信息表] ([床位号], [床位状态]) VALUES (N'003       ', N'有人                                                ')
INSERT [dbo].[床位信息表] ([床位号], [床位状态]) VALUES (N'004       ', N'空闲                                                ')
INSERT [dbo].[床位信息表] ([床位号], [床位状态]) VALUES (N'005       ', N'空闲                                                ')
INSERT [dbo].[床位信息表] ([床位号], [床位状态]) VALUES (N'006       ', N'空闲                                                ')
INSERT [dbo].[床位信息表] ([床位号], [床位状态]) VALUES (N'007       ', N'空闲                                                ')
INSERT [dbo].[床位信息表] ([床位号], [床位状态]) VALUES (N'008       ', N'空闲                                                ')
INSERT [dbo].[床位信息表] ([床位号], [床位状态]) VALUES (N'009       ', N'空闲                                                ')
INSERT [dbo].[床位信息表] ([床位号], [床位状态]) VALUES (N'010       ', N'空闲                                                ')
INSERT [dbo].[床位信息表] ([床位号], [床位状态]) VALUES (N'011       ', N'空闲                                                ')
/****** Object:  Table [dbo].[部门信息表]    Script Date: 07/10/2020 17:07:56 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[部门信息表](
	[部门代号] [nchar](50) NOT NULL,
	[部门名称] [nchar](50) NOT NULL,
	[部门主任代号] [nchar](50) NOT NULL,
	[部门副主任代号] [nchar](50) NOT NULL,
 CONSTRAINT [PK_部门信息表] PRIMARY KEY CLUSTERED 
(
	[部门代号] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[部门信息表] ([部门代号], [部门名称], [部门主任代号], [部门副主任代号]) VALUES (N'NK                                                ', N'内科                                                ', N'001                                               ', N'0001                                              ')
INSERT [dbo].[部门信息表] ([部门代号], [部门名称], [部门主任代号], [部门副主任代号]) VALUES (N'WK                                                ', N'外科                                                ', N'001                                               ', N'0001                                              ')
INSERT [dbo].[部门信息表] ([部门代号], [部门名称], [部门主任代号], [部门副主任代号]) VALUES (N'XNXG                                              ', N'心脑血管                                              ', N'001                                               ', N'0001                                              ')
/****** Object:  Table [dbo].[员工基本状况表]    Script Date: 07/10/2020 17:07:56 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[员工基本状况表](
	[员工号] [nchar](50) NOT NULL,
	[员工姓名] [nchar](50) NOT NULL,
	[所在的部门号] [nchar](50) NOT NULL,
	[职务] [nchar](50) NOT NULL,
	[学历] [nchar](50) NOT NULL,
	[性别] [nchar](50) NOT NULL,
	[生日] [nchar](50) NOT NULL,
	[籍贯] [nchar](50) NOT NULL,
	[国籍] [nchar](50) NOT NULL,
	[民族] [nchar](50) NOT NULL,
	[身份证号] [nchar](50) NOT NULL,
	[婚姻状况] [nchar](50) NOT NULL,
	[健康状况] [nchar](50) NOT NULL,
	[参加工作时间] [nchar](50) NOT NULL,
	[员工状态] [nchar](50) NOT NULL,
	[家庭住址] [nchar](50) NOT NULL,
	[联系电话] [nchar](50) NOT NULL,
	[联系Email地址] [nchar](50) NOT NULL,
	[工作岗位代号] [nchar](50) NOT NULL,
 CONSTRAINT [PK_员工基本状况表] PRIMARY KEY CLUSTERED 
(
	[员工号] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[员工基本状况表] ([员工号], [员工姓名], [所在的部门号], [职务], [学历], [性别], [生日], [籍贯], [国籍], [民族], [身份证号], [婚姻状况], [健康状况], [参加工作时间], [员工状态], [家庭住址], [联系电话], [联系Email地址], [工作岗位代号]) VALUES (N'GC001                                             ', N'吴佳伟                                               ', N'NK                                                ', N'主治医生                                              ', N'本科                                                ', N'男                                                 ', N'1999.07.09                                        ', N'湖南长沙                                              ', N'中国                                                ', N'汉                                                 ', N'430104199907092511                                ', N'未婚                                                ', N'优秀                                                ', N'2004.11.25                                        ', N'在职                                                ', N'湖南省长沙市                                            ', N'18874299510                                       ', N'764012358@qq.com                                  ', N'001                                               ')
INSERT [dbo].[员工基本状况表] ([员工号], [员工姓名], [所在的部门号], [职务], [学历], [性别], [生日], [籍贯], [国籍], [民族], [身份证号], [婚姻状况], [健康状况], [参加工作时间], [员工状态], [家庭住址], [联系电话], [联系Email地址], [工作岗位代号]) VALUES (N'GC002                                             ', N'邹铎                                                ', N'WK                                                ', N'主治医生                                              ', N'本科                                                ', N'男                                                 ', N'2000.01.02                                        ', N'东北                                                ', N'中国                                                ', N'汉                                                 ', N'430405999984421568                                ', N'未婚                                                ', N'优秀                                                ', N'2008.12.21                                        ', N'在职                                                ', N'湖南省长沙市                                            ', N'18874568123                                       ', N'7658351813@qq.com                                 ', N'002                                               ')
/****** Object:  Table [dbo].[病人信息表]    Script Date: 07/10/2020 17:07:56 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[病人信息表](
	[病人姓名] [nchar](50) NOT NULL,
	[病人性别] [nchar](50) NOT NULL,
	[入院时间] [nchar](50) NOT NULL,
	[病人所属科室] [nchar](50) NOT NULL,
	[病人状况] [nchar](50) NOT NULL,
	[病人主治医生] [nchar](50) NOT NULL,
	[病人房间号] [nchar](50) NOT NULL,
	[病人床位号] [nchar](10) NOT NULL,
 CONSTRAINT [PK_病人信息表] PRIMARY KEY CLUSTERED 
(
	[病人姓名] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[病人信息表] ([病人姓名], [病人性别], [入院时间], [病人所属科室], [病人状况], [病人主治医生], [病人房间号], [病人床位号]) VALUES (N'王锡龙                                               ', N'女                                                 ', N'2019.12.25                                        ', N'外科                                                ', N'良好                                                ', N'吴佳伟                                               ', N'401                                               ', N'002       ')
INSERT [dbo].[病人信息表] ([病人姓名], [病人性别], [入院时间], [病人所属科室], [病人状况], [病人主治医生], [病人房间号], [病人床位号]) VALUES (N'谢沅峰                                               ', N'男                                                 ', N'2019.12.15                                        ', N'内科                                                ', N'差                                                 ', N'吴佳伟                                               ', N'406                                               ', N'001       ')
INSERT [dbo].[病人信息表] ([病人姓名], [病人性别], [入院时间], [病人所属科室], [病人状况], [病人主治医生], [病人房间号], [病人床位号]) VALUES (N'章策哲                                               ', N'男                                                 ', N'2019.12.11                                        ', N'外科                                                ', N'良好                                                ', N'吴佳伟                                               ', N'401                                               ', N'003       ')
/****** Object:  ForeignKey [FK_员工基本状况表_部门信息表]    Script Date: 07/10/2020 17:07:56 ******/
ALTER TABLE [dbo].[员工基本状况表]  WITH CHECK ADD  CONSTRAINT [FK_员工基本状况表_部门信息表] FOREIGN KEY([所在的部门号])
REFERENCES [dbo].[部门信息表] ([部门代号])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[员工基本状况表] CHECK CONSTRAINT [FK_员工基本状况表_部门信息表]
GO
/****** Object:  ForeignKey [FK_员工基本状况表_工作岗位情况表]    Script Date: 07/10/2020 17:07:56 ******/
ALTER TABLE [dbo].[员工基本状况表]  WITH CHECK ADD  CONSTRAINT [FK_员工基本状况表_工作岗位情况表] FOREIGN KEY([工作岗位代号])
REFERENCES [dbo].[工作岗位情况表] ([工作岗位代号])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[员工基本状况表] CHECK CONSTRAINT [FK_员工基本状况表_工作岗位情况表]
GO
/****** Object:  ForeignKey [FK_病人信息表_床位信息表]    Script Date: 07/10/2020 17:07:56 ******/
ALTER TABLE [dbo].[病人信息表]  WITH CHECK ADD  CONSTRAINT [FK_病人信息表_床位信息表] FOREIGN KEY([病人床位号])
REFERENCES [dbo].[床位信息表] ([床位号])
GO
ALTER TABLE [dbo].[病人信息表] CHECK CONSTRAINT [FK_病人信息表_床位信息表]
GO
