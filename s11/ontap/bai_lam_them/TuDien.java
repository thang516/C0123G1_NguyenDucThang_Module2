package bai_lam_them;

import java.util.*;

public class TuDien {
    private Map<String,String> duLieu = new TreeMap<String,String>();
    public String themTu(String tuKhoa,String yNghia){
         return this.duLieu.put(tuKhoa,yNghia);
    }
    public  String xoaTu(String tuKhoa){
        return  this.duLieu.remove(tuKhoa);
    }
    public String traTu(String tuKhoa){
        String yNghia=this.duLieu.get(tuKhoa);
        return yNghia;
    }
    public  void  inTuKhoa(){
        Set<String> tapHopTuKhoa= this.duLieu.keySet();
        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));

    }
public int laySoLuong(){
        return  this.duLieu.size();

}
public void  xoaTatCa(){
        this.duLieu.clear();
}

    public static void main(String[] args) {
        TuDien tuDien= new TuDien();
        int luaChon = 0 ;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("------00---------");
            System.out.println("Menu : "+
                    "\n  1. Thêm từ (từ khóa , ý nghĩa )"+
                    "\n 2. Xóa từ  "+
                    "\n 3. Tìm ý nghĩa của từ khóa - Tra cứu "+
                    "\n 4.In ra danh sách từ khóa "+
                    "\n 5.Xóa tất cả các  từ khóa  ");
            luaChon = scanner.nextInt();scanner.nextLine();

              if(luaChon==1){

                  System.out.println("Nhập zô từ khóa ");
                  String tuKhoa= scanner.nextLine();
                  System.out.println("Nhập zô ý nghĩa ");

                  String yNghia= scanner.nextLine();
                  tuDien.themTu(tuKhoa,yNghia);
              }else if( luaChon==2 || luaChon==3 ){
                  System.out.println("Nhập zô từ khóa ");
                  String tuKhoa= scanner.nextLine();
                  if(luaChon==2){
                      tuDien.xoaTu(tuKhoa);
                  }else {
                      System.out.println("Ý nghĩa từ "+ tuDien.traTu(tuKhoa));
                  }
              }else if( luaChon==4){
                  tuDien.inTuKhoa();
              } else if (luaChon==5) {
                  System.out.println("Số lượng từ khóa là "+tuDien.laySoLuong());
              } else if (luaChon==6) {
                  tuDien.xoaTatCa();
              }
        }
        while (luaChon!=0);

    }

}
