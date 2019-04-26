package com.class28;


//Create a WebDriver Interface that will have the following unimplemented behaviour: 
//	openBrowser(), closeBrowser(), maximizeWindow(), findElement(). Create 2 classes 
//that implements WebDriver interface: ChromeDriver and FirefoxDriver.

public interface WebDriver {

	public void openBrowser();

	public void closeBrowser();

	public void maximizeWindow();

	public void findElement();

}

class ChromeDriver implements WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("ChromeDriver has an open browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome has a close Browser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome has a maximize Window");
	}

	@Override
	public void findElement() {
		System.out.println("Chrome has a finding Element");
	}
}

class FirefoxDriver implements WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("FirefoxDriver has an open browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("FirefoxDriver has closeBrowser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("FirefoxDriver has a maximize Window");
	}

	@Override
	public void findElement() {
		System.out.println("FirefoxDriver has a finding Element");
	}
}