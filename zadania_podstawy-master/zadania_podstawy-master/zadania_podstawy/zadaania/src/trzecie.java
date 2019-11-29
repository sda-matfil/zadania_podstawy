package zadaania.src;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class trzecie {
    public Integer third(){
        Scanner skan = new Scanner(System.in);
        double x,y,z;
        int choice;
        do {
            System.out.println("\nJakie działanie chcesz wykonać");
            System.out.println("1. Dodawanie\n2. Odejmowanie\n3. Mnożenie");
            System.out.println("4. Dzielenie'\n5. Reszta z dzielenia");
            System.out.println("6. Potęgowanie\n7. Pierwiastkowanie\n");
            System.out.println("0 - wyjście");
            System.out.println("Twój wybór : ");
            choice = skan.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("\nWprowadź cyfrę: ");
                    x = skan.nextDouble();
                    System.out.println("\nWprowadź drugą cyfrę: ");
                    y = skan.nextDouble();

                    z = x + y;
                    System.out.printf("\nWynik dodawania dwóch liczb wynosi : %.2f", z);


                case 2:
                    System.out.println("\nWprowadź cyfrę: ");
                    x = skan.nextDouble();
                    System.out.println("\nWprowadź drugą cyfrę: ");
                    y = skan.nextDouble();

                    z = x - y;
                    System.out.printf("\nWynik odejmowania dwóch liczb wynosi : %.2f", z);


                case 3:
                    System.out.println("\nWprowadź cyfrę: ");
                    x = skan.nextDouble();
                    System.out.println("\nWprowadź drugą cyfrę: ");
                    y = skan.nextDouble();

                    z = x * y;
                    System.out.printf("\nWynik mnożenia dwóch liczb wynosi : %.2f", z);


                case 4:
                    System.out.println("\nWprowadź cyfrę: ");
                    x = skan.nextDouble();
                    System.out.println("\nWprowadź drugą cyfrę: ");
                    y = skan.nextDouble();

                    z = x / y;
                    System.out.printf("Wynik dzielenia dwóch liczb wynosi : %.2f", z);


                case 5:
                    System.out.println("Wprowadź cyfrę: ");
                    x = skan.nextDouble();
                    System.out.println("Wprowadź drugą cyfrę: ");
                    y = skan.nextDouble();

                    z = x % y;
                    System.out.printf("Reszta z dzielenia dwóch liczb wynosi : %.2f", z);


                case 6:
                    System.out.println("\nWprowadź cyfrę: ");
                    x = skan.nextDouble();
                    System.out.println("\nPodaj potęgę do której chcesz ponieść " + x);
                    System.out.println("\nTwój wybór : ");
                    y = skan.nextDouble();

                    z = Math.pow(x, y);
                    System.out.printf("\nWynik potęgowania wynosi : %.2f", z);break;

                case 7:
                    System.out.println("\nWprowadź cyfrę: ");
                    x = skan.nextDouble();
                    System.out.println("\nWprowadź stopień pierwiastka: ");
                    y = skan.nextDouble();

                    z = Math.pow(x, (1 / y));
                    System.out.printf("\nWynik pierwiastkowania wynosi  : %.2f", z);


                case 0:
                    System.out.println("\nHave a nice day... :)");
            }
        }
while(choice!=0);

return choice;
    }
}
