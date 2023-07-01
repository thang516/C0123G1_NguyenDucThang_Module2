package mvc.service;

import mvc.models.HoaDonTienDien;
import mvc.repository.HoaDonTienDienRepository;
import mvc.repository.IHoaDonTienDienRepository;

import java.util.List;
import java.util.Scanner;

public class HoaDonTienDienService implements IHoaDonTienDIenService {
    Scanner scanner = new Scanner(System.in);
    HoaDonTienDienRepository hoaDonTienDienRepository = new HoaDonTienDienRepository();
    List<HoaDonTienDien> hoaDonTienDienList = hoaDonTienDienRepository.hienThiTienDien();


    public void luuFile() {
        hoaDonTienDienRepository.themTienDienFile(hoaDonTienDienList);
    }

    @Override
    public void display() {
        for (HoaDonTienDien x : hoaDonTienDienList) {
            System.out.println(x);
        }
    }

    @Override
    public void add() {

        String id;
        boolean co1;
        do {
            System.out.println("Nhập vô mã hóa đơn");
            String regex = "^(MHD)-[0-9]{4}$";
            id = scanner.nextLine();
            co1 = id.matches(regex);


        }
        while (!co1);
        System.out.println("Nhập họ tên khách hàng");
        String name = scanner.nextLine();
        System.out.println("Nhập loại khách hàng");
        boolean co = true;
        String loaiKhach = "";
        do {
            System.out.println("chọn : " +
                    "\n 1.sinh hoat" +
                    "\n 2. kinh doanh");
            String chon = scanner.nextLine();
            switch (chon) {
                case "1":
                    loaiKhach = "sinh hoạt";
                    co = false;
                    break;
                case "2":
                    loaiKhach = "kinh doanh";
                    co = false;
                    break;
            }
        }
        while (co);
        System.out.println("Nhập định mức tiêu thụ");
        int dinhmuc = Integer.parseInt(scanner.nextLine());
        HoaDonTienDien hoaDonTienDien = new HoaDonTienDien(id, name, loaiKhach, dinhmuc);
        hoaDonTienDienList.add(hoaDonTienDien);
    }

}
