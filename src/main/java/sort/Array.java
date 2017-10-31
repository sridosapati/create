package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Array {

	public static void main(String[] args) {
		//String[] Company = {"Infosys","Tcs","Hcl"};//sort

		//List[] Company = {"Infosys","Tcs","Hcl"};
		//Arrays.sort(Company);
			//System.out.println(companies[i]);}
		ArrayList<String> ls= new ArrayList<String>();//list using array..
		ls.add("Tcs");
		ls.add("Infosys");
		ls.add("Hcl");
		Collections.sort(ls);	
		for (String a : ls) {    //alphabetical order..
         System.out.println(a);			
		}
		
		/*for (int i = ls.size()-1; i >= 0; i--) {//reverse order
			System.out.println(ls.get(i));
		}*/
		
		
		
		
		
	}

}
