package me.hadi.bridgepattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class TopupService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TopupService.class);

    public void saveRequestData() {
        LOGGER.info("request data was saved...!");
    }

    public Boolean login() {
        LOGGER.info("login is done successfully...");
        return Boolean.TRUE;
    }

    public String debit() {
        LOGGER.info("debit is done successfully...");
        return "success";
    }

    public abstract OperatorService getOperatorService();
}
