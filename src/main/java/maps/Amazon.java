package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Amazon {

	public static void main(String[] args) {

		String ln="amazon";
		
		char[] de=ln.toCharArray();//syntex tochararray=to convert all string to characters..
		//syntex
		Map<Character, Integer> obj=new LinkedHashMap ();//linkedhash=same value which you have given
		//forloop
		for (char d : de){
			
			if(obj.containsKey(d)){
				obj.put(d, obj.get(d)+1);
			}else{
				obj.put(d, 1);
			}
		}
		
		/*Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){
            if(dupMap.get(ch) > 1){
                System.out.println(ch+"--->"+dupMap.get(ch));
            }
        }
    }
     
    public static void main(String a[]){
        DuplicateCharsInString dcs = new DuplicateCharsInString();
        dcs.findDuplicateChars("Java2Novice");
    }}
*/
		System.out.println(obj);
	}
			
		
		
	}



























