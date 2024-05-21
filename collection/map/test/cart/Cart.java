package collection.map.test.cart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int addQuantity) {
        for (Product products : cartMap.keySet()) {
            if (products.equals(product)) {
                Integer count = cartMap.get(product);
                cartMap.replace(products, count + addQuantity);
                return;
            }
        }
        cartMap.put(product, addQuantity);
    }

    public void printAll() {
        System.out.println("== 모든 상품 출력 ==");
        Set<Map.Entry<Product, Integer>> entrySet = cartMap.entrySet();
        for (Map.Entry<Product, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " 수량: " + entry.getValue());
        }
    }

    public void minus(Product product, int minusQuantity) {

        int integer = cartMap.get(product);
        if (integer - minusQuantity <= 0) {
            cartMap.remove(product);
        } else {
            int count = integer - minusQuantity;
            cartMap.put(product, count);
        }
    }
}

