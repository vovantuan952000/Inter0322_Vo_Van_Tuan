package services.lmpl;

import models.Customer;
import services.CustomerService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CustomerServicelmpl implements CustomerService {
    private static LinkedList<Customer> customerLinkedList= new LinkedList<>();
    private static Scanner scanner=new Scanner(System.in);
    @Override
    public void display() {
        System.out.println("Danh sách khách hàng");
        for (Customer customer: customerLinkedList){
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine()) ;

        System.out.println("Nhập họ tên: ");
        String hoten = scanner.nextLine();

        System.out.println("Nhập ngày sinh: ");
        String n =scanner.nextLine();

        Date ngaysinh=new Date();
        SimpleDateFormat df=new SimpleDateFormat("dd/mm/yyyy");
        df.setLenient(false);
        try {
            ngaysinh= df.parse(n);
        }
        catch (ParseException e){
            System.out.println(" Nhập ngày sinh sai !!!");
        }
        System.out.println("Nhập giới tính: ");
        String gioitinh = scanner.nextLine();

        System.out.println("Nhập CMND: ");
        String soCMND = scanner.nextLine();

        System.out.println("Nhập số điện thoại: ");
        String sodienthoai = scanner.nextLine();

        System.out.println("Nhập Email: ");
        String email = scanner.nextLine();

        System.out.println("Nhập loại khách: ");
        String loiakhach = scanner.nextLine();

        System.out.println("Nhập địa chỉ: ");
        String diachi = scanner.nextLine();


        Customer customer=new Customer(id,hoten,ngaysinh,gioitinh,soCMND,sodienthoai,email,loiakhach,diachi);
        customerLinkedList.add(customer);
    }



    @Override
    public void edit() {
        System.out.println("Nhập id khách hàng cần chỉnh sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int sizeListC = customerLinkedList.size();
        boolean check = false;

        for(int i = 0; i<sizeListC; i++) {
            if(customerLinkedList.get(i).getId() == id) {
                check = true;
                System.out.println("Tìm thấy khách hàng cần chỉnh sửa:");
                System.out.println(customerLinkedList.get(i));
                int idmoi;
                String hotenmoi, gioitinhmoi, cmndmoi, sodienthoaimoi, emailmoi,  loaikhachmoi, diachimoi;
                Date ngaysinhmoi;
                System.out.print("Nhập id: ");
                idmoi = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập tên: ");
                hotenmoi = scanner.nextLine();
                System.out.print("Nhập ngày sinh: ");
                String x = scanner.nextLine();
                ngaysinhmoi = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                dateFormat.setLenient(false); //set false để kiểm tra tính hợp lệ của date. Vd: tháng 2 phải có 28,29 ngày, 1 năm phải có 12 tháng,...
                try{
                    ngaysinhmoi= dateFormat.parse(x); // parse dateString thành kiểu Date
                }
                catch (ParseException ex) { //Quăng lỗi nếu date không hợp lệ
                    System.out.println("Invalid date");
                }
                System.out.print("Nhập giới tính: ");
                gioitinhmoi = scanner.nextLine();
                System.out.print("Nhập số cmnd: ");
                cmndmoi = scanner.nextLine();
                System.out.print("Nhập số điện thoại: ");
                sodienthoaimoi = scanner.nextLine();
                System.out.print("Nhập Email: ");
                emailmoi = scanner.nextLine();
                System.out.print("Nhập loại khách: ");
                loaikhachmoi = scanner.nextLine();
                System.out.print("Nhập địa chỉ: ");
                diachimoi = scanner.nextLine();
                customerLinkedList.get(i).setId(idmoi); customerLinkedList.get(i).setHoten(hotenmoi); customerLinkedList.get(i).setNgaysinh(ngaysinhmoi);
                customerLinkedList.get(i).setGioitinh(gioitinhmoi); customerLinkedList.get(i).setSoCMND(cmndmoi);
                customerLinkedList.get(i).setSodienthoai(sodienthoaimoi); customerLinkedList.get(i).setEmail(emailmoi);
                customerLinkedList.get(i).setLoiakhach(loaikhachmoi); customerLinkedList.get(i).setDiachi(diachimoi);
                System.out.println("Đã cập nhật thành công!");
                break;

            } break;
        }

        if(check == false) {
            System.out.println("Không tìm thấy khách hàng với mã id: "+id);
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập id khách hàng cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int sizeList= customerLinkedList.size();
        boolean check = false;
        for (int i=0; i < sizeList; i++){
            if (customerLinkedList.get(i).getId() == id) {
                customerLinkedList.remove(customerLinkedList.get(i));
                System.out.println("Đã xóa thành công!");
                check = true;
            }
        }
        if(check == false){
            System.out.println("Không tồn tại nhân viên có mã id: "+id);
        }

    }
}
