package at.campus02.iwi.pictures;

public class Picture {
    int length;
    int width;


    public int totalPixels(){
        int totalPixels=length*width;
        return totalPixels;
    }
    public int totalSize(int bytePerPixel){
        int totalSize;
        totalSize= bytePerPixel*totalPixels();
        return totalSize;
    }
    public void Scale(double factor){
        length= (int) (factor*length);
         width= (int) (factor* width);
    }
}