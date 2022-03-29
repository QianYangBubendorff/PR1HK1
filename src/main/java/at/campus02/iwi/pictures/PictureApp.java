package at.campus02.iwi.pictures;

public class PictureApp {
    public static void main(String[] args) {
        Picture picture1= new Picture();
        picture1.length = 640;
        picture1.width = 480;
        picture1.totalPixels();
        int totalsize= picture1.totalSize(20);
        System.out.println( totalsize);
        System.out.println(picture1.totalPixels());
    }
}
