import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int seconds = requestNumber();
        checkTime(seconds);    
    }
    static void checkTime(int sec) {
        int h = sec / 3600;
        int m = sec % 3600/60;        
        int leftSec = sec % 60;       
        System.out.printf("Прошло:" + "\n" + "полных часов с начала суток - " + h + "\n" + "полных минут" +
                " с начала очередного часа - " + m + "\n" + "полных секунд с начала очередной минуты - " + leftSec);
    }
    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextInt();
     
    }   
}
