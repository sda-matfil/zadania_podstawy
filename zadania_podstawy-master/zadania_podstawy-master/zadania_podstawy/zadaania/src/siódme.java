package zadaania.src;

import java.util.Scanner;

public class siódme {

    public Integer seventh() {
        Scanner skan=new Scanner(System.in);
        int x;
        do{
            System.out.println("\n\nwpisz liczbę : ");
            x=skan.nextInt();
            boolean pierwsza=false;
            if(x==0 || x==1){
                System.out.println("\nTy chyba nie lubisz się bawić co?");
                break;
            }
            for (int i=2;i<x;i++){
                if(x%i==0){
                    pierwsza=true;
                    break;
                }
            }
            if(pierwsza==true){
                System.out.println("\nliczba druga ");
            }
            else {
                System.out.println("\nliczba pierwsza");
            }

        }while(x!=0);
        return x;
    }
}