import org.junit.jupiter.api.Assertions;
public class UnitTestCalculator {
    public void sumTest(){
        Assertions.assertEquals(Calculator.sum(2, 3), 5);
    }

    public void differenceTest(){
        Assertions.assertEquals(Calculator.difference(2, 3), -1);
    }

    public void multiplicationTest(){
        Assertions.assertEquals(Calculator.multiplication(2, 3), 6);
    }

    public void divisionTest(){
        Assertions.assertEquals(Calculator.division(6, 3), 2);
    }
}
