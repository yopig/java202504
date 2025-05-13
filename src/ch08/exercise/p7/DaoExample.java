package ch08.exercise.p7;

public class DaoExample {
    public static void dbWork(dataaccessobject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new orcledao());
        dbWork(new Mysqldao());
    }
}
