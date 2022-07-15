class Main {
    public static void main(String[] args) {
        System.out.println("Hola Dorelly");
        Car car = new Car("AMQ", new Account("Carlos Herrera", 45763998)); // objeto
        car.passengers = 4;
        car.printDataCar();

        Car car2 = new Car("QWM123", new Account("Fabian Cortez", 38653468));
        car2.passengers = 3;
        car2.printDataCar();

    }
}