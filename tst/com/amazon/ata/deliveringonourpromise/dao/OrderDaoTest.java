package com.amazon.ata.deliveringonourpromise.dao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderDaoTest {

    private OrderDao dao;

    @Test
    public void get_forKnownOrderId_returnsOrder() {
        // GIVEN
        String ValidOrderID = "900-3746401-0000001";

        //WHEN
        //THEN
        assertEquals(null, dao.get("900-3746401-0000001"), "Expected Not null got: ");

    }
}
