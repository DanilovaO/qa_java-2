import com.example.Feline;
import org.junit.Test;

public class TestFeline {

    Feline feline = new Feline();




    @Test
    public void TestGetFamily() {
        Feline feline = new Feline();
        assert feline.getFamily().equals("Кошачьи");
    }
    @Test
    public void TestGetKittens() {
        Feline feline = new Feline();
        assert feline.getKittens()==1;
    }
    @Test
    public void TestGetKittensWithKittensCount() {
        Feline feline = new Feline();
        assert feline.getKittens(4)==4;
    }
}