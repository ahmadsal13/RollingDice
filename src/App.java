import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Random coolNumberBro = new Random();
        int x = coolNumberBro.nextInt(6) + 1;
        // java starts at 0 so add 1 to avoid the 0 and get the 6 in the range

        // stores the dice program in the int x

        System.out.println("You rolled a: " + x);
    }
}
