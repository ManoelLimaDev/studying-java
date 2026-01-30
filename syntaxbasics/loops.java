public class loops {
    public static void main(String[] args) {
        int capitalA= 65;
        int capitalZ = 90;
        int lowerA= 97;
        int lowerZ = 122;

        System.out.println("THIS ARE THE CAPITAL LETTERS");
        for (int i = capitalA; i <= capitalZ; i++){
            char letter = (char) i;
            System.out.print(letter + " ");
        }
        System.out.println("\n");
        System.out.println("THIS ARE THE LOWERCASE LETTERS");
        int i = lowerA;
        while(i <= lowerZ){
            char letter = (char) i;
            System.out.print(letter + " ");
            i++;
        }

    }
}
