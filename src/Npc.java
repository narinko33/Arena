import java.util.Random;

public class Npc extends Gladiator {
	Random r = new Random();

	public Npc() {
	}

	public void npcStatus(Player p) {
		if (p.level <= 5) {
			this.level = r.nextInt(5) + 1;
			this.hp = r.nextInt(10) + 1;
			this.str = r.nextInt(10) + 1;
			this.dex = r.nextInt(5) + 1;
			this.exp = r.nextInt(3) + 1;
			this.money = r.nextInt(4) + 1;
		}
		npcDisplay();
	}

	public void npcDisplay() {
		System.out.println("Lv:" + this.level + " HP:" + this.hp + " STR:" + this.str + " DEX:" + this.dex);
	}

	public boolean attack(Player p, Armor a) {
		System.out.println("NPCの攻撃");
		int dmg = this.str - a.dex;
		if(dmg < 0)dmg = 0;
		System.out.println(dmg + "のダメージを与えた。");
		p.hp -= dmg;
		return p.hp <= 0;
	}
}
