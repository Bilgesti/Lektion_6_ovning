package com.bilgee.lektion_6_ovning;

public class Main {

    public static void main(String[] args) {

        System.out.println("Part3");
        //Få appen att sluta krascha!
        //Skapa en try catch runt for-loopen och if-satsen som skapade
        //kraschen tidigare.
        //(Detta ska kasta ett felmeddelande.
        //Detta går att testa om du har en ‘SOUT’ efter ‘try’, körs den så
        //fungerar det!)

    try {
        System.out.println("Crash");
        for (int i = 0; i < 5; i++) {
            if (i > 1) {
                System.out.println(i + 1);
            }
        }
    }catch (Exception error) {
        System.out.println("End");
    }

    }

}

