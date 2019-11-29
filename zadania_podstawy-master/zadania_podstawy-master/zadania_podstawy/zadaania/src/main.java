package zadaania.src;

import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        int choice;
        String quit;
        Scanner skan = new Scanner(System.in);
        do {


            System.out.println("\nDokonaj wyboru od 1 do 8\n");
            System.out.println("1. znajdź Max/Min\n2. oblicz Body Mass Index");
            System.out.println("3. Kalkulator\n4. Liczby nie/parzyste malejaco");
            System.out.println("5. Potęgi danej liczby\n6. Działania na ciągu liczb");
            System.out.println("7. Czy liczba jest pierwsza?\n8. Liczby parzyste/nieparzyste");
            System.out.println("8. Wyjście");
            System.out.println("Twój wybór : ");

            choice = skan.nextInt();

            switch (choice) {
                case 1:
                    String first = new pierwsze().first();
                    break;

                case 2:
                    String second = new drugie().second();
                    break;

                case 3:
                    Integer third = new trzecie().third();
                    break;

                case 4:
                Integer fourth = new czwarte().fourth();
                    break;

                case 5:
                    Integer fifth = new piąte().fifth();
                    break;

                case 6:
                    Integer sixth = new szóste().sixth();
                    break;

                case 7:
                    Integer seventh = new siódme().seventh();
                    break;

                case 8:
                    String ósme = new ósme().eight();
                  break;

                case 9:
                    Integer dziewiate = new dziewiąte().ninth();
                    break;



            }
            System.out.println("\nPress q to QUIT\n or \nany key to continue");
            quit = skan.next();

        }

                while (!(quit.equals("q"))) ;


    }

}
