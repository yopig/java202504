package ch08.sec05;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnon();

    void turnoff();

    void setvolume(int volume);

    default void setmute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리");
            setvolume(MIN_VOLUME);
        } else {

            System.out.println("무음 해제");
        }
    }
}
