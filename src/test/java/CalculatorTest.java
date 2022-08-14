import com.yl.junit5.demo.service.Calculator;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {
    Calculator ca=new Calculator();
    @ParameterizedTest
    @CsvSource({"1,2","5,6"})
    @Tag("add")
    void add(int a,int b) {
        System.out.println(ca.add(a,b));
    }

    @ParameterizedTest
    @CsvSource({"1,2","5,6"})
    @Tag("sub")
    void sub(int a,int b) {
        System.out.println(ca.sub(a,b));
    }
}