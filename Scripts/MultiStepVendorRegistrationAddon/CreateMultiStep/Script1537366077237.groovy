import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://46.101.72.110/admin_stage/admin/index/index/key/f39c9f07e3d497e1058c0f0c4cde40a9cfd0294f3e0c9f5ce7f4fbb4e2054d9d/')

WebUI.setText(findTestObject('Page_Magento Admin/input_Username_loginusername'), 'adminStage2')

WebUI.setEncryptedText(findTestObject('Page_Magento Admin/input_Password_loginpassword'), 'o/jRBTHHC5MhWaNKJm55gg==')

WebUI.click(findTestObject('Page_Magento Admin/span_Sign in'))

WebUI.click(findTestObject('Page_Dashboard  Magento Admin/a_Marketplace'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Dashboard  Magento Admin/a_Multi-step Registration'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Manage Vendor Attributes  Mana/button_Add Registration Step'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Manage Steps  Magento Admin/button_Add Option'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_Manage Steps  Magento Admin/input_Delete_stepsoptionslabel'), '4')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_Manage Steps  Magento Admin/input_Delete_stepsoptionslabel_10'), 'Test Info')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Manage Steps  Magento Admin/button_Save Step'))

WebUI.delay(3)

WebUI.closeBrowser()
