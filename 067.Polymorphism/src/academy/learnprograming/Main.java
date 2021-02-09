package academy.learnprograming;

class Movie
{
        private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String Plot()
    {
        return  "No Plot Here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie
{
    public Jaws()
    {
        super("Jaws");
    }

    public String Plot()
    {
        return "A Shark eats lots of people";
    }
}
class IndependenceDay extends Movie
{
    public IndependenceDay()
    {
        super("Independence Day");
    }

    @Override
    public String Plot() {
        return "Aliens attempts to take over planet earth";
    }
}
class MazeRunner extends Movie
{
    public MazeRunner()
    {
        super("Maze Runner");
    }

    @Override
    public String Plot() {
        return "Kids try to escape a Maze";
    }
}
class Starwars extends Movie
{
    public Starwars()
    {
        super("Star Wars");
    }

    @Override
    public String Plot() {
        return "Imperial Forces try to take over the universe";
    }
}
class Forgetable extends Movie
{
    public Forgetable()
    {
        super("Forgetable");
    }

    // No PLOT Method
}

public class Main
{
    public static void main(String[] args)
    {
        for (int i = 1; i < 11; i++)
        {
        Movie movie = randomMovie();
        System.out.println("Movie #"+i+" : "+movie.getName()+" \n" +"Plot: "+movie.Plot()+"\n");
        }
    }
public static Movie randomMovie()
{
    int randomNumber = (int) (Math.random()*5)+1;
    System.out.println("Random number generator was: "+randomNumber);
    switch (randomNumber)
    {
        case 1:
            return new Jaws();
        case 2:
            return new IndependenceDay();
        case 3:
            return new MazeRunner();
        case 4:
            return new Starwars();
        case 5:
            return new Forgetable();
    }
    return null;
}

}

