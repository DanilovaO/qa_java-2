import com.example.Feline;
import org.junit.Test;

public class TestFeline {

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        assert feline.getFamily().equals("Кошачьи");
    }
    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        assert feline.getKittens()==1;
    }
    @Test
    public void testGetKittensWithKittensCount() {
        Feline feline = new Feline();
        assert feline.getKittens(4)==4;
    }
}