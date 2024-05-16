package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items = new ArrayList<>();


    public void addItem(Item item) {
        items.add(item);
    }
    int totalPrice = 0;
    public void displayItems() {
        System.out.println("장바구니 출력");
        for (Item item : items) {
            System.out.println("상품: " + item.getName() + ", 가격: " + item.getTotalPrice());
            totalPrice += item.getTotalPrice();
        }
        System.out.println("전체 가격 합: " + totalPrice);
    }
}
