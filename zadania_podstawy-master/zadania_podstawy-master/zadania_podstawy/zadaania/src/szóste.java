package zadaania.src;

import java.util.ArrayList;
import java.util.Scanner;

public class szóste {
    public Integer sixth(){


        Scanner skan = new Scanner(System.in);
        int x;

        ArrayList<Integer> lista = new ArrayList<Integer>();

            for (int i = 0;; i++) {

                System.out.println("\nWpisz liczbę,a by dodać do tablicy albo wpisz 0, aby wyświetlić ciąg");
                x = skan.nextInt();
                if (x == 0) {
                    System.out.println("\n\nStworzyny ciąg wygląda następująco :\n" +lista);

                    System.out.println("\n Co chcesz wyswitlic na ekranie? ");
                    System.out.println("1. Sumę\n2. średnią\n3. Wartość max/min");
                    System.out.println("\nTwój wybór : ");
                    int choice = skan.nextInt();
                    switch (choice) {
                        case 1:
                            int suma=0;
                        for (int j = 0; j < lista.size(); j++) {
                            suma+= lista.get(j);
                        }
                            System.out.println("Suma wprowadzonych liczb wynosi : "+suma);

                        case 2:
                            double średnia=0;
                            for(int j=0;j<lista.size();j++){
                                średnia+=lista.get(j);
                            }
                            System.out.println("średnia wynosi : "+średnia/lista.size());

                        case 3:

                                int y = 0;
                                int z = Math.min(lista.get(y), lista.get(y+1));
                                int c = Math.min(lista.get(y), lista.get(y+1));
                                do {
                                    z = Math.min(z, lista.get(y));
                                    c = Math.max(c, lista.get(y));
                                    y++;

                                } while (y <= lista.size() - 1);
                                System.out.println("\n Wartość minimalna wynosi: " + z+"\n Wartość maksymalna wynosi: " + c);



                    }



                    break;
                }
                lista.add(x);
// System.out.println(lista);
            }return x;
            }

    }


