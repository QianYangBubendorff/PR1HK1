package at.campus02.iwi.pictures;

public class Picture {
    public int length;
    public int width;


    public int totalPixels(){
        int totalPixels=length*width;
        return totalPixels;
    }
    public int totalSize(int bytePerPixel){
        int totalSize;
        totalSize= bytePerPixel*totalPixels();
        return totalSize;
    }
    public void scale(double factor){
        length= (int) (factor*length);
         width= (int) (factor* width);
//         width*=factor;
    }
}