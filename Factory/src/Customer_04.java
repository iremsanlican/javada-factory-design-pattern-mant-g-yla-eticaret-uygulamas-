import java.util.ArrayList;
import java.util.List;

public class Customer_04 implements IProduct_04{
	
	public String name;
	public int id;
	public static String adress;
	public String telefon;
	public int Cart;
	

	public Customer_04(String name, int id, String telefon,int Cart) {
		super();
		this.name = name;
		this.id = id;
		this.telefon = telefon;
		this.Cart = Cart;
		
	}
	public String getname() {
		return name;
	}
	public void setname(String musteriname) {
		this.name = musteriname;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress= adress;
	}
	
	
	public int getcart() {
		return Cart;
	}
	public void setcart(int kart) {
		this.Cart = kart;
	}
	
	
	        List<String> urunler = new ArrayList<String>();
			
		
		
			@Override
			public void addproduct(String p) {
				urunler.add(p);
				System.out.println("\r\n"
						+ "product added");
				
			}
			@Override
			public void deleteproduct(String p) {
				urunler.remove(p);
				System.out.println("\r\n"
						+ "product removed");
				
			}
			@Override
			public double totalbalance() {
				// TODO Auto-generated method stub
				return 0;
			}
			@Override
			public void pay(int balance) {
				// TODO Auto-generated method stub
				
			}
			
		    
		
	
	

}
