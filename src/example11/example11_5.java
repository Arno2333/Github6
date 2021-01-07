package example11;

public class example11_5 {
	 public static void main(String[] args){ 
		displayObject(new example11_2
				 (1,"red",false));
		displayObject(new example11_3
				 (1,1,"black", true));	 
	 }
	 public static void displayObject(example11_1 object){
		 System.out.println("Created on "+ object.getDateCreated() +
				 "Color is " + object.getColor());
	 }
}
