package com.gFilter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> malePeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePeople.add(person);
            }
        }
        return malePeople;
    }
}
