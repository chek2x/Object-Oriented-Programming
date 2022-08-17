public class PrintDemo {
    public static void main(String[] args) {
        Ownership.Introduction();

        System.out.print("This is a string ");
        System.out.print(" with a number on the same line ");
        System.out.print(762);
        System.out.println();
        System.out.print("This is a number " + 512);
        System.out.print(" and another number " + 88 +
                " all on the same line");

        System.out.print("\nThis is a concatenation of both string and integer: ");
        System.out.print("String and " + 157 + "\n");
    }
}
