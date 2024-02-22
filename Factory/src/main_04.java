
public class main_04 {

	public static void main(String[] args) {
		  factory_04 factory = new factory_04();

	       
		    IProduct_04 Product = factory.createProduct("Product");
	        Product.addproduct("k");
	        Product.deleteproduct("ka");
	       
	        IProduct_04 Customer = factory.createProduct("Customer");
	       Customer.totalbalance();
	      
	        ICargo_04 Kargo = factory.createKargo("Kargo");
	        Kargo.cargoadress();


	}

}
