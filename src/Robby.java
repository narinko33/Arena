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
				
			case 2:
				
			case 3:
				
			case 4:
				
			
			}
			
			
		}
	}

}
