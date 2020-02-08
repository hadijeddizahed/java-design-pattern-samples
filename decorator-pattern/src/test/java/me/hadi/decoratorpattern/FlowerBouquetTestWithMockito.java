package me.hadi.decoratorpattern;

import me.hadi.decoratorpattern.service.flowerbouquet.RoseBouquet;
import me.hadi.decoratorpattern.service.flowerbouquet.decorated.GlitterDecorate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FlowerBouquetTestWithMockito {



    @Mock
    private RoseBouquet flowerBouquet;

    @InjectMocks
    private GlitterDecorate glitterDecorate;


    @Test
    public void test_roseBouquet_with_glitter() {

        Mockito.when(flowerBouquet.cost()).thenReturn(12d);
        double cost = glitterDecorate.cost();
        Assertions.assertEquals(16d, cost);

    }
}
