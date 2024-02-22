import java.util.Scanner;

public class Cargo_04 implements ICargo_04{
	
	  public String adress;
	  public int id;
	  public String cargocompany;
	  
	  
	public Cargo_04(String adress, int id, String cargocompany) {
		super();
		this.adress = adress;
		this.id = id;
		this.cargocompany = cargocompany;
	}
	
	
	 public void cargocompany() {
		    System.out.println("chossing cargo company");
	    	System.out.println("1-mng kargo"
	    			          +"2-aras kargo"
	    			          +"3-sendeo ");
	    	Scanner scan =new Scanner(System.in);
	    	int choice=scan.nextInt();
	    	
	    	if(choice==1) {
	    		System.out.println("Your cargo will come with mng");
	    	}
	    	else if(choice==2) {
	    		System.out.println("Your cargo will come with aras");
	    	}
	    	else {
	    		System.out.println("Your cargo will come with sendeo");
	    	}
	    		
	    	
	    }
	    
	    public void cargoadress() {
	    	System.out.println("merkez neig. karanfil street ankara");
	    	
	    	
	    }
	

}
