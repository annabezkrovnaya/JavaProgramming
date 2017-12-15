package ua.org.oa.annabezkrovnaya.task1;


public class AppCar {

    public static void main(String[] args) {

        System.out.println("Task 1.2: Anonymous Inner classes ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //override method toString with Anonymous class
        System.out.println(new Car("Suzuki SX4", "beige", 1500, 15000){
            @Override
            public String toString() {
                return "My car " + getBrand() + " has " + getColor() + " color. It's super car and I don't tell you how does it cost!";
            }
        });

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //override method equals with Anonymous class
        System.out.println(new Car("Suzuki SX4", "beige", 1500, 15000) {
            @Override
            public boolean equals(Object o) {
                return true;
            }
        });

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
