package ch08.exercise.p7;

public class Mysqldao implements dataaccessobject {

    @Override
    public void dbWork() {

    }

    @Override
    public void select() {
        System.out.println("mysql db에서 검색");

    }

    @Override
    public void insert() {
        System.out.println("mysql db에서 삽입");
    }

    @Override
    public void update() {
        System.out.println("mysql db에서 수정");
    }

    @Override
    public void delete() {
        System.out.println("mysql db에서 삭제");
    }
}
