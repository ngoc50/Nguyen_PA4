package nguyen_p2;

import java.io.*;
import java.util.*;

public class DuplicateCounter {
    private HashMap <String, Integer> wordCount = new HashMap<String, Integer>();

    BufferedReader inputStream = null;
    PrintWriter outputStream = null;

    public void count(File dataFile) throws IOException
    {
        inputStream = new BufferedReader(new FileReader("problem2.txt"));
        outputStream = new PrintWriter(new FileWriter("unique_words.txt"));

        String firstLine = null;

        while (firstLine = inputStream.readLine()) != null)
        {
            if (!wordCount.containsKey(line))
            {
                wordCount.put(line, 1);
            }
            else
            {
                wordCount.put(line, wordCount.get(line) + 1);
            }
        }
        streamFile.close();
    }

    public void write(File outputFile) throws IOException
    {
        Writer newFile = new FileWriter(outputFile, false);

        int length = wordCount.size();
        for (HashMap.Entry<String,Integer> entry : wordCount.entrySet())
        {
            String key = entry.getKey();
            int value = entry.getValue();
            newFile.write(key + " = " + value);
        }
        newFile.close();

    }
}

