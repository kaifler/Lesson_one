package Homework_1;

public class Data {
    public static void main(String[] args) {
        Man [] man = new Man [4];
        man [0] = new Man("Петя", 120);
        man [1] = new Man("Вася", 89);
        man [2] = new Man("Коля", 100);
        man [3] = new Man("Инокентий", 108);
        Team team = new Team("Три друга и ещё один", man);

        Pool pool = new Pool(100);
        String result = pool.doIt (team);
        System.out.println(result);
    }
}
