
public class Wepon extends Item {
	int str;

	public Wepon(String name, int str, int price) {
		this.name = name;
		this.str = str;
		this.price = price;
	}
	public void displayWepon() {
		System.out.println("武器名:" + this.name + " STR:" + this.str );
	}
	public Wepon viewWepon(Player p) {
		String name = null;
		int str = 0;
		int price = 0;
		
		if(p.level <= 5) {
			name = ("鉄の剣");
			str = 8;
			price = 10;
		}else if(p.level <= 10) {
			name = ("鉄の大剣");
			str = 15;
			price = 25;
		}else if(p.level <= 15) {
			name = ("鋼の槍");
			str = 30;
			price = 45;
		}else if(p.level <= 20) {
			name = ("鋼の斧");
			str = 30;
			price = 45;
		}else if(p.level <= 25) {
			name = ("アサシンダガー");
			str = 45;
			price = 70;
		}else if(p.level <= 30) {
			name = ("銀の弓");
			str = 70;
			price = 100;
		}else if(p.level <= 35) {
			name = ("王の財宝");
			str = 150;
			price = 500;
		}else if(p.level >= 40) {
			name = ("約束されし勝利の剣");
			str = 400;
			price = 1500;
		}else if(p.level <= 45) {
			name = ("飛鳥文化アタック");
			str = 900;
			price = 3000;
		}else if(p.level <= 50) {
			name = ("ストレス");
			str = 3000;
			price = 5000;
		}
		Wepon view = new Wepon(name,str,price);
		System.out.println("武器名:" + view.name + " STR:" + view.str + " 値段:" + view.price);
		return view;
	}
}
