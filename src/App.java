package src;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static List<OfficialPhone> phoneList = new ArrayList<OfficialPhone>();
    public static List<RemotePhone> phoneList1 = new ArrayList<RemotePhone>();

    public static void menu() {
        System.out.println("----------Chuơng Trình Quản Lí Điện Thoại-----------");
        System.out.println("Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1. Thêm mới ");
        System.out.println("2. Xoá");
        System.out.println("3. Xem danh sách điện thoại");
        System.out.println("4. Tìm kiếm");
        System.out.println("5. Thoát");
    }
    public static void main(String[] args) {
        int function = 0;
        do {
            menu();
            Scanner input = new Scanner(System.in);
            try {
                System.out.print("Chọn chức năng");
                function = input.nextInt();
                ProductService productService = new ProductService();
                switch (function) {
                    case 1:
                        productService.insert();
                        break;
                    case 2:
                        productService.Delete();
                        break;
                    case 3:
                        productService.ShowList();
                        break;
                    case 4:
                        productService.Search();
                        break;
                    case 5:
                        break;
                }
            } catch (InputMismatchException ei) {
                System.out.println("Bạn đã nhập sai giá trị, vui lòng thử lại");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (function != 5);
    }
    }

