import java.util.*;
public class M3Q6A{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long val = scn.nextLong();
        String str = "";
        while(val>0){
            str = Long.toString(val%10)+" "+str;
            val/=10;
        }
        System.out.print(str);
    }
}