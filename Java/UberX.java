class UberX extends Car { // herencia es con extens
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model) {
        super(license, driver); // super es para referirnos al método constructor de la clase padre
        this.brand = brand;
        this.model = model;
    }

}