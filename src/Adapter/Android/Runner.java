package Adapter.Android;

public class Runner {
    public static void main(String[] args) {
        AndroidHeadSet androidHeadSet = new HeadSetAdapter();
        ListenMusic lm = new ListenMusic(androidHeadSet);
        lm.listenSongs("I am listing to a song");
    }
}
