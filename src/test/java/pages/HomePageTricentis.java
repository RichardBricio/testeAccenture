package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepsdefs.StepDefinitions;

public class HomePageTricentis {

	public HomePageTricentis() {
		PageFactory.initElements(StepDefinitions.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id=\"idealsteps-nav\"]/ul/li[1]")
	WebElement tabEnterVehicleData;

	@FindBy(xpath = "//*[@id=\"make\"]")
	WebElement selectMake;

	@FindBy(xpath = "//*[@id=\"model\"]")
	WebElement selectModel;

	@FindBy(xpath = "//*[@id=\"cylindercapacity\"]")
	WebElement inputCylinderCapacity;

	@FindBy(xpath = "//*[@id=\"engineperformance\"]")
	WebElement inputEnginePerformance;

	@FindBy(xpath = "//*[@id=\"dateofmanufacture\"]")
	WebElement dtManufacture;

	@FindBy(xpath = "//*[@id=\"numberofseats\"]")
	WebElement selectNumberSeats;

	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]")
	WebElement radioRightHandDriveYES;

	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[2]")
	WebElement radioRightHandDriveNO;

	@FindBy(xpath = "//*[@id=\"numberofseatsmotorcycle\"]")
	WebElement selectNumberSeatsMotorcycle;

	@FindBy(xpath = "//*[@id=\"fuel\"]")
	WebElement selectFuelType;

	@FindBy(xpath = "//*[@id=\"payload\"]")
	WebElement inputPayload;

	@FindBy(xpath = "//*[@id=\"totalweight\"]")
	WebElement inputTotalWeight;

	@FindBy(xpath = "//*[@id=\"listprice\"]")
	WebElement inputListPrice;

	@FindBy(xpath = "//*[@id=\"licenseplatenumber\"]")
	WebElement inputLicensePlateNumber;

	@FindBy(xpath = "//*[@id=\"annualmileage\"]")
	WebElement inputAnnualMileage;

	@FindBy(xpath = "//*[@id=\"nextenterinsurantdata\"]")
	WebElement btNextEnterVehicleData;

	//---------------------------------------------------------------------

	@FindBy(xpath = "//*[@id=\"idealsteps-nav\"]/ul/li[2]")
	WebElement tabEnterInsurantData;

	@FindBy(xpath = "//*[@id=\"firstname\"]")
	WebElement inputFirstName;

	@FindBy(xpath = "//*[@id=\"lastname\"]")
	WebElement inputLastName;

	@FindBy(xpath = "//*[@id=\"birthdate\"]")
	WebElement dtBirthDay;

	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]")
	WebElement radioGenderMale;

	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]")
	WebElement radioGenderFemale;

	@FindBy(xpath = "//*[@id=\"streetaddress\"]")
	WebElement inputStreetAddress;

	@FindBy(xpath = "//*[@id=\"country\"]")
	WebElement selectCountry;

	@FindBy(xpath = "//*[@id=\"zipcode\"]")
	WebElement inputZipCode;

	@FindBy(xpath = "//*[@id=\"city\"]")
	WebElement inputCity;

	@FindBy(xpath = "//*[@id=\"occupation\"]")
	WebElement selectOccupation;

	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]")
	WebElement checkHobbiesSpeeding;

	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]")
	WebElement checkHobbiesBungeeJumping;

	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]")
	WebElement checkHobbiesCliffDiving;

	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]")
	WebElement checkHobbiesSkydiving;

	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]")
	WebElement checkHobbiesOther;

	@FindBy(xpath = "//*[@id=\"website\"]")
	WebElement inputWebsite;

	@FindBy(xpath = "//*[@id=\"open\"]")
	WebElement btInputPicture;

	@FindBy(xpath = "//*[@id=\"preventervehicledata\"]")
	WebElement btPreviousEnterInsurantData;

	@FindBy(xpath = "//*[@id=\"nextenterproductdata\"]")
	WebElement btNextEnterInsurantData;

	//---------------------------------------------------------------------

	@FindBy(xpath = "//*[@id=\"idealsteps-nav\"]/ul/li[3]")
	WebElement tabEnterProductData;

	@FindBy(xpath = "//*[@id=\"startdate\"]")
	WebElement dtStartDate;

	@FindBy(xpath = "//*[@id=\"insurancesum\"]")
	WebElement selectInsuranceSum;

	@FindBy(xpath = "//*[@id=\"meritrating\"]")
	WebElement selectMeritRating;

	@FindBy(xpath = "//*[@id=\"damageinsurance\"]")
	WebElement selectDamageInsurance;

	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]")
	WebElement checkOptionalProductsEuroProtection;

	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]")
	WebElement checkOptionalProductsLegalDefenseInsurance;

	@FindBy(xpath = "//*[@id=\"courtesycar\"]")
	WebElement selectCourtesyCar;

	@FindBy(xpath = "//*[@id=\"preventerinsurancedata\"]")
	WebElement btPreviousEnterProductData;

	@FindBy(xpath = "//*[@id=\"nextselectpriceoption\"]")
	WebElement btNextEnterProductData;

	//---------------------------------------------------------------------

	@FindBy(xpath = "//*[@id=\"idealsteps-nav\"]/ul/li[4]")
	WebElement tabSelectPriceIotion;

	@FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]")
	WebElement radioSilver;

	@FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]")
	WebElement radioGold;

	@FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]")
	WebElement radioPlatinum;

	@FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]")
	WebElement radioUltimate;

	@FindBy(xpath = "//*[@id=\"preventerproductdata\"]")
	WebElement btPreviousSelectPriceOptions;

	@FindBy(xpath = "//*[@id=\"nextsendquote\"]")
	WebElement btNextSelectPriceOptions;

	//---------------------------------------------------------------------

	@FindBy(xpath = "//*[@id=\"idealsteps-nav\"]/ul/li[5]")
	WebElement tabSendQuote;

	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement inputEmail;

	@FindBy(xpath = "//*[@id=\"phone\"]")
	WebElement inputPhone;

	@FindBy(xpath = "//*[@id=\"username\"]")
	WebElement inputUsername;

	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement inputPassword;

	@FindBy(xpath = "//*[@id=\"confirmpassword\"]")
	WebElement inputConfirmPassword;

	@FindBy(xpath = "//*[@id=\"Comments\"]")
	WebElement inputComments;

	@FindBy(xpath = "//*[@id=\"prevselectpriceoption\"]")
	WebElement btPreviousSendQuote;

	@FindBy(xpath = "//*[@id=\"sendemail\"]")
	WebElement btEnviarSendQuote;

	//---------------------------------------------------------------------

	@FindBy(xpath = "/html/body/div[4]")
	WebElement windowConfirmSend;

	public WebElement getTabEnterVehicleData() {
		return tabEnterVehicleData;
	}

	public WebElement getSelectMake() {
		return selectMake;
	}

	public WebElement getSelectModel() {
		return selectModel;
	}

	public WebElement getInputCylinderCapacity() {
		return inputCylinderCapacity;
	}

	public WebElement getInputEnginePerformance() {
		return inputEnginePerformance;
	}

	public WebElement getDtManufacture() {
		return dtManufacture;
	}

	public WebElement getSelectNumberSeats() { return selectNumberSeats; }

	public WebElement getRadioRightHandDriveYES() {	return radioRightHandDriveYES; }

	public WebElement getRadioRightHandDriveNO() { return radioRightHandDriveNO; }

	public WebElement getSelectNumberSeatsMotorcycle() {
		return selectNumberSeatsMotorcycle;
	}

	public WebElement getSelectFuelType() {
		return selectFuelType;
	}

	public WebElement getInputPayload() {
		return inputPayload;
	}

	public WebElement getInputTotalWeight() {
		return inputTotalWeight;
	}

	public WebElement getInputListPrice() {
		return inputListPrice;
	}

	public WebElement getInputLicensePlateNumber() {
		return inputLicensePlateNumber;
	}

	public WebElement getInputAnnualMileage() {
		return inputAnnualMileage;
	}

	public WebElement getBtNextEnterVehicleData() {
		return btNextEnterVehicleData;
	}

	public WebElement getTabEnterInsurantData() {
		return tabEnterInsurantData;
	}

	public WebElement getInputFirstName() {
		return inputFirstName;
	}

	public WebElement getInputLastName() {
		return inputLastName;
	}

	public WebElement getDtBirthDay() {	return dtBirthDay; }

	public WebElement getRadioGenderMale() { return radioGenderMale; }

	public WebElement getRadioGenderFemale() { return radioGenderFemale; }

	public WebElement getInputStreetAddress() {
		return inputStreetAddress;
	}

	public WebElement getSelectCountry() {
		return selectCountry;
	}

	public WebElement getInputZipCode() {
		return inputZipCode;
	}

	public WebElement getInputCity() {
		return inputCity;
	}

	public WebElement getSelectOccupation() {
		return selectOccupation;
	}

	public WebElement getCheckHobbiesSpeeding() {
		return checkHobbiesSpeeding;
	}

	public WebElement getCheckHobbiesBungeeJumping() {
		return checkHobbiesBungeeJumping;
	}

	public WebElement getCheckHobbiesCliffDiving() {
		return checkHobbiesCliffDiving;
	}

	public WebElement getCheckHobbiesSkydiving() {
		return checkHobbiesSkydiving;
	}

	public WebElement getCheckHobbiesOther() {
		return checkHobbiesOther;
	}

	public WebElement getInputWebsite() {
		return inputWebsite;
	}

	public WebElement getBtInputPicture() {
		return btInputPicture;
	}

	public WebElement getBtPreviousEnterInsurantData() {
		return btPreviousEnterInsurantData;
	}

	public WebElement getBtNextEnterInsurantData() {
		return btNextEnterInsurantData;
	}

	public WebElement getTabEnterProductData() {
		return tabEnterProductData;
	}

	public WebElement getDtStartDate() {
		return dtStartDate;
	}

	public WebElement getSelectInsuranceSum() {
		return selectInsuranceSum;
	}

	public WebElement getSelectMeritRating() {
		return selectMeritRating;
	}

	public WebElement getSelectDamageInsurance() {
		return selectDamageInsurance;
	}

	public WebElement getCheckOptionalProductsEuroProtection() {
		return checkOptionalProductsEuroProtection;
	}

	public WebElement getCheckOptionalProductsLegalDefenseInsurance() {
		return checkOptionalProductsLegalDefenseInsurance;
	}

	public WebElement getSelectCourtesyCar() {
		return selectCourtesyCar;
	}

	public WebElement getBtPreviousEnterProductData() {
		return btPreviousEnterProductData;
	}

	public WebElement getBtNextEnterProductData() {
		return btNextEnterProductData;
	}

	public WebElement getTabSelectPriceIotion() {
		return tabSelectPriceIotion;
	}

	public WebElement getTabSendQuote() {
		return tabSendQuote;
	}

	public WebElement getRadioSilver() {
		return radioSilver;
	}

	public WebElement getRadioGold() {
		return radioGold;
	}

	public WebElement getRadioPlatinum() {
		return radioPlatinum;
	}

	public WebElement getRadioUltimate() {
		return radioUltimate;
	}

	public WebElement getBtPreviousSelectPriceOptions() {
		return btPreviousSelectPriceOptions;
	}

	public WebElement getBtNextSelectPriceOptions() {
		return btNextSelectPriceOptions;
	}

	public WebElement getInputEmail() {
		return inputEmail;
	}

	public WebElement getInputPhone() {
		return inputPhone;
	}

	public WebElement getInputUsername() {
		return inputUsername;
	}

	public WebElement getInputPassword() {
		return inputPassword;
	}

	public WebElement getInputConfirmPassword() {
		return inputConfirmPassword;
	}

	public WebElement getInputComments() {
		return inputComments;
	}

	public WebElement getBtPreviousSendQuote() {
		return btPreviousSendQuote;
	}

	public WebElement getBtEnviarSendQuote() {
		return btEnviarSendQuote;
	}

	public WebElement getWindowConfirmSend() {
		return windowConfirmSend;
	}
}
