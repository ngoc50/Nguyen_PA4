package nguyen_p2;

import java.io.File;

public class Application {
    public static void main (String[] args)
    {
        DuplicateCounter duplicateCounter = new DuplicateCounter();
        duplicateCounter.count("problem2.txt");
        duplicateCounter.write(new File("unique_word_counts.txt"));
    }
}
