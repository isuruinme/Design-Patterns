package proxy;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        LoadFromCloud(fileName);
    }

    @Override
    public void Display() {
        System.out.println("Preview " + fileName);
    }

    private void LoadFromCloud(String fileName){
        System.out.println("Loading from cloud " + fileName);
    }
}
