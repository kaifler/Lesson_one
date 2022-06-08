package Homework_1;

public class Team {
    private String name;
    private Man[] peoples;

    public Team (String name, Man[] peoples) {
        this.name = name;
        this.peoples = peoples;
    }
    public String getName() {return name; }
    public Man[] getPeoples() {return peoples; }
}
