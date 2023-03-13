package lam_lai;

import java.util.Scanner;

public class TestSinhVienNangCao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachSinhVienNangCao dssv = new DanhSachSinhVienNangCao();
        boolean flag = true;
        do {
            System.out.println("vui lòng chọn chức năng ");
            System.out.println("Menu" +
                    "\n 1. Thêm SV" +
                    "\n 2. In danh sách SV" +
                    "\n 3. Kiểm tra danh sách có rỗng hay ko +" +
                    "\n 4. Lấy ra số lượng SV trong ds" +
                    "\n 5. làm rỗng ds sinh viên" +
                    "\n 6. Ktra sv có tồn tại ko" +
                    "\n 7.  Xóa sinh viên khỏi ds dựa trên mã Sv" +
                    "\n 8.  Tìm kiếm tất cả mã sinh viên dựa trên mã sinh viên nhập từ bàn phím" +
                    "\n 9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp" +
                    "\n 10. Thoát khỏi chương trình");

            int choosen = Integer.parseInt(scanner.nextLine());
            switch (choosen) {
                case 1:
                    System.out.println("1.Thêm sinh viên");
                    System.out.println("Nhập mã sinh viên :");
                    String maSinhVien = scanner.nextLine();
                    System.out.println("Nhập họ và tên:");
                    String hoVaTen = scanner.nextLine();
                    System.out.println("nhập năm sinh");
                    int namSinh = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập điểm trung bình ");
                    float diemTrungBinh = Float.parseFloat(scanner.nextLine());
                    SinhVienNangCao sv = new SinhVienNangCao(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                    dssv.themSinhVien(sv);
                    break;
                case 2:
                    System.out.println("2.In danh sách SV");
                    dssv.inDanhSachSinhVien();
                    break;
                case 3:
                    System.out.println("3.Kiểm tra danh sách có rỗng hay ko?");
                    System.out.println("danh sách sinh viên rỗng" + dssv.kiemTraDanhSachRong());
                    break;
                case 4:
                    System.out.println("4.Lấy ra số lượng SV trong ds");
                    System.out.println("SỐ lượng hiện tại " + dssv.laySoLuongSinhVien());
                    break;
                case 5:
                    System.out.println("5.làm rỗng ds sinh viên");
                    dssv.lamRongDanhSach();
                    break;
                case 6:
                    System.out.println("6.Ktra sv có tồn tại ko");
                    System.out.println("Nhập mã sinh viên ");
                    String maSinh = scanner.nextLine();
                    SinhVienNangCao sv1 = new SinhVienNangCao(maSinh);
                    System.out.println(dssv.kiemTraTonTai(sv1));
                    break;
                case 7:
                    System.out.println("7. Xóa sinh viên khỏi ds dựa trên mã Sv");
                    System.out.println("Nhập mã sinh viên ");
                    maSinh = scanner.nextLine();
                    SinhVienNangCao sv2 = new SinhVienNangCao(maSinh);
                    System.out.println(dssv.xoaSinhVien(sv2));
                    break;
                case 8:
                    System.out.println(" Tìm kiếm tất cả mã sinh viên dựa trên mã sinh viên nhập từ bàn phím");
                    break;
                case 9:
                    System.out.println("9.Xuất ra danh sách sinh viên có điểm từ cao đến thấp");
                    break;
                case 10:
                    System.out.println(" 10.Thoát");
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn nhập lựa chọn ko hợp lệ");
            }
        }
        while (flag);
    }
}
