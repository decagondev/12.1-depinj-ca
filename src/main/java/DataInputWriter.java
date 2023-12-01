import datastores.JsonDatastore;
import generator.EmployeeDataGenerator;

import java.util.List;

public class DataInputWriter {

    //TODO Step 1 - Analyze how this class is structured

    private JsonDatastore datastore;
    private EmployeeDataGenerator generator;

    public DataInputWriter() {
        this.datastore = new JsonDatastore();
        this.generator = new EmployeeDataGenerator();
    }

    public void storeData() {
        List data = generator.produceData();
        datastore.store(data);
    }

}
