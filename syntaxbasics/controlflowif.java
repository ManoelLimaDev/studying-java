public class controlflowif {
    public static void main(String[] args) {
        int age = 10;
        System.out.println("Your age is: " + age + " years old.");
        if (age < 18) {
            System.out.println("You are underage and can't drink.");
        } else if(age < 21) {
            System.out.println("You are of age, but can't drink.");
        }else{
            System.out.println("You are of age and can drink.");
        }
    }
}
