package proxy;

public class RealVideo implements Video {
    private String videoName;

    public RealVideo(String videoName) {
        this.videoName = videoName;
        download();
    }

    private void download() {
        System.out.println("--> [DOWNLOADING] Connecting to server & buffering 4K video: " + videoName);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + videoName);
    }
}
