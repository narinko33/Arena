import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Robby {

	public static void main(String[] args) {

		Wepon w = new Wepon("いい感じの枝", 10, 0);
		Armor a = new Armor("Tシャツ", 10, 0);
		Player p = new Player(1, 1, w, a);
		while (true) {
			System.out.print("1:闘技場 2:コンビニ 3:ステータス 4:終わる<<");
			switch (select()) {
			case 1:
				Npc n = new Npc();
				n.npcStatus(p);
				System.out.print("1:戦う 2:やめる <<");
				switch (select()) {
				case 1:
					battle(p, n);
					break;
				case 2:
					break;
				}
				break;
			case 2:
				while (true) {
					boolean isExit = false;
					System.out.println("いらっしゃい。見てく？");
					System.out.print("1:武器 2:防具 3:出る<<");
					switch (select()) {
					case 1:
						Shop.weponShop(p, w);
						break;
					case 2:
						Shop.armorShop(p, a);
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
				System.out.println("終了します。");
				System.out.println("ヒント:5656");
				return;
			case 5656:
				System.out.println("コナミコマンドを入力してください");
				String comand = new java.util.Scanner(System.in).nextLine();
				if (comand.equals("8822464626")) {
					p.level = 49;
					p.hp = 10000;
					p.wepon = new Wepon("", 99999, 0);
					p.armor = new Armor("", 99999, 0);
					p.exp = 99999;
					p.money = 99999;
					String[] kansou = { "このコマンドが思いつくということはあなたはゲームが大好きなんですね。",
							"私がこのコマンドを初めて入力したのはゲームボーイの遊戯王でした。",
							"ではそういうことになるのでステータスを確認してください。",
							"そしてどうぞお楽しみください", "", "⊂二二二（  ＾ω＾）二二⊃ﾌﾞｰﾝ",
							"                ﾌﾞｰﾝ⊂二二二（＾ω＾  ）二二⊃", "" };
					for (int i = 0; i < kansou.length; i++) {
						System.out.println(kansou[i]);
						try {
							Thread.sleep(1500);
						} catch (Exception e) {
							;
						}
					}
				} else {
					System.out.println("違います。");

				}
				break;
			default:
				System.out.println("選択肢から選んでください");
			}

			p.hp = p.maxhp;
		}

	}

	public static int select() {
		Scanner s = new Scanner(System.in);
		int sel = s.nextInt();
		return sel;

	}

	public static void battle(Player p, Npc n) {
		List<Gladiator> gList = new ArrayList<Gladiator>();
		if (p.level >= n.level) {
			gList.add(p);
			gList.add(n);
		} else {
			gList.add(n);
			gList.add(p);
		}
		while (true) {
			for (int i = 0; i < gList.size(); i++) {
				Gladiator g = gList.get(i);
				if (g instanceof Player) {
					Player player = (Player) g;
					Npc enemy = (Npc) gList.get((i + 1) % gList.size());
					if (player.attack(enemy)) {
						System.out.println("NPCを倒した。");
						p.levelUp(n.exp);
						p.inWallet(n.money);
						return;
					}
				} else {
					Npc enemy = (Npc) g;
					Player player = (Player) gList.get((i + 1) % gList.size());
					if (enemy.attack(player)) {
						System.out.println("あなたは負けてしまった。");
						return;
					}
				}
			}
		}
	}

}
//	while(true){
//	if (p.level >= n.level) {
//		if (p.attack(n) || n.attack(p, a)) {
//			break;
//		}
//	} else {
//		if (n.attack(p, a) || p.attack(n)) {
//			break;
//		}
//	}
//
//}
//if (p.hp > 0) {
//	System.out.println("NPCを倒した。");
//	p.levelUp(n.exp);
//	p.inWallet(n.money);
//	break;
//} else {
//	System.out.println("あなたは負けてしまった。");
//	break;
//}
