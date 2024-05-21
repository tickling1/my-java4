package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class CartRef {

    // cartMap 생성
    private Map<Product, Integer> cartMap = new HashMap<>();
    
    
    // add 메서드 선언
    public void add(Product product, int addQuantity) {
        // cartMap에서 product가 없으면 기본 값 0을 초기화(product에 hash, equals 있어야함)
        int existingQuantity = cartMap.getOrDefault(product, 0);
        // 맵 자료구조에 <Product, Integer> 형태로 저장
        cartMap.put(product, existingQuantity + addQuantity);
    }

    // minus 메서드 선언 매개변수로 product 객체와 감소할 수량을 가지고 있음
    public void minus(Product product, int minusQuantity) {
        // 자료구조에 있는지 확인하고 없으면 0
        int existingQuantity = cartMap.getOrDefault(product, 0);
        
        // 자료구조에 존재하던 수량과 매개변수로 가져온 감소할 수량을 뺌
        int newQuantity = existingQuantity - minusQuantity;
        // 감소한 값이 0보다 작다면 키값을 이용해 삭제
        if (newQuantity <= 0) {
            cartMap.remove(product);
            // 아니면 감소한 값으로 새로운 데이터 추가
        } else {
            cartMap.put(product, newQuantity);
        }
    }
    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량: " +
                    entry.getValue());
        }
    }
}
