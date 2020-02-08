package me.hadi.decoratorpattern.service.flowerbouquet;

public abstract class FlowerBouquet {

    String description;
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
