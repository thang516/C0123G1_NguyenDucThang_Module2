package bai1_ss6;

public class LopCylinder extends LopCircle {
    private double chieuCao;

    public LopCylinder() {
        super(3.5);
    }

    public LopCylinder(double banKinh, String mauSac, double chieuCao) {
        super(banKinh, mauSac);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getTheTich() {
        return Math.PI * chieuCao * Math.pow(banKinh, 2);
    }

    @Override
    public String toString() {
        return "LopCylinder{" +
                "chieuCao=" + this.getChieuCao() +
                ", theTich=" + this.getTheTich() +
                ", mauSac='" + this.getMauSac() + '\'' +
                '}';
    }
}
