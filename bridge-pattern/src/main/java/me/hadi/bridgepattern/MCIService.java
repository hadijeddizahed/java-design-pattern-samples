package me.hadi.bridgepattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCIService extends TopupService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RightelService.class);

    private final OperatorService operatorService;

    public MCIService(OperatorService operatorService) {
        this.operatorService = operatorService;
    }

    @Override
    public OperatorService getOperatorService() {
        return operatorService;
    }
}
