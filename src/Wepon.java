
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
	public void viewWepon(Player p) {
		if(p.level <= 6) {
			name = ("鉄の剣");
			str = 8;
			price = 10;
		}
		Wepon view = new Wepon(name,str,price);
		System.out.println("武器名:" + view.name + " STR:" + view.str + " 値段:" + view.price);
		
	}
}
