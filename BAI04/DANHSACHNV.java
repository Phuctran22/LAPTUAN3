package BAI04;

import java.util.ArrayList;
import java.util.Scanner;

public class DANHSACHNV {
private ArrayList<NhanVien> danhSach;

    public DANHSACHNV() {
        this.danhSach = new ArrayList<>();
    }

    public void themNhanVien(NhanVien nv) {
        this.danhSach.add(nv);
    }

    public void nhapDanhSach() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("nhap so luong nv: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); 
        
        for (int i = 0; i < soLuong; i++) {
            System.out.println("\nNhap thong tin nhan vien thu " + (i + 1) + ":");
            NhanVien nv = new NhanVien();
            nv.nhap();
            this.danhSach.add(nv);
        }
    }

    public void xuatDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach nv trong!");
            return;
        }
        
        System.out.println("\n========== DANH SACH NHAN VIEN ==========");
        System.out.println("tong so nhan vien: " + danhSach.size());
        
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println("\nThong tin nhan vien thu " + (i + 1) + ":");
            danhSach.get(i).xuat();
        }
        
        System.out.println("==========================================");
    }
  
    public NhanVien timNhanVienTheoMaSo(String maSo) {
        for (NhanVien nv : danhSach) {
            if (nv.getmaSo().equals(maSo)) {
                return nv;
            }
        }
        return null;
    }
 
    public boolean xoaNhanVien(String maSo) {
        NhanVien nv = timNhanVienTheoMaSo(maSo);
        if (nv != null) {
            return danhSach.remove(nv);
        }
        return false;
    }

    public double tinhTongLuong() {
        double tongLuong = 0;
        for (NhanVien nv : danhSach) {
            tongLuong += nv.tinhluong();
        }
        return tongLuong;
    }

    public NhanVien timNhanVienLuongCaoNhat() {
        if (danhSach.isEmpty()) {
            return null;
        }
        
        NhanVien nvMax = danhSach.get(0);
        for (int i = 1; i < danhSach.size(); i++) {
            if (danhSach.get(i).tinhluong() > nvMax.tinhluong()) {
                nvMax = danhSach.get(i);
            }
        }
        return nvMax;
    }
 
    public void sapXepTheoLuongGiamDan() {
        for (int i = 0; i < danhSach.size() - 1; i++) {
            for (int j = i + 1; j < danhSach.size(); j++) {
                if (danhSach.get(i).tinhluong() < danhSach.get(j).tinhluong()) {
                    NhanVien temp = danhSach.get(i);
                    danhSach.set(i, danhSach.get(j));
                    danhSach.set(j, temp);
                }
            }
        }
    }

    public void xuatNhanVienLuongLonHon(double mucLuong) {
        System.out.println("\n===== DANH SACH NV CO LUONG > " + mucLuong + " =====");
        boolean coNhanVien = false;
        
        for (NhanVien nv : danhSach) {
            if (nv.tinhluong() > mucLuong) {
                nv.xuat();
                coNhanVien = true;
            }
        }
        
        if (!coNhanVien) {
            System.out.println("Khong co nv nao co muc luong hon " + mucLuong);
        }
        
        System.out.println("==========================================");
    }
}
