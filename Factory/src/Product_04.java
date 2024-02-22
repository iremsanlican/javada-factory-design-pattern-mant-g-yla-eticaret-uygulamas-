import java.util.ArrayList;
import java.util.List;


public class Product_04 implements IProduct_04 {
	
	String name;
    int price;
    String  producttype;
    
	public Product_04() {
		super();
	}


	public Product_04(String name, int fiyat, String producttype, List<String> urunler) {
		super();
		this.name = name;
		this.price = price;
		this.producttype= producttype;
		this.urunler = urunler;
	}


public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getProducttype() {
		return producttype;
	}


	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}


	public List<String> getUrunler() {
		return urunler;
	}


	public void setUrunler(List<String> urunler) {
		this.urunler = urunler;
	}






List<String> urunler = new ArrayList<String>();
    public  void  addproduct(String uruntur) {
      
			urunler.add(uruntur);
			System.out.println("urun eklendi");
		
    }
    public void sepet() {

 
    	 for (String element : urunler) {
 	    	
             System.out.println(element);
         }
    }

    public void deleteproduct(String uruntur) {
        urunler.remove(uruntur);
        System.out.println("deleted product");
    }
    public double totalbalance() {
    	List<Product_04> urunler = new ArrayList<Product_04>();
        double total = 0;
        for (Product_04 urun : urunler) {
        //total+=setPrice(price);
        	System.out.println("  " +total);
            
        }
        return total;
    }


	@Override
	public void pay(int kartbakiye) {
		// TODO Auto-generated method stub
		
	}
    


   
    

}
