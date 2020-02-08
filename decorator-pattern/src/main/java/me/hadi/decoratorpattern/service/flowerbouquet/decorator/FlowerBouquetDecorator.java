package me.hadi.decoratorpattern.service.flowerbouquet.decorator;

import me.hadi.decoratorpattern.service.flowerbouquet.FlowerBouquet;
import org.springframework.stereotype.Component;

@Component
public abstract class FlowerBouquetDecorator extends FlowerBouquet {

    public abstract double cost();
}
