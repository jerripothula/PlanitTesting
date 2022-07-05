import java.util.*;  

class Challenge {


public static void findIt(String str) { 
    int max=1;
         LinkedHashMap<Character, Integer> hm
            = new LinkedHashMap<Character,Integer>(); 
        char[] charArray = str.replaceAll(" ", "").toLowerCase().toCharArray();  
        for (Character ch : charArray) {  
            if (hm.containsKey(ch)) {  
                hm.put(ch, hm.get(ch) + 1);
                if(hm.get(ch)>max)
                {
                    max=hm.get(ch);
                }
            } else {  
                hm.put(ch, 1);  
            }  
        }

        for (Map.Entry<Character,Integer> mapElement :
             hm.entrySet()) {
 
            Character key = mapElement.getKey();
            Integer value = mapElement.getValue();
         
            if(value==max)
            {
            System.out.println(key);
            break;
            }
        }  
}


  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter username :");

    String userName = myObj.nextLine();
    findIt(userName);
  }
}
