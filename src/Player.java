import java.util.HashMap;
import java.util.Map;

public class Player extends Gladiator {
	int maxhp = 10;
	Wepon wepon;
	Armor armor;

	public Player(int level, int hp, Wepon wepon, Armor armor) {
		this.level = 1;
		this.hp = maxhp;
		this.wepon = wepon;
		this.armor = armor;
		this.exp = 0;
		this.money = 0;

	}

	public void inWallet(int money) {
		System.out.println(money + "円手に入れた。");
		this.money += money;
		System.out.println("所持金は" + this.money + "円");

	}

	public void levelUp(int exp) {
		System.out.println(exp + "経験値を獲得した。");
		this.exp += exp;
		Map<Integer, Integer> expTable = new HashMap<Integer, Integer>();
		expTable.put(1, 5);
		expTable.put(2, 15);
		expTable.put(3, 30);
		expTable.put(4, 45);
		expTable.put(5, 60);
		expTable.put(6, 80);
		expTable.put(7, 100);
		expTable.put(8, 130);
		expTable.put(9, 160);
		expTable.put(10, 200);
		expTable.put(11, 220);
		expTable.put(12, 250);
		expTable.put(13, 280);
		expTable.put(14, 310);
		expTable.put(15, 350);
		expTable.put(16, 400);
		expTable.put(17, 460);
		expTable.put(18, 520);
		expTable.put(19, 580);
		expTable.put(20, 640);
		expTable.put(21, 710);
		expTable.put(22, 800);
		expTable.put(23, 890);
		expTable.put(24, 990);
		expTable.put(25, 1100);
		expTable.put(26, 710);
		expTable.put(27, 1250);
		expTable.put(28, 1450);
		expTable.put(29, 1700);
		expTable.put(30, 2000);
		expTable.put(31, 2350);
		expTable.put(32, 2800);
		expTable.put(33, 3200);
		expTable.put(34, 3700);
		expTable.put(35, 4200);
		expTable.put(36, 4350);
		expTable.put(37, 4600);
		expTable.put(38, 5000);
		expTable.put(39, 5600);
		expTable.put(40, 6400);
		expTable.put(41, 7000);
		expTable.put(42, 7500);
		expTable.put(43, 8000);
		expTable.put(44, 8500);
		expTable.put(45, 9000);
		expTable.put(46, 9500);
		expTable.put(47, 12000);
		expTable.put(48, 14000);
		expTable.put(49, 16000);
		if (this.level < expTable.size() && expTable.get(this.level) <= this.exp) {
			this.level++;
			System.out.println("レベルが" + this.level + "になった！");
			maxhp += 10;
			System.out.println("最大HPが10増えた");
		}
		if (this.level == 10) {
			System.out.println("レベル10ボーナス！");
			System.out.println("最大HPが50増えた！");
			maxhp += 50;
		} else if (this.level == 20) {
			System.out.println("レベル20ボーナス！");
			System.out.println("最大HPが100増えた！");
			maxhp += 100;
		} else if (this.level == 30) {
			System.out.println("レベル30ボーナス！");
			System.out.println("最大HPが200増えた！");
			maxhp += 200;
		} else if (this.level == 40) {
			System.out.println("レベル40ボーナス！");
			System.out.println("最大HPが500増えた！");
			maxhp += 500;
		} else if (this.level == 50) {
			System.out.println("レベル50ボーナス！");
			System.out.println("最大HPが1000増えた！");
			maxhp += 1000;
		}

	}

	public void displayStatus() {
		System.out.println("Lv:" + this.level + " HP:" + this.hp + " EXP:" + this.exp + " MONEY:" + this.money + "円");
		wepon.displayWepon();
		armor.displayArmor();
	}

	public boolean attack(Npc n) {
		System.out.println("あなたの攻撃");
		int dmg = wepon.str - n.dex;
		if (dmg < 0)
			dmg = 0;
		System.out.println(dmg + "のダメージを与えた。");
		n.hp -= dmg;
		return n.hp <= 0;

	}
}
