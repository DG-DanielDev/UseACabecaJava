package chapter2.moviepoo;

import java.util.Scanner;

public class MovieTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Lost in the Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;

        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;

        System.out.println("Qual filme quer assistir?");
        System.out.printf("| Digite: 1 para %s | Digite: 2  para %s | Digite: 3 para %s | %n", one.title, two.title, three.title);

        int chosenMovie = scanner.nextInt();
        if(chosenMovie == 1){
          System.out.println("Você escolheu o filme: " + one.title);
          one.playIt();
        } else if(chosenMovie == 2) {
          System.out.println("Você escolheu o filme: " + two.title);
          two.playIt();
        } else if(chosenMovie == 3) {
          System.out.println("Você escolheu o filme: " + three.title);
          three.playIt();
        } else{
          System.out.println("Não há esse filme em cartaz!");
        }
    }
}