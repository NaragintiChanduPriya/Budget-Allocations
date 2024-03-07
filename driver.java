package BudgetAllocation;
import java.util.*;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("How much can you spend: ");
      Scanner scan=new Scanner(System.in);
      double total=scan.nextDouble();
      double sum=0;
      int i=0;
      ArrayList<Double> proportion =new ArrayList<Double>();
      System.out.println("Enter the proportions: ");
      System.out.println("The system stops if cumlivate exceeds 100%");
      while(true) {
    	  if(sum>=100) {
    		  break;
    	  }
    	  System.out.println("your porportion of expences at "+(i+1)+":");
    	  double value=scan.nextDouble();
    	  
    	  proportion.add(value);
    	  sum += proportion.get(i);
    	  i++;
    	 
      }
      scan.close();
      System.out.println(sum);
      if(sum>100) {
    	  double cummilativesum=0.0;
    	  for(int j=0;j<proportion.size()-1;j++) {
    		  cummilativesum+=proportion.get(j);
    		  
    	  }
    	  proportion.set(proportion.size()-1, 100.0-cummilativesum);
    	  }
      for(double value:proportion) {
    	  double expense=(value/100.0)*total;
    	  System.out.println("Your "+value+" % equal $"+expense);
      }
	}

}
