package sourceFolder;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
 
public class imageResizer {

    public static void resize(String inputImagePath,
            String outputImagePath, int scaledWidth, int scaledHeight)
            throws IOException {
        File inputFile = new File(inputImagePath);
        BufferedImage inputImage = ImageIO.read(inputFile);
 
        
        BufferedImage outputImage = new BufferedImage(scaledWidth,
                scaledHeight, inputImage.getType());
 
       
        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(inputImage, 0, 0, scaledWidth, scaledHeight, null);
        g2d.dispose();
// 
//       
//        String formatName = outputImagePath.substring(outputImagePath
//                .lastIndexOf(".") + 1);
 
        
        ImageIO.write(outputImage, "png", new File(outputImagePath));
    }
 
    public static void main(String[] args) {
        String inputImageBG =	"C:/Users/satijaa/Documents/Branded_Apps/Coca-Cola/bg.png";
//        String inputImageSplash = "E:/source/splash.png";
       String outputBGPathxhdpi = "E:/source/bg/drawable-xhdpi/bg.png";
//        String outputBGPathhdpi = "E:/source/bg/drawable-hdpi/bg.png";
//        String outputBGPathmdpi = "E:/source/bg/drawable-mdpi/bg.png";
//        String outputSplashPathxhdpi = "E:/source/splash/drawable-xhdpi/splash.png";
//        String outputSplashPathhdpi = "E:/source/splash/drawable-hdpi/splash.png";
//        String outputSplashPathmdpi = "E:/source/splash/drawable-mdpi/splash.png";
 try{
            int widthxhdpi = 1024;
            int heightxhdpi = 500;
//            int widthhdpi = 720;
//            int heighthdpi = 1280;
//            int widthmdpi = 480;
//            int heightmdpi = 800;
            imageResizer.resize(inputImageBG, outputBGPathxhdpi, widthxhdpi, heightxhdpi);
//            imageResizer.resize(inputImageBG, outputBGPathhdpi, widthhdpi, heighthdpi);
//            imageResizer.resize(inputImageBG, outputBGPathmdpi, widthmdpi, heightmdpi);
//            imageResizer.resize(inputImageSplash, outputSplashPathxhdpi, widthxhdpi, heightxhdpi);
//            imageResizer.resize(inputImageSplash, outputSplashPathhdpi, widthhdpi, heighthdpi);
//            imageResizer.resize(inputImageSplash, outputSplashPathmdpi, widthmdpi, heightmdpi);




        } catch (IOException ex) {
            System.out.println("Error resizing the image.");
            ex.printStackTrace();
        }
    }
 
}
