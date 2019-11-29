package zadaania.src;

import java.util.Scanner;

public class piąte {
    public Integer fifth(){
        int x;
        Scanner skan = new Scanner(System.in);
        do{
            System.out.println("\nWpisz liczbę całkowitą lub 0 by wyjść");
            x= skan.nextInt();
            double a=0;

            for(int i=0;a<x;i++){
                a= Math.pow(2,i);
                if(a>=x)
                    break;
                System.out.printf("|%5.0f ",a);
            }
            System.out.println("\n\n");

        }while(!(x<=0));
        return x;
    }
}
