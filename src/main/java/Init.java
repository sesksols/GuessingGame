

import java.util.Scanner;

public class Init {

    public static void startGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        Player pl = new Player(sc.nextLine());
        System.out.println("Привет, " + pl.playerName + "!" + " Хочешь сыграть в игру?");
        System.out.println("1. Да");
        System.out.println("2. Нет");
    }//----End of methos startGame
}//--------End of class Init
