package basics;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEmptyEdgeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
	}

}
