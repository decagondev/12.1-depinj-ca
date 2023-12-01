package generator;

import com.github.javafaker.Faker;
import model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EmployeeDataGenerator {

    public List<Employee> produceData() {
        List<Employee> data = new ArrayList<>();
        Faker faker = new Faker();
        for (int i = 0; i < 100; i++) {
            data.add(new Employee(
                            faker.name().name(),
                            UUID.randomUUID().toString(),
                            faker.number().numberBetween(1980, 2022),
                            faker.job().position(),
                            faker.number().numberBetween(50000, 200000),
                            faker.address().fullAddress()
                    )
            );
        }
        return data;
    }
}
