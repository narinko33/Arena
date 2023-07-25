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
		if(expTable.get(this.level) <= this.exp) {
			
			
		}

		//		if (this.level == 1 && this.exp >= 5) || this.exp >= 15 || this.exp >= 30 || this.exp >= 45 || this.exp >= 60 ||
		//				this.exp >= 80 || this.exp >= 100 || this.exp >= 130 || this.exp >= 160 || this.exp >= 200 ||
		//				this.exp >= 220 || this.exp >= 250 || this.exp >= 280 || this.exp >= 310 || this.exp >= 350 ||
		//				this.exp >= 400 || this.exp >= 460 || this.exp >= 520 || this.exp >= 580 || this.exp >= 640 ||
		//				this.exp >= 710 || this.exp >= 800 || this.exp >= 890 || this.exp >= 990 || this.exp >= 1100 ||
		//				this.exp >= 1250 || this.exp >= 1450 || this.exp >= 1700 || this.exp >= 2000 || this.exp >= 2350 ||
		//				this.exp >= 2800 || this.exp >= 3200 || this.exp >= 3700 || this.exp >= 4200 || this.exp >= 4350 ||
		//				this.exp >= 4600 || this.exp >= 5000 || this.exp >= 5600 || this.exp >= 6400 || this.exp >= 7000 ||
		//				this.exp >= 7500 || this.exp >= 8000 || this.exp >= 8500 || this.exp >= 9000 || this.exp >= 9500 ||
		//				this.exp >= 12000 || this.exp >= 14000 || this.exp >= 16000 || this.exp >= 18000
		//				|| this.exp >= 20000 && this.level <= MAXLEVEL) {

		System.out.println("レベルが" + this.level + "になった！");
	}

	public void attack() {

	}
}
