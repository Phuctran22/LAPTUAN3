package lap3bai1;

public class Demo1 {
    public static void main(String[] args) {
  
        HocSinh hs1 = new HocSinh();
        hs1.input();
        
        HocSinh hs2 = new HocSinh(111, "Nguyen Ngo", 8.5f);
        hs2.output();
        
        HocSinh hs3 = new HocSinh(hs2);
        hs3.output();
   
        hs3.setHoTen("Phan Chau Tuan");

        hs3.output();

        float max = hs1.getDtb();
        String ht = hs1.getHoTen();
        
        if (max < hs2.getDtb()) {
            max = hs2.getDtb();
            ht = hs2.getHoTen();
        }
        if (max < hs3.getDtb()) {
            max = hs3.getDtb();
            ht = hs3.getHoTen();
        }
        
        System.out.println("Hoc sinh " + ht + " co DTB con nhat la: " + max);
    }
}
 class Demo2 {
    public static void main(String[] args) {
        DSHocSinh danhSach = new DSHocSinh(3);
        danhSach.nhapDS();
        danhSach.sapXep();
        danhSach.xuatDS();
    }
}
