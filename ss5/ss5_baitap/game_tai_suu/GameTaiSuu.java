package game_tai_suu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class GameTaiSuu {
    public static void main(String[] args) {
        double taiKhoanNguoiChoi = 5000;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        // dùng local để biết mình đang ở đâu
        Locale lc = new Locale("vi", "VN");
        //numberFormat để định dạng sô thập phân ở
        //NumberFormat numf= NumberFormat.getInstance(lc);
        // getCurrencyInstancy là forrmat tiền
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);

        do {
            System.out.println("-----------Mời bạn lựa chọn----------" +
                    "\n 1.Tiếp tục chơi " +
                    "\n 2.Để thoát");
            int choosen = Integer.parseInt(scanner.nextLine());
            switch (choosen) {
                case 1:
                    System.out.println("Tiếp tục chơi");
                    if (choosen == 1) {
                        System.out.println("--------------------");
                        System.out.println("Bắt đầu chơi");
                        System.out.println("Tài khoản bạn có " + numf.format(taiKhoanNguoiChoi) + "  " + "Bạn muốn đặt cược bao nhiêu?");
                        double datCuoc;
                        do {
                            System.out.println("------------------------");
                            System.out.println("Đặt cược (0< số tiền cược <=" + numf.format(taiKhoanNguoiChoi) + ":");
                            datCuoc = Integer.parseInt(scanner.nextLine());
                        }
                        while (datCuoc <= 0 || datCuoc >= taiKhoanNguoiChoi);
                        int luuChonTaiXiu = 0;
                        do {
                            System.out.println("Chọn:1 <-->Tài hoặc 2<--> Xỉu");
                            luuChonTaiXiu = Integer.parseInt(scanner.nextLine());
                        }
                        while (luuChonTaiXiu != 1 && luuChonTaiXiu != 2);
                        Random xucXac1 = new Random();
                        Random xucXac2 = new Random();
                        Random xucXac3 = new Random();
                        int giaTri = xucXac1.nextInt(5) + 1;
                        int giaTri2 = xucXac2.nextInt(5) + 1;
                        int giaTri3 = xucXac3.nextInt(5) + 1;
                        int tong = giaTri + giaTri2 + giaTri3;
                        System.out.println("Kết quả :" + giaTri + "--" + giaTri2 + "--" + giaTri3);
                        if (tong == 3 || tong == 18) {
                            taiKhoanNguoiChoi -= datCuoc;
                            System.out.println("Tổng là :" + tong + " => Nhà cái ăn hết, bạn đã thua");
                            System.out.println("Tài khoản của bạn là :" + taiKhoanNguoiChoi);
                        } else if (tong >= 4 || tong <= 10) {
                            System.out.println(" Tổng là " + tong + "=> Xiu");
                            if (luuChonTaiXiu == 2) {
                                System.out.println("Bạn đã thắng cược");
                                taiKhoanNguoiChoi += datCuoc;
                                System.out.println("Tài khoản của bạn là:" + taiKhoanNguoiChoi);

                            } else {
                                System.out.println("Bạn đã thua cược");
                                taiKhoanNguoiChoi -= datCuoc;
                                System.out.println("Tài khoản của bạn là " + taiKhoanNguoiChoi);
                            }
                        } else {
                            System.out.println(" Tổng là " + tong + "=> Tài");
                            if (luuChonTaiXiu == 1) {
                                System.out.println("Bạn đã thắng cược");
                                taiKhoanNguoiChoi += datCuoc;
                                System.out.println("Tài khoản của bạn là:" + taiKhoanNguoiChoi);

                            } else {
                                System.out.println("Bạn đã thua cược");

                                taiKhoanNguoiChoi += datCuoc;
                                System.out.println("Tài khoản của bạn là " + taiKhoanNguoiChoi);
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Exit");
                    flag = false;
                    break;
                default:
                    System.out.println("bạn nhập số ko hợp lệ");
            }
        }
        while (flag);
    }
}
