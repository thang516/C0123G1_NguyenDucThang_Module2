package mvc.repository;

import mvc.models.HoaDonTienDien;

import java.util.List;

public interface IHoaDonTienDienRepository {
    List<HoaDonTienDien> hienThiTienDien();
    void themTienDienFile(List<HoaDonTienDien> hoaDonTienDienList);
}
