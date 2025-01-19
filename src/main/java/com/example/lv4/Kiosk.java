package com.example.lv3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    private final List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem menuItem = menuItems.get(i);
                System.out.println((i + 1) + ". " + menuItem.getName() + "   | W " + menuItem.getPrice() + " | " + menuItem.getDescription());
            }
            System.out.println("0. 종료   | 종료\n");
            System.out.println("메뉴를 선택하세요");

            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (choice > 0 && choice <= menuItems.size()) {
                MenuItem selectedItem = menuItems.get(choice - 1);
                System.out.println(selectedItem.getName() + "를 선택하셨습니다.");
            } else {
                throw new IllegalArgumentException("잘못된 입력입니다. 메뉴 번호를 확인해주세요.");
            }
        }
    }
}
