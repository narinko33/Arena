import java.util.Scanner;

public class Robby {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Wepon w = new Wepon("ひのきのぼう", 5, 0);
		Armor a = new Armor("Tシャツ", 5, 0);
		Player p = new Player(1, 1, w, a);
		while (true) {
			System.out.print("1:闘技場 2:コンビニ 3:ステータス 4:終わる<<");
			int select = s.nextInt();
			switch (select) {
			case 1:
				Npc n = new Npc();
				n.npcStatus(p);
				System.out.print("1:戦う 2:やめる <<");
				int select2 = s.nextInt();
				switch (select2) {
				case 1:
					while (true) {
						if (p.level > n.level) {
							if (p.attack(n) || n.attack(p, a)) {
								break;
							}
						} else {
							if (n.attack(p, a) || p.attack(n)) {
								break;
							}
						}

					}
					if (p.hp >= 0) {
						System.out.println("NPCを倒した。");
						p.levelUp(n.exp);
						p.inWallet(n.money);
						break;
					} else {
						System.out.println("あなたは負けてしまった。");
						break;
					}

				case 2:
					break;
				}
				break;
			case 2:
				while (true) {
					boolean isExit = false;
					System.out.println("いらっしゃい。見てく？");
					System.out.print("1:武器 2:防具 3:出る<<");
					int select3 = s.nextInt();
					switch (select3) {
					case 1:
						Wepon wepon = w.viewWepon(p);
						System.out.println("いるかい？");
						System.out.print("1:いる 2:いらない<<");
						int select4 = s.nextInt();
						switch (select4) {
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
						break;
					case 2:
						Armor armor = a.viewArmor(p);
						System.out.println("いるかい？");
						System.out.print("1:いる 2:いらない<<");
						int select5 = s.nextInt();
						switch (select5) {
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
						break;
					case 3:
						System.out.println("またな。");
						isExit = true;
						break;
					}
					if (isExit)
						break;

				}
				break;
			case 3:
				p.displayStatus();

				break;
			case 4:
				return;

			}
			p.hp = p.maxhp;
		}
	}
}
