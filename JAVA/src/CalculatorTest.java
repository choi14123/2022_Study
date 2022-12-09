public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.powerOn();
        System.out.println(cal.plus(3, 8));
        System.out.println(cal.divide(5, 2));
        System.out.println(cal.plus(3, 6));
        System.out.println(cal.divide(15, 3));
        cal.powerOff();
    }
}
