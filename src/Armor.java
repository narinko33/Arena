
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
}
