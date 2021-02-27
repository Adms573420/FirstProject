import java.util.Scanner;

public class Lesson_5 {
    public static void main(String[] args) {
        System.out.println("Gun Adını Yazınız:");
        Scanner scanner = new Scanner(System.in);
        String gun = scanner.next();




        switch (gun.toLowerCase()) {
            case "cuma":
                System.out.println("Müslümanlar için kutsal gün.");
                break;
            case "Cumartesi":
                System.out.println("Yahudiler için kutsal gün.");
                break;
            case "Pazar":
                System.out.println("Hristiyanlar için kutsal gün.");
                break;
            default:
                System.out.println("Kutsal gün degil.");

        }


    }
}
