package com.class28;

public class WebDriverTest {

	public static void main(String[] args) {

		WebDriver web = new ChromeDriver();
		web.openBrowser();
		web.closeBrowser();
		web.maximizeWindow();
		web.findElement();

		WebDriver web1 = new FirefoxDriver();
		web1.openBrowser();
		web1.closeBrowser();
		web1.maximizeWindow();
		web1.findElement();

	}
}