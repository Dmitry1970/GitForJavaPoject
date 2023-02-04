import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int seconds = requestNumber();
        checkTime(seconds);    
    }
    static void checkTime(int sec) {
        int hours = sec / 3600;
        int minutes = sec % 3600/60;
        System.out.println(minutes);
        int leftSeconds = sec % 60;
        System.out.println(leftSeconds);
        System.out.printf("Прошло:" + "\n" + "полных часов с начала суток - " + hours + "\n" + "полных минут" +
                " с начала очередного часа - " + minutes + "\n" + "полных секунд с начала очередной минуты - " + leftSeconds);
    }
    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextInt();
     
    }   
}
