package sourceFolder;

import java.io.File;

public class demo {

	public static void main(String[] args) {
			File folder = new File("C:/Users/satijaa/Downloads");
			File[] listOfFiles = folder.listFiles();
			for (File file: listOfFiles)
			{
				if(file.getName().contains("_BG")&&file.getName().contains(".png"))
				{
					String inputBG = file.getName();
					System.out.println(inputBG);
					continue;
				}
				else if(file.getName().contains("_Splash")&&file.getName().contains(".png"))
				{
					String inputSplash = file.getName();
					System.out.println(inputSplash);
					continue;
				}
				else if(file.getName().contains("icon")&&file.getName().contains(".png"))
				{
					String inputIcon = file.getName();
					System.out.println(inputIcon);
				}

	}
	}
}

