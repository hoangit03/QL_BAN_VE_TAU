use master
GO

CREATE DATABASE BVTAU
ON PRIMARY
(NAME =N'BVTAU',FILENAME=N'D:\Nam3Ky2\PTUD\QL_BAN_VE_TAU\SQL\BVTAU.mdf',SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB)
LOG ON
( NAME = N'BVTAU_log', FILENAME = N'D:\Nam3Ky2\PTUD\QL_BAN_VE_TAU\SQL\BVTAU_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB)

GO

--name PTUD
--pwd 123456

use BVTAU

create table NhanVien (
	MaNhanVien nvarchar(20) not null primary key,
	HoTen nvarchar(50) not null,
	CCCD nvarchar(15) not null,
	SDT nvarchar(15),
	Email nvarchar(35),
	DiaChi nvarchar(50),
	LoaiNV nvarchar(30),
	TrangThai bit,
	NgaySinh Datetime,
	NgayVaoLam Datetime
)

create table TaiKhoan (
	TenTaiKhoan nvarchar(30) not null primary key,
	MatKhau nvarchar(30),
	MaNhanVien nvarchar(20) not null FOREIGN KEY REFERENCES NhanVien(MaNhanVien) ON DELETE SET NULL
)

create table KhachHang(
	CCCD nvarchar(15) not null primary key,
	HoTen nvarchar(50) not null,
	Email nvarchar(35),
	SDT nvarchar(15),
	DoiTuong nvarchar(20)
)
CREATE TABLE Tuyen(
	MaTuyen nvarchar(20) not null primary key,
	TenTuyen nvarchar(50) not null,
)

CREATE TABLE Ga(
	TenGa nvarchar(50) not null primary key,
	ToaDoX real not null,
	ToaDoY real not null,
	DiaChi nvarchar(50) not null,
	MaTuyen nvarchar(20) not null FOREIGN KEY REFERENCES Tuyen(MaTuyen)
)

CREATE TABLE Toa(
	MaToa nvarchar(20) not null primary key,
	LoaiToa nvarchar(20) not null,
	SoDungTich int not null,
	NganChua int not null
)


CREATE TABLE Tau(
	MaTau nvarchar(20) not null primary key,
	TenTau nvarchar(30) not null,
	LoaiTau nvarchar(30),
	NamSanXuat datetime,
	TocDo real not null
)

CREATE TABLE Chuyen(
	MaChuyen nvarchar(20) not null primary key,
	TenChuyen nvarchar(50) not null,
	GioKhoiHanh datetime not null,
	NgayKhoiHanh datetime not null,
	MaTau nvarchar(20) not null FOREIGN KEY REFERENCES Tau(MaTau),
	MaTuyen nvarchar(20) not null FOREIGN KEY REFERENCES Tuyen(MaTuyen)
)


CREATE TABLE ChoNgoi(
	MaChoNgoi nvarchar(20) not null primary key,
	MoTa nvarchar(30) not null,
	Gia real not null,
	ViTri int not null,
	MaTau nvarchar(20) not null FOREIGN KEY REFERENCES Tau(MaTau),
	MaToa nvarchar(20) not null FOREIGN KEY REFERENCES Toa(MaToa)
)

CREATE TABLE KhuyenMai(
	MaKhuyenMai nvarchar(20) not null primary key,
	TenKhuyenMai nvarchar(50) not null,
	LoaiKhuyenMai nvarchar(30) not null,
	ThoiGianBatDau datetime not null,
	ThoiGianKetThuc datetime not null,
	ChietKhau real not null
)

CREATE TABLE HoaDon(
	MaHoaDon nvarchar(20) not null primary key,
	GioTao datetime not null,
	NgayTao datetime not null,
	TrangThai bit not null,
	MaNhanVien nvarchar(20) FOREIGN KEY REFERENCES NhanVien(MaNhanVien) ON DELETE SET NULL,
	CCCD nvarchar(15) FOREIGN KEY REFERENCES KhachHang(CCCD) ON DELETE SET NULL
)

CREATE TABLE Ve(
	MaVe nvarchar(20) not null primary key,
	ThoiGianLenTau datetime not null,
	MaChuyen nvarchar(20) FOREIGN KEY REFERENCES Chuyen(MaChuyen) ON DELETE SET NULL,
	MaChoNgoi nvarchar(20) FOREIGN KEY REFERENCES ChoNgoi(MaChoNgoi) ON DELETE SET NULL,
	GaDi nvarchar(50) FOREIGN KEY REFERENCES Ga(TenGa) ON DELETE SET NULL,
	GaDen nvarchar(50) FOREIGN KEY REFERENCES Ga(TenGa) ON DELETE SET NULL,
	MaKhuyenMai nvarchar(20) FOREIGN KEY REFERENCES KhuyenMai(MaKhuyenMai) ON DELETE SET NULL,
	CCCD nvarchar(15)FOREIGN KEY REFERENCES KhachHang(CCCD) ON DELETE SET NULL,
	MaHoaDon nvarchar(20)  FOREIGN KEY REFERENCES HoaDon(MaHoaDon) ON DELETE SET NULL
)

CREATE TABLE ChiTietKhuyenMai(
	MaHoaDon nvarchar(20) FOREIGN KEY REFERENCES HoaDon(MaHoaDon) ON DELETE SET NULL,
	MaKhuyenMai nvarchar(20) FOREIGN KEY REFERENCES KhuyenMai(MaKhuyenMai) ON DELETE SET NULL,
	CONSTRAINT PK_ChiTietHoaDon PRIMARY KEY (MaHoaDon,MaKhuyenMai)
)

