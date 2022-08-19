
import java.util.Scanner;

public class Siralama {
    static void siralama(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[j] > arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i: arr){
            
            System.out.print(" " + i);
            
        }
        

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eleman ;
        System.out.print("Dizinin boyutu n : ");
        int n = scan.nextInt();
        int[] dizi = new int[n]; 
        System.out.println("Dizinin elemanlarını giriniz : ");
        for(int i = 0; i < dizi.length;i++ ){
            System.out.print( (i+1) +". eleman : ");
            eleman = scan.nextInt();
            dizi[i] = eleman; 
            
            
        }
        System.out.print("Sıralama : ");
        siralama(dizi);
        scan.close();
    }
}