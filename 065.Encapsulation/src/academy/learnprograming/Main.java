package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
//	Player player = new Player();
//	player.name = "Satyam";
//	player.health = 20;
//	player.weapon = "Sword";
//
//	int damage = 10;
//	player.looseHeath(damage);
//	System.out.println("Remaining Health = "+player.healthRemaining());
//
//	damage = 11;
//	player.looseHeath(damage);
//	System.out.println("Remaining Health = "+player.healthRemaining());

		EnhancedPlayer player = new EnhancedPlayer("Satyam",200,"Sword");
		System.out.println("Remaining Health = "+player.getHitPoints());
    }
}
