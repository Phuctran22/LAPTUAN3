package lap3bai5;

public class TamGiac {
    private int canh1;
    private int canh2;
    private int canh3;
    
    public TamGiac(int canh1, int canh2, int canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }
    
    private boolean kiemTraHopLe() {
        return (canh1 > 0 && canh2 > 0 && canh3 > 0) &&
               (canh1 + canh2 > canh3) &&
               (canh2 + canh3 > canh1) &&
               (canh1 + canh3 > canh2);
    }
    
    public int tinhChuVi() {
        if (!kiemTraHopLe()) {
            return 0;
        }
        return canh1 + canh2 + canh3;
    }
    public double tinhDienTich() {
        if (!kiemTraHopLe()) {
            return 0;
        }
        double p = tinhChuVi() / 2.0;
        return Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));
    }
    
    public String loaiTamGiac() {
        if (!kiemTraHopLe()) {
            return "Khong phai tam giac";
        }
        
        if (canh1 == canh2 && canh2 == canh3) {
            return "Tam giac deu";
        }
        
        if (canh1 == canh2 || canh2 == canh3 || canh1 == canh3) {
            if (kiemTraTamGiacVuong()) {
                return "Tam giac vuong can";
            }
            return "Tam giac can";
        }
        
        if (kiemTraTamGiacVuong()) {
            return "Tam giac vuong";
        }
        
        return "Tam giac thuong";
    }
    
    private boolean kiemTraTamGiacVuong() {
        int a2 = canh1 * canh1;
        int b2 = canh2 * canh2;
        int c2 = canh3 * canh3;
        return (a2 + b2 == c2) || (a2 + c2 == b2) || (b2 + c2 == a2);
    }
    
    public void xuatThongTin() {
        if (!kiemTraHopLe()) {
            System.out.println("Khong phai tam giac hop le");
            return;
        }
        System.out.printf("Tam giac co 3 canh: %d, %d, %d\n", canh1, canh2, canh3);
        System.out.println("Loai tam giac: " + loaiTamGiac());
        System.out.println("Chu vi: " + tinhChuVi());
        System.out.printf("Dien tich: %.2f\n", tinhDienTich());
    }
}
 class Demo {
    public static void main(String[] args) {
        TamGiac tg1 = new TamGiac(3, 4, 5);
        TamGiac tg2 = new TamGiac(5, 5, 5);
        TamGiac tg3 = new TamGiac(4, 4, 6);
        TamGiac tg4 = new TamGiac(1, 1, 3);
        
        System.out.println("Tam giac 1:");
        tg1.xuatThongTin();
        System.out.println();
        
        System.out.println("Tam giac 2:");
        tg2.xuatThongTin();
        System.out.println();
        
        System.out.println("Tam giac 3:");
        tg3.xuatThongTin();
        System.out.println();
        
        System.out.println("Tam giac 4:");
        tg4.xuatThongTin();
    }
}

