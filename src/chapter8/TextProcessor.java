package chapter8;

public class TextProcessor {

    public static void main(String args[]) {
        countWords("I love Betty La Fea");
    }

    private static void countWords(String paramText) {
        var words = paramText.split(" ");
        int numberOfWord = words.length;

        String message = String.format("Your text contains %d words:", numberOfWord);
        System.out.println(message);

        for (int i = 0; i < numberOfWord; i++) {
            System.out.println(words[i]);
        }
    }
}
