
public class Armor extends Item{
int dex;

public Armor(String name, int dex, int price){
	this.name = name;
	this.dex = dex;
	this.price = price;
	
}
public void displayArmor() {
	System.out.println("防具名:" + this.name + " DEX:" + this.dex );
}
public Armor viewArmor(Player p) {
	String name = null;
	int dex = 0;
	int price = 0;
	
	if(p.level <= 5) {
		name = ("鉄の鎧");
		dex = 10;
		price = 10;
	}
	Armor view = new Armor(name,dex,price);
	System.out.println("武器名:" + view.name + " STR:" + view.dex + " 値段:" + view.price);
	return view;
}
}
