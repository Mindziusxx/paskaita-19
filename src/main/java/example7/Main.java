package example7;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("index4.txt"))
        ) {
            String line = bufferedReader.readLine();

            while (!line.equals("stop")) {
                String[] splitedLine = line.split(",");
                Person person = new Person();
                person.setName(splitedLine[0]);
                person.setHeight(splitedLine[1]);

                System.out.println(person);
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}