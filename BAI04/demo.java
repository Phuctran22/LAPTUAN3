package BAI04;

import java.util.Scanner;

public class demo {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== QUAN LY NHAN VIEN ===");

        System.out.println("\n1. nhan vien 1: ");
        NhanVien nv1 = new NhanVien();

        System.out.println("\n2. nhan vien 2: ");
        NhanVien nv2 = new NhanVien("NV002", "Nguyễn Văn B", 70000000, 2.5);

        System.out.println("\n3. nhan vien 3: ");
        NhanVien nv3 = new NhanVien(nv2); 
 
        System.out.println("\n=== NHAP VA XUAT THONG TIN NV ===");
        
        System.out.println("\nnhap thong tin nv 1:");
        nv1.nhap();
        
        System.out.println("\nthong tin nhan vien 2:");
        nv2.xuat();
        
        System.out.println("\nnhap thong tin nhan vien 3:");
        nv3.nhap();
        
        System.out.println("\nhien thi thong tin 3 nv:");
        System.out.println("\nnhan vien 1:");
        nv1.xuat();
        System.out.println("\nnhan vien 2:");
        nv2.xuat();
        System.out.println("\nnhan vien 3:");
        nv3.xuat();
  
        System.out.println("\n=== THAY DOI HO TEN NV ===");
        System.out.print("\nnhap ho ten moi cho nv 1: ");
        String hoTenMoi = scanner.nextLine();
        nv1.sethoTen(hoTenMoi);
        
        System.out.println("\nthong tin nv 1 sau khi doi ho ten:");
        nv1.xuat();
   
        System.out.println("\n=== NHAN VIEN CO HE SO LUONG CAO NHAT ===");
        NhanVien nvMaxHeSo = nv1;
        
        if (nv2.getheSoLuong() > nvMaxHeSo.getheSoLuong()) {
            nvMaxHeSo = nv2;
        }
        
        if (nv3.getheSoLuong() > nvMaxHeSo.getheSoLuong()) {
            nvMaxHeSo = nv3;
        }
        
        System.out.println("\nnhan vien co he so luong cao nhat:");
        nvMaxHeSo.xuat();

        System.out.println("\n=== NHẬP VÀ XUẤT DANH SÁCH NHÂN VIÊN ===");
        DANHSACHNV danhSach = new DANHSACHNV();

        danhSach.themNhanVien(nv1);
        danhSach.themNhanVien(nv2);
        danhSach.themNhanVien(nv3);
        
        System.out.print("\nban co muon nhap them nv ko? (1: co, 0: ko): ");
        int luaChon = scanner.nextInt();
        scanner.nextLine();
        
        if (luaChon == 1) {
            danhSach.nhapDanhSach();
        }
  
        danhSach.xuatDanhSach();
 
        System.out.println("\n=== SO LUONG NV ===");
        System.out.println("tong so nv da tao: " + NhanVien.getsoLuongNV());
        
        scanner.close();
    }
}
