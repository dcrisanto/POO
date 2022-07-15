from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Dorelly")
    car = Car("AMQ", Account("Alonso Vasquez", 76543567))
    car.passengers = 4
    print(vars(car)) 
    print(vars(car.driver)) 

    car2 = Car("WQG", Account("Francisco Zapata", 98765432))
    car2.passengers = 3
    print(vars(car2))
    print(vars(car2.driver))