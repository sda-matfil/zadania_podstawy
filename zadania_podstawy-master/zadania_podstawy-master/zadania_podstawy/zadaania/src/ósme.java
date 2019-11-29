package zadaania.src;

import java.util.Scanner;

public class ósme {
    public String eight() {
        Scanner skan = new Scanner(System.in);
        System.out.println("Wpisz liczbę dodatnią");
        long num = skan.nextInt();
        String number = String.valueOf(num);


        System.out.println("\n\nCo chcesz zrobić z podaną liczbą?");
        System.out.println("1. Oblicz sumę pojedynczych cyfr\n2. Oblicz stosunek średniej cyfr parzystych do nieparzystych\n");
        System.out.println("\nTwój wybór : ");
        int choice = skan.nextInt();
        switch (choice) {
            case 1:
                int x = 0;
                for (int i = 0; i < number.length(); i++) {
                int j = Character.digit(number.charAt(i), 10);
                x += j;

            }
            System.out.println("\n\n Suma pojedynczych cyfr podanej liczby wynosi: " + x);
            break;

            case 2:
                double a=0, b=0, tmpa=0, tmpb=0;
                double c;
                for (int i = 0; i < number.length(); i++) {
                    int j = Character.digit(number.charAt(i), 10);

                    if (j % 2 == 0){
                        tmpa += 1;
                        a+=j;
            //            if(i==0)
            //            a = 1;
           //             tmpa =1;
                    }

                    else if(j%2!=0) {
                        b += j;
                        tmpb += 1;
           //             if (i == 0)
// = 1;
           //             tmpb = 1;
                    }


                }
                c = (double)(a/tmpa)/(double)(b/tmpb);
                System.out.printf("\n\nŚrednia arytmetyczna cyfr parzystych wynosi : %3.2f ", (double)(a/tmpa));
                System.out.printf("\n\n natomiast ŚA nieparzystych wynosi : %3.2f ",(double)(b/tmpb));
                System.out.printf("\n\n\nStosunek średniej arytmetycznej parzystych do nieparzystych wynosi zatem %3.3f",c);
                System.out.println("\n\n");
        }


    return number;
    }
}
