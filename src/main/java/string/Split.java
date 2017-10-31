package string;

public class Split {

	public static void main(String[] args) {

		//count of words..strings=length..
		String text=("I am The Winner Today");
		
		String[] data=text.split(" ");
		System.out.println("the length of the words:"+data.length);
		
		
		//reverse order..reverse string
		String text1=("WoW! it is fun to do this");
		int data1=text1.length();
		for(int i=data1-1;i>=0;i--)
			System.out.print(text1.charAt(i));
		
		//how many repeate E are there..
		String text2=("I am smart Learner");
		int data2=text2.length();
		for(int i=0;i>=data2;i++){
			if(i == 'e'){
				System.out.println(i);
				
				
			}
		}
		
			
			
			
	}

}
