package src;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static src.App.phoneList;
import static src.App.phoneList1;

public class ProductService {
    public void insert() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập thông tin sản phẩm");
        try {
            System.out.println("Mã: ");
            int id = input.nextInt();

            System.out.println("Tên: ");
            String name = input.nextLine();

            input.nextLine();
            System.out.println("Số lượng: ");
            String quantity = input.nextLine();

            System.out.println("Giá: ");
            String price = input.nextLine();

            System.out.println("Nhà sản xuất: ");
            String manufactuer = input.nextLine();

            System.out.println("Trạng thái: ");
            String status = input.nextLine();

            System.out.println("Quốc gia: ");
            String region = input.nextLine();

            System.out.println("Thời gian bảo hành: ");
            String ExpDate = input.nextLine();

            System.out.println("Phạm vi bảo hành: ");
            String ExpScope = input.nextLine();

            RemotePhone phone = new RemotePhone(id, name, quantity, price, manufactuer, status, region);
            App.phoneList1.add(phone);
            OfficialPhone phone1 = new OfficialPhone(id, name, quantity, price, manufactuer, ExpDate, ExpScope);
            App.phoneList.add(phone1);
        } catch (InputMismatchException ei) {
            System.out.println("Nhập sai giá trị, vui lòng nhập lại");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void Delete() {
//        phoneList
//        if(x != null){
//            List.remove(x);
//            System.out.println("Sinh vien da bi xoa");
//        } else {
//            System.out.println("Khong tim thay sinh vien");
//        }
    }

    public void ShowList() {
        System.out.println("Danh sách sản phẩm");
        String header = String.format("%s%15s%30s%15s%15s", "Mã ", "Tên ", "Số lượng ", "Giá ", "Nhà sản xuất ");
        System.out.println(header);
//        for (List p : phoneList) {

    }

    public RemotePhone Search() {
        Scanner input = new Scanner(System.in);
        for (RemotePhone x : phoneList1) {
            if (x.getId() == input.nextInt()) {
                return x;
            }
        }
        return null;
    }

    public OfficialPhone Search2() {
        Scanner input = new Scanner(System.in);
        for (OfficialPhone y : phoneList) {
            if (y.getId() == input.nextInt()) {
                return y;
            }
        }
        return null;
    }
}
