

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot() {
        return "No plot here";
    }
}
class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

public String plot() {
    return "shark eats lots of people";
}
}
 class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("IndependemceDay");
    }
    @Override
    public String plot() {
        return ("the aliens are here already");
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("MazeRunner");
    }
    @Override
    public String plot() {
        return("apparently we are runnly forward");
    }
}
class StarWars extends Movie {
    public StarWars() {
        super("StarWars");
    }
    @Override
    public String plot(){
        return ("our early phanatasis");
    }
}
class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }
    // write overide here
}
public class Main {
    public static void main(String[] args) {

    }
    public static Movie randoMovie() {
    int randomNumber = (int)(Math.random() * 5) + 1;
    System.out.println("Random number generated was: " + randomNumber);
    switch (randomNumber) {
        case 1:
        return new Jaws();
        case 2:
        return  new IndependenceDay();
        case 3:
        return new MazeRunner();
        case 4:
        return new StarWars();
        case 5:
        return new Forgetable();

    }
     return null;
}
}