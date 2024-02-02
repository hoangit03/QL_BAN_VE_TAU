use master
GO

CREATE DATABASE BVTAU
ON PRIMARY
(NAME =N'BVTAU',FILENAME=N'D:\Nam3HocKyII\PTUD\SQL\BVTAU.mdf',SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB)
LOG ON
( NAME = N'BVTAU_log', FILENAME = N'D:\Nam3HocKyII\PTUD\SQL\BVTAU_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB)

GO

--name PTUD
--pwd 123456

use BVTAU

CREATE TABLE NHANVIEN(
	MaNV nvarchar(20) not null PRIMARY KEY,
	CCCD nvarchar(20) not null,
	HoTen nvarchar(30) not null,
	tuoi int not null,
	SDT nvarchar(20) not null,
	DiaChi nvarchar(50) not null,
	Email nvarchar(30) not null,
)


CREATE TABLE TAIKHOAN(
	MaNV nvarchar(20) not null FOREIGN KEY REFERENCES NHANVIEN(MaNV),
	pwd nvarchar(70) not null
)

CREATE TABLE KHACHHANG(
	CCCD nvarchar(20) not null PRIMARY KEY ,
	HoTen nvarchar(30) not null,
	tuoi int not null,
	SDT nvarchar(20) not null
)



CREATE TABLE TAU(
	MaTau nvarchar(20) not null PRIMARY KEY,
	TaiTrong int not null,
	TocDo int not null,

CREATE TABLE TOA(
	MaToa nvarchar(20) not null PRIMARY KEY,
	loaiTau nvarchar(20)not null 
)
	MaTau nvarchar(20) not null FOREIGN KEY REFERENCES TAU(MaTau),
	SoMayLanh int not null
)

CREATE TABLE GHE(
	ViTri int not null PRIMARY KEY,
	TrangThai bit not null,
	LoaiGhe nvarchar(10) not null,
	MaToa nvarchar(20) not null FOREIGN KEY REFERENCES TOA(MaToa)
)

CREATE TABLE GIUONG(
	ViTri int not null PRIMARY KEY,
	TrangThai bit not null,
	LoaiGiuong nvarchar(10) not null,
	MaToa nvarchar(20) not null FOREIGN KEY REFERENCES TOA(MaToa)
)


CREATE TABLE GA(
	TenGa nvarchar(30) not null PRIMARY KEY,
	DiaChi nvarchar(50) not null,
	GaDen nvarchar(30) not null,
	GaDi nvarchar(30) not null,
)

CREATE TABLE TUYEN(
	MaTuyen nvarchar(20) not null PRIMARY KEY,
	GaBatDau nvarchar(30) not null FOREIGN KEY REFERENCES GA(TenGa),
	GaKetThuc nvarchar(30) not null FOREIGN KEY REFERENCES GA(TenGa)

)


CREATE TABLE CHUYEN(
	MaChuyen nvarchar(20) not null PRIMARY KEY,
	MaTau nvarchar(20) not null FOREIGN KEY REFERENCES TAU(MaTau),
	MaTuyen nvarchar(20) not null FOREIGN KEY REFERENCES TUYEN(MaTuyen),
	NgayDi date not null,
	GioKhoiHanh datetime not null,
)

CREATE TABLE VE(
	MaVe nvarchar(20) not null PRIMARY KEY,
	CCCD nvarchar(20) not null FOREIGN KEY REFERENCES KHACHHANG(CCCD),
	MaNV nvarchar(20) not null FOREIGN KEY REFERENCES NHANVIEN(MaNV),
	MaChuyen nvarchar(20) not null FOREIGN KEY REFERENCES CHUYEN(MaChuyen),
	ThoiGianDatVe datetime not null,
	NgayDi date not null,
	GioDi date not null,
	Gia int not null
)
