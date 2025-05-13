package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {
    @Override
    public void turnon() {
        System.out.println("tv를 켭니다");
    }

    @Override
    public void turnoff() {
        System.out.println("tv를 끕니다");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "를 검색합니다");
    }
}
