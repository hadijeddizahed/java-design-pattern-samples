package me.hadi.decoratorpattern;


import me.hadi.decoratorpattern.service.flowerbouquet.FlowerBouquet;
import me.hadi.decoratorpattern.service.flowerbouquet.OrchidBouquet;
import me.hadi.decoratorpattern.service.flowerbouquet.RoseBouquet;
import me.hadi.decoratorpattern.service.flowerbouquet.decorated.GlitterDecorate;
import me.hadi.decoratorpattern.service.flowerbouquet.decorated.PaperWrapper;
import me.hadi.decoratorpattern.service.flowerbouquet.decorated.RibbonBow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FlowerBouquetTest {

    private FlowerBouquet roseBouquet;
    private FlowerBouquet orchidBouquet;
    private GlitterDecorate glitterDecorate;
    private PaperWrapper paperWrapper;

    private RibbonBow ribbonBow;

    @BeforeEach
    void init() {
        roseBouquet = new RoseBouquet();
        orchidBouquet = new OrchidBouquet();


        paperWrapper = new PaperWrapper(roseBouquet);
        glitterDecorate = new GlitterDecorate(roseBouquet);

        ribbonBow = new RibbonBow(orchidBouquet);
    }


    @Test
    public void test_roseBouquet_with_glitter() {

        double cost = glitterDecorate.cost();
        Assertions.assertEquals(16d, cost);

    }

    @Test
    public void test_roseBouquet_with_paperWrapper() {

        double cost = paperWrapper.cost();
        Assertions.assertEquals(15d, cost);

    }

    @Test
    public void test_orchidBouquet_with_ribbonRow() {

        double cost = ribbonBow.cost();
        Assertions.assertEquals(35.5, cost);

    }
}
