import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

/**
 * Pojo class with three properties
 * pId - Product Id
 * name - Product name
 * price - Product Price
 */
class Product{
	int id;
	String name;
	int quantity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
/**
 * This class process the array list of products and display it.
 * Do not change the class name
 *
 */
public class asgn_521 {
	
	/**
	 * This function process array list based upon business rules.
	 * @param - ArrayList, ArrayList
	 * @return - ArrayList
	 */
	public ArrayList processData(ArrayList arrayListA, ArrayList  arrayListB){
		
     																		
	}
	
	
	/**
	 * This function displays ArrayList elements
	 * DO NOT CHANGE THE CONTENT OF THIS METHOD 
	 * @param ArrayList
	 */
	public void displayArr(ArrayList arrlist){
		  arrlist = SkillevantUtil.sortArrayList(arrlist, "id");	
		  Iterator itr=arrlist.iterator();		 //getting Iterator from array list to traverse elements  
		  while(itr.hasNext()){
			  Product prod = new Product();
			  prod = (Product) itr.next();
			  System.out.println(prod.getId()+","+prod.getName()+","+prod.getQuantity());    
		  }  	  
	}
	
	/**
	 * DO NOT CHANGE THE CONTENT OF THIS METHOD 
	 */
	 public static void main(String args[]){ 
		 
		 String firstInputPath = "input1.txt";
		 String SecondInputPath = "input2.txt";
		 String[] data = new String[3];		// Hold data from input record after split
		 asgn_521 ProductArrObj = new asgn_521();
		 ArrayList resultantArrlist = new ArrayList();		// Array list resultant file
		 ArrayList arrayListA = new ArrayList();			// Array list first file
		 ArrayList arrayListB = new ArrayList();		// Array list second file		
		 
		 try {
			 
			 BufferedReader brForFisrtInput = new BufferedReader(new FileReader(firstInputPath));	// Reading file at given path
			 BufferedReader brForSecondInput = new BufferedReader(new FileReader(SecondInputPath));	// Reading file at given path
			 
			 String recordForFisrtInput =  brForFisrtInput.readLine();		// Reading each line of file
			 while(recordForFisrtInput != null){		// Loop until end of the file
				 Product productForFirstInput = new Product();				 
				 data = recordForFisrtInput.split(",",3);
				 productForFirstInput.setId(Integer.parseInt(data[0]));
				 productForFirstInput.setName(data[1]);
				 productForFirstInput.setQuantity((Integer.parseInt(data[2])));				 
				 arrayListA.add(productForFirstInput);
				 recordForFisrtInput =  brForFisrtInput.readLine();
			 }
			 
			 String recordForScondInput =  brForSecondInput.readLine();
			 while(recordForScondInput != null){
				 Product productForSecondInput = new Product();				 
				 data = recordForScondInput.split(",",3);
				 productForSecondInput.setId(Integer.parseInt(data[0]));
				 productForSecondInput.setName(data[1]);
				 productForSecondInput.setQuantity((Integer.parseInt(data[2])));				 
				 arrayListB.add(productForSecondInput);
				 recordForScondInput =  brForSecondInput.readLine();
			 }		 
			 resultantArrlist = ProductArrObj.processData(arrayListA, arrayListB); 
			 ProductArrObj.displayArr(resultantArrlist);
		 } catch (Exception e) {
				
				e.printStackTrace();
		 }
	 }

}