
// create a base class called car
//it should have a few fields that would be appropriate for a generic  car class
// engine, cylinders, wheels, etc
// constructor should initialize cylinders(number of) and name, and set wheels
//and engine to true. Cylinders and names would be passed  parameters
//create appropriate getters
//
//create some methods like StartEngine,accelerate, and brake
//
//show a message for each in the base class
//Now create 3 sub classes for your favourite vehicles
// overide the appropriate method to demonstrate polymorphism in use
// put all classes in one java file
  class Car {
      private boolean engine;
      private int cylinders;
      private String name;
      private int wheels;

      public Car (int cylinders, String name) {
          this.cylinders = cylinders;
          this.name = name;
          this.wheels = 4;
          this.engine = true;
      }
      public String starttEngine() {
          return "Car -> startEngine()";
      }
      public int getCylinders() {
          return cylinders;
      }
      public String getName() {
          return name;
      }
      public int getWheels() {
          return wheels;
      }
      public String accelerate() {
          return "Car -> accelerate";
      }
      public String brake() {
          return "Car -> brake";
      }

      class Mistsubishi extends Car {
          public Mistsubishi(int cylinders, String name) {
              super(cylinders, name);
          }

          @java.lang.Override
          public String brake() {
              return "Mistsubishi -> brake()";
          }

          @java.lang.Override
          public String accelerate() {
              return "Mistsubishi -> accelerate()";
          }

          @java.lang.Override
          public String starttEngine() {
              return " Mistsubishi -> starttEngine()";
          }
      }
  }
public class Main2 {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.starttEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}