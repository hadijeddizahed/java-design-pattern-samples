package me.hadi.decoratorpattern.service.flowerbouquet;


import org.springframework.stereotype.Component;

@Component
public class RoseBouquet extends FlowerBouquet{
    public RoseBouquet(){
        description = "Rose bouquet";
    }
    public  double cost(){
        return 12.0;
    }
}
