import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    private Integer passenger;

    public UberVan(String license, Account driver) {
        super(license, driver);
    }

    public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted,
            ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    /* Polimorfismo */
    @Override /*
               * Override indica que estamos sobreescribiendo el método setPassengers que
               * pertenece a la clase padre Car
               */
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
            this.passenger = passenger;
        } else {
            System.out.println("Debes asignar un valor de pasajeros igual a 6");
        }
    }
}
