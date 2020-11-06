package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write yuor band ");
        song.band = scanner.nextLine();
        System.out.println("Write yuor song ");
        song.title = scanner.nextLine();

        System.out.println("Write yuor length");
        song.length = scanner.nextFloat();

System.out.println(song.band);
System.out.println(song.title);
System.out.println(song.length);
    }
}
