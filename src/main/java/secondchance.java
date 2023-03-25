import java.util.Arrays;

public class secondchance {
    public static void printname(){
        System.out.println("Edwin Velasco");
    }
public static String greetUser(String username){
        return ("Welcome to my website " + username);
}

public static int buyCoffee (int dollars){
        int priceOfCoffee = 1 - dollars;
        return priceOfCoffee;
}
public static String [] myHobbies (String[] hobbies){
    return hobbies;
}
public static String checkWeather(String weatherCondition , int temp){
return
}


    public static void main(String[] args) {
        System.out.println("Question 1:");
        printname();
        System.out.println();
        System.out.println("Question 2:");
        System.out.println(greetUser("ev3lasco"));
        System.out.println();
        System.out.println("Question 3");
        System.out.println("Change is $" + buyCoffee(2));
        System.out.println();
        System.out.println("Question 4");
        System.out.println(Arrays.toString(myHobbies(new String[]{"Pussy", "Money", "Cars"})));


    }


}
