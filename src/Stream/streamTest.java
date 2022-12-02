package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class streamTest {
    public static boolean ifContain(String[]strArr,ArrayList<String> input){
        boolean res=false;
//        res= Arrays.stream(strArr).map(String::toLowerCase).anyMatch(s->s.equalsIgnoreCase(input.stream().iterator().next()));
        res= Arrays.stream(strArr).anyMatch(each->each.equalsIgnoreCase(input.stream().iterator().next()));
        return res;
    }
    public static void main(String[] args) {
//        System.out.println(ifContain(new String[]{"java", "haha"}, new ArrayList<>(Arrays.asList("java", "haha"))));
  ArrayList<String> test=new ArrayList<>(Arrays.asList("Java","is","good"));
  Iterator<String>stringIterator=test.iterator();
     while(stringIterator.hasNext()){
         String next=stringIterator.next();
         System.out.println(next);
     }
    }
}
