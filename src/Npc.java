import java.util.Random;

public class Npc extends Gladiator {
	Random r = new Random();

	public Npc() {
	}

	public void npcStatus(Player p) {
		if (p.level <= 5) {
			this.level = r.ints(1,5).findFirst().getAsInt();
			this.hp = r.ints(1,29).findFirst().getAsInt();
			this.str = r.ints(1,25).findFirst().getAsInt();
			this.dex = r.ints(1,12).findFirst().getAsInt();
			this.exp = r.ints(3,10).findFirst().getAsInt();
			this.money = r.ints(3,10).findFirst().getAsInt();
		}else if (p.level <= 10) {
			this.level = r.nextInt(10) + 6;
			this.hp = r.nextInt(99) + 50;
			this.str = r.nextInt(40) + 20;
			this.dex = r.nextInt(24) + 12;
			this.exp = r.nextInt(40) + 20;
			this.money = r.nextInt(20) + 10;
		}else if (p.level <= 15) {
			this.level = r.nextInt(15) + 11;
			this.hp = r.nextInt(150) + 85;
			this.str = r.nextInt(60) + 30;
			this.dex = r.nextInt(30) + 20;
			this.exp = r.nextInt(60) + 40;
			this.money = r.nextInt(40) + 20;
		}else if (p.level <= 20) {
			this.level = r.nextInt(20) + 16;
			this.hp = r.nextInt(400) + 250;
			this.str = r.nextInt(130) + 60;
			this.dex = r.nextInt(65) + 40;
			this.exp = r.nextInt(90) + 50;
			this.money = r.nextInt(60) + 35;
		}else if (p.level <= 25) {
			this.level = r.nextInt(25) + 21;
			this.hp = r.nextInt(29) + 1;
			this.str = r.nextInt(25) + 1;
			this.dex = r.nextInt(12) + 1;
			this.exp = r.nextInt(4) + 1;
			this.money = r.nextInt(5) + 1;
		}else if (p.level <= 30) {
			this.level = r.nextInt(30) + 26;
			this.hp = r.nextInt(29) + 1;
			this.str = r.nextInt(25) + 1;
			this.dex = r.nextInt(12) + 1;
			this.exp = r.nextInt(4) + 1;
			this.money = r.nextInt(5) + 1;
		}else if (p.level <= 35) {
			this.level = r.nextInt(35) + 31;
			this.hp = r.nextInt(29) + 1;
			this.str = r.nextInt(25) + 1;
			this.dex = r.nextInt(12) + 1;
			this.exp = r.nextInt(4) + 1;
			this.money = r.nextInt(5) + 1;
		}else if (p.level <= 40) {
			this.level = r.nextInt(40) + 36;
			this.hp = r.nextInt(29) + 1;
			this.str = r.nextInt(25) + 1;
			this.dex = r.nextInt(12) + 1;
			this.exp = r.nextInt(4) + 1;
			this.money = r.nextInt(5) + 1;
		}else if (p.level <= 45) {
			this.level = r.nextInt(45) + 41;
			this.hp = r.nextInt(29) + 1;
			this.str = r.nextInt(25) + 1;
			this.dex = r.nextInt(12) + 1;
			this.exp = r.nextInt(4) + 1;
			this.money = r.nextInt(5) + 1;
		}else if (p.level <= 50) {
			this.level = r.nextInt(100) + 46;
			this.hp = r.nextInt(29) + 1;
			this.str = r.nextInt(25) + 1;
			this.dex = r.nextInt(12) + 1;
			this.exp = r.nextInt(4) + 1;
			this.money = r.nextInt(5) + 1;
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
