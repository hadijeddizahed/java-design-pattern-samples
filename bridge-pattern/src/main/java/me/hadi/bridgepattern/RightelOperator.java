package me.hadi.bridgepattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RightelOperator implements OperatorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RightelOperator.class);


    @Override
    public Long getBalance(String id) {
        LOGGER.info("user balance for RIGHTEL operator is: ", 1L);
        return 1L;
    }

    @Override
    public Boolean getStatus(String id) {
        LOGGER.info("user status for RIGHTEL operator is: ", Boolean.TRUE);
        return Boolean.TRUE;
    }

    @Override
    public Boolean recharge(String order) {
        LOGGER.info("charge is done by RIGHTEL operator successfully!");
        return Boolean.TRUE;
    }
}
