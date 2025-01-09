public class Main {
    public static void main(String[] args) {
        Geometry geometry = new Geometry();

       System.out.println("square area [side10]= " + geometry.area(10) + " m^2");
       System.out.println("circle area [radius 10.0]= " +geometry.area(10.0) + " m^2");
       System.out.println("rectangle area [length 19.0, breadth 15]= " +geometry.area(19.0, 15) + " m^2");
       System.out.println("triangle area [base 4, hieght 9, true]= " +geometry.area(4, 9, true) + " m^2");



        // Create a StringFormatter object
        StringFormatter formatter = new StringFormatter();

        // Test Method 1: Capitalizing words
        String text = "hello collins, how are you";
        System.out.println("Original text: " + text);
        System.out.println("Capitalized: " + formatter.format(text));


        // Test Method 2: Repeating string
        String word = "hello";
        System.out.println("\nOriginal word: " + word);
        System.out.println("Repeated 3 times: " + formatter.format(word, 3));


        // Test Method 3: Adding prefix and suffix
        System.out.println("\nWith prefix and suffix: " +
                formatter.format("hello", "<<", ">>"));
    }


}