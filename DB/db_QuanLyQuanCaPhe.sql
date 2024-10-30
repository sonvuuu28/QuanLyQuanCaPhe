create database QuanLyQuanCaPhe
use QuanLyQuanCaPhe
go

DROP TABLE IF EXISTS [ChiTietPhieuNhap];
DROP TABLE IF EXISTS [ChiTietHoaDon];
DROP TABLE IF EXISTS [CaLam];
DROP TABLE IF EXISTS [LichLam];
DROP TABLE IF EXISTS [PhanQuyen];
DROP TABLE IF EXISTS [TaiKhoan];
DROP TABLE IF EXISTS [PhieuNhap];
DROP TABLE IF EXISTS [HoaDon];
DROP TABLE IF EXISTS [KhachHang];
DROP TABLE IF EXISTS [KhuyenMai];
DROP TABLE IF EXISTS [UuDaiThanhVien];
DROP TABLE IF EXISTS [Mon];
DROP TABLE IF EXISTS [LoaiMon];
DROP TABLE IF EXISTS [NguyenLieu];
DROP TABLE IF EXISTS [CongThuc];
DROP TABLE IF EXISTS [NhaCungCap];
DROP TABLE IF EXISTS [NhanVien]

CREATE TABLE [CaLam] (
	[MaCaLam] nvarchar(255),
	[TenCaLam] nvarchar(255),
	[ThoiGianVaoCaLam] time ,
	[ThoiGianRaCalam] time ,
	[TrangThaiCaLam] bit,
	PRIMARY KEY ([MaCaLam])
);

CREATE TABLE [NhanVien] (
	[MaNhanVien] nvarchar(255) ,
	[TenNhanVien] nvarchar(255) ,
	[GioiTinhNhanVien] nvarchar(255) ,
	[SoDienThoaiNhanVien] nvarchar(255) ,
	[NgaySinhNhanVien] date ,
	[ChucVuNhanVien] nvarchar(255) ,
	[DiaChi] nvarchar(255) ,
	[LuongNhanVien] int,
	[TrangThaiNhanVien] bit,
	PRIMARY KEY ([MaNhanVien])
);

CREATE TABLE [LichLam] (
	[MaCaLam] nvarchar(255) ,
	[MaNhanVien] nvarchar(255),
	[NgayLam] date,
	PRIMARY KEY ([MaCaLam], [MaNhanVien]),
	FOREIGN KEY ([MaCaLam]) REFERENCES [CaLam]([MaCaLam]),
	FOREIGN KEY ([MaNhanVien]) REFERENCES [NhanVien]([MaNhanVien])
);

CREATE TABLE [PhanQuyen] (
	[MaPhanQuyen] nvarchar(255),
	[TenQuyen] nvarchar(255),
	[QuyenKhachHang] bit,
	[QuyenBanHang] bit,
	[QuyenNhapHang] bit,
	[QuyenMon] bit,
	[QuyenNguyenLieu] bit,
	[QuyenLichLam] bit,
	[QuyenKhuyenMaiUuDai] bit,
	[QuyenNhaCungCap] bit,
	[QuyenNhanVien] bit,
	[QuyenThongKe] bit,
	[TrangThaiPhanQuyen] bit,
	PRIMARY KEY ([MaPhanQuyen])
);

CREATE TABLE [TaiKhoan] (
	[MaTaiKhoan] nvarchar(255) ,
	[TenDangNhap] nvarchar(255) ,
	[MatKhau] nvarchar(255) ,
	[MaPhanQuyen] nvarchar(255) ,
	[MaNhanVien] nvarchar(255) ,
	[TrangThaiTaiKhoan] bit,
	PRIMARY KEY ([MaTaiKhoan]),
	FOREIGN KEY ([MaNhanVien]) REFERENCES [NhanVien]([MaNhanVien]),
	FOREIGN KEY ([MaPhanQuyen]) REFERENCES [PhanQuyen]([MaPhanQuyen])
);

CREATE TABLE [KhuyenMai] (
	[MaKhuyenMai] nvarchar(255),
	[TenKhuyenMai] nvarchar(255),
	[NgayBatDauKhuyenMai] date ,
	[NgayKetThucKhuyenMai] date ,
	[PhanTramKhuyenMai] float(53),
	[DieuKienKhuyenMai] int,
	PRIMARY KEY ([MaKhuyenMai])
);

CREATE TABLE [UuDaiThanhVien] (
	[MaUuDai] nvarchar(255),
	[TenUuDai] nvarchar(255),
	[NgayBatDauUuDai] date ,
	[NgayKetThucUuDai] date ,
	[PhanTramUuDai] float(53) ,
	[DieuKienUuDai] int,
	PRIMARY KEY ([MaUuDai]),
);

CREATE TABLE [KhachHang] (
	[MaKhachHang] nvarchar(255) ,
	[TenKhachHang] nvarchar(255) ,
	[NgaySinhKhachHang] date ,
	[GioiTinhKhachHang] nvarchar(255),
	[SoDienThoaiKhachHang] nvarchar(255) ,
	[ChiTieuKhachHang] int,
	--[MaUuDai] nvarchar(255),
	PRIMARY KEY ([MaKhachHang]),
	--FOREIGN KEY ([MaUuDai]) REFERENCES [UuDaiThanhVien]([MaUuDai]),
);

CREATE TABLE [HoaDon] (
	[MaHoaDon] nvarchar(255) ,
	[NgayLapHoaDon] date ,
	[TongTienHoaDon] int,
	[MaNhanVien] nvarchar(255) ,
	[MaKhachHang] nvarchar(255) ,
	[MaUuDai] nvarchar(255),
	[MaKhuyenMai] nvarchar(255) ,
	PRIMARY KEY ([MaHoaDon]),
	FOREIGN KEY ([MaNhanVien]) REFERENCES [NhanVien]([MaNhanVien]),
	FOREIGN KEY ([MaKhachHang]) REFERENCES [KhachHang]([MaKhachHang]),
	FOREIGN KEY ([MaUuDai]) REFERENCES [UuDaiThanhVien]([MaUuDai]),
	FOREIGN KEY ([MaKhuyenMai]) REFERENCES [KhuyenMai]([MaKhuyenMai])
);

CREATE TABLE [LoaiMon] (
	[MaLoaiMon] nvarchar(255) ,
	[TenLoaiMon] nvarchar(255) ,
	[TrangThaiLoaiMon] bit,
	PRIMARY KEY ([MaLoaiMon])
);

CREATE TABLE [NguyenLieu] (
	[MaNguyenLieu] nvarchar(255) ,
	[TenNguyenLieu] nvarchar(255) ,
	[KhoiLuongNguyenLieu] float,
	[DonGiaNguyenLieu] int,
	[TrangThaiNguyenLieu] bit,
	PRIMARY KEY ([MaNguyenLieu])
);

CREATE TABLE [Mon] (
	[MaMon] nvarchar(255) ,
	[MaLoaiMon] nvarchar(255),
	[TenMon] nvarchar(255),
	[HinhAnh] nvarchar(255),
	[DonGiaMon] int,
	[TrangThaiMon] bit,
	PRIMARY KEY ([MaMon]),
	FOREIGN KEY ([MaLoaiMon]) REFERENCES [LoaiMon]([MaLoaiMon])
);

CREATE TABLE [CongThuc] (
	[MaMon] nvarchar(255),
	[MaNguyenLieu] nvarchar(255),
	[KhoiLuong] float,
	FOREIGN KEY ([MaNguyenLieu]) REFERENCES [NguyenLieu]([MaNguyenLieu]),
	FOREIGN KEY ([MaMon]) REFERENCES [Mon]([MaMon])
);


CREATE TABLE [ChiTietHoaDon] (
	[MaHoaDon] nvarchar(255),
	[MaMon] nvarchar(255),
	[DonGia] int,
	[ThanhTien] int,
	[SoLuong] int,

	PRIMARY KEY ([MaHoaDon], [MaMon]),
	FOREIGN KEY ([MaHoaDon]) REFERENCES [HoaDon]([MaHoaDon]),
	FOREIGN KEY ([MaMon]) REFERENCES [Mon]([MaMon])
);

CREATE TABLE [NhaCungCap] (
	[MaNhaCungCap] nvarchar(255),
	[TenNhaCungCap] nvarchar(255),
	[DiaChiNhaCungCap] nvarchar(255),
	[SoDienThoaiNhaCungCap] nvarchar(255),
	PRIMARY KEY ([MaNhaCungCap])
);

CREATE TABLE [PhieuNhap] (
	[MaPhieuNhap] nvarchar(255) ,
	[NgayLapPhieuNhap] date ,
	[TongTienPhieuNhap] int,
	[MaNhanVien] nvarchar(255) ,
	[MaNhaCungCap] nvarchar(255) ,
	PRIMARY KEY ([MaPhieuNhap]),
	FOREIGN KEY ([MaNhanVien]) REFERENCES [NhanVien]([MaNhanVien]),
	FOREIGN KEY ([MaNhaCungCap]) REFERENCES [NhaCungCap]([MaNhaCungCap])
);

CREATE TABLE [ChiTietPhieuNhap] (
	[MaPhieuNhap] nvarchar(255),
	[MaNguyenLieu] nvarchar(255),
	[DonGia] int,
	[ThanhTien] int,
	[KhoiLuong] float,

	PRIMARY KEY ([MaPhieuNhap], [MaNguyenLieu]),
	FOREIGN KEY ([MaPhieuNhap]) REFERENCES [PhieuNhap]([MaPhieuNhap]),
	FOREIGN KEY ([MaNguyenLieu]) REFERENCES NguyenLieu([MaNguyenLieu])
);

INSERT INTO KhuyenMai (MaKhuyenMai, TenKhuyenMai, NgayBatDauKhuyenMai, NgayKetThucKhuyenMai, PhanTramKhuyenMai, DieuKienKhuyenMai)
VALUES 
('KM001', N'Khuyến mãi 20 tháng 11','2024-10-10', '2024-10-20', 10.5, 500000),
('KM002', N'Khuyến mãi khai trương', '2024-11-05', '2024-11-15', 15.0, 800000),
('KM003', N'Khuyến mãi cuối năm','2024-12-01', '2024-12-10', 20.0, 1000000),
('KM004', N'Khuyến mãi tháng 10','2024-11-05', '2024-11-15', 15.0, 800000),
('KM005', N'Khuyến mãi tháng 3','2024-12-01', '2024-12-10', 20.0, 1000000);

INSERT INTO UuDaiThanhVien (MaUuDai, TenUuDai, NgayBatDauUuDai, NgayKetThucUuDai, PhanTramUuDai, DieuKienUuDai)
VALUES
('UD001', N'Ưu đãi thành viên chi tiêu trên 10tr','2024-10-01', '2024-10-31', 5.0, 200000),
('UD002', N'Ưu đãi thành viên chi tiêu trên 500K','2024-11-01', '2024-11-30', 8.0, 300000),
('UD003', N'Ưu đãi thành viên chi tiêu trên 100K','2024-12-01', '2024-12-31', 10.0, 400000),
('UD004', N'Ưu đãi thành viên chi tiêu trên 10tr', '2024-11-01', '2024-11-30', 8.0, 300000),
('UD005', N'Ưu đãi thành viên chi tiêu trên 20tr','2024-12-01', '2024-12-31', 10.0, 400000);

------ INSERT
-- Inserting sample records into the CaLam table
INSERT INTO [CaLam] ([MaCaLam], [TenCaLam], [ThoiGianVaoCaLam], [ThoiGianRaCalam], [TrangThaiCaLam]) 
VALUES 
('CL001', 'Ca A', '06:00:00', '14:00:00', 1),
('CL002', 'Ca B',  '14:00:00', '22:00:00', 1),
('CL003', 'Ca C',  '12:00:00', '22:00:00', 0);

-- Inserting sample records into the NhanVien table
INSERT INTO [NhanVien] ([MaNhanVien], [TenNhanVien], [NgaySinhNhanVien], [SoDienThoaiNhanVien], [LuongNhanVien], [ChucVuNhanVien], [GioiTinhNhanVien], [TrangThaiNhanVien], [DiaChi]) 
VALUES 
('NV001', N'Nguyễn Văn A', '1990-01-01', '123456789', 5000000, N'Nhân Viên', 'Nam', 1, '1234 An Dương Vương'),
('NV002', N'Trần Thị B', '1995-05-10', '987654321', 6000000, N'Quản Lý', N'Nữ', 1, '1234 An Dương Vương'),
('NV003', N'Lê Văn C', '1988-12-15', '456123789', 7000000, N'Quản Lý', 'Nam', 0, '1234 An Dương Vương'),
('NV004', N'Phạm Anh D', '1992-08-20', '789456123', 5500000, N'Nhân Viên', 'Nam', 1, '1234 An Dương Vương'),
('NV005', N'Hoàng Thi E', '1998-04-25', '321654987', 5200000, N'Nhân Viên', N'Nữ', 0, '1234 An Dương Vương');

-- Inserting sample records into the LichLam table
INSERT INTO [LichLam] ([MaCaLam], [MaNhanVien], [NgayLam]) 
VALUES 
('CL001', 'NV001', '2024-09-28'),
('CL001', 'NV002', '2024-09-28'),
('CL001', 'NV003', '2024-09-28'),
('CL002', 'NV004', '2024-09-28'),
('CL002', 'NV005', '2024-09-28');

-- Inserting sample records into the PhanQuyen table
INSERT INTO [PhanQuyen] ([MaPhanQuyen], [TenQuyen],[QuyenKhachHang], [QuyenBanHang], [QuyenNhapHang], [QuyenMon], [QuyenNguyenLieu], [QuyenLichLam], [QuyenKhuyenMaiUuDai], [QuyenNhaCungCap], [QuyenNhanVien], [QuyenThongKe], [TrangThaiPhanQuyen]) 
VALUES 
('PQ001', N'Quản Lý', 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1),
('PQ002', N'Nhân Viên', 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1),
('PQ003', N'Quản Lý Chi Nhánh', 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1);

-- delete from [PhanQuyen]

-- Inserting sample records into the TaiKhoan table
INSERT INTO [TaiKhoan] ([MaTaiKhoan], [TenDangNhap], [MatKhau], [MaPhanQuyen], [MaNhanVien], [TrangThaiTaiKhoan]) 
VALUES 
('TK001', 'user1', 'password1', 'PQ001', 'NV001', 1),
('TK002', 'user2', 'password2', 'PQ002', 'NV002', 1),
('TK003', 'user3', 'password3', 'PQ003', 'NV003', 0),
('TK004', 'user4', 'password4', 'PQ001', 'NV004', 1),
('TK005', 'user5', 'password5', 'PQ002', 'NV005', 1);

-- Inserting sample records into the KhachHang table
INSERT INTO [KhachHang] ([MaKhachHang], [TenKhachHang], [NgaySinhKhachHang], [GioiTinhKhachHang], [SoDienThoaiKhachHang], [ChiTieuKhachHang]) 
VALUES 
('KH001', N'Nguyễn Văn A', '1990-02-15', 'Nam', '123456789', 500000),
('KH002', N'Trần Bảo Long', '1995-06-20', 'Nam', '987654321', 600000),
('KH003', N'Lê Thị Thu', '1988-03-10', N'Nữ', '456123789', 700000),
('KH004', N'Phạm Huy Hoàng', '1992-09-25', 'Nam', '789456123', 550000),
('KH005', N'Nguyễn Thị Hương', '1998-05-30', N'Nữ', '321654987', 520000);


-- Dữ liệu mẫu cho bảng LoaiMon
INSERT INTO LoaiMon (MaLoaiMon, TenLoaiMon, TrangThaiLoaiMon) VALUES
('LM001', N'Cà Phê', 1),
('LM002', N'Trà', 1),
('LM003', N'Sinh Tố', 1),
('LM004', N'Nước Ép', 1),
('LM005', N'Cacao', 1);

-- Dữ liệu mẫu cho bảng Mon
INSERT INTO Mon (MaMon, MaLoaiMon, TenMon, HinhAnh, DonGiaMon, TrangThaiMon) 
VALUES
('M001', 'LM001', N'Cà Phê Đen', 'anh1.png', 20000, 1),
('M002', 'LM001', N'Cappuccino', 'anh1.png', 30000, 1),
('M003', 'LM002', N'Trà Xanh', 'anh3.png', 25000, 1),
('M004', 'LM003', N'Sinh Tố Dâu', 'anh2.png', 35000, 1),
('M005', 'LM005', N'Cacao Sữa', 'anh1.png', 28000, 1);

INSERT INTO [CongThuc] (MaMon, MaNguyenLieu, KhoiLuong)
VALUES 
    ('M001', 'NL001', 0.5),
('M001', 'NL002', 0.5),
('M001', 'NL003', 0.5),
('M002', 'NL001', 0.5),
('M003', 'NL002', 0.5);

-- Dữ liệu mẫu cho bảng NguyenLieu
INSERT INTO NguyenLieu (MaNguyenLieu, TenNguyenLieu, KhoiLuongNguyenLieu, DonGiaNguyenLieu, TrangThaiNguyenLieu) VALUES
('NL001', N'Cà Phê Robusta', 0.5, 50000, 1),
('NL002', N'Sữa Tươi', 1, 25000, 1),
('NL003', N'Đường', 1, 10000, 1),
('NL004', N'Bột Cacao', 0.2, 30000, 1),
('NL005', N'Dâu Tây', 0.5, 15000, 1);

-- Dữ liệu mẫu cho bảng HoaDon
INSERT INTO HoaDon (MaHoaDon, NgayLapHoaDon, TongTienHoaDon, MaNhanVien, MaKhachHang, MaUuDai, MaKhuyenMai) VALUES
('HD001', '2024-10-01', 75000, 'NV001', 'KH001', 'UD001', 'KM001'),
('HD002', '2024-10-02', 105000, 'NV002', 'KH002', 'UD002', 'KM002'),
('HD003', '2024-10-03', 55000, 'NV003', 'KH003', 'UD003', 'KM003'),
('HD004', '2024-10-04', 85000, 'NV004', 'KH004', 'UD004', 'KM003'),
('HD005', '2024-10-05', 95000, 'NV005', 'KH005', 'UD005', 'KM003');

-- Dữ liệu mẫu cho bảng ChiTietHoaDon
INSERT INTO ChiTietHoaDon (MaHoaDon, MaMon, DonGia, ThanhTien, SoLuong) VALUES
('HD001', 'M001', 20000, 20000, 1),
('HD001', 'M003', 25000, 25000, 1),
('HD002', 'M002', 30000, 60000, 2),
('HD002', 'M004', 35000, 35000, 1),
('HD003', 'M001', 20000, 20000, 1);

-- Bảng NhaCungCap
INSERT INTO [NhaCungCap] ([MaNhaCungCap], [TenNhaCungCap], [DiaChiNhaCungCap], [SoDienThoaiNhaCungCap])
VALUES 
    ('NCC001', N'Công ty TNHH ABC', N'123 Đường ABC, TP. Hồ Chí Minh', '0123456789'),
    ('NCC002', N'Công ty XYZ', N'456 Đường XYZ, TP. Hà Nội', '0987654321'),
    ('NCC003', N'Cửa hàng MNP', N'789 Đường MNP, TP. Đà Nẵng', '0369852147'),
    ('NCC004', N'Chợ Lớn', N'1012 Đường KLM, TP. Cần Thơ', '0765432198'),
    ('NCC005', N'Siêu thị UVW', N'1518 Đường UVW, TP. Hải Phòng', '0932145786');

-- Bảng PhieuNhap
INSERT INTO [PhieuNhap] ([MaPhieuNhap], [NgayLapPhieuNhap], [TongTienPhieuNhap], [MaNhanVien], [MaNhaCungCap])
VALUES 
    ('PN001', '2024-10-01', 150000, 'NV001', 'NCC001'),
    ('PN002', '2024-10-02', 120000, 'NV002', 'NCC002'),
    ('PN003', '2024-10-03', 180000, 'NV003', 'NCC003'),
    ('PN004', '2024-10-04', 90000, 'NV004', 'NCC004'),
    ('PN005', '2024-10-05', 135000, 'NV005', 'NCC005');

-- Bảng ChiTietPhieuNhap
INSERT INTO [ChiTietPhieuNhap] ([MaPhieuNhap], [MaNguyenLieu], [DonGia], [ThanhTien], [KhoiLuong])
VALUES 
    ('PN001', 'NL001', 5000, 10000, 2),
    ('PN002', 'NL002', 4500, 9000, 2),
    ('PN003', 'NL003', 4000, 16000, 4),
    ('PN004', 'NL004', 2000, 4000, 2),
    ('PN005', 'NL005', 3500, 10500, 3);
-----select
SELECT * FROM [CaLam];

SELECT * FROM [NhanVien];

SELECT * FROM [LichLam];

SELECT * FROM [PhanQuyen];

SELECT * FROM [TaiKhoan];

SELECT * FROM [KhachHang];

SELECT * FROM [KhuyenMai];

SELECT * FROM [UuDaiThanhVien];

SELECT * FROM [HoaDon];

SELECT * FROM [LoaiMon];

SELECT * FROM [NguyenLieu];

SELECT * FROM [CongThuc];

SELECT * FROM [Mon];

SELECT * FROM [ChiTietHoaDon];

SELECT * FROM [NhaCungCap];

SELECT * FROM [PhieuNhap];

SELECT * FROM [ChiTietPhieuNhap];