package com.amazon.ata.deliveringonourpromise.types;

public class OrderTest {

    public void masteryTaskThree_orderClass_getCustomerOrderItemList_internalStateIsProtectedByDefensiveCopying() {
        // GIVEN: a valid order ID
        String validOrderId = "900-3746401-0000001";
        // WHEN: gets a copy of Customers orderItemList
        // THEN: display a copy of Customers orderItemList
    }

    public void masteryTaskThree_orderClass_internalStateIsNotExposed() {
        // GIVEN
        // WHEN
        // THEN
    }

    public void masteryTaskThree_orderClass_withCustomerOrderItemList_internalStateIsProtectedByDefensiveCopying() {
        // GIVEN: a valid OrderItemList
        Order.builder().withOrderId("900-3746401-0000001");
        Order order = Order.builder().build();
        // WHEN: creates a copy of the original orderItemList
        // THEN: 2 copies of the original orderItemList
    }


}
