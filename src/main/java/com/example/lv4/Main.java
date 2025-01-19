package com.example.lv4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu burgers = new Menu("BURGERS",
                new ArrayList<>(
                        List.of(
                                new MenuItem("ShackBurger", 6.5, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                                new MenuItem("SmokeBurger", 8.5, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                                new MenuItem("CheeseBurger", 5.5, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                                new MenuItem("Hamburger", 4.5, "비프패티를 기반으로 야채가 들어간 기본버거")
                        )
                )
        );
        Menu drinks = new Menu("DRINKS", new ArrayList<>(
                List.of(
                        new MenuItem("Coke", 1.5, "콜라"),
                        new MenuItem("Sprite", 1.5, "스프라이트"),
                        new MenuItem("Fanta", 1.5, "환타"),
                        new MenuItem("Lemonade", 2.0, "레몬에이드")
                )
        ));
        Menu deserts = new Menu("DESERTS", new ArrayList<>(
                List.of(
                        new MenuItem("ShackSundae", 3.5, "초코, 바닐라 아이스크림에 월넛, 쉑소스가 들어간 선데이"),
                        new MenuItem("ShackShake", 4.0, "초코, 바닐라, 카라멜 세가지 맛 중 선택 가능한 밀크쉐이크")
                )
        ));

        Kiosk kiosk = new Kiosk(
                List.of(burgers, drinks, deserts)
        );
        kiosk.start();
    }
}
