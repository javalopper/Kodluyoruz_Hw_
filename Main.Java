/* 
*Bu kod, Girilen String deðerini tersini almak ve yazdýrmak için kullanýlmaktadýr.

*2022Yýlýnda Kodluyorz.com BootcamP Hackerrank Hazýrlýk Ödevi için Derlenmiþtir.

*Ferhat BÖLÜKBAÞ */


import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int arr2Di[][] = new int[6][6];
        for(int satir = 0; satir < 6; satir++){
            for(int sutun = 0; sutun < 6;sutun++){
                arr2Di[satir][sutun] = sc.nextInt();
            }
        }
        System.out.println(Cev(arr2Di));
    }
    static int Cev(int arr[][]){
        int maksi = Integer.MIN_VALUE;
        int toplam = 0;
        for(int satir = 0; satir < 4; satir++){

            for(int sutun = 0; sutun < 4; sutun++ ){

                toplam = arr[satir][sutun] + arr[satir][sutun+1] + arr[satir][sutun+2];
                toplam += arr[satir+1][sutun+1];
                toplam += arr[satir+2][sutun] + arr[satir+2][sutun+1] + arr[satir+2][sutun+2];
                maksi = toplam>maksi?toplam:maksi;
            }
        }
        return maksi;

    }

}
