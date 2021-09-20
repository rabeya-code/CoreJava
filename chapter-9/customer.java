public class customer{
	int id;
	String name;
	String address;
	
	
	customer(){
		
	}
	
		
	customer(int id,String name){
		 this.id = id ;
		 this.name = name ;
		
	}
	
	customer(int id,String name,String address){
		 this.id = id ;
	     this.name = name ;
	     this.address = address;
		
	}
	
	
	public static void main(String[] args){
		customer cus = new customer();
		System.out.println("=========Default object========");
		System.out.println("ID : "+cus.id);
		System.out.println("Name : "+cus.name);
		System.out.println("Address : "+cus.address);
		
		
	    System.out.println("=========Parameter 2 object========");	
		customer cus2 = new customer(001,"Sakib");
		System.out.println("ID : "+cus2.id);
		System.out.println("Name : "+cus2.name);
		System.out.println("Address : "+cus2.address);
		
		
		
		System.out.println("=========Parameter 3 object========");	
		customer cus3 = new customer(001,"Sakib","Shamoli");
		System.out.println("ID : "+cus3.id);
		System.out.println("Name : "+cus3.name);
		System.out.println("Address : "+cus3.address);
	}
	
	
}