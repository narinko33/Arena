import java.util.HashMap;
import java.util.Map;

public class Player extends Gladiator {
	final int MAXLEVEL = 50;
	Wepon wepon;
	Armor armor;

	public Player(int level, int hp, Wepon wepon, Armor armor) {
		this.level = 1;
		this.hp = 10;
		this.wepon = wepon;
		this.armor = armor;
		this.exp = 0;
		this.money = 0;

	}

	public void inWallet(int money) {
		this.money += money;
		System.out.println("所持金は" + this.money);

	}

	public void levelUp(int exp) {
		System.out.println(exp + "経験値を獲得した。");
		this.exp += exp;
		Map<Integer, Integer> expTable = new HashMap<Integer, Integer>();
		expTable.put(1, 5);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが2になった！");
			System.out.println("最大HPが10増えた");
			this.hp += 10;
			this.level++;
		}
		expTable.put(2, 15);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが3になった！");
			System.out.println("最大HPが10増えた");
			this.hp += 10;
			this.level++;
		}
		expTable.put(3, 30);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが4になった！");
			System.out.println("最大HPが10増えた");
			this.hp += 10;
			this.level++;
		}
		expTable.put(4, 45);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが5になった！");
			System.out.println("最大HPが10増えた");
			this.hp += 10;
			this.level++;
		}
		expTable.put(5, 60);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが6になった！");
			System.out.println("最大HPが10増えた");
			this.hp += 10;
			this.level++;
		}
		expTable.put(6, 80);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが7になった！");
			System.out.println("最大HPが10増えた");
			this.hp += 10;
			this.level++;
		}
		expTable.put(7, 100);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが8になった！");
			System.out.println("最大HPが10増えた");
			this.hp += 10;
			this.level++;
		}
		expTable.put(8, 130);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが9になった！");
			System.out.println("最大HPが10増えた");
			this.hp += 10;
			this.level++;
		}
		expTable.put(9, 160);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが10になった！");
			System.out.println("最大HPが10増えた");
			this.hp += 10;
			this.level++;
		}
		expTable.put(10, 200);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが11になった！");
			System.out.println("最大HPが20増えた");
			this.hp += 20;
			this.level++;
		}
		expTable.put(11, 220);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが12になった！");
			System.out.println("最大HPが20増えた");
			this.hp += 20;
			this.level++;
		}
		expTable.put(12, 250);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが13になった！");
			System.out.println("最大HPが20増えた");
			this.hp += 20;
			this.level++;
		}
		expTable.put(13, 280);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが14になった！");
			System.out.println("最大HPが20増えた");
			this.hp += 20;
			this.level++;
		}
		expTable.put(14, 310);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが15になった！");
			System.out.println("最大HPが20増えた");
			this.hp += 20;
			this.level++;
		}
		expTable.put(15, 350);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが16になった！");
			System.out.println("最大HPが20増えた");
			this.hp += 20;
			this.level++;
		}
		expTable.put(16, 400);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが17になった！");
			System.out.println("最大HPが20増えた");
			this.hp += 20;
			this.level++;
		}
		expTable.put(17, 460);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが18になった！");
			System.out.println("最大HPが20増えた");
			this.hp += 20;
			this.level++;
		}
		expTable.put(18, 520);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが19になった！");
			System.out.println("最大HPが20増えた");
			this.hp += 20;
			this.level++;
		}
		expTable.put(19, 580);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが20になった！");
			System.out.println("最大HPが20増えた");
			this.hp += 20;
			this.level++;
		}
		expTable.put(20, 640);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが21になった！");
			System.out.println("最大HPが30増えた");
			this.hp += 30;
			this.level++;
		}
		expTable.put(21, 710);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが22になった！");
			System.out.println("最大HPが30増えた");
			this.hp += 30;
			this.level++;
		}
		expTable.put(22, 800);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが23になった！");
			System.out.println("最大HPが30増えた");
			this.hp += 30;
			this.level++;
		}
		expTable.put(23, 890);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが24になった！");
			System.out.println("最大HPが30増えた");
			this.hp += 30;
			this.level++;
		}
		expTable.put(24, 990);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが25になった！");
			System.out.println("最大HPが30増えた");
			this.hp += 30;
			this.level++;
		}
		expTable.put(25, 1100);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが26になった！");
			System.out.println("最大HPが30増えた");
			this.hp += 30;
			this.level++;
		}
		expTable.put(26, 710);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが27になった！");
			System.out.println("最大HPが30増えた");
			this.hp += 30;
			this.level++;
		}
		expTable.put(27, 1250);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが28になった！");
			System.out.println("最大HPが30増えた");
			this.hp += 30;
			this.level++;
		}
		expTable.put(28, 1450);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが29になった！");
			System.out.println("最大HPが30増えた");
			this.hp += 30;
			this.level++;
		}
		expTable.put(29, 1700);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが30になった！");
			System.out.println("最大HPが30増えた");
			this.hp += 30;
			this.level++;
		}
		expTable.put(30, 2000);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが31になった！");
			System.out.println("最大HPが40増えた");
			this.hp += 40;
			this.level++;
		}
		expTable.put(31, 2350);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが32になった！");
			System.out.println("最大HPが40増えた");
			this.hp += 40;
			this.level++;
		}
		expTable.put(32, 2800);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが33になった！");
			System.out.println("最大HPが40増えた");
			this.hp += 40;
			this.level++;
		}
		expTable.put(33, 3200);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが34になった！");
			System.out.println("最大HPが40増えた");
			this.hp += 40;
			this.level++;
		}
		expTable.put(34, 3700);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが35になった！");
			System.out.println("最大HPが40増えた");
			this.hp += 40;
			this.level++;
		}
		expTable.put(35, 4200);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが36になった！");
			System.out.println("最大HPが40増えた");
			this.hp += 40;
			this.level++;
		}
		expTable.put(36, 4350);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが37になった！");
			System.out.println("最大HPが40増えた");
			this.hp += 40;
			this.level++;
		}
		expTable.put(37, 4600);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが38になった！");
			System.out.println("最大HPが40増えた");
			this.hp += 40;
			this.level++;
		}
		expTable.put(38, 5000);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが39になった！");
			System.out.println("最大HPが40増えた");
			this.hp += 40;
			this.level++;
		}
		expTable.put(39, 5600);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが40になった！");
			System.out.println("最大HPが40増えた");
			this.hp += 40;
			this.level++;
		}
		expTable.put(40, 6400);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが41になった！");
			System.out.println("最大HPが50増えた");
			this.hp += 50;
			this.level++;
		}
		expTable.put(41, 7000);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが42になった！");
			System.out.println("最大HPが60増えた");
			this.hp += 60;
			this.level++;
		}
		expTable.put(42, 7500);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが43になった！");
			System.out.println("最大HPが70増えた");
			this.hp += 70;
			this.level++;
		}
		expTable.put(43, 8000);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが44になった！");
			System.out.println("最大HPが80増えた");
			this.hp += 80;
			this.level++;
		}
		expTable.put(44, 8500);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが45になった！");
			System.out.println("最大HPが100増えた");
			this.hp += 100;
			this.level++;
		}
		expTable.put(45, 9000);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが46になった！");
			System.out.println("最大HPが300増えた");
			this.hp += 300;
			this.level++;
		}
		expTable.put(46, 9500);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが47になった！");
			System.out.println("最大HPが600増えた");
			this.hp += 600;
			this.level++;
		}
		expTable.put(47, 12000);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが48になった！");
			System.out.println("最大HPが1000増えた");
			this.hp += 1000;
			this.level++;
		}
		expTable.put(48, 14000);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが49になった！");
			System.out.println("最大HPが3000増えた");
			this.hp += 3000;
			this.level++;
		}
		expTable.put(49, 16000);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが50になった！");
			System.out.println("最大HPが5000増えた");
			this.hp += 5000;
			this.level++;
		}

	}
public void displayStatus() {
	System.out.println("Lv:" + this.level + " HP:" + this.hp + " EXP:" + this.exp + " MONEY:" + this.money);
}
	
	public void attack() {

	}
}
