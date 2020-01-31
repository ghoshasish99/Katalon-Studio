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

not_run: for (int i = 0; i <= 2; i++) {
    WebUI.navigateToUrl('http://screenplay-contacts.herokuapp.com/')

    not_run: WebUI.click(findTestObject('Object Repository/Page_MeanContactlistAngular2/button_New'))

    not_run: WebUI.setText(findTestObject('Object Repository/Page_MeanContactlistAngular2/input_Name_contact-name'), 'Katalon1')

    not_run: WebUI.setText(findTestObject('Object Repository/Page_MeanContactlistAngular2/input_Email_contact-email'), 'Katalon@user.com')

    not_run: WebUI.setText(findTestObject('Object Repository/Page_MeanContactlistAngular2/input_Mobile_contact-phone-mobile'), 
        '8989898989898')

    not_run: WebUI.setText(findTestObject('Object Repository/Page_MeanContactlistAngular2/input_Work_contact-phone-work'), 
        '20202020202020202')

    not_run: WebUI.click(findTestObject('Object Repository/Page_MeanContactlistAngular2/button_Create'))
}

if (findTestObject('tetete', null).getObjectId().isEmpty()) {
    println('Empty')
}

WebUI.closeBrowser()

WebUI.verifyElementClickable(findTestObject(null))

