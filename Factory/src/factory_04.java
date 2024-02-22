
public class factory_04 {
	
	   public IProduct_04 createProduct(String productType) {
	        if (productType.equalsIgnoreCase("Product")) {
	            return new Product_04();
	        } else if (productType.equalsIgnoreCase("Customer")) {
	            return new Customer_04("irem", 0, productType, 0);
	        }
	        
	     
	        return null;
	    }

	  
	    public ICargo_04 createKargo(String KargoType) {
	        if (KargoType.equalsIgnoreCase("Kargo")) {
	            return new Cargo_04("ankara", 55, "mng");
	        }
	        return null;
	    }
	
	

}
