import java.util.Scanner;

public class Shop {

	Scanner s = new Scanner(System.in);

	public Shop() {
	}

	public static void weponShop(Player p, Wepon w) {
		Scanner s = new Scanner(System.in);
		Wepon wepon = w.viewWepon(p);
		System.out.println("いるかい？");
		System.out.print("1:いる 2:いらない<<");
		int select = s.nextInt();
		switch (select) {
		case 1:
			if (p.money >= wepon.price) {
				System.out.println("まいど！");
				p.money -= wepon.price;
				p.wepon = wepon;
			} else {
				System.out.println("この甲斐性なしが！");
			}
			break;
		case 2:
			System.out.println("見るだけはタダだしな");
			break;
		}

	}

	public static void armorShop(Player p, Armor a) {
		Scanner s = new Scanner(System.in);
		Armor armor = a.viewArmor(p);
		System.out.println("いるかい？");
		System.out.print("1:いる 2:いらない<<");
		int select = s.nextInt();
		switch (select) {
		case 1:
			if (p.money >= armor.price) {
				System.out.println("まいど！");
				p.money -= armor.price;
				p.armor = armor;
			} else {
				System.out.println("この甲斐性なしが！");
			}
			break;
		case 2:
			System.out.println("見るだけはタダだしな");
			break;
		}
	}
}
