import java.util.*;
import java.util.Arrays;
public class anagram2{
public static boolean isAnagram(String s ,String t){
        s=s.replaceAll("\\s+","").toLowerCase();
        t=t.replaceAll("\\s+","").toLowerCase();
        if(s.length()!=t.length()){
            return false;
        }
        char s1[]=s.toCharArray();
        char s2[]=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1,s2);
}
public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st string:");
        String s1=sc.nextLine();
        System.out.println("enter the 2nd string:");
        String s2=sc.nextLine();
        if(isAnagram(s1,s2)){
            System.out.println("anagram");
        }else{
            System.out.println("not a anagram");
        }
    }
}