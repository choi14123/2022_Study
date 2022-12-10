public class Car {

    int gas;
    String carName;

    void setGas(int gas, String carName) {
        this.gas = gas;
        this.carName = carName;
    }

    boolean isLeftFas() {
        if (gas == 0) {
            System.out.println(carName + " gas가 없습니다.");
            return false;
        }
        System.out.println(carName + " gas가 있습니다.");
        return true;
    }

    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println(carName + " 달립니다. (gas 잔량 : " + gas + ")");
                gas -= 1;
            } else {
                System.out.println(carName + " 멈춥니다. (gas 잔량 : " + gas + ")");
                return;
            }
        }
    }
}
