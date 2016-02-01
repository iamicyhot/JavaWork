package sourceFolder;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;

public class allImages {
	public static void ready() throws IOException
	{		String inputSplash= new String();
			String inputBG = new String();
			String inputIcon = new String();
			String inputChathead = new String();
			String inputFeature = new String();
		
		File folder = new File("C:/Users/satijaa/Downloads");
		File[] listOfFiles = folder.listFiles();
		for (File file: listOfFiles)
		{
			if(file.getName().contains("_BG")&&file.getName().contains(".png"))
			{
				inputBG = file.getAbsolutePath();
				continue;
			}
			else if(file.getName().contains("_Splash")&&file.getName().contains(".png"))
			{
				inputSplash = file.getAbsolutePath();
				continue;
			}

			else if(file.getName().contains("chathead")&&file.getName().contains(".png"))
			{
				inputChathead = file.getAbsolutePath();
				continue;
			}
			else if(file.getName().contains("icon")&&file.getName().contains(".png"))
			{
				inputIcon = file.getAbsolutePath();
				continue;
			}
			else if(file.getName().contains("GooglePlay")&&file.getName().contains(".png"))
			{
				inputFeature = file.getAbsolutePath();
				
				continue;
			}
			
		}
//		System.out.println(inputFeature);
//		System.out.println(inputIcon);
//		System.out.println(inputChathead);
//		System.out.println(inputSplash);
//		System.out.println(inputBG);



		createSplash(inputSplash);
		createBG(inputBG);
		createIcons(inputIcon);
		createChatheads(inputChathead);
		createFeature(inputFeature);
		
	}
	
	public static void createSplash(String inputPath) throws IOException
	{
		File splashx = new File("E:/source/splash/drawable-xhdpi");
		splashx.mkdirs();
		File splashh = new File("E:/source/splash/drawable-hdpi");
		splashh.mkdirs();
		File splashm = new File("E:/source/splash/drawable-mdpi");
		splashm.mkdirs();
		int widthxhdpi = 1080;
        int heightxhdpi = 1920;
        int widthhdpi = 720;
        int heighthdpi = 1280;
        int widthmdpi = 480;
        int heightmdpi = 800;
        File inputFile = new File(inputPath);
        BufferedImage inputImage = ImageIO.read(inputFile);
        BufferedImage outputImagex = new BufferedImage(widthxhdpi, heightxhdpi, inputImage.getType());
        BufferedImage outputImageh = new BufferedImage(widthhdpi, heighthdpi, inputImage.getType());
        BufferedImage outputImagem = new BufferedImage(widthmdpi, heightmdpi, inputImage.getType());
        Graphics2D g2dx = outputImagex.createGraphics();
        Graphics2D g2dh = outputImageh.createGraphics();
        Graphics2D g2dm = outputImagem.createGraphics();
        g2dx.drawImage(inputImage, 0, 0, widthxhdpi, heightxhdpi, null);
        g2dx.dispose();
        g2dh.drawImage(inputImage, 0, 0, widthhdpi, heighthdpi, null);
        g2dh.dispose();
        g2dm.drawImage(inputImage, 0, 0, widthmdpi, heightmdpi, null);
        g2dm.dispose();
        String outputPathx ="E:/source/splash/drawable-xhdpi/splash.png" ;
        String outputPathh = "E:/source/splash/drawable-hdpi/splash.png";
        String outputPathm = "E:/source/splash/drawable-mdpi/splash.png";
        ImageIO.write(outputImagex, "png", new File(outputPathx));
        ImageIO.write(outputImageh, "png", new File(outputPathh));
        ImageIO.write(outputImagem, "png", new File(outputPathm));
	}
	
	public static void createBG(String inputPath) throws IOException
	{
		File bgx = new File("E:/source/bg/drawable-xhdpi");
		bgx.mkdirs();
		File bgh = new File("E:/source/bg/drawable-hdpi");
		bgh.mkdirs();
		File bgm = new File("E:/source/bg/drawable-mdpi");
		bgm.mkdirs();
		int widthxhdpi = 1080;
        int heightxhdpi = 1920;
        int widthhdpi = 720;
        int heighthdpi = 1280;
        int widthmdpi = 480;
        int heightmdpi = 800;
        File inputFile = new File(inputPath);
        BufferedImage inputImage = ImageIO.read(inputFile);
        BufferedImage outputImagex = new BufferedImage(widthxhdpi, heightxhdpi, inputImage.getType());
        BufferedImage outputImageh = new BufferedImage(widthhdpi, heighthdpi, inputImage.getType());
        BufferedImage outputImagem = new BufferedImage(widthmdpi, heightmdpi, inputImage.getType());
        Graphics2D g2dx = outputImagex.createGraphics();
        Graphics2D g2dh = outputImageh.createGraphics();
        Graphics2D g2dm = outputImagem.createGraphics();
        g2dx.drawImage(inputImage, 0, 0, widthxhdpi, heightxhdpi, null);
        g2dx.dispose();
        g2dh.drawImage(inputImage, 0, 0, widthhdpi, heighthdpi, null);
        g2dh.dispose();
        g2dm.drawImage(inputImage, 0, 0, widthmdpi, heightmdpi, null);
        g2dm.dispose();
        String outputPathx ="E:/source/bg/drawable-xhdpi/bg.png" ;
        String outputPathh = "E:/source/bg/drawable-hdpi/bg.png";
        String outputPathm = "E:/source/bg/drawable-mdpi/bg.png";
        ImageIO.write(outputImagex, "png", new File(outputPathx));
        ImageIO.write(outputImageh, "png", new File(outputPathh));
        ImageIO.write(outputImagem, "png", new File(outputPathm));
		
	}
	
	public static void createIcons(String inputPath) throws IOException
	{
		File iconxxx = new File("E:/source/icon/drawable-xxxhdpi");
		iconxxx.mkdirs();
		File iconxx = new File("E:/source/icon/drawable-xxhdpi");
		iconxx.mkdirs();
		File iconx = new File ("E:/source/icon/drawable-xhdpi");
		iconx.mkdirs();
		File iconh = new File ("E:/source/icon/drawable-hdpi");
		iconh.mkdirs();
		File iconm = new File ("E:/source/icon/drawable-mdpi");
		iconm.mkdirs();
		File iconl = new File ("E:/source/icon/drawable-ldpi");
		iconl.mkdirs();
		int xxxhdpi = 192;
        int xxhdpi = 144;
        int xhdpi = 96;
        int hdpi = 72;
        int mdpi = 48;
        int ldpi = 36;
        int rate = 100;
        int play = 512;
        File inputFile = new File(inputPath);
        BufferedImage inputImage = ImageIO.read(inputFile);
        BufferedImage outputImagexxx = new BufferedImage(xxxhdpi, xxxhdpi, inputImage.getType());
        BufferedImage outputImagexx = new BufferedImage(xxhdpi, xxhdpi, inputImage.getType());
        BufferedImage outputImagex = new BufferedImage(xhdpi, xhdpi, inputImage.getType());
        BufferedImage outputImageh = new BufferedImage(hdpi, hdpi, inputImage.getType());
        BufferedImage outputImagem = new BufferedImage(mdpi, mdpi, inputImage.getType());
        BufferedImage outputImagel = new BufferedImage(ldpi, ldpi, inputImage.getType());
        BufferedImage outputImager = new BufferedImage(rate, rate, inputImage.getType());
        BufferedImage outputImagePlay = new BufferedImage(play, play, inputImage.getType());
        Graphics2D g2dxxx = outputImagexxx.createGraphics();
        g2dxxx.drawImage(inputImage, 0, 0, xxxhdpi, xxxhdpi, null);
        g2dxxx.dispose();
        Graphics2D g2dxx = outputImagexx.createGraphics();
        g2dxx.drawImage(inputImage, 0, 0, xxhdpi, xxhdpi, null);
        g2dxx.dispose();
        Graphics2D g2dx = outputImagex.createGraphics();
        g2dx.drawImage(inputImage, 0, 0, xhdpi, xhdpi, null);
        g2dx.dispose();
        Graphics2D g2dh = outputImageh.createGraphics();
        g2dh.drawImage(inputImage, 0, 0, hdpi, hdpi, null);
        g2dh.dispose();
        Graphics2D g2dm = outputImagem.createGraphics();
        g2dm.drawImage(inputImage, 0, 0, mdpi, mdpi, null);
        g2dm.dispose();
        Graphics2D g2dl = outputImagel.createGraphics();
        g2dl.drawImage(inputImage, 0, 0, ldpi, ldpi, null);
        g2dl.dispose();
        Graphics2D g2dr = outputImager.createGraphics();
        g2dr.drawImage(inputImage, 0, 0, rate, rate, null);
        g2dr.dispose();
        Graphics2D g2dp = outputImagePlay.createGraphics();
        g2dp.drawImage(inputImage, 0, 0, play, play, null);
        g2dp.dispose();
        String outputPathxxx = "E:/source/icon/drawable-xxxhdpi/icon.png";
        String outputPathxx = "E:/source/icon/drawable-xxhdpi/icon.png";
        String outputPathx = "E:/source/icon/drawable-xhdpi/icon.png";
        String outputPathh = "E:/source/icon/drawable-hdpi/icon.png";
        String outputPathm = "E:/source/icon/drawable-mdpi/icon.png";
        String outputPathl = "E:/source/icon/drawable-ldpi/icon.png";
        String outputPathr = "E:/source/rate.png";
        String outputPathp = "E:/source/playstoreicon.png";
        ImageIO.write(outputImagexxx, "png", new File(outputPathxxx));
        ImageIO.write(outputImagexx, "png", new File(outputPathxx));
        ImageIO.write(outputImagex, "png", new File(outputPathx));
        ImageIO.write(outputImageh, "png", new File(outputPathh));
        ImageIO.write(outputImagem, "png", new File(outputPathm));
        ImageIO.write(outputImagel, "png", new File(outputPathl));
        ImageIO.write(outputImager, "png", new File(outputPathr));  
        ImageIO.write(outputImagePlay, "png", new File(outputPathp));
	}
	
	public static void createChatheads(String inputPath) throws IOException
	{
		File iconxxx = new File("E:/source/chathead/drawable-xxxhdpi");
		iconxxx.mkdirs();
		File iconxx = new File("E:/source/chathead/drawable-xxhdpi");
		iconxx.mkdirs();
		File iconx = new File ("E:/source/chathead/drawable-xhdpi");
		iconx.mkdirs();
		File iconh = new File ("E:/source/chathead/drawable-hdpi");
		iconh.mkdirs();
		File iconm = new File ("E:/source/chathead/drawable-mdpi");
		iconm.mkdirs();
		File iconl = new File ("E:/source/chathead/drawable-ldpi");
		iconl.mkdirs();
		int xxxhdpi = 192;
        int xxhdpi = 144;
        int xhdpi = 96;
        int hdpi = 72;
        int mdpi = 48;
        int ldpi = 36;
        File inputFile = new File(inputPath);
        BufferedImage inputImage = ImageIO.read(inputFile);
        BufferedImage outputImagexxx = new BufferedImage(xxxhdpi, xxxhdpi, inputImage.getType());
        BufferedImage outputImagexx = new BufferedImage(xxhdpi, xxhdpi, inputImage.getType());
        BufferedImage outputImagex = new BufferedImage(xhdpi, xhdpi, inputImage.getType());
        BufferedImage outputImageh = new BufferedImage(hdpi, hdpi, inputImage.getType());
        BufferedImage outputImagem = new BufferedImage(mdpi, mdpi, inputImage.getType());
        BufferedImage outputImagel = new BufferedImage(ldpi, ldpi, inputImage.getType());
        Graphics2D g2dxxx = outputImagexxx.createGraphics();
        g2dxxx.drawImage(inputImage, 0, 0, xxxhdpi, xxxhdpi, null);
        g2dxxx.dispose();
        Graphics2D g2dxx = outputImagexx.createGraphics();
        g2dxx.drawImage(inputImage, 0, 0, xxhdpi, xxhdpi, null);
        g2dxx.dispose();
        Graphics2D g2dx = outputImagex.createGraphics();
        g2dx.drawImage(inputImage, 0, 0, xhdpi, xhdpi, null);
        g2dx.dispose();
        Graphics2D g2dh = outputImageh.createGraphics();
        g2dh.drawImage(inputImage, 0, 0, hdpi, hdpi, null);
        g2dh.dispose();
        Graphics2D g2dm = outputImagem.createGraphics();
        g2dm.drawImage(inputImage, 0, 0, mdpi, mdpi, null);
        g2dm.dispose();
        Graphics2D g2dl = outputImagel.createGraphics();
        g2dl.drawImage(inputImage, 0, 0, ldpi, ldpi, null);
        g2dl.dispose();
        String outputPathxxx = "E:/source/chathead/drawable-xxxhdpi/appicon_shadow.png";
        String outputPathxx = "E:/source/chathead/drawable-xxhdpi/appicon_shadow.png";
        String outputPathx = "E:/source/chathead/drawable-xhdpi/appicon_shadow.png";
        String outputPathh = "E:/source/chathead/drawable-hdpi/appicon_shadow.png";
        String outputPathm = "E:/source/chathead/drawable-mdpi/appicon_shadow.png";
        String outputPathl = "E:/source/chathead/drawable-ldpi/appicon_shadow.png";
        ImageIO.write(outputImagexxx, "png", new File(outputPathxxx));
        ImageIO.write(outputImagexx, "png", new File(outputPathxx));
        ImageIO.write(outputImagex, "png", new File(outputPathx));
        ImageIO.write(outputImageh, "png", new File(outputPathh));
        ImageIO.write(outputImagem, "png", new File(outputPathm));
        ImageIO.write(outputImagel, "png", new File(outputPathl));
	}

	public static void createFeature (String inputPath) throws IOException
	{
		File inputFile = new File(inputPath);
		BufferedImage inputImage = ImageIO.read(inputFile);
		BufferedImage outputImage = new BufferedImage(1024, 500, inputImage.getType());
		Graphics2D g2d = outputImage.createGraphics();
		g2d.drawImage(inputImage, 0, 0, 1024, 500, null);
		g2d.dispose();
		String outputPath= "E:/source/GooglePlayFeature.png";
		ImageIO.write(outputImage, "png", new File(outputPath));
		
	}
	

	public static void main(String[] args) throws IOException {
		ready();

	}

}
