import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;


    @Test
    public void maleIsNotDefinedTest() throws Exception {
        try {
            new Lion("и виски", feline);
            assert false;
        } catch (Exception exception){
            assert true;
        }
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник"); // в проверке передали другой аргумент
    }



}









