
public class ExpandedCharacters {
    public static void main(String[] args) {
        String input = "a1b2d4";
        System.out.println(expandString(input));

    }
    public  static String expandString(String input) {
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < input.length(); i += 2) {
            char letter = input.charAt(i);

            int count = Character.getNumericValue(input.charAt(i + 1));


            for (int j = 0; j < count; j++) {
                result.append(letter);
            }
        }

        return result.toString();
    }
}


