import java.util.*;
public class M3Q8{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str[] = scn.nextLine().split(" ");
        int data[] = new int[str.length];
        for(int i = 0; i<data.length; i++){
            data[i]=Integer.parseInt(str[i]);
        }
        square(data);
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+"\t");
        }
        System.out.println();
    }

    public static void square(int arr[]){
        for(int i =0; i<arr.length; i++){
             arr[i]*=arr[i];
        }
    }
}