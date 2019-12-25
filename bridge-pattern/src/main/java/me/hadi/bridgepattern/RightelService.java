package me.hadi.bridgepattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RightelService extends TopupService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RightelService.class);

    private final OperatorService operatorService;

    public RightelService(OperatorService operatorService) {
        this.operatorService = operatorService;
    }

    @Override
    public OperatorService getOperatorService() {
        return operatorService;
    }
}
