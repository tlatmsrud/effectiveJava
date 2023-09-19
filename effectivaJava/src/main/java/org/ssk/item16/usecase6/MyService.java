package org.ssk.item16.usecase6;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-19
 * description  :
 */
public class MyService {

    public void createOrder(Order order){

        isExistStock(order.getProductNum()); // private 메서드 호출
        // 주문 생성 로직
    }

    public Order selectOrder(int orderNum){
        // 주문 조회 로직
        return new Order();
    }

    private boolean isExistStock(int productNum){
        // 재고 확인 로직
        return true;
    }
}
