public class Task4_StringExplorer {
    public static void main(String[] args) {

        String fullName = "Mariam Medhat Mohy";

        // 2 (Length)
        int length = fullName.length();
        System.out.println("Length: " + length);

        // 3 (Uppercase)
        System.out.println("Uppercase: " + fullName.toUpperCase());

        //  (Lowercase)
        System.out.println("Lowercase: " + fullName.toLowerCase());



        char firstChar = fullName.charAt(0);
        System.out.println("First Character: " + firstChar);


        char lastChar = fullName.charAt(fullName.length() - 1);
        System.out.println("Last Character: " + lastChar);

        // (Reverse)
        String reversed = new StringBuilder(fullName).reverse().toString();
        System.out.println("Reversed: " + reversed);

        // 8 (Space)؟
        boolean hasSpace = fullName.contains(" ");
        System.out.println("Has Space: " + hasSpace);

    }
}
