package me.hadi.decoratorpattern;


import me.hadi.decoratorpattern.service.flowerbouquet.RoseBouquet;
import me.hadi.decoratorpattern.service.flowerbouquet.decorated.GlitterDecorate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FlowerBouquetTest {

    private RoseBouquet roseBouquet;
    private GlitterDecorate glitterDecorate;

    @BeforeEach
    void init() {
        roseBouquet = new RoseBouquet();
        glitterDecorate = new GlitterDecorate(roseBouquet);
    }


    @Test
    public void test_roseBouquet_with_glitter() {

        double cost = glitterDecorate.cost();
        Assertions.assertEquals(16d, cost);

    }
}
