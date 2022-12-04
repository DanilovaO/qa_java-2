import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline = new Feline();
    @Mock
    Lion lion;

    @Test
    public void maleIsNotDefinedTest() throws Exception {
        try {
            new Lion("и виски");
            assert false;
        } catch (Exception exception){
            assert exception.getMessage().equals("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    @Test
    public void getFoodTest2() throws Exception {
        feline.getFood("Хищник");
        Mockito.verify(feline).getFood("Хищник"); // в проверке передали другой аргумент
    }



}









