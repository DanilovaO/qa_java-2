import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCat {

    @Test
    public void TestGetSound() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        assert cat.getSound().equals("Мяу");;
    }

    @Test
    public void TestGetFood() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> l = new ArrayList();
        l.add("Животные");
        l.add("Птицы");
        l.add("Рыба");

        assert cat.getFood().equals(l);
    }


}
