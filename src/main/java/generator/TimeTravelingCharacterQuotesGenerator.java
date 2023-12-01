package generator;

import com.github.javafaker.Faker;
import model.Employee;
import model.TimeTravelingCharacterQuotes;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TimeTravelingCharacterQuotesGenerator {

    public List produceData() {
        List<TimeTravelingCharacterQuotes> data = new ArrayList<>();
        Faker faker = new Faker();
        for (int i = 0; i < 100; i++) {
            data.add(new TimeTravelingCharacterQuotes(
                            faker.backToTheFuture().character(),
                            faker.backToTheFuture().date(),
                            faker.backToTheFuture().quote()
                    )
            );
        }
        return data;
    }
}
