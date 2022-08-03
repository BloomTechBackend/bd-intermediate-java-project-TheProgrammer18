package com.amazon.ata.deliveringonourpromise.orderfulfillmentservice;

import com.amazon.ata.deliveringonourpromise.types.Promise;
import com.amazon.ata.orderfulfillmentservice.OrderFulfillmentService;
import com.amazon.ata.orderfulfillmentservice.OrderPromise;

public class OrderFulfillmentServiceClient implements ServiceInterface {

    OrderFulfillmentService oFService;
    /**
     * retrieves ofs services.
     * @param service - gets the type of services needed
     */
    public OrderFulfillmentServiceClient(OrderFulfillmentService service) {
        this.oFService = service;
    }

    /**
     * creates a promise using customerOrderItemId.
     * @param customerOrderItemId retrievers the customers order item id
     * @return returns a Promise
     */
    public Promise getPromiseByOrderItemId(String customerOrderItemId) {
        OrderPromise deliveryPromise = oFService.getOrderPromise(customerOrderItemId);

        if (null == deliveryPromise) {
            return null;
        }

        return Promise.builder()
                .withPromiseLatestArrivalDate(deliveryPromise.getPromiseLatestArrivalDate())
                .withCustomerOrderItemId(deliveryPromise.getCustomerOrderItemId())
                .withPromiseLatestShipDate(deliveryPromise.getPromiseLatestShipDate())
                .withPromiseEffectiveDate(deliveryPromise.getPromiseEffectiveDate())
                .withIsActive(deliveryPromise.isActive())
                .withPromiseProvidedBy(deliveryPromise.getPromiseProvidedBy())
                .withAsin(deliveryPromise.getAsin())
                .build();
    }

}
