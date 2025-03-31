package lap3bai1;

public class DSHocSinh {
    private HocSinh ds[];
    private int soLuong;
    
    public DSHocSinh(int soLuong) {
        this.soLuong = soLuong;
        ds = new HocSinh[soLuong];
    }
    
    public void nhapDS() {
        for (int i = 0; i < soLuong; i++) {
            ds[i] = new HocSinh();
            ds[i].input();
        }
    }
    
    public void xuatDS() {
        System.out.println("Danh sach hoc sinh la:");
        for (int i = 0; i < soLuong; i++) {
            ds[i].output();
        }
    }
    
    public void sapXep() {
        for (int i = 0; i < soLuong - 1; i++) {
            for (int j = i + 1; j < soLuong; j++) {
                if (ds[i].getDtb() < ds[j].getDtb()) {
                    HocSinh tmp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = tmp;
                }
            }
        }
    }
}

