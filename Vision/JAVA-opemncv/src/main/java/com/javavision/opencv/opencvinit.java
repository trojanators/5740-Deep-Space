package main.java.com.javavision.opencv;
import org.opencv.core.*;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class opencvinit{
    static{
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
    public void init(){
        VideoCapture cap = new VideoCapture(1);
    }
}