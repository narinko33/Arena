import java.util.Random;

public class Npc extends Gladiator {
	Random r = new Random();

	public Npc() {
	}

	public void npcStatus(Player p) {
		if (p.level <= 5) {
			this.level = r.nextInt(5);
			this.hp = r.nextInt(50);
			this.str = r.nextInt(10);
			this.dex = r.nextInt(15);
			this.exp = r.nextInt(3);
			this.money = r.nextInt(4);
		}
	}

	public void npcDisplay() {
		System.out.println("Lv:" + this.level + " HP:" + this.hp + " STR:" + this.str + " DEX:" + this.dex);
	}

	public void attack() {

	}
}
