package product;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GameFileWriter {
    public static void writeIntoFile(String text) throws IOException
    {
      Files.write(
       Paths.get("C:\\Users\\Joe\\Documents\\UMKC\\Classes\\Senior\\CS 
449\\Sprint5\\output.txt"),
       text.getBytes(), StandardOpenOption.APPEND);
    }
}