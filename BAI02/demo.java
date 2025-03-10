package BAI02;
import java.util.Scanner;
public class demo {
    public static void main(String[] args){
        phanso p1 = new phanso();

        System.out.println("phan so p1 sau khi khoi tao mac dinh: ");
        p1.xuatphanso();

        System.out.println("nhap gia tri moi cho phan so p1: ");
        p1.nhapPhanSo();

        System.out.println("phan so p1 sau khi nhap: ");
        p1.xuatphanso();

        phanso p2 = new phanso(4,16);

        System.out.print("\nphan so p2 sau khi tao: ");
        p2.xuatphanso();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nnhap gia tri cho phan so p3: ");
        System.out.print("nhap tu so: ");
        int tuso = scanner.nextInt();

        int mauso;
        do {
            System.out.print("nhap mau so: ");
            mauso = scanner.nextInt();
        
        if (mauso ==0) {
            System.out.println("mau so ko the = 0");
        }
    }while (mauso==0);
    phanso p3 = new phanso(tuso, mauso);

    System.out.print("phan so p3 sau khi tao: ");
    p3.xuatphanso();

    phanso tong = p1.cong(p3);

    System.out.print("\nket qua cong p1 va p3: ");
    tong.xuatphanso();

    phanso p4 = new phanso(tong);
    System.out.print("\nphan so p4 sau khi sao chep tu tong: ");
    p4.xuatphanso();

    phanso ketquanhan = p4.nhan(p2);
    System.out.print("\nk q nhan p4 va p2: ");
    ketquanhan.xuatphanso();

    }
}
