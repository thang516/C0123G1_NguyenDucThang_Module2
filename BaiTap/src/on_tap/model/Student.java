package on_tap.model;

public class Student {
    private int id;
    private String hoVaTen;
    private String gioiTinh;
    private  String noiSinh;

    public Student(int id, String hoVaTen, String gioiTinh, String noiSinh) {
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.gioiTinh = gioiTinh;
        this.noiSinh = noiSinh;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    @Override
    public String toString() {
        return "Student " +
                "id:" + id +
                ", Họ và tên :'" + hoVaTen + '\'' +
                ", Giới tính :'" + gioiTinh + '\'' +
                ", Nơi sinh:'" + noiSinh + '\'';
    }
}
