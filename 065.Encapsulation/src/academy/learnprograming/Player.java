package academy.learnprograming;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void  looseHeath(int damage)
    {
        this.health = this.health-damage;
        if(this.health <=0 )
        {
            System.out.println("Player Knocked OUT");
        }
    }
    public int healthRemaining()
    {
        return health;
    }
}
