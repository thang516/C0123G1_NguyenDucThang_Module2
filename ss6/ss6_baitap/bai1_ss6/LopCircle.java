package bai1_ss6;

public class LopCircle {
    protected double banKinh;
    protected String mauSac;

    public LopCircle(double banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

    public LopCircle(double v) {
    }

    public double getBanKinh() {
        return banKinh;
    }

    public double setBanKinh(double banKinh) {
        this.banKinh = banKinh;
        return banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public String setMauSac(String mauSac) {
        this.mauSac = mauSac;
        return mauSac;
    }

    public double getDienTich() {
        return  Math.PI*Math.pow(banKinh,2);
    }



    @Override
    public String toString() {
        return "LopCircle{" +
                "banKinh=" + this.getBanKinh() +
                ", mauSac='" + this.getMauSac() + '\'' +
                ", dienTich=" + getDienTich() +
                '}';
    }
}
