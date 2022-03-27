package controllers;

import models.Customer;
import services.lmpl.CustomerServicelmpl;
import services.lmpl.EmployeeServicelmpl;
import services.lmpl.FacilityServicelmpl;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class FuramaController {
    public  FuramaController() {};

     public void displayMainMenu() {

        Scanner scanner = new Scanner(System.in);
        int choiceNumber;
        int choice =0;
        while (true) {
            System.out.println(" MENU FURAMARESORT");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Managerment");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");

            do {
                System.out.printf("Chọn chức năng mà bạn muốn: ");
                choiceNumber = scanner.nextInt();
            }
            while ((choiceNumber < 1) || (choiceNumber > 6));
            switch (choiceNumber) {
                case 1: displayEmployeeManagement();
                    break;
                case 2: displayCustomerManagement();
                    break;
                case 3:displayFacilityManagement();
                    break;
                case 4: displayBookingManagerment();
                    break;
                case 5: displayPromotionManagement();
                    break;
                case 6:
                    System.out.println(" Bạn đã thoát khỏi chương trình !!!");
                    break;


            }
        }

    }

    private void displayEmployeeManagement() {
        Scanner scanner = new Scanner(System.in);
        EmployeeServicelmpl employeeServicelmpl=new EmployeeServicelmpl();
        int choiceNumber;
        while (true) {
            System.out.println(" MENU displayEmployeeManagement ");
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn main menu\n"

            );
            do {
                System.out.println("Chọn chức năng bạn muôn");
                choiceNumber = scanner.nextInt();
            }
            while ((choiceNumber) < 1 || (choiceNumber > 4));
            switch (choiceNumber) {
                case 1:employeeServicelmpl.display();
                break
                    ;
                case 2:employeeServicelmpl.addNew();
               break;
                case 3:employeeServicelmpl.edit();
                    ;
                case 4:employeeServicelmpl.delete();
                    ;
                    return;
            }
        }

    }

    private void displayCustomerManagement() {
        CustomerServicelmpl customerServicelmpl=new CustomerServicelmpl();
        Scanner scanner = new Scanner(System.in);
        int choiceNumber;
        while (true) {
            System.out.println(" MENU displayCustomerManagement ");
            System.out.println("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n"
            );
            do {
                System.out.println("Chọn chức năng bạn muốn: ");
                choiceNumber = scanner.nextInt();
            }
            while ((choiceNumber) < 1 || (choiceNumber > 4));
            switch (choiceNumber) {
                case 1: customerServicelmpl.display();
                    ;
                case 2:customerServicelmpl.addNew();
                    ;
                case 3:customerServicelmpl.edit();
                    ;
                case 4:customerServicelmpl.delete();
                    ;
                    return;
            }
        }

    }
    private void displayFacilityManagement () {
         FacilityServicelmpl facilityServicelmpl = new FacilityServicelmpl();
        Scanner scanner = new Scanner(System.in);
        int choiceNumber;
        while (true) {
            System.out.println(" MENU displayFacilityManagement ");
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n"
            );
            do {
                System.out.println("Chọn chức năng bạn muốn: ");
                choiceNumber = scanner.nextInt();
            }
            while ((choiceNumber) < 1 || (choiceNumber > 4));
            switch (choiceNumber) {
                case 1: facilityServicelmpl.display();
                    ;
                case 2: addNewFacilityMenu();
                    ;
                case 3:
                    ;
                case 4:
                    ;
                    return;
            }
        }

    }

    public static void addNewFacilityMenu() {
        FacilityServicelmpl facilityServicelmpl = new FacilityServicelmpl();
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while(check) {
            System.out.println("1. Add new villa");
            System.out.println("2. Add new room");
            System.out.println("3. Add new house");
            System.out.println("4. Back to menu");
            int choiceNumber = Integer.parseInt(scanner.nextLine());
            switch (choiceNumber) {
                case 1: facilityServicelmpl.addNewVilla() ;
                    break;
                case 2: facilityServicelmpl.addNewRoom(); ;
                    break;
                case 3: facilityServicelmpl.addNewHouse() ;
                    break;
                case 4: return;
            }
        }

    }
    private void displayBookingManagerment () {
        Scanner scanner = new Scanner(System.in);
        int choiceNumber;
        while (true) {
            System.out.println(" MENU displayBookingManagerment ");
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new constracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n"
            );
            do {
                System.out.println("Chọn chức năng bạn muốn: ");
                choiceNumber = scanner.nextInt();
            }
            while ((choiceNumber) < 1 || (choiceNumber > 6));
            switch (choiceNumber) {
                case 1:
                    ;
                case 2:
                    ;
                case 3:
                    ;
                case 4:
                    ;
                case 5:
                    ;
                case 6:
                    ;
                    return;
            }
        }
    }
    private void displayPromotionManagement () {
        Scanner scanner = new Scanner(System.in);
        int choiceNumber;
        while (true) {
            System.out.println(" MENU displayPromotionManagement ");
            System.out.println("1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n"
            );
            do {
                System.out.println("Chọn chức năng bạn muốn: ");
                choiceNumber = scanner.nextInt();
            }
            while ((choiceNumber) < 1 || (choiceNumber > 3));
            switch (choiceNumber) {
                case 1:
                    ;
                case 2:
                    ;
                case 3:
                    ;
                    return;
            }
        }
    }
}
