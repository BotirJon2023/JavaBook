package org.example;

public class Vehicle2 {

    int passengers; // количество пассажиров
    int fuelcap; // емкость топливного бака
    int mpg; // потребление топлива в милях на галлон

    // Отображение дальности поездки транспортного средства
    void range() {

        System.out.println("Дальность - " + fuelcap * mpg + " миль.");

        class AddMeth {
            public static void main(String args[]) {
                Vehicle2 minivan = new Vehicle2();
                Vehicle2 sportscar = new Vehicle2();
                int range1, range2;

// Присваивание значений полям объекта minivan
                minivan.passengers = 7;
                minivan.fuelcap = 16;
                minivan.mpg = 21;
// Присваивание значений полям объекта sportscar
                sportscar.passengers = 2;
                sportscar.fuelcap = 14;
                sportscar.mpg = 12;

                System.out.print("Мини-фургон может перевезти " +
                        minivan.passengers + " пассажиров. ");
                minivan.range(); // отображение информации о дальности
// поездки мини-фургона
                System.out.print("Спортивный автомобиль может перевезти " +
                        sportscar.passengers + " пассажиров. ");
                sportscar.range(); // отображение дальности поездки
// спортивного автомобиля
            }
        }
    }
}
