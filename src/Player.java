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
		}
		expTable.put(2, 15);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが3になった！");
		}
		expTable.put(3, 30);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが4になった！");
		}
		expTable.put(4, 45);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが5になった！");
		}
		expTable.put(5, 60);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが6になった！");
		}
		expTable.put(6, 80);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが7になった！");
		}
		expTable.put(7, 100);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが8になった！");
		}
		expTable.put(8, 130);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが9になった！");
		}
		expTable.put(9, 160);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが10になった！");
		}
		expTable.put(10, 200);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが11になった！");
		}
		expTable.put(11, 220);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが12になった！");
		}
		expTable.put(12, 250);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが13になった！");
		}
		expTable.put(13, 280);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが14になった！");
		}
		expTable.put(14, 310);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが15になった！");
		}
		expTable.put(15, 350);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが16になった！");
		}
		expTable.put(16, 400);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが17になった！");
		}
		expTable.put(17, 460);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが18になった！");
		}
		expTable.put(18, 520);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが19になった！");
		}
		expTable.put(19, 580);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが20になった！");
		}
		expTable.put(20, 640);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが21になった！");
		}
		expTable.put(21, 710);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが22になった！");
		}
		expTable.put(22, 800);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが23になった！");
		}
		expTable.put(23, 890);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが24になった！");
		}
		expTable.put(24, 990);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが25になった！");
		}
		expTable.put(25, 1100);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが26になった！");
		}
		expTable.put(26, 710);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが27になった！");
		}
		expTable.put(27, 1250);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが28になった！");
		}
		expTable.put(28, 1450);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが29になった！");
		}
		expTable.put(29, 1700);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが30になった！");
		}
		expTable.put(30, 2000);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが31になった！");
		}
		expTable.put(31, 2350);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが32になった！");
		}
		expTable.put(32, 2800);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが33になった！");
		}
		expTable.put(33, 3200);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが34になった！");
		}
		expTable.put(34, 3700);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが35になった！");
		}
		expTable.put(35, 4200);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが36になった！");
		}
		expTable.put(36, 4350);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが37になった！");
		}
		expTable.put(37, 4600);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが38になった！");
		}
		expTable.put(38, 5000);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが39になった！");
		}
		expTable.put(39, 5600);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが40になった！");
		}
		expTable.put(40, 6400);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが41になった！");
		}
		expTable.put(41, 7000);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが42になった！");
		}
		expTable.put(42, 7500);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが43になった！");
		}
		expTable.put(43, 8000);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが44になった！");
		}
		expTable.put(44, 8500);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが45になった！");
		}
		expTable.put(45, 9000);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが46になった！");
		}
		expTable.put(46, 9500);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが47になった！");
		}
		expTable.put(47, 12000);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが48になった！");
		}
		expTable.put(48, 14000);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが49になった！");
		}
		expTable.put(49, 16000);
		if (expTable.get(this.level) <= this.exp) {
			System.out.println("レベルが50になった！");
		}

	}
public void displayStatus() {
	System.out.println("Lv:" + this.level + " HP:" + this.hp + " EXP:" + this.exp + " MONEY:" + this.money);
}
	
	public void attack() {

	}
}
