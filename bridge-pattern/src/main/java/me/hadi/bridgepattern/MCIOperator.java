package me.hadi.bridgepattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCIOperator implements OperatorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MCIOperator.class);

    @Override
    public Long getBalance(String id) {
        LOGGER.info("user balance for MCI operator is: ", 1L);
        return 1L;
    }

    @Override
    public Boolean getStatus(String id) {
        LOGGER.info("user status for MCI operator is: ", Boolean.TRUE);
        return Boolean.TRUE;
    }

    @Override
    public Boolean recharge(String order) {
        LOGGER.info("charge is done by MCI operator successfully!");
        return Boolean.TRUE;
    }
}
