package ch08.sec08;

public class multiinterfaceimplexample {
    public static void main(String[] args) {

        RemoteControl rc = new SmartTelevision();
        rc.turnon();
        rc.turnoff();
        Searchable s = new SmartTelevision();
        s.search("httpsyoutubu");
    }
}
