import datastores.ByteDatastore;
import datastores.JsonDatastore;
import generator.EmployeeDataGenerator;
import generator.TimeTravelingCharacterQuotesGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

public class App {

    private static final Class[] datastores = {
            JsonDatastore.class,
            ByteDatastore.class
    };

    private static final Class[] generators = {
            EmployeeDataGenerator.class,
            TimeTravelingCharacterQuotesGenerator.class
    } ;

    public static void main(String[] args) {

        //TODO Step 2 - update this main function to incorporate your solution

        DataInputWriter writer = new DataInputWriter();
        writer.storeData();

    }

//    private static Datastore selectDatastore() {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("What type of datastore would you like to use? (enter number)");
//
//        printOptions(datastores);
//
//        try {
//            int selectedOption = Integer.parseInt(reader.readLine()) - 1;
//            return (Datastore) datastores[selectedOption].getConstructor().newInstance();
//        } catch (IOException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
//
//        return selectDatastore();
//    }

//    private static Generator selectDataGenerator() {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("What type of data generator would you like to use? (enter number)");
//
//        printOptions(generators);
//
//        try {
//            int selectedOption = Integer.parseInt(reader.readLine()) - 1;
//            return (Generator) generators[selectedOption].getConstructor().newInstance();
//        } catch (IOException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        return selectDataGenerator();
//    }

    private static void printOptions(Class[] array) {
        for (int i = 0; i < array.length; i++) {
            String option = (i + 1) +
                    ". " + array[i].getCanonicalName();
            System.out.println(option);
        }
    }
}
