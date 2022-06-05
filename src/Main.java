public class Main {
    public static void main(String[] args) {
        System.out.println(homework(20,-20));
    }
    public static String homework(int age, int temperature) {
       if (age > 20 && age < 45 && temperature > -20 && temperature < 30){
           return (" go to walk");
       }else if (age < 20 && temperature > 0 && temperature < 28){
           return ("go to walk");
       }else if (age > 45 && temperature > -10 && temperature < 25){
           return ("go to walk");
       }else {
           return ("stay at home");
       }
    }
}