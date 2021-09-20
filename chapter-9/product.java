public class product{
	int id;
	String name;
	int price;
	
	
	product(){
		
	}
	
	product(int id,String name){
		this.id = id ;
		this.name = name ;
	}
	
	product(int id,String name ,int price){
		this.id = id;
		this.name = name;
		this.price = price;
		
	}
	
	public void displayMessage(){
		System.out.println("RFL");
	}
	
	
	public static void main(String[] args){
		//variable declaration
		product pro1 = new product();
		System.out.println("==========default object==========");
		System.out.println("Id : "+ pro1.id);
		System.out.println("Name : "+ pro1.name);
		System.out.println("Price : "+ pro1.price);
		
		
		
		System.out.println("==========parameter 2 object==========");
        product pro2 =new product(001,"chair");
		System.out.println("Id : "+ pro2.id);
		System.out.println("Name : "+ pro2.name);
		System.out.println("Price : "+ pro2.price);
      
		
		
		System.out.println("==========parameter 3 object==========");
        product pro3 =new product(001,"chair",1500);
		System.out.println("Id : "+ pro3.id);
		System.out.println("Name : "+ pro3.name);
		System.out.println("Price : "+ pro3.price);
		
	}
	
}