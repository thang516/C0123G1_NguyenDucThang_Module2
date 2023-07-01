package mvc.repository;

import mvc.models.HoaDonTienDien;
import mvc.util.DocVaGhi;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class HoaDonTienDienRepository implements IHoaDonTienDienRepository {
    public final String PATH_FILE = "mvc\\data\\hoa_don_tien_dien.csv";

    @Override
    public List<HoaDonTienDien> hienThiTienDien() {
        List<HoaDonTienDien> hoaDonTienDienList = new ArrayList<>();
        List<String> stringList = DocVaGhi.doc(PATH_FILE);
        for (int i = 0; i < stringList.size(); i++) {
            String str = stringList.get(i);
            String[] arr = str.split(",");
            HoaDonTienDien hoaDonTienDien = new HoaDonTienDien(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]));
            hoaDonTienDienList.add(hoaDonTienDien);
        }
        return hoaDonTienDienList;
    }

    @Override
    public void themTienDienFile(List<HoaDonTienDien> hoaDonTienDienList) {
        DocVaGhi.ghi(PATH_FILE, "", false);
        for (int i = 0; i < hoaDonTienDienList.size(); i++) {
            HoaDonTienDien hoaDonTienDien = hoaDonTienDienList.get(i);
            if (i == 0) {
                DocVaGhi.ghi(PATH_FILE, hoaDonTienDien.ghiThongTinThanhChuoi(), false);
            } else {
                DocVaGhi.ghi(PATH_FILE, hoaDonTienDien.ghiThongTinThanhChuoi(), true);
            }
        }

    }
}
