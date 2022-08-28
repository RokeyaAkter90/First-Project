package com.falgun.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.falgun.utility.base_class;

public class aboutuspageLocators extends base_class {

	public aboutuspageLocators () {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(how=How.LINK_TEXT, using="About us")
	public WebElement aboutuslink;
	
	@FindBy(how=How.ID, using="videoModalLabel")
	public WebElement aboutustext;
	
	@FindBy(how=How.ID, using="example-video")
	public WebElement aboutusvdo;
	
	@FindBy(how=How.XPATH, using="//button[@class='vjs-big-play-button']")
	public WebElement playbutton;
	
	@FindBy(how=How.ID, using="example-video_html5_api")
	public WebElement vdoplaying;
	
	
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div/div/div[3]/button")
	public WebElement closebutton;
	
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div/div/div[1]/button/span")
	public WebElement xbutton;
	
	@FindBy(how=How.XPATH, using="//button[@title='Fullscreen']")
	public WebElement maximize;
	
	@FindBy(how=How.XPATH, using="//button[@title='Non-Fullscreen']")
	public WebElement minimize;
	
	@FindBy(how=How.XPATH, using="//button[@title='Picture-in-Picture']")
	public WebElement picinpicbutton;
	@FindBy(how=How.XPATH, using="//button[@title='Exit Picture-in-Picture']")
	public WebElement exitpicinpicbutton;
	
	
	@FindBy(how=How.XPATH, using="//button[@title='Mute']")
	public WebElement mute;
	
	@FindBy(how=How.XPATH, using="//button[@title='Unmute']")
	public WebElement unmute;
	
}
