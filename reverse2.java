import java.util.*;
    public class reverse2 {
        public static void main(String[] args) {
            int arr[]={190,120,10,80,50,30};
            int temp=0;
          for (int i=arr.length-2;i>=0;i--){
          for(int j=0;j<=i;j++){
           if (arr[j]>arr[j+1]){
               temp=arr[j];
               arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
          
        }
        System.out.println(Arrays.toString(arr));
        }
    }
    
