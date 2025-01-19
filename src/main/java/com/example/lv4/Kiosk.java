package com.example.lv4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    private final List<Menu> menus;

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {
        // 스캐너 선언
        Scanner sc = new Scanner(System.in);

        // 반복문 시작
        while (true) {
            // List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력
            for (int i = 0; i < menus.size(); i++) {
                Menu menu = menus.get(i);
                System.out.println(i + 1 + ". " + menu.getName());
            }
            System.out.println("0. 종료   | 종료\n");
            System.out.println("메뉴를 선택하세요");

            // 숫자 입력 받기
            int menuChoice = sc.nextInt();
            if (menuChoice < 0 || menuChoice > menus.size()) {
                throw new IllegalArgumentException("잘못된 입력입니다.");
            }
            if (menuChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
            List<MenuItem> menuItems = menus.get(menuChoice - 1).getMenuItems();

            // Menu가 가진 List<MenuItem>을 반복문을 활용하여 햄버거 메뉴 출력
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem menuItem = menuItems.get(i);
                System.out.println((i + 1) + ". " + menuItem.getName() + "   | W " + menuItem.getPrice() + " | " + menuItem.getDescription());
            }
            System.out.println("0. 뒤로가기\n");
            System.out.println("메뉴를 선택하세요");

            // 숫자 입력 받기
            int menuItemChoice = sc.nextInt();
            if (menuItemChoice == 0) {
                continue;
            }
            if (menuItemChoice <= 0 || menuItemChoice > menuItems.size()) {
                throw new IllegalArgumentException("잘못된 입력입니다.");
            }

            // 입력 받은 숫자가 올바르다면 인덱스로 활용해서 접근하기
            MenuItem selectedItem = menuItems.get(menuItemChoice - 1);
            System.out.println(selectedItem.getName() + "를 선택하셨습니다.");
        }
    }
}
