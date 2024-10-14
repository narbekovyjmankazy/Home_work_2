import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(permission(34, -7));
        System.out.println(permission(generateRandomAge(), 7));
        System.out.println(permission(5, -20));
        System.out.println(permission(generateRandomAge(), -15));
        System.out.println(permission(56, 12));
    }
    public static String permission(int age, int temperature){
        if(age > 20 && age < 45 && temperature > -20 && temperature < 30){
            return "можно идти гулять";
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return "можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "можно идти гулять";
        } else {
            return "оставайтесь дома";
        }
    }
    public static int generateRandomAge() {
        Random random = new Random();
        int number = random.nextInt(70)+1;
        return number;
    }
}