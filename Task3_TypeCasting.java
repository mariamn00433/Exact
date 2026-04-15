public class Task3_TypeCasting {
    public static void main(String[] args) {
        double price= 29.99;
        int newPrice = (int) price;
        System.out.println("Original price (double): " + price);
        System.out.println("Price after casting to int: " + newPrice);

        double div1 =7.0/2;
        int div2=7/2;
        System.out.println("Result of 7.0 / 2 (double division): " + div1);
        System.out.println("Result of 7 / 2 (integer division): " + div2);

        int parseInt = Integer.parseInt("42");
        System.out.println("String \"42\" converted to int: " + parseInt);
    }
}
