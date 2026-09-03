import java.util.*;
public class frq_letter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st string:");
        String s1=sc.nextLine();
        s1=s1.replaceAll("\\s+","").toLowerCase();
        int count[]= new int[26];
        int digit[] = new int[100];
        int i;
        for(i=0;i<s1.length();i++)
        {
            if((s1.charAt(i)) >='a' && (s1.charAt(i))<='z'){
                count[(s1.charAt(i))-'a']++;
            }
            if(Character.isDigit(s1.charAt(i))){
                digit[s1.charAt(i)- '0']++;
            }
        }
        for(i=0;i<26;i++){
            if(count[i]>0){
                System.out.println((char)(i+'a')+":"+count[i]);
            }
        }
        for(i=0;i<100;i++){
            if(digit[i]>0){
                System.out.println(i+":"+digit[i]);
            }
        }
    }
}