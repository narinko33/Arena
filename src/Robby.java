import java.util.Scanner;

public class Robby {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Wepon w = new Wepon("ひのきのぼう", 5, 0);
		Armor a = new Armor("Tシャツ", 2, 0);
		Player p = new Player(1, 1, w, a);
		while (true) {
			System.out.print("1:闘技場 2:コンビニ 3:ステータス 4:終わる");
			int select = s.nextInt();
			switch (select) {
			case 1:
				break;
			case 2:
				while (true) {
					boolean isExit = false;
					System.out.println("いらっしゃい。見てく？");
					System.out.print("1:武器 2:防具 3:出る");
					int select2 = s.nextInt();
					switch (select2) {
					case 1:
						Wepon wepon = w.viewWepon(p);
						System.out.println("いるかい？");
						System.out.print("1:いる 2:いらないお");
						int select3 = s.nextInt();
						switch (select3) {
						case 1:
							if (p.money >= w.price) {
								System.out.println("まいど！");
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
						a.viewArmor(p);
						System.out.println("いるかい？");
						System.out.print("1:いる 2:いらないお");
						int select4 = s.nextInt();
						switch (select4) {
						case 1:
							if (p.money >= a.price) {
								System.out.println("まいど！");
								p.armor = a.viewArmor(p);
							} else {
								System.out.println("この甲斐性なしが！");
							}
							break;
						case 2:
							System.out.println("見るだけはタダだしな");
							break;
						}
					case 3:
						System.out.println("またな。");
						isExit =true;
						break;
					}
					if(isExit)break;
					
				}
				break;
			case 3:
				p.displayStatus();
				w.displayWepon();
				a.displayArmor();
				break;
			case 4:
				return;

			}
		}
	}
}
