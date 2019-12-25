package me.hadi.bridgepattern;

public interface OperatorService {

    Long getBalance(String id);

    Boolean getStatus(String id);

    Boolean recharge(String order);

}
