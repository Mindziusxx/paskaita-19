package example6;

import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("index3.txt")) {

            ///reikia pabaigti...

        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
