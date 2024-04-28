package Week1;

import java.util.Scanner;

public class SayiKuvveti {
    public static void main(String[] args) {

        int n;

        Scanner input = new Scanner(System.in) ;
        System.out.println("Sınır sayısını giriniz: ");

        n = input.nextInt();

        for ( int i = 4 ; i<=n ; i*=4 ){
            System.out.println(i + " 4'ün kuvvetidir.");
        }
        for ( int i = 5 ; i<=n ; i*=5 ){
            System.out.println(i + " 5'in kuvvetidir.");
        }
    }
}
