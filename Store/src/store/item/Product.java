package store.item;

/* A regular store like wallmart sells products to its costumers.
 * this is the superclass item 
 *
 */

public abstract class Product {
	
	//Instance variables
	private String productID;
	private String productName;
	private double productPrice;
	
	//Klassevariabelen
	static private int aantalProducten = 0;
	
	
	//Methodes
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	//Contructors
	Product() {
		this("00000000", "unknown", -1);
	}

	Product(String newProductID){
		this(newProductID, "unknown", -1);
	}
	
	Product(String newProductID, String newProductName){
		this(newProductID, newProductName, -1);
	}
	
	Product(String newProductID, String newProductName, double newProductPrice){
		this.setProductID(newProductID);
		this.setProductName(newProductName);
		this.setProductPrice(newProductPrice);
		
		//Increment every time a product is created
		Product.setAantalProducten(Product.getAantalProducten() + 1);
	}
	
	//Getters and Setters
	public String getProductID() {
		return productID;
	}

	public void setProductID(String newProductID) {
		this.productID = newProductID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String newProductName) {
		this.productName = newProductName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double newProductPrice) {
		this.productPrice = newProductPrice;
	}

	public static int getAantalProducten() {
		return aantalProducten;
	}

	public static void setAantalProducten(int aantalItems) {
		Product.aantalProducten = aantalItems;
	}
	
}
