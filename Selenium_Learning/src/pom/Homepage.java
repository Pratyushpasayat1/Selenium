package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
public Homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(linkText = "Register")
 private WebElement registerlink;

public WebElement getRegisterlink() {
	return registerlink;
}

public void setRegisterlink(WebElement registerlink) {
	this.registerlink = registerlink;
}

public WebElement getLoginlink() {
	return loginlink;
}

public void setLoginlink(WebElement loginlink) {
	this.loginlink = loginlink;
}

public WebElement getShoppinkcartlink() {
	return shoppinkcartlink;
}

public void setShoppinkcartlink(WebElement shoppinkcartlink) {
	this.shoppinkcartlink = shoppinkcartlink;
}

public WebElement getSearchbutton() {
	return searchbutton;
}

public void setSearchbutton(WebElement searchbutton) {
	this.searchbutton = searchbutton;
}
@FindBy(linkText = "Log in")
 private WebElement loginlink;

@FindBy(linkText = "Shopping cart")
private WebElement shoppinkcartlink;

@FindBy(xpath = "//input[@value='Search']")
private WebElement searchbutton;
}
