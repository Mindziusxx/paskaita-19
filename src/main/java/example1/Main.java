package example1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("index.txt")
        ) {
            int i = 0;                          ///Ciklą leidžiam, kad kiekieną simbolį nuskaityti iš failo ir gaunam žodį.
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
