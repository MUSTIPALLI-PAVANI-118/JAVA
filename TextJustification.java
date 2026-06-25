import java.util.*;

public class TextJustification {
    private static String spaces(int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) builder.append(' ');
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int width = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) words[i] = sc.next();

        // Greedily place as many words as possible on each line.
        int index = 0;
        while (index < n) {
            int last = index + 1;
            int wordLength = words[index].length();
            while (last < n && wordLength + 1 + words[last].length() <= width) {
                wordLength += 1 + words[last].length();
                last++;
            }

            int gaps = last - index - 1;
            StringBuilder line = new StringBuilder();
            if (last == n || gaps == 0) {
                for (int i = index; i < last; i++) {
                    if (i > index) line.append(' ');
                    line.append(words[i]);
                }
                line.append(spaces(width - line.length()));
            } else {
                int letters = 0;
                for (int i = index; i < last; i++) letters += words[i].length();
                int totalSpaces = width - letters;
                int each = totalSpaces / gaps;
                int extra = totalSpaces % gaps;
                for (int i = index; i < last; i++) {
                    line.append(words[i]);
                    if (i < last - 1) {
                        line.append(spaces(each));
                        if (extra > 0) {
                            line.append(' ');
                            extra--;
                        }
                    }
                }
            }
            System.out.println(line.toString());
            index = last;
        }
    }
}

