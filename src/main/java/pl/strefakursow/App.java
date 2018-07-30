package pl.strefakursow;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import org.simpleframework.xml.Serializer;

/**
 * Hello world!
 */
@AllArgsConstructor
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        new Gson();
//        new Serializer();
    }
}
