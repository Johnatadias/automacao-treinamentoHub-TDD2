package br.com.rsinet.hub_tdd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FormCadastraUsuarioPage {
	
	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	public WebElement userName;
	
	@FindBy(how = How.NAME, using = "emailRegisterPage")
	public WebElement email;
	
	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	public WebElement password;
	
	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	public WebElement confirmPassword;
	
	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	public WebElement firstName;
	
	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	public WebElement lastName;
	
	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	public WebElement phoneNumber;
	
	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	public WebElement countryList;
	
	@FindBy(how = How.NAME, using = "cityRegisterPage")
	public WebElement city;
	
	@FindBy(how = How.NAME, using = "addressRegisterPage")
	public WebElement address;
	
	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	public WebElement state;
	
	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	public WebElement postalCode;
	
	@FindBy(how = How.NAME, using = "i_agree")
	public WebElement aceitarTermo;
	
	@FindBy(how = How.ID, using = "register_btnundefined")
	public WebElement botaoRegistrar;
	
	@FindBy(how = How.ID, using = "menuUserLink")
	public WebElement infoParaValidacao;
}