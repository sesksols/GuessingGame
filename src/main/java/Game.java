

import java.util.Scanner;

public class Game {
    public static void yesOrNo() {
        Scanner sc = new Scanner(System.in);
        switch (sc.nextLine().toLowerCase()) {
            case "1":
                System.out.println("Хорошо, тогда первый вопрос: ");
                break;
            case "2":
                System.out.println("Очень жаль, но до свидания. Может в следующий раз у тебя будет настроение для игры.");
                break;
            case "да":
                System.out.println("Хорошо, тогда первый вопрос: ");
                break;
            case "нет":
                System.out.println("Очень жаль, но до свидания. Может в следующий раз у тебя будет настроение для игры.");
                break;
            default:
                System.out.println("Вы ввели что-то не то.");
        }


    }//------------End of method yesOrNo
}//----------------end of class Game
