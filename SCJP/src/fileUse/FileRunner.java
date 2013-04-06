package fileUse;

import java.io.*;

/**
 * 1.File represents the actual file(but not the data in the files) or
 * directories that exists on a computer's physical disk.
 * 2.Remember to invoke close() on reader and writer. 
 *
 */
public class FileRunner {
    public static void main(String[] args) {
        //Notice:I/O is one of those inherently risky things!!!!!
        try {
            boolean newFile = false;
            File file = new File("fileWriter.txt");//There is no file yet!
            System.out.println(file.exists());
            newFile = file.createNewFile();//create a new file if it doesn't already exist
            System.out.println(newFile);
            /**
             * File file = new File("fileWriter.txt");//no file yet.
             * FileWriter fw = new FileWriter(file);//create an actual file and a FileWriter object 
             */
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("Hello");
            writer.newLine();
            writer.write("world");
            writer.flush();
            writer.close();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String s;
            while((s = reader.readLine())!= null) {
                System.out.println(s);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
