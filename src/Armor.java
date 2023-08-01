
public class Armor extends Item {
	int dex;

	public Armor(String name, int dex, int price) {
		this.name = name;
		this.dex = dex;
		this.price = price;

	}

	public void displayArmor() {
		System.out.println("防具名:" + this.name + " DEX:" + this.dex);
	}

	public Armor viewArmor(Player p) {
		String name = null;
		int dex = 0;
		int price = 0;

		if (p.level <= 5) {
			name = ("鉄の鎧");
			dex = 15;
			price = 10;
		} else if (p.level <= 10) {
			name = ("鎖帷子");
			dex = 20;
			price = 25;
		} else if (p.level <= 15) {
			name = ("鋼の鎧");
			dex = 40;
			price = 120;
		} else if (p.level <= 20) {
			name = ("炎の衣");
			dex = 60;
			price = 160;
		} else if (p.level <= 25) {
			name = ("アサシンマント");
			dex = 100;
			price = 250;
		} else if (p.level <= 30) {
			name = ("シルバーメイル");
			dex = 160;
			price = 300;
		} else if (p.level <= 35) {
			name = ("ミスリルアーマー");
			dex = 225;
			price = 500;
		} else if (p.level >= 40) {
			name = ("オリハルコンシールド");
			dex = 360;
			price = 1500;
		} else if (p.level <= 45) {
			name = ("ばーりあ");
			dex = 500;
			price = 3000;
		} else if (p.level <= 50) {
			name = ("プロテクション");
			dex = 1500;
			price = 5000;
		}
		Armor view = new Armor(name, dex, price);
		System.out.println("防具名:" + view.name + " DEX:" + view.dex + " 値段:" + view.price);
		return view;
	}
}
