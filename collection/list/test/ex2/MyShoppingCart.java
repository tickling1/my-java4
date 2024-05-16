package collection.list.test.ex2;

import java.util.ArrayList;

public class MyShoppingCart {
    int totalPrice = 0;
    ArrayList<Integer> price = new ArrayList<>();
    ArrayList<String> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item.getName());
        price.add(item.getTotalPrice());
        totalPrice += item.getTotalPrice();
    }

    public void displayItems() {
        System.out.println("장바구니 출력");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("상품명: " + items.get(i) + ", 가격: " + price.get(i));
        }
        System.out.println("전체 가격 합: " + totalPrice);
    }
}
