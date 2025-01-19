package com.example.lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>(
                List.of(
                        new MenuItem("ShackBurger", 6.5, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                        new MenuItem("SmokeBurger", 8.5, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                        new MenuItem("CheeseBurger", 5.5, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                        new MenuItem("Hamburger", 4.5, "비프패티를 기반으로 야채가 들어간 기본버거")
                )
        );

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
