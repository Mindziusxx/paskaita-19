package example3;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) {


        try (
                FileOutputStream fileOutputStream = new FileOutputStream("index2.txt");
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ) {

            bufferedOutputStream.write("Sveiki".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
