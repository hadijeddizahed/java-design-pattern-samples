package me.hadi.bridgepattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BridgePatternApplication {

    public static void main(String[] args) {

        SpringApplication.run(BridgePatternApplication.class, args);

        var irancell = new IrancellService(new IrancellOperator());

        irancell.saveRequestData();
        irancell.login();
        irancell.debit();
        irancell.getOperatorService().getBalance("1");
        irancell.getOperatorService().getStatus("1");
        irancell.getOperatorService().recharge("11");

    }

}
