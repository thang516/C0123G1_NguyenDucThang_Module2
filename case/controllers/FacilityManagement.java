package controllers;

import services.lpml.FacilityService;
import services.lpml.HouseService;
import services.lpml.RoomService;
import services.lpml.VillaService;

import java.util.Scanner;

public class FacilityManagement {
    public static void displayMenu() {
        FacilityService facilityService = new FacilityService();
        HouseService houseService = new HouseService();
        VillaService villaService = new VillaService();
        RoomService roomService = new RoomService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Facility Management");
        System.out.println("--------------------");
        boolean flag3 = true;
        do {
            System.out.println("Bạn có thể chọn thêm  chức năng " +
                    "\n 1.Display list facility" +
                    "\n 2.Add new facility" +
                    "\n 3.Display list facility maintenance" +
                    "\n 4. Return main menu ");
            int choosen3 = Integer.parseInt(scanner.nextLine());
            switch (choosen3) {
                case 1:
                    System.out.println("Display list facility");
                    System.out.println("--------------------");
                    facilityService.display();
                    houseService.display();
                    roomService.display();
                    villaService.display();
                    break;
                case 2:
                    System.out.println("Add new facility ");
                    System.out.println("--------------------");
                    boolean flag = true;
                    do {
                        System.out.println(" Chọn chức năng add " +
                                "\n 1.Add New Villa " +
                                "\n 2. Add New House" +
                                "\n 3.Add New Room " +
                                "\n 4. Back to menu ");
                        int choose = Integer.parseInt(scanner.nextLine());
                        switch (choose) {
                            case 1:
                                System.out.println("1.Add New Villa ");
                                villaService.add();
                                facilityService.updateMaintain("villa");
                                villaService.addVillaCsv();

                                break;
                            case 2:
                                System.out.println("2.Add New House ");
                                houseService.add();
                                facilityService.updateMaintain("house");
                                houseService.updateRepository();

                                break;
                            case 3:
                                System.out.println("3.Add New Room ");
                                roomService.add();
                                facilityService.updateMaintain("room");
                                roomService.addRoomCsv();

                                break;
                            default:
                                System.out.println("Back to menu");
                                System.out.println("--------------------");
                                flag = false;
                                break;
                        }
                    }
                    while (flag);
                    facilityService.add();
                    break;
                case 3:
                    System.out.println("Display list facility maintenance ");
                    System.out.println("--------------------");
                    facilityService.displayMaintain();
                    break;
                default:
                    System.out.println("Return menu");
                    System.out.println("--------------------");
                    facilityService.updateRepository();
                    flag3 = false;
                    break;
            }
        }
        while (flag3);
    }
}
