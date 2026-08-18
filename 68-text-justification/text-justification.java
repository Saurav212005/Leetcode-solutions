class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < words.length) {

            // Find how many words can fit in this line
            int j = i;
            int lineLength = 0;

            while (j < words.length &&
                   lineLength + words[j].length() + (j - i) <= maxWidth) {

                lineLength += words[j].length();
                j++;
            }

            int numberOfWords = j - i;
            int spaces = maxWidth - lineLength;

            // Last line OR only one word
            if (j == words.length || numberOfWords == 1) {

                StringBuilder line = new StringBuilder();

                for (int k = i; k < j; k++) {

                    line.append(words[k]);

                    if (k < j - 1) {
                        line.append(" ");
                    }
                }

                // Add remaining spaces at the end
                while (line.length() < maxWidth) {
                    line.append(" ");
                }

                result.add(line.toString());
            }

            // Normal line - fully justified
            else {

                int gaps = numberOfWords - 1;

                int spacePerGap = spaces / gaps;
                int extraSpaces = spaces % gaps;

                StringBuilder line = new StringBuilder();

                for (int k = i; k < j; k++) {

                    line.append(words[k]);

                    if (k < j - 1) {

                        int count = spacePerGap;

                        // Give extra space to left gaps
                        if (extraSpaces > 0) {
                            count++;
                            extraSpaces--;
                        }

                        for (int s = 0; s < count; s++) {
                            line.append(" ");
                        }
                    }
                }

                result.add(line.toString());
            }

            i = j;
        }

        return result;
    }
}