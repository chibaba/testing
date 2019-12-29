

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
}
public class Main {
    public static void main(String[] args) {

    }
}