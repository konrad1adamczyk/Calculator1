/**
 *
 * Created by Konrad on 2016-01-01.
 */



public class CalcTest {

    @Test
    public void testCalc() {
        SimpleCalculator calc = new SimpleCalculator();

        assertEquals(11, calc.compute(5,"+",6));
        assertEquals(4, calc.compute(2,"*",2));
        assertEquals(2, calc.compute(10,"/",5));
        assertEquals(2, calc.compute(9,"-",7));

    }
}
