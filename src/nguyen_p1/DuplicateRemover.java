package nguyen_p1;

import java.io.*;
import java.util.Arrays;

public class DuplicateRemover {
    public void remove(String dataFile) throws IOException {
    BufferedReader inputStream = null;
    PrintWriter outputStream = null;

    try {
        inputStream = new BufferedReader(new FileReader("problem1.txt"));
        outputStream = new PrintWriter(new FileWriter("unique_word.txt"));

        String firstLine;
        while (firstLine = inputStream.readLine()) != null)
        {
            for (String i : temp)
            {
                if (!uniqueWords.contains(i))
                {

                    uniqueWords.add(i);
                }
            }
            firstLine = buffReader.readLine();
        }
        buffReader.close();
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
}

public void write(String dataFile) throws FileNotFoundException {
    PrintWriter printWriter = new PrintWriter(new File(dataFile));

        for(String writeWords: uniqueWords)
        {
            printWriter.println(writeWords);
        }
        printWriter.close();
    }
}
