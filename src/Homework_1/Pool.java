package Homework_1;

public class Pool {
    String result;
    private int length;

    public Pool (int length) {
        this.length = length;
    }
    public String doIt(Team team) {
        result = "Команда:" + team.getName() + " " + '\n';
        for (Man man: team.getPeoples()){
            result += "Пловец: " + man.getName() + " " + '\n';
            int value = man.getSkillSwimm();
            testLength(value);
        }
        return result;
    }
    private void testLength (int value){
        if (value>length) result += "Проплыл"+ '\n';
        else result += "Всплыл"+ '\n';
    }
}
