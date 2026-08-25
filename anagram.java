import java.util.*;
public class anagram{
    public static boolean isAnagram(String s ,String t){
        s=s.replaceAll("\\s+","").toLowerCase();
        t=t.replaceAll("\\s+","").toLowerCase();
        if(s.length()!=t.length()){
            return false;
        }
        int []Count = new int[26];
        int i;
        for(i=0;i<s.length();i++){
            Count[s.charAt(i)-'a']++;
            Count[t.charAt(i)-'a']--;
        }
        for(int c : Count){
            if(c!=0){
                return false;
            }
        }
        return true;
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
