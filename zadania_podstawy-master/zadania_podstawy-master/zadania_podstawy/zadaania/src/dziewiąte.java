package zadaania.src;

import java.util.Scanner;

public class dziewiąte {
    public Integer ninth(){
        Scanner skan = new Scanner(System.in);
        int tab[] = new int [10];

        int licznik=0;
        int x;
        while(licznik<10) {
            System.out.println("Wpisz liczbę : ");
            x= skan.nextInt();
            tab[licznik]=tab[x];
            licznik++;
        }
        System.out.println(tab);
        return licznik;
    }
}
