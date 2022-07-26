import java.sql.Array;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Dorelly");
        Car car = new Car("AMQ", new Account("Carlos Herrera", 45763998)); // objeto
        // car.passengers = 4; no se puede acceder a la propiedad passengers debido a
        // que esta definido como private es decir sólo acceso a nivel de la clase.
        car.printDataCar();

        Car car2 = new Car("QWM123", new Account("Fabian Cortez", 38653468));
        // car2.passengers = 3;
        car2.printDataCar();

        UberX uber = new UberX("APOLK", new Account("Patricia Huaman", 47897834), "Chevrolet", "Sparl");
        /*
         * Se puede acceder debido a que el método es público. Se el envía el valor para
         * la propiedad passenger
         */
        uber.setPassenger(4);
        uber.printDataCar();

        UberVan uberVan1 = new UberVan("APED", new Account("Fabiola Mendoza", 45769828));
        uberVan1.setPassenger(6);
        uberVan1.printDataCar();

    }
}