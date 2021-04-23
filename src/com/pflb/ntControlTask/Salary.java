package com.pflb.ntControlTask;

public class Salary implements Helper<Integer> {
    private String organisation;
    private String person;
    private int salary;

    public Salary(String organisation, String person, int salary) {
        this.organisation = organisation;
        this.person = person;
        this.salary = salary;
    }

    @Override
    public String getFrom() {
        return organisation;
    }

    @Override
    public String getTo() {
        return person;
    }

    @Override
    public Integer getContent() {
        return salary;
    }
}
