package com.amazon.ata.deliveringonourpromise.orderfulfillmentservice;


import com.amazon.ata.deliveringonourpromise.types.Promise;

public interface ServiceInterface {

    /**
     * retrieves promises using customerOrderItemId.
     * @param customerOrderItemId retrievers the customers order item id
     * @return nothing uses everything
     */
    Promise getPromiseByOrderItemId(String customerOrderItemId);

}
