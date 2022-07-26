class Account {

    constructor(name, document, email, password) {
        this.id;
        this.name = name;
        this.phone;
        this.document = document;
        this.email = email;
        this.password = password;
    }

    dataUser() {
        console.log(`Mis datos son: 
        nombre: ${this.name}
        dni: ${this.document}
        email: ${this.email}
        password: ${this.password}`
        );
    }
    
}