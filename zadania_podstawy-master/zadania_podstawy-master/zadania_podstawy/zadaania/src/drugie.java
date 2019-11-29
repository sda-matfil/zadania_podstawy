package zadaania.src;

import java.util.Scanner;

public class drugie {

    public String second(){
        String napis="dupa";
        int waga;
        double BMI, wzrost;

        Scanner skan = new Scanner(System.in);
        System.out.println("\nWpisz swój wzrost (w centymetrach): ");
        wzrost = skan.nextInt();

        System.out.println("\nPodaj swoją wagę (w kilogramach): ");
        waga = skan.nextInt();
        wzrost = wzrost / 100;
        BMI = (double) waga / (double) (Math.pow(wzrost, 2));

        System.out.println("\n\n");
        if (BMI < 18.9) {
            System.out.printf("Twoje BMI wynosi: %5.2f. \n Masz niedowagę. ", BMI);
        } else if (BMI > 25) {
            System.out.printf("Twoje BMI wynosi: %5.2f. \n Masz nadwagę. ", BMI);
        } else
            System.out.printf("Twoje BMI wynosi: %5.2f. \n Waga prawidłowa. ", BMI);

        System.out.println("\n\n");
        return napis;
    }
}
