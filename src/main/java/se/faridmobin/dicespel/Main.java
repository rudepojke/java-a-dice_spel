package se.faridmobin.dicespel;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hej! Välkommen till Farids första spel!");
        System.out.println("För att starta spelet tryck på retur på tangentbordet!");
        System.out.println("För att läsa spelets regler, ange R!");

        String regler = scanner.nextLine();

        if (regler.equals("R")){
            System.out.println("Det här spelet är ett tärningsspel. Max antal spelare är 2.");
            System.out.println("Varje spelare får slå tärningen 2 gånger.");
            System.out.println("Slå tärningen med hjälp av Retur-knappen.");
            System.out.println("Spelaren som får högst antal totala poäng vinner!");
            System.out.println("Spelet startar nu...");

        } else {
            System.out.println("Spelet startar nu...");
        }


        System.out.println("Första spelarens namn:");
        String namePlayerOne = scanner.nextLine();
            System.out.println("Welcome "+ namePlayerOne+"!");
            System.out.println(" ");


        System.out.println("Andra Spelarens namn: ");
        String namePlayerTwo = scanner.nextLine();
            System.out.println("Welcome "+namePlayerTwo+"!");
            System.out.println(" ");



        Player newPlayer = new Player(namePlayerOne, namePlayerTwo);


        System.out.println(namePlayerOne+" slår tärningen:");
        scanner.nextLine();
        Random random1 = new Random();
            int roll1 = random1.nextInt(6)+1;
                System.out.println("Du kastade: "+roll1);



        System.out.println(namePlayerOne+ " slår tärningen igen:");
        scanner.nextLine();
        Random random2 = new Random();
            int roll2 = random2.nextInt(6)+1;
                System.out.println("Du kastade: "+roll2);


        int total1 = roll1 + roll2;
            System.out.println("Din totala poäng är "+ total1 + " " + namePlayerOne + "!");
            System.out.println(" ");



        System.out.println(namePlayerTwo + " Slår tärningen:");
        scanner.nextLine();
        Random random3 = new Random();
            int roll3 = random3.nextInt(6)+1;
            System.out.println("Du kastade: " + roll3);



        System.out.println(namePlayerTwo + " Slår tärningen igen:");
        scanner.nextLine();
        Random random4 = new Random();
            int roll4 = random4.nextInt(6)+1;
                System.out.println("Du kastade: " + roll4);



        int total2 = roll3 + roll4;
            System.out.println("Din totala poäng är "+ total2 + " " + namePlayerTwo + "!");
            System.out.println(" ");



        if (total1 > total2){
            System.out.println("Grattis " + namePlayerOne + "! Du vann!");

            } else if (total1 < total2) {
                System.out.println("Grattis " + namePlayerTwo + "! Du vann!");

            } else {
                System.out.println("Ingen vinnare tyvär. Det är oavgjort. Eller man kan säga båda har vunnit!;)");

            }


        System.out.println("Spelet är över nu! Om du vill spela igen, kör om programmet.");

    }

}
