public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setGas(10, "부릉이");
        boolean gasState = car.isLeftFas();
        if (gasState) {
            System.out.println("출발합니다.");
            car.run();
        }
        if (car.isLeftFas()) {
            System.out.println("gas를 주입할 필요가 없습니다.");
        } else {
            System.out.println("gas를 주입하세요.");
        }
    }
}
