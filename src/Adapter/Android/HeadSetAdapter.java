package Adapter.Android;

import Adapter.Iphone.IphoneHeadSet;

public class HeadSetAdapter implements AndroidHeadSet{
    IphoneHeadSet iphoneHeadSet = new IphoneHeadSet();

    @Override
    public void giveSound(String str) {
        iphoneHeadSet.qualitySound(str);
    }
}
