public class stringBuilderIntro {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello"); // Append a string
        sb.append(" ");
        sb.append("world");

        System.out.println(sb.toString()); // Convert StringBuilder to String and print

        sb.insert(5, ", "); // Insert a substring at index 5
        System.out.println(sb.toString());

        sb.replace(6, 11, "there"); // Replace a substring from index 6 to 10
        System.out.println(sb.toString());

        sb.delete(5, 7); // Delete characters from index 5 to 6
        System.out.println(sb.toString());

        sb.reverse(); // Reverse the string
        System.out.println(sb.toString());
    }
}
