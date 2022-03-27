package services.lmpl;

import models.Employee;
import services.EmployeeService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeServicelmpl implements EmployeeService {
    private static List<Employee> employeeList= new ArrayList<>();
    private static Scanner scanner=new Scanner(System.in);
    @Override
    public void display() {
for (Employee employee: employeeList){
    System.out.println(employee.toString());
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

        System.out.println("Nhập trình độ: ");
        String trinhdo = scanner.nextLine();

        System.out.println("Nhập vị trí: ");
        String vitri = scanner.nextLine();

        System.out.println("Nhập lương: ");
        Long luong = Long.parseLong(scanner.nextLine());
        Employee employee=new Employee(id,hoten,ngaysinh,gioitinh,soCMND,sodienthoai,email,trinhdo,vitri,luong);
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("Nhập id nhân viên cần chỉnh sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int sizeListE = employeeList.size();
        boolean check = false;

        for(int i = 0; i<sizeListE; i++) {
            if(employeeList.get(i).getId() == id) {
                check = true;
                System.out.println("Tìm thấy nhân viên cần chỉnh sửa:");
                System.out.println(employeeList.get(i));
                int idmoi;
                String hotenmoi, gioitinhmoi, cmndmoi, sodienthoaimoi, emailmoi,  trinhdomoi, vitrimoi;
                Date ngaysinhmoi;
                long luongmoi;
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
                System.out.print("Nhập trình độ: ");
                trinhdomoi = scanner.nextLine();
                System.out.print("Nhập vị trí: ");
                vitrimoi = scanner.nextLine();
                System.out.println("Nhập lương: ");
                luongmoi = Long.parseLong(scanner.nextLine());
                employeeList.get(i).setId(idmoi); employeeList.get(i).setHoten(hotenmoi); employeeList.get(i).setNgaysinh(ngaysinhmoi);
                employeeList.get(i).setGioitinh(gioitinhmoi); employeeList.get(i).setSoCMND(cmndmoi);
                employeeList.get(i).setSodienthoai(sodienthoaimoi); employeeList.get(i).setEmail(emailmoi);
                employeeList.get(i).setTrinhdo(trinhdomoi); employeeList.get(i).setVitri(vitrimoi); employeeList.get(i).setLuong(luongmoi);
                System.out.println("Đã cập nhật thành công!");
                break;

            } break;
        }

        if(check == false) {
            System.out.println("Không tìm thấy nhân viên với mã id: "+id);
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập id nhân viên cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int sizeList= employeeList.size();
        boolean check = false;
        for (int i=0; i < sizeList; i++){
            if (employeeList.get(i).getId() == id) {
                employeeList.remove(employeeList.get(i));
                System.out.println("Đã xóa thành công!");
                check = true;
            }
        }

        if(check == false){
            System.out.println("Không tồn tại nhân viên có mã id: "+id);
        }
    }
}
