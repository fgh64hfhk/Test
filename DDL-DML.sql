SELECT TOP (9999) [學號]
      ,[姓名]
      ,[性別]
      ,[生日]
      ,[地址]
      ,[電話]
  FROM [myDB0802].[dbo].[學生]
  WHERE [生日] IS NOT NULL;


USE [myDB0802]--USE為保留關鍵字，後接資料庫名稱
GO

/* /**/為多行註解符號
====== Object:  Table [dbo].[學生]    Script Date: 2023/8/4 下午 07:54:01 =====
*/
-- 此為單行註解
SET ANSI_NULLS ON;
SET QUOTED_IDENTIFIER ON; --雙引號識別碼作用為ON，"SELECT" or [SELECT]保留關鍵字可當作一般字串處理
GO --GO為多行陳述句(Statements)批次執行的結束

CREATE TABLE "dbo"."班級"(
	[學號] [char](3) NOT NULL,
	[課程編號] [char](3) NOT NULL,
	[教授編號] [char](3) NOT NULL,
	[教室] [char](4) NOT NULL,
	[上課時間] [datetime] NULL
) ON [PRIMARY]
GO

CREATE TABLE "dbo"."課程"(
	[課程編號] [char](3) NOT NULL,
	[課程名稱] [varchar](10) NOT NULL,
	[學分] [int] NOT NULL
 CONSTRAINT [PK_課程編號] PRIMARY KEY CLUSTERED 
(
	[課程編號] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

Create Table "教授"(
"教授編號" "char"(3) NOT NULL,
"科系" "char"(8) NOT NULL,
[職稱] "char"(10) NULL
 CONSTRAINT [PK_教授編號] PRIMARY KEY CLUSTERED 
(
	[教授編號] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]

GO

select *
from [dbo].[學生]

select *
from [dbo].[課程]

select *
from [dbo].[教授]

USE [myDB0802]
GO

INSERT INTO [dbo].[教授]
           ([教授編號]
           ,[科系]
           ,[職稱])
     VALUES
           (<教授編號, char(3),>
           ,<科系, char(8),>
           ,<職稱, char(10),>)
GO