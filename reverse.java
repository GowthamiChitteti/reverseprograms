//import java.net.SocketPermission;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
      int arr[]={1,2,3,4,5,6};
         int i=0;
         int j=arr.length-4;
         int temp=0;
         while(i<(arr.length-4)){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i=i+1;
            j=j-1;
         }
           i=3;
           j=arr.length-1;
           temp=0;
           while(i<(arr.length-1)){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i=i+1;
            j=j-1;
         }
           i =0;
           j =arr.length-1;
           temp=0;
          while (i<(arr.length/2)){
           temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i=i+1;
           j=j-1;
    }
    System.out.println(Arrays.toString(arr));
    
        }
    }

