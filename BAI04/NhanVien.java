package BAI04;
import java.util.Scanner;
public class NhanVien {
    private String maSo;
    private String hoTen;
    private double luongCB;
    private double heSoLuong;

    private static int soLuongNV = 0;

    public NhanVien(){
        this.maSo="";
        this.hoTen="";
        this.luongCB=0;
        this.heSoLuong=0;
        soLuongNV++;
    }

    public NhanVien(String maSo, String hoTen, double luongCB, double heSoLuong) {
        this.maSo = maSo;
        this.hoTen=hoTen;
        this.luongCB=luongCB;
        this.heSoLuong=heSoLuong;
        soLuongNV++;
    }

    public NhanVien(NhanVien nv){
        this.maSo = nv.maSo;
        this.hoTen=nv.hoTen;
        this.luongCB=nv.luongCB;
        this.heSoLuong=nv.heSoLuong;
        soLuongNV++;
    }

    public String getmaSo(){
        return maSo;
    }
    public void setmaSo(String maSo){
        this.maSo=maSo;
    }

    public String gethoTen(){
        return hoTen;
    }
    public void sethoTen(String hoTen){
        this.hoTen=hoTen;
    }

    public double getluongCB(){
        return luongCB;
    }
    public void setluongCB(double luongCB){
        this.luongCB=luongCB;
    }

    public double getheSoLuong(){
        return heSoLuong;
    }
    public void setheSoLuong(double heSoLuong){
        this.heSoLuong= heSoLuong;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap ma so NV: ");
        this.maSo= scanner.nextLine();

        System.out.print("nhap ho ten NV: ");
        this.hoTen=scanner.nextLine();

        System.out.print("nhap luong co ban: ");
        this.luongCB=scanner.nextDouble();

        System.out.print("nhap he so luong: ");
        this.heSoLuong=scanner.nextDouble();

    }

    public double tinhluong() {
        return luongCB * heSoLuong;
    }


    public void xuat(){
        System.out.println("    THONG TIN NV    ");
        System.out.println("ma so: "+maSo);
        System.out.println("ho ten: "+ hoTen);
        System.out.println("luong co ban: "+luongCB);
        System.out.println("he so luong: "+ heSoLuong);
        System.out.println("luong nhan: "+tinhluong());
    }

    public static void inSLNV() {
        System.out.println("tong so nhan vien: " + soLuongNV);
    }

    public static int getsoLuongNV() {
        return soLuongNV;
    }

    @Override
    public String toString() {
        return "NhanVien [maSo=" + maSo + ", hoTen=" + hoTen + ", luongCoBan=" + luongCB + 
               ", heSoLuong=" + heSoLuong + ", luongThucNhan=" + tinhluong() + "]";
    }

}

