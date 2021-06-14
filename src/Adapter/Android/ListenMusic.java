package Adapter.Android;

public class ListenMusic {
    private AndroidHeadSet androidHeadSet;

    public ListenMusic(AndroidHeadSet androidHeadSet){
        this.androidHeadSet = androidHeadSet;
    }

    public void listenSongs(String str){
        androidHeadSet.giveSound(str);
    }
}
