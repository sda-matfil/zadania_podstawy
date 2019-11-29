package zadaania.src;

import java.util.Scanner;

public class czwarte {
    public Integer fourth(){
        int a;
        int y;
        Scanner skan = new Scanner(System.in);

        do {
            System.out.println(" Podaj liczbę całkowitą dodatnią: ");
            a=skan.nextInt();
            System.out.println(a);
            System.out.println("Wyświetl liczby parzyste (1), nieparzyste (2) lub wpisz inną cyfrę by powrócić do menu");
            System.out.println("Twój wybór : ");
            y = skan.nextInt();
            int x;
            switch(y){

                case 1:
            if (a % 2 == 0) {

                if (y==1) {

                    for (int i = 0; a>0; i++) {
                        x = a;
                        a -= 2;

                        System.out.printf(x + "; ");
                    }
                } else if (y==2) {
                    for (int i = 0; a>0; i++) {
                        x = a;
                        a -= 1;

                        System.out.printf(x + "; ");
                    }
                    }
                 }
                case 2:

            }  if (a % 2 != 0) {
                if (y==1) {

                    for (int i = 0; a>0; i++) {
                        x = a;
                        a -= 2;

                        System.out.printf(x + "; ");
                    }
                } else if (y==2) {
                    for (int i = 0; a>0; i++) {
                        x = a;
                        a -= 1;

                        System.out.printf(x + "; ");
                    }
                }
            }
            System.out.println("\n\n");
        }

        while(y==1 || y==2);
        return a;
        }
}


