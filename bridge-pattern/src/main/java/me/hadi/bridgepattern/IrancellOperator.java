package me.hadi.bridgepattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IrancellOperator implements OperatorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(IrancellOperator.class);

    @Override
    public Long getBalance(String id) {
        LOGGER.info("user balance for Irancell operator is: ", 1L);
        return 2L;
    }

    @Override
    public Boolean getStatus(String id) {
        LOGGER.info("user status for Irancell operator is: ", Boolean.TRUE);
        return Boolean.TRUE;
    }

    @Override
    public Boolean recharge(String order) {
        LOGGER.info("charge is done by Irancell operator successfully!");
        return Boolean.TRUE;
    }
}
