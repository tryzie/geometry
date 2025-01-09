public class StringFormatter {
    public String format (String input){
        if (input == null || input.isEmpty()){
            return input;
        }
        String [] words = input.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                String firstLetter = word.substring(0,1).toUpperCase();
                String restOfTheWord = word.substring(1).toLowerCase();
                result.append(firstLetter).append(restOfTheWord).append(" ");
            }
        }

        return result.toString().trim();

    }

    public  String format (String input, int repeat){
        if (repeat<0){
            return "Repeat cannot be negative";
        }
        String result = "";

        for (int i =0; i<repeat; i++){
            result += input;
            if (i<repeat-1) {
                result += " ";
            }
        }
        return  result ;
    }

    public String format (String input, String prefix, String suffix){
        return prefix + input + suffix;
    }
}
