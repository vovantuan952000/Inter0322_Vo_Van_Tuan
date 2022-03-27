package services.lmpl;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import models.Facility;
import models.House;
import models.Room;
import models.Villa;
import services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServicelmpl implements FacilityService {
private static Map<Facility, Integer>facilityIntegerMap=new LinkedHashMap<>();
private static Scanner scanner=new Scanner(System.in);
    @Override
    public void display() {
        System.out.println("-----DANH SÁCH FACILITY-----");
        for(Map.Entry<Facility,Integer> facilityIntegerEntry : facilityIntegerMap.entrySet()) {
            System.out.println("Dịch vụ: " +facilityIntegerEntry.getKey()+" ;Số lần đã thuê: "+facilityIntegerEntry.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        System.out.print("Nhập tên dịch vụ: ");
        String tendichvu= scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        double dientichsudung =Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập chi phí thuê: ");
        double chiphithue =Double.parseDouble(scanner.nextLine()) ;
        System.out.print("Nhập số lượng người tối đa: ");
        int soluongnguoitoida = Integer.parseInt(scanner.nextLine()) ;
        System.out.print("Nhập kiểu thuê: ");
        String kieuthue = scanner.nextLine();
        System.out.print("Nhập tiêu chuẩn phòng: ");
        String tieuchuanphong = scanner.nextLine();
        System.out.print("Nhập diện tích hồ bơi: ");
        double dientichhoboi =Double.parseDouble(scanner.nextLine()) ;
        System.out.print("Nhập số tầng: ");
        int sotang =Integer.parseInt(scanner.nextLine()) ;
        Villa facility=new Villa(tendichvu, dientichsudung, chiphithue, soluongnguoitoida, kieuthue, tieuchuanphong, dientichhoboi, sotang);
        facilityIntegerMap.put(facility, 0);
        System.out.println("Thêm mới Villa thành công: ");
    }

    @Override
    public void addNewHouse() {
        System.out.print("Nhập tên dịch vụ: ");
        String tendichvu= scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        double dientichsudung =Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập chi phí thuê: ");
        double chiphithue =Double.parseDouble(scanner.nextLine()) ;
        System.out.print("Nhập số lượng người tối đa: ");
        int soluongnguoitoida = Integer.parseInt(scanner.nextLine()) ;
        System.out.print("Nhập kiểu thuê: ");
        String kieuthue = scanner.nextLine();
        System.out.print("Nhập tiêu chuẩn phòng: ");
        String tieuchuanphong = scanner.nextLine();
        System.out.print("Nhập số tầng: ");
        int sotang =Integer.parseInt(scanner.nextLine()) ;
        House facility=new House(tendichvu, dientichsudung, chiphithue, soluongnguoitoida, kieuthue, tieuchuanphong, sotang);
        facilityIntegerMap.put(facility, 0);
        System.out.println("Thêm mới House thành công: ");

    }

    @Override
    public void addNewRoom() {
        System.out.print("Nhập tên dịch vụ: ");
        String tendichvu= scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        double dientichsudung =Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập chi phí thuê: ");
        double chiphithue =Double.parseDouble(scanner.nextLine()) ;
        System.out.print("Nhập số lượng người tối đa: ");
        int soluongnguoitoida = Integer.parseInt(scanner.nextLine()) ;
        System.out.print("Nhập kiểu thuê: ");
        String kieuthue = scanner.nextLine();
        System.out.print("Nhập dịch vụ miễn phí đi kèm: ");
        String dichvumienphidikem= scanner.nextLine();
        Room facility = new Room(tendichvu,dientichsudung, chiphithue,soluongnguoitoida,kieuthue,dichvumienphidikem);
        facilityIntegerMap.put(facility,0);
        System.out.println("Thêm mới Room thành công: ");
    }

}
