/*use master
GO

CREATE DATABASE QuanLyBanVeTau
ON PRIMARY
(NAME =N'QuanLyBanVeTau',FILENAME=N'D:\Nam3Ky2\PTUD\QL_BAN_VE_TAU\SQL\QuanLyBanVeTau.mdf',SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB)
LOG ON
( NAME = N'QuanLyBanVeTau_log', FILENAME = N'D:\Nam3Ky2\PTUD\QL_BAN_VE_TAU\SQL\QuanLyBanVeTau_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB)

GO

--name sa
--pwd 123456
*/
USE QuanLyBanVeTau;


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------TẠO BẢNG------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------1
/*
CREATE TABLE KhachHang (
    CCCD NVARCHAR(13) NOT NULL,
    HoTen NVARCHAR(50) NOT NULL,
    Email NVARCHAR(30),
    SDT NVARCHAR(10) NOT NULL,
    DoiTuong NVARCHAR(20) NOT NULL,
    PRIMARY KEY (CCCD)
); 
------------------------------------------------------------------------------------------------------2
CREATE TABLE NhanVien (
    MaNhanVien NVARCHAR(20) NOT NULL,
    HoTen NVARCHAR(50) NOT NULL,
	CCCD NVARCHAR(12) NOT NULL,
    SDT NVARCHAR(10) NOT NULL,
    Email NVARCHAR(35) NOT NULL,
    DiaChi NVARCHAR(50) NOT NULL,
    LoaiNV NVARCHAR(30) NOT NULL,
    TrangThai BIT NOT NULL,
    NgaySinh DATETIME NOT NULL,
    NgayVaoLam DATETIME NOT NULL,
    PRIMARY KEY (MaNhanVien)
); 
-------------------------------------------------------------------------------------------------3
CREATE TABLE TaiKhoan (
    TenTaiKhoan NVARCHAR(30) NOT NULL,
    MatKhau NVARCHAR(30) NOT NULL,
	MaNhanVien NVARCHAR(20) FOREIGN KEY REFERENCES NhanVien(MaNhanVien) ON DELETE SET NULL,
    PRIMARY KEY (TenTaiKhoan) 
); 
--------------------------------------------------------------------------------------------------------4
CREATE TABLE HoaDon (
    MaHoaDon NVARCHAR(20) NOT NULL ,
    GioTao TIME NOT NULL,
    NgayTao DATE NOT NULL,
    TrangThai BIT NOT NULL,
	MaNhanVien NVARCHAR(20) FOREIGN KEY REFERENCES NhanVien(MaNhanVien) ON DELETE SET NULL,
	CCCD NVARCHAR(13) FOREIGN KEY REFERENCES KhachHang(CCCD) ON DELETE SET NULL, 
	PRIMARY KEY (MaHoaDon)
); 
--------------------------------------------------------------------------------------5
CREATE TABLE Tau (
    MaTau NVARCHAR(20) NOT NULL,
    LoaiTau NVARCHAR(30) NOT NULL,
    TenTau NVARCHAR(30) NOT NULL,
    TocDo DECIMAL(10, 2) NOT NULL,
    NamSanXuat DATETIME NOT NULL,
    PRIMARY KEY (MaTau)
);
------------------------------------------------------------------------------------6


CREATE TABLE Toa(
	MaToa NVARCHAR(20) NOT NULL,
	LoaiToa NVARCHAR(20) NOT NULL,
	SoDungTich INT NOT NULL,
	NganChua INT NOT NULL,
	PRIMARY KEY (MaToa)
);
---------------------------------------------------------------------------------------7

CREATE TABLE ChoNgoi(
	MaChoNgoi NVARCHAR(20) NOT NULL ,
	MoTa NVARCHAR(50) NOT NULL,
	Gia REAL NOT NULL,
	ViTri INT NOT NULL,
	MaTau NVARCHAR(20) NOT NULL FOREIGN KEY REFERENCES Tau(MaTau),
	MaToa NVARCHAR(20) NOT NULL FOREIGN KEY REFERENCES Toa(MaToa),
	PRIMARY KEY (MaChoNgoi)
); 
----------------------------------------------------------------------------------8

CREATE TABLE Ga(
    TenGa NVARCHAR(50) NOT NULL PRIMARY KEY,
    CuLy REAL NOT NULL,
    DiaChi NVARCHAR(100) NOT NULL,
);
--------------------------------------------------------------------------------------9
CREATE TABLE Tuyen (
    MaTuyen NVARCHAR(20) NOT NULL ,
    TenTuyen NVARCHAR(50) NOT NULL,
	TenGa NVARCHAR(50) NOT NULL FOREIGN KEY REFERENCES Ga(TenGa),
	PRIMARY KEY (MaTuyen)
);
--------------------------------------------------------------------------------------------10
CREATE TABLE Chuyen(
    MaChuyen NVARCHAR(20) NOT NULL,
    TenChuyen NVARCHAR(50) NOT NULL,
    GioKhoiHanh DATETIME NOT NULL,
    NgayKhoiHanh DATETIME NOT NULL,
    MaTau NVARCHAR(20) NOT NULL FOREIGN KEY REFERENCES Tau(MaTau),
    MaTuyen NVARCHAR(20) NOT NULL FOREIGN KEY REFERENCES Tuyen(MaTuyen),
    PRIMARY KEY (MaChuyen)
);
-------------------------------------------------------------------------------------------------11

CREATE TABLE KhuyenMai(
    MaKhuyenMai NVARCHAR(20) NOT NULL PRIMARY KEY,
    TenKhuyenMai NVARCHAR(50) NOT NULL,
    LoaiKhuyenMai NVARCHAR(30) NOT NULL,
    ThoiGianBatDau DATETIME NOT NULL,
    ThoiGianKetThuc DATETIME NOT NULL,
    ChietKhau REAL NOT NULL
)
----------------------------------------------------------------------------------------------------------------------------------12
CREATE TABLE VE(
    MaVe NVARCHAR(20) NOT NULL PRIMARY KEY,
    ThoiGianLenTau DATETIME NOT NULL,
    MaChuyen NVARCHAR(20) FOREIGN KEY REFERENCES Chuyen(MaChuyen) ON DELETE SET NULL,
    MaChoNgoi NVARCHAR(20) FOREIGN KEY REFERENCES ChoNgoi(MaChoNgoi) ON DELETE SET NULL,
    GaDi NVARCHAR(50) FOREIGN KEY REFERENCES Ga(TenGa) ON DELETE SET NULL,
    GaDen NVARCHAR(50) FOREIGN KEY REFERENCES Ga(TenGa) ON DELETE NO ACTION,
    MaKhuyenMai NVARCHAR(20) FOREIGN KEY REFERENCES KhuyenMai(MaKhuyenMai) ON DELETE SET NULL,
    CCCD NVARCHAR(13) FOREIGN KEY REFERENCES KhachHang(CCCD) ON DELETE SET NULL,
    MaHoaDon NVARCHAR(20) FOREIGN KEY REFERENCES HoaDon(MaHoaDon) ON DELETE SET NULL
);
----------------------------------------------------------------------------------------------------------------------------------------------13

CREATE TABLE ChiTietKhuyenMai (
    MaHoaDon NVARCHAR(20) NOT NULL,
    MaKhuyenMai NVARCHAR(20) NOT NULL,
    CONSTRAINT FK_ChiTietKhuyenMai_HoaDon FOREIGN KEY (MaHoaDon) REFERENCES HoaDon(MaHoaDon) ON DELETE NO ACTION,
    CONSTRAINT FK_ChiTietKhuyenMai_KhuyenMai FOREIGN KEY (MaKhuyenMai) REFERENCES KhuyenMai(MaKhuyenMai) ON DELETE NO ACTION,
    CONSTRAINT PK_ChiTietHoaDon PRIMARY KEY (MaHoaDon, MaKhuyenMai)
);

*/
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------DỮ LIỆU BẢNG------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------1
                                                                          /*DỮ LIỆU KHÁCH HÀNG*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------1
INSERT INTO KhachHang (CCCD, HoTen, Email, SDT, DoiTuong)
VALUES 
      ('038203000233', N'Lê Đình Nam',     'fsfsnam7@gmail.com',   '0937546286', N'Sinh viên'),
	  ('038203000232', N'Lê Đình Long',    'fsfsnam9@gmail.com',   '0937546236', N'Trẻ em'),
	  ('038203000231', N'Lê Đình Ho',      'fsfsnam11@gmail.com',  '0937542863',  N'Người lớn'),
	  ('038203000234', N'Nguyễn Thị Hằng', 'nguyenhang@gmail.com', '0937546290', N'Sinh viên'),
	  ('038203000235', N'Trần Văn Tùng',   'vantung@gmail.com',    '0937546291', N'Sinh viên'),
	  ('038203000236', N'Lê Thị Hằng',     'lehang@gmail.com',     '0937546292', N'Sinh viên'),
	  ('038203000237', N'Phạm Văn Phú',    'vanphu@gmail.com',     '0937546293', N'Người lớn'),
	  ('038203000238', N'Nguyễn Thị Thảo', 'thao@gmail.com',       '0937546294', N'Người lớn'),
	  ('038203000239', N'Trần Văn Đức',    'vanduc@gmail.com',     '0937546295', N'Người lớn'),
	  ('038203000240', N'Hoàng Minh Tuấn', 'minhtuan@gmail.com',   '0937546296', N'Người lớn'),
	  ('038203000241', N'Lê Thị Hồng',     'lehong@gmail.com',     '0937546297', N'Trẻ em'),
	  ('038203000242', N'Nguyễn Văn Hùng', 'vanhung@gmail.com',    '0937546298', N'Sinh viên'),
	  ('038203000243', N'Trần Thị Mai',    'thimai@gmail.com',     '0937546299', N'Người lớn'),
	  ('038203000244', N'Lê Văn Sơn',      'vanson@gmail.com',     '0937546300', N'Sinh viên'),
	  ('038203000245', N'Nguyễn Thị Anh',  'thianh@gmail.com',     '0937546301', N'Người lớn'),
	  ('038203000246', N'Trần Minh Tuấn',  'minhtuan2@gmail.com',  '0937546302', N'Trẻ em'),
	  ('038203000247', N'Phạm Thị Hà',     'thiha@gmail.com',      '0937546303', N'Sinh viên'),
	  ('038203000248', N'Nguyễn Văn Hùng', 'vanhung2@gmail.com',   '0937546304', N'Sinh viên'),
	  ('038203000249', N'Hoàng Thị Hồng',  'thihong@gmail.com',    '0937546305', N'Người lớn'),
	  ('038203000250', N'Lê Văn Nam',      'vannam@gmail.com',     '0937546306', N'Trẻ em')
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------2
                                                                                /*DỮ LIỆU NHÂN VIÊN*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------2

INSERT INTO NhanVien (MaNhanVien, CCCD, HoTen, SDT, Email, DiaChi, LoaiNV, TrangThai, NgaySinh, NgayVaoLam)
VALUES 
      ('NV21030001', '001012345678',  N'Lê Đình Nam',     '0937546286',  'ledinhnam@gmail.com',     N'Quận Hoàn Kiếm, Thành phố Hà Nội',       N'Nhân viên quản lý', 1, '2003-03-15', '2021-03-15'),
      ('NV21020002', '079023456789',  N'Lê Đình Long',    '0937546236',  'ledinhlong@gmail.com',    N'Quận 1, Thành phố Hồ Chí Minh',          N'Nhân viên bán vé',  1, '2002-03-16', '2021-03-16'),
      ('NV21010003', '001034567890',  N'Lê Đình Ho',      '0937546283',  'ledinhho@gmail.com',      N'Quận Ba Đình, Thành phố Hà Nội',         N'Nhân viên quản lý', 0, '2001-03-17', '2021-03-17'),
      ('NV21000004', '079045678901',  N'Nguyễn Thị Hằng', '0937546290',  'nguyenthihang@gmail.com', N'Quận Tân Bình, Thành phố Hồ Chí Minh',   N'Nhân viên quản lý', 1, '2000-03-18', '2021-03-18'),
      ('NV21990005', '001056789012',  N'Trần Văn Tùng',   '0937546291',  'tranvantung@gmail.com',   N'Quận Cầu Giấy, Thành phố Hà Nội',        N'Nhân viên bán vé',  1, '1999-03-19', '2021-03-19'),
      ('NV21980006', '079067890123',  N'Lê Thị Hằng',     '0937546292',  'lethihang@gmail.com',     N'Quận Bình Thạnh, Thành phố Hồ Chí Minh', N'Nhân viên bán vé',  0, '1998-03-20', '2021-03-20'),
      ('NV21970007', '048078901234',  N'Phạm Văn Phú',    '0937546293',  'phamvanphu@gmail.com',    N'Quận Hải Châu, Thành phố Đà Nẵng',       N'Nhân viên quản lý', 1, '1997-03-21', '2021-03-21'),
      ('NV21960008', '079089012345',  N'Nguyễn Thị Thảo', '0937546294',  'nguyenthithao@gmail.com', N'Quận Thủ Đức, Thành phố Hồ Chí Minh',    N'Nhân viên bán vé',  1, '1996-03-22', '2021-03-22'),
      ('NV21950009', '001090123456',  N'Trần Văn Đức',    '0937546295',  'tranvanduc@gmail.com',    N'Huyện Hoài Đức, Thành phố Hà Nội',       N'Nhân viên quản lý', 0, '1995-03-23', '2021-03-23'),
      ('NV21940010', '079901234567',  N'Hoàng Minh Tuấn', '0937546296',  'hoangminhtuan@gmail.com', N'Huyện Củ Chi, Thành phố Hồ Chí Minh',    N'Nhân viên bán vé',  1, '1994-03-24', '2021-03-24');
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------3
                                                                                /*DỮ LIỆU TÀI KHOẢN*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------3

INSERT INTO TaiKhoan (TenTaiKhoan, MatKhau, MaNhanVien) VALUES 
      ('21030001', 'Passw0rd',           'NV21030001'),
      ('21020002', 'StrongPassword1',    'NV21020002'),
      ('21010003', 'SecurePassword123',  'NV21010003'),
      ('21000004', 'Secret123!',         'NV21000004'),
      ('21990005', 'Pa$$w0rd',           'NV21990005'),
      ('21980006', 'StrongP@ssw0rd',     'NV21980006'),
      ('21970007', 'SecureP@ssw0rd',     'NV21970007'),
      ('21960008', 'VeryStrongPassword', 'NV21960008'),
      ('21950009', 'Password123',        'NV21950009'),
      ('21940010', 'P@ssw0rd!2024',      'NV21940010');
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------4
                                                                                /*DỮ LIỆU HOÁ ĐƠN*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------4

INSERT INTO HoaDon (MaHoaDon, GioTao, NgayTao, TrangThai, MaNhanVien, CCCD)
VALUES 
    ('HD12022300023', '2023-02-12 12:30:45', '2023-02-12 12:30:45', 1, 'NV21020002', '038203000233'),
    ('HD12022300024', '2023-02-12 13:45:22', '2023-02-12 13:45:22', 0, 'NV21020002', '038203000232'),
    ('HD12022300025', '2023-02-12 15:20:10', '2023-02-12 15:20:10', 1, 'NV21990005', '038203000231'),
    ('HD12022300026', '2023-02-12 16:10:55', '2023-02-12 16:10:55', 0, 'NV21020002', '038203000234'),
    ('HD12022300027', '2023-02-12 17:55:30', '2023-02-12 17:55:30', 1, 'NV21990005', '038203000235'),
    ('HD12022300028', '2023-02-12 18:40:15', '2023-02-12 18:40:15', 0, 'NV21950009', '038203000245'),
    ('HD12022300029', '2023-02-12 19:25:00', '2023-02-12 19:25:00', 1, 'NV21020002', '038203000245'),
    ('HD12022300030', '2023-02-12 20:10:45', '2023-02-12 20:10:45', 0, 'NV21950009', '038203000246'),
    ('HD12022300031', '2023-02-12 21:30:30', '2023-02-12 21:30:30', 1, 'NV21940010', '038203000248'),
    ('HD12022300032', '2023-02-12 22:15:15', '2023-02-12 22:15:15', 0, 'NV21940010', '038203000250');
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------5
                                                                                /*DỮ LIỆU TÀU*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------5

INSERT INTO Tau (MaTau, LoaiTau, TenTau, TocDo, NamSanXuat) 
VALUES
      ('SE01', N'Tàu nhanh', N'Tàu thống nhất', 54.49, '2005'),
      ('SE02', N'Tàu nhanh', N'Tàu thống nhất', 45.7, '2005'),
      ('SE03', N'Tàu nhanh', N'Tàu thống nhất', 72.0, '2006'),
      ('SE04', N'Tàu nhanh', N'Tàu thống nhất', 51.9, '2006'),
      ('TN05', N'Tàu chậm', N'Tàu thống nhất', 43.3, '1995'),
      ('TN06', N'Tàu chậm', N'Tàu thống nhất', 42.1, '1994');
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------6
                                                                               /*DỮ LIỆU TOA*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------6
	
INSERT INTO Toa (MaToa, LoaiToa, SoDungTich, NganChua)
VALUES 
    ('N6SE1', N'Giường nằm khoang 6', 42, 42),
    ('N4SE1', N'Giường nằm khoang 6', 28, 28),
    ('NMSE1', N'Ngồi mềm điều hoà',   64, 64),
	('N6SE2', N'Giường nằm khoang 6', 42, 42),
    ('N4SE2', N'Giường nằm khoang 6', 28, 28),
    ('NMSE2', N'Ngồi mềm điều hoà',   64, 64),
	('N6SE3', N'Giường nằm khoang 6', 42, 42),
    ('N4SE3', N'Giường nằm khoang 4', 28, 28),
    ('NMSE3', N'Ngồi mềm điều hoà',   64, 64);
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7
                                                                               /*DỮ LIỆU CHONGOI*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7

INSERT INTO ChoNgoi (MaChoNgoi, MoTa, Gia, ViTri, MaTau, MaToa)
VALUES 
    ('0801', N'Nằm khoang 4 điều hòa Toa 8 Tầng 1 Chỗ ngồi 1 ',   1500000.0,  1,  'SE01', 'N4SE1'),
    ('1101', N'Nằm khoang 4 điều hòa Toa 11 Tầng 1 Chỗ ngồi 1 ',  1500000.0,  1,  'SE01', 'N4SE1'),
    ('1002', N'Nằm khoang 4 điều hòa Toa 10 Tầng 1 Chỗ ngồi 2',   1500000.0,  2,  'SE01', 'N4SE1'),
    ('0621', N'Nằm khoang 6 điều hòa Toa 6 Tầng 2 Chỗ ngồi 21',   500000.0,   21, 'SE02', 'N6SE2'),
    ('0202', N'Ngồi mềm điều hòa Toa 2 Chỗ ngồi 2',               2500000.0,  2,  'SE02', 'NMSE3');
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7
                                                                               /*DỮ LIỆU GA*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7

INSERT INTO Ga (TenGa, CuLy, DiaChi)
VALUES
    (N'Sài Gòn', 0,   N'1 Nguyễn Thông, Phường 9, Quận 3, Thành phố Hồ Chí Minh'),
	(N'Bình Thuận', 175, N'Thôn Đại Thành, Mương Mán, Hàm Thuận Nam, Bình Thuận'),
	(N'Đà Nẵng', 935, N'791 Hải Phòng, Tam Thuận, Thanh Khê, Đà Nẵng'),
	(N'Nha Trang', 411, N'17 Thái Nguyên, Phước Tân, Nha Trang, Khánh Hòa');
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7
                                                                               /*DỮ LIỆU TUYEN*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7


INSERT INTO Tuyen (MaTuyen, TenTuyen, TenGa)
VALUES 
    ('SG-NT', N'Sài Gòn - Nha Trang', N'Sài Gòn'),
	('SG-DT', N'Sài Gòn Diêu Trì', N'Sài Gòn'),
	('SG-DN', N'Sài Gòn - Đà Nẵng', N'Sài Gòn');
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7
                                                                               /*DỮ LIỆU CHUYEN*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7

INSERT INTO Chuyen (MaChuyen, TenChuyen, GioKhoiHanh, NgayKhoiHanh, MaTau, MaTuyen)
VALUES
    ('SGNT001', N'Sài Gòn - Nha Trang',  '2023-02-12 12:30:00',  '2023-02-12 12:30:00', 'SE02', 'SG-NT'),
	('SGNT002', N'Sài Gòn - Nha Trang',  '2023-02-13 06:30:00',  '2023-02-13 06:30:00', 'SE04', 'SG-NT'),
	('SGNT003', N'Sài Gòn - Nha Trang',  '2023-02-15 09:30:00',  '2023-02-15 09:30:00', 'SE03', 'SG-NT'),
	('SGDN001', N'Sài Gòn - Đà Nẵng',    '2023-02-13 06:00:00',  '2023-02-13 06:00:00', 'SE01', 'SG-DN'),
	('SGDN002', N'Sài Gòn - Đà Nẵng',    '2023-02-13 09:00:00',  '2023-02-13 09:00:00', 'SE04', 'SG-DN'),
	('SGDN003', N'Sài Gòn - Đà Nẵng',    '2023-02-13 12:00:00',  '2023-02-13 12:00:00', 'SE02', 'SG-DN');

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7
                                                                               /*DỮ LIỆU KHUYENMAI*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7

INSERT INTO KhuyenMai(MaKhuyenMai, TenKhuyenMai,LoaiKhuyenMai,ThoiGianBatDau,ThoiGianKetThuc, ChietKhau)
VALUES 
    ('KM0609202304', 'VeNhaAnTet', 'KMKH', '2023-02-13 00:00:00', '2023-03-13 00:00:00', '0.4'),
	('KM0609202303', 'SinhVienNgheo', 'KMKH', '2023-06-15 00:00:00', '2023-07-15 00:00:00', '0.1'),
	('KM0609202302', 'LienHoanCongTy', 'KMHD', '2023-02-13 00:00:00', '2023-03-13 00:00:00', '0.7'),
	('KM0609202301', 'Student', 'KMKH', '2023-02-13 00:00:00', '2023-03-13 00:00:00', '0.3');
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7
                                                                               /*DỮ LIỆU CHITIETKHUYENMAI*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7

INSERT INTO ChiTietKhuyenMai(MaHoaDon, MaKhuyenMai)
VALUES
    ('HD12022300023', 'KM0609202304'),
	('HD12022300023', 'KM0609202303'),
	('HD12022300023', 'KM0609202302'),
	('HD12022300023', 'KM0609202301'),
	('HD12022300030', 'KM0609202304');

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7
                                                                               /*DỮ LIỆU VE*/
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------7

INSERT INTO Ve (MaVe, ThoiGianLenTau, MaChuyen, MaChoNgoi, GaDi, GaDen, MaKhuyenMai, CCCD, MaHoaDon)
VALUES
    ('1230120223001Aplus', '2023-02-12 12:30:00', 'SGNT001', '0621', N'Sài Gòn', N'Nha Trang', 'KM0609202304', '038203000233', 'HD12022300023'),
	('1230150223001Aplus', '2023-02-15 12:30:00', 'SGDN001', '0202', N'Sài Gòn', N'Đà Nẵng', 'KM0609202303', '038203000246', 'HD12022300030'),
	('1200170223001Aplus', '2023-02-17 12:00:00', 'SGNT001', '0621', N'Sài Gòn', N'Nha Trang', 'KM0609202304', '038203000233', 'HD12022300023'),
	('1230120523001Aplus', '2023-05-12 12:30:00', 'SGNT001', '0621', N'Sài Gòn', N'Nha Trang', 'KM0609202304', '038203000233', 'HD12022300023');







                                                                                /*XOÁ BẢNG*/
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*DROP TABLE KhachHang;
DROP TABLE NhanVien;
DROP TABLE TaiKhoan;
DROP TABLE HoaDon;
DROP TABLE Tau;
DROP TABLE Toa;
DROP TABLE ChoNgoi;
DROP TABLE Chuyen;
DROP TABLE Tuyen;
DROP TABLE Ga;
DROP TABLE ChiTietKhuyenMai;*/
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------2
                                                                                /*CHẠY BẢNG*/
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------2
----------------------------------------------------------
-----------------------CHỌN BẢNG--------------------------
----------------------------------------------------------
SELECT * FROM KhachHang;        --1
SELECT * FROM NhanVien;         --2
SELECT * FROM TaiKhoan;         --3
SELECT * FROM HoaDon;           --4
SELECT * FROM Tau;              --5
SELECT * FROM Toa;              --6
SELECT * FROM ChoNgoi;          --7
SELECT * FROM Chuyen;           --8
SELECT * FROM Tuyen;            --9
SELECT * FROM Ga;               --10
SELECT * FROM Ve;               --11
SELECT * FROM KhuyenMai;        --12
SELECT * FROM ChiTietKhuyenMai; --13
