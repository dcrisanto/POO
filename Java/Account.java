class Account {
    Integer id;
    String name;
    Integer phone;
    Integer document;
    String email;
    String password;

    public Account(String name, Integer document) { // constructor
        this.name = name;
        this.document = document;
    }
}
