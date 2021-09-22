package com.gFilter;

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Person> meetCriteria(List<Person> people) {
        List<Person> first = criteria.meetCriteria(people);
        List<Person> other = otherCriteria.meetCriteria(people);

        for (Person person : other) {
            if (!first.contains(person)) {
                first.add(person);
            }
        }

        return first;
    }
}
