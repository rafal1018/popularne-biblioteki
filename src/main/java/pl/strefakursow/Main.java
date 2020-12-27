package pl.strefakursow;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import lombok.extern.java.Log;
import okhttp3.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

@Log
public class Main {
    public static void main(String[] vararg) throws Exception {

        OkHttpClient client = new OkHttpClient();

        final Request request = new Request.Builder()
                .url("http://www.json-generator.com/api/json/get/bUjOtRBGTC?indent=2")
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                log.info(e.toString());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String json = response.body().string();
                Type type = new TypeToken<List<Cloth>>() {}.getType();
                List<Cloth> cloths = new Gson().fromJson(json, type);
                log.info(cloths.get(0).toString());
            }
        });

        log.info("Koniec bloku");
    }
}
