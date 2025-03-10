package BAI02;

import java.util.Scanner;

public class phanso {
private int tu;
private int mau;

public phanso(){
    this.tu = 0;
    this.mau = 1;
}
public phanso (int tu, int mau) {
    this.tu = tu;
    if (mau == 0) {
        System.out.println("mau khong the bang 0.");
        this.mau = 1;
    } 
    else {
        this.mau = mau;
    }
    
}
public phanso(phanso p){
    this.tu=p.tu;
    this.mau=p.mau;
}
 public void nhapPhanSo() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("nhap tu so: ");
        this.tu = scanner.nextInt();
        
        do {
            System.out.print("nhap mau so: ");
            this.mau = scanner.nextInt();
            
            if (this.mau == 0) {
                System.out.println("mau so ko the bang 0.");
            }
        } while (this.mau == 0);
        

}
public void xuatphanso(){
    if (mau==1) {
        System.out.println(tu);
    }else {
        System.out.println(tu + "/" + mau);
    }

}
private int USCLN(int a, int b) {
    a= Math.abs(a);
    b=Math.abs(b);
    while (b!=0) {
        int temp = b;
        b= a % b;
        a = temp;
    }
    return a;
}
private void rutgon(){
    int gcd = USCLN(tu, mau);
        tu /= gcd;
        mau /= gcd;
        if (mau < 0) {
            tu = -tu;
            mau = -mau;
        }
    }
    public phanso cong(phanso p) {
        int tuMoi = this.tu * p.mau + p.tu * this.mau;
        int mauMoi = this.mau * p.mau;
        phanso ketQua = new phanso(tuMoi, mauMoi);
        return ketQua;
    }

    public phanso tru(phanso p) {
        int tuMoi = this.tu * p.mau - p.tu * this.mau;
        int mauMoi = this.mau * p.mau;
        phanso ketQua = new phanso(tuMoi, mauMoi);
        return ketQua;
    }

    public phanso nhan(phanso p) {
        int tuMoi = this.tu * p.tu;
        int mauMoi = this.mau * p.mau;
        phanso ketQua = new phanso(tuMoi, mauMoi);
        return ketQua;
    }

    public phanso chia(phanso p){
        if (p.tu==0) {
            System.out.println("ko the chia cho 0");
            return new phanso();
        }
        int tuMoi = this.tu * p.mau;
        int mauMoi = this.mau * p.tu;
        phanso ketQua = new phanso(tuMoi, mauMoi);
        return ketQua;
    }

    public int gettu(){
        return tu;
    }
    public void settu(int tu){
        this.tu=tu;
        rutgon();
    }

    public int getmau(){
        return mau;
    }
    public void setmau(int mau){
        if (mau==0) {
            System.out.println("mau so ko the bang 0");
            return;
        }
        this.mau=mau;
        rutgon();
    }
}


