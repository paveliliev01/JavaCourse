public class Main {

    public static void main(String[] args) {
       String literalOne = "FMI";
       String literalTwo = "FMI";
        System.out.println(
                literalOne == literalTwo
        );

        String newStr = new String("FMI");
        String newStr2 = new String("FMI");
        System.out.println(newStr == newStr2);
        System.out.println(literalOne.equals(newStr));
        String newStr3 = newStr.intern();
        System.out.println(newStr3);
        String message = "Hello, my name is Pavel.";
        String[] wordsInMessage = message.split(" ");
        System.out.println("--------------------");
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
        }

    }
}


