import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.appsheet.com/Account/Login?returnUrl=https%3A%2F%2Fwww.appsheet.com%2Fstart%2Fa90c6084-af20-4c66-b4d5-34eb37a30cc8&provider=google&fullScope=False&appName=Uji%20Coba#appName=UjiCoba-1203134&group=%5B%5D&page=fastTable&sort=%5B%5D&table=Toko&view=TOKO')

WebUI.click(findTestObject('Object Repository/Page_Login - AppSheet/span_Google'))

WebUI.setText(findTestObject('Object Repository/Page_Masuk - Akun Google/input_AppSheet_identifier'), 'fuad.never')

WebUI.sendKeys(findTestObject('Object Repository/Page_Masuk - Akun Google/input_AppSheet_identifier'), Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk - Akun Google/input_Terlalu sering gagal_password'), 
    'c2KysTJzdaULvHzGmenbJw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Masuk - Akun Google/input_Terlalu sering gagal_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Uji Coba/i_TOKO_MuiBottomNavigationAction-icon fa fa_641cfb'))

WebUI.click(findTestObject('Object Repository/Page_Uji Coba/i_tidak ada_fa fa-plus'))

WebUI.setText(findTestObject('Object Repository/Page_Uji Coba/input_Nama_input-block-level'), findTestData('Git_appsheet').getValue(
        'Nama', 1))

WebUI.setText(findTestObject('Page_Uji Coba/input_Botol_input-block-level'), findTestData('Git_appsheet').getValue(
        'Botol', 1))

WebUI.click(findTestObject('Object Repository/Page_Uji Coba/span_TIDAK'))

WebUI.click(findTestObject('Object Repository/Page_Uji Coba/div_Hari'))

WebUI.setText(findTestObject('Object Repository/Page_Uji Coba/input_Nama_input-block-level'), 'Rabu')

WebUI.click(findTestObject('Object Repository/Page_Uji Coba/span_Pagi'))

WebUI.click(findTestObject('Object Repository/Page_Uji Coba/div_Blokingan'))

WebUI.click(findTestObject('Object Repository/Page_Uji Coba/span_Blokingan_ASTappable ListSelect__butto_e5b466'))

WebUI.click(findTestObject('Object Repository/Page_Uji Coba/div_SENIN'))

WebUI.setText(findTestObject('Object Repository/Page_Uji Coba/input_Nama_input-block-level'), findTestData('Git_appsheet').getValue(
        'Note', 1))

WebUI.click(findTestObject('Object Repository/Page_Uji Coba/span_Save'))

WebUI.closeBrowser()

