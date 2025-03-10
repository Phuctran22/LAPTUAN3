package BAI03;

public class main {
    public static void main(String[] args) {
        // Tạo điểm với constructor không tham số
        toado point1 = new toado();
        System.out.println("diem 1:");
        point1.intoado();
        
        // Tạo điểm với constructor có tham số
        toado point2 = new toado(3.5f, 2.0f);
        System.out.println("diem 2:");
        point2.intoado();
        
        // Tính tổng của hai điểm
        toado sum = point1.add(point2);
        System.out.println("tong cua 2 diem:");
        sum.intoado();
        
        // Tính điểm đối xứng qua trục hoành
        toado reflection = point2.reflectx();
        System.out.println("diem doi xung qua truc hoanh cua diem 2:");
        reflection.intoado();
    }
}
