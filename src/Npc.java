import java.util.Random;

public class Npc extends Gladiator {
	Random r = new Random();

	public Npc() {
	}

	public void npcStatus(Player p) {
		if (p.level <= 5) {
			this.level = r.ints(1, 6).findFirst().getAsInt();
			this.hp = r.ints(1, 29).findFirst().getAsInt();
			this.str = r.ints(1, 25).findFirst().getAsInt();
			this.dex = r.ints(5, 9).findFirst().getAsInt();
			this.exp = r.ints(3, 10).findFirst().getAsInt();
			this.money = r.ints(3, 10).findFirst().getAsInt();
		} else if (p.level <= 10) {
			this.level = r.ints(6, 11).findFirst().getAsInt();
			this.hp = r.ints(40, 80).findFirst().getAsInt();
			this.str = r.ints(15, 30).findFirst().getAsInt();
			this.dex = r.ints(6, 14).findFirst().getAsInt();
			this.exp = r.ints(20, 40).findFirst().getAsInt();
			this.money = r.ints(10, 20).findFirst().getAsInt();
		} else if (p.level <= 15) {
			this.level = r.ints(11, 16).findFirst().getAsInt();
			this.hp = r.ints(85, 150).findFirst().getAsInt();
			this.str = r.ints(30, 50).findFirst().getAsInt();
			this.dex = r.ints(20, 28).findFirst().getAsInt();
			this.exp = r.ints(40, 60).findFirst().getAsInt();
			this.money = r.ints(20, 40).findFirst().getAsInt();
		} else if (p.level <= 20) {
			this.level = r.ints(16, 21).findFirst().getAsInt();
			this.hp = r.ints(250, 400).findFirst().getAsInt();
			this.str = r.ints(50, 90).findFirst().getAsInt();
			this.dex = r.ints(20, 40).findFirst().getAsInt();
			this.exp = r.ints(50, 90).findFirst().getAsInt();
			this.money = r.ints(35, 60).findFirst().getAsInt();
		} else if (p.level <= 25) {
			this.level = r.ints(21, 26).findFirst().getAsInt();
			this.hp = r.ints(350, 500).findFirst().getAsInt();
			this.str = r.ints(70, 120).findFirst().getAsInt();
			this.dex = r.ints(50, 85).findFirst().getAsInt();
			this.exp = r.ints(90, 120).findFirst().getAsInt();
			this.money = r.ints(80, 150).findFirst().getAsInt();
		} else if (p.level <= 30) {
			this.level = r.ints(26, 31).findFirst().getAsInt();
			this.hp = r.ints(450, 750).findFirst().getAsInt();
			this.str = r.ints(110, 250).findFirst().getAsInt();
			this.dex = r.ints(125, 175).findFirst().getAsInt();
			this.exp = r.ints(90, 150).findFirst().getAsInt();
			this.money = r.ints(100, 150).findFirst().getAsInt();
		} else if (p.level <= 35) {
			this.level = r.ints(31, 36).findFirst().getAsInt();
			this.hp = r.ints(700, 900).findFirst().getAsInt();
			this.str = r.ints(180, 320).findFirst().getAsInt();
			this.dex = r.ints(170, 200).findFirst().getAsInt();
			this.exp = r.ints(200, 300).findFirst().getAsInt();
			this.money = r.ints(200, 350).findFirst().getAsInt();
		} else if (p.level <= 40) {
			this.level = r.ints(36, 41).findFirst().getAsInt();
			this.hp = r.ints(1000, 1300).findFirst().getAsInt();
			this.str = r.ints(250, 400).findFirst().getAsInt();
			this.dex = r.ints(270, 380).findFirst().getAsInt();
			this.exp = r.ints(300, 500).findFirst().getAsInt();
			this.money = r.ints(450, 600).findFirst().getAsInt();
		} else if (p.level <= 45) {
			this.level = r.ints(41, 46).findFirst().getAsInt();
			this.hp = r.ints(1500, 1800).findFirst().getAsInt();
			this.str = r.ints(380, 700).findFirst().getAsInt();
			this.dex = r.ints(400, 450).findFirst().getAsInt();
			this.exp = r.ints(400, 600).findFirst().getAsInt();
			this.money = r.ints(600, 900).findFirst().getAsInt();
		} else if (p.level <= 50) {
			this.level = r.ints(46, 51).findFirst().getAsInt();
			this.hp = r.ints(2000, 3000).findFirst().getAsInt();
			this.str = r.ints(1600, 2500).findFirst().getAsInt();
			this.dex = r.ints(600, 900).findFirst().getAsInt();
			this.exp = r.ints(1000, 1500).findFirst().getAsInt();
			this.money = r.ints(1200, 2000).findFirst().getAsInt();
		}
		npcDisplay();
	}

	public void npcDisplay() {
		System.out.println("Lv:" + this.level + " HP:" + this.hp + " STR:" + this.str + " DEX:" + this.dex);
	}

	public boolean attack(Player p, Armor a) {
		System.out.println("NPCの攻撃");
		int dmg = this.str - a.dex;
		if (dmg < 0)
			dmg = 0;
		System.out.println(dmg + "のダメージを与えた。");
		p.hp -= dmg;
		return p.hp <= 0;
	}

	public boolean attack(Player p) {
		System.out.println("NPCの攻撃");
		int dmg = this.str - p.armor.dex;
		if (dmg < 0)
			dmg = 0;
		p.hp -= dmg;
		System.out.println(dmg + "のダメージを与えた。" + "あなた:HP" + p.hp);

		return p.hp <= 0;
	}
}
