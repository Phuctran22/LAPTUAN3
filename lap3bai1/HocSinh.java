package lap3bai1;

import java.util.Scanner;

public class HocSinh {
private int maSo;
    private String hoTen;
    private float dtb;
    
    public int getMaSo() {
        return maSo;
    }
    
    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }
    
    public String getHoTen() {
        return hoTen;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
    public float getDtb() {
        return dtb;
    }
    
    public void setDtb(float dtb) {
        this.dtb = dtb;
    }
    
    public HocSinh() {
        this.maSo = 0;
        this.hoTen = null;
        this.dtb = 0f;
    }
    
    public HocSinh(int maSo, String hoTen, float dtb) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.dtb = dtb;
    }
    
    public HocSinh(HocSinh tmp) {
        this.maSo = tmp.maSo;
        this.hoTen = tmp.hoTen;
        this.dtb = tmp.dtb;
    }
    
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma so: ");
        maSo = scanner.nextInt();
        System.out.println("Nhap ho ten: ");
        scanner.nextLine();
        hoTen = scanner.nextLine();
        System.out.println("Nhap diem trung binh: ");
        dtb = scanner.nextFloat();
        scanner.nextLine();
    }
    
    public void output() {
        System.out.println(maSo + " - " + hoTen + " - " + dtb);
    }
    
    public void rank() {
        if (dtb < 5) {
            System.out.println("Xep loai yeu");
        } else if (dtb >= 5 && dtb < 7) {
            System.out.println("Xep loai trung binh");
        } else {
            System.out.println("Xep loai gioi");
        }
    }
}
