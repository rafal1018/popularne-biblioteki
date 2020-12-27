package pl.strefakursow;


import lombok.extern.java.Log;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Log
public class Main {
    public static void main(String[] vararg) throws Exception {

        List<Cloth> clothList = new ArrayList<>();
        clothList.add(new Cloth("Green", true));
        clothList.add(new Cloth("Red", false));
        ExampleModel exampleModel = new ExampleModel();
        exampleModel.setHairColor("Blond");
        exampleModel.setHeight(190);
        exampleModel.setAge(4);
        exampleModel.setCloths(clothList);
        ExampleModel exampleModel2 = new ExampleModel();
        exampleModel2.setHairColor("Blond");
        exampleModel2.setHeight(1902);
        exampleModel2.setMale(true);
        exampleModel2.setAge(42);

        List<ExampleModel> listOld = Arrays.asList(exampleModel, exampleModel2);

        Serializer serializer = new Persister();

        File out = new File("example.xml");
        serializer.write(exampleModel, out);

        ExampleModel exampleModelread = serializer.read(ExampleModel.class, out);

        log.info(String.valueOf(exampleModelread.equals(exampleModel)));
    }
}
