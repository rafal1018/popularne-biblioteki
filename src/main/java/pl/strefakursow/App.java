package pl.strefakursow;

import com.google.gson.Gson;
import com.google.inject.Inject;
import lombok.AllArgsConstructor;
import okhttp3.OkHttpClient;
import org.simpleframework.xml.Serializer;

/**
 * Hello world!
 */
@AllArgsConstructor
public class App {

    @Inject
    public static void main(String[] args) {
        System.out.println("Hello World!");
        new Gson();
//        new Serializer();
        OkHttpClient client = new OkHttpClient();
    }
}
