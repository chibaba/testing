
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
  }
public class Main2 {
    public static void main(String[] args) {
    }
}