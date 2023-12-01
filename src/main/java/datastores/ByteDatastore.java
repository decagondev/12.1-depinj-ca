package datastores;

import org.apache.commons.io.FileUtils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class ByteDatastore {

    public void store(List data) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(baos);
            oos.writeObject(data);
            // Convert to Byte Array
            byte[] byteArray = baos.toByteArray();
            FileUtils.writeByteArrayToFile(new File("data"), byteArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
