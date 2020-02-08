package me.hadi.decoratorpattern.service.flowerbouquet.decorated;

import lombok.RequiredArgsConstructor;
import me.hadi.decoratorpattern.service.flowerbouquet.FlowerBouquet;
import me.hadi.decoratorpattern.service.flowerbouquet.decorator.FlowerBouquetDecorator;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GlitterDecorate extends FlowerBouquetDecorator {

    private final FlowerBouquet flowerBouquet;

    public String getDescription() {
        return flowerBouquet.getDescription() + ", glitter";
    }

    public double cost() {
        return 4 + flowerBouquet.cost();
    }

}
