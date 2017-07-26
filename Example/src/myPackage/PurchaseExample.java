package myPackage;

public class PurchaseExample {

	public static void main(String[] args) {
		double totalCost = 0;
		
		Purchase item = new Purchase();
		
		item.setName("Orange");
		item.setPrice(10, 2.99);
		item.setNumberBought(24);
		item.writeOutput();
		System.out.println("Subtotal cost: "+item.getTotalCost());
		totalCost += item.getTotalCost();
		
		item.setName("Eggs");
		item.setPrice(12, 1.69);
		item.setNumberBought(36);
		item.writeOutput();
		System.out.println("SubTotal cost: "+item.getTotalCost());
		totalCost += item.getTotalCost();
		
		item.setName("Apples");
		item.setPrice(3, 1.00);
		item.setNumberBought(20);
		item.writeOutput();
		System.out.println("SubTotal cost: "+item.getTotalCost());
		totalCost += item.getTotalCost();
		
		item.setName("Watermelons");
		item.setPrice(1,4.39);
		item.setNumberBought(2);
		item.writeOutput();
		System.out.println("SubTotal cost: "+item.getTotalCost());
		totalCost += item.getTotalCost();
		
		item.setName("Bagels");
		item.setPrice(6,3.50);
		item.setNumberBought(12);
		item.writeOutput();
		System.out.println("SubTotal cost: "+item.getTotalCost());
		totalCost += item.getTotalCost();
		
		System.out.println("*******************");
		System.out.println("Total cost: "+ totalCost);
	}

}
