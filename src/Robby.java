import java.util.Scanner;

public class Robby {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Wepon w = new Wepon("ひのきのぼう",5,0);
		Armor a = new Armor("Tシャツ",2,0);
		Player p = new Player(1,1,w,a);
		while(true) {
			System.out.print("1:闘技場 2:コンビニ 3:ステータス 4:終わる");
			int select = s.nextInt();
			switch(select) {
			case 1:
				break;
			case 2:
				while(true) {System.out.println("いらっしゃい。見てく？");
				System.out.print("1:見る 2:出る");
				int select2 = s.nextInt();
				switch(select2) {
				case 1:
					w.viewWepon(p);
//					System.out.println("いるかい？");
//					System.out.print("1:いる 2:いらないお");
//					int select3 = s.nextInt();
//					switch(select3) {
//					case 1:
//						System.out.println("まいど！");
//						p.wepon = w.viewWepon;
//					}
					break;
				case 2:
					System.out.println("またな。");
				continue;}
				}
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
