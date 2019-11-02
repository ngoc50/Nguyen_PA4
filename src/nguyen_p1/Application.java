package nguyen_p1;

public class Application {
    public static void main (String[] args)
    {
        DuplicateRemover duplicateRemover = new DuplicateRemover();
        duplicateRemover.remove("problem1.txt");
        duplicateRemover.write("unique_word.txt");
    }
}
