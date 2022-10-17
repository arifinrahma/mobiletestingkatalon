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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication(GlobalVariable.G_HappyDayShopping, true)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tugas/search_button'), 0)

Mobile.tap(findTestObject('Tugas/serach_bar'), 0)

Mobile.setText(findTestObject('Tugas/serach_bar'), 'promo' + '\\n', 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tugas/noodle/product_noodle_btn'), 0)

Mobile.tap(findTestObject('Tugas/noodle/noodle_quantitiy_bar'), 0)

Mobile.setText(findTestObject('Tugas/noodle/noodle_quantitiy_bar'), 10 + '\\n', 0)

Mobile.tap(findTestObject('Tugas/noodle/addtobag_noodle_btn'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tugas/back_btn_promo'), 0)

Mobile.tap(findTestObject('Tugas/biskuit/biscuitpicture_btn'), 0)

Mobile.tap(findTestObject('Tugas/biskuit/quantitity_biscuit_bar'), 0)

Mobile.setText(findTestObject('Tugas/biskuit/quantitity_biscuit_bar'), 15 + '\\n', 0)

Mobile.tap(findTestObject('Tugas/addtobag_btn_promo'), 0)

Mobile.tap(findTestObject('Tugas/back_btn_promo'), 0)

Mobile.tap(findTestObject('Tugas/backbutton_promo'), 0)

Mobile.tap(findTestObject('Tugas/promo_flashsale_btn'), 0)

Mobile.tap(findTestObject('Tugas/anline/anline_flashsale_btn'), 0)

Mobile.tap(findTestObject('Tugas/anline/quantity_bar_anline'), 0)

Mobile.setText(findTestObject('Tugas/anline/quantity_bar_anline'), 10 + '\\n', 0)

Mobile.tap(findTestObject('Tugas/anline/addtobag_btn_anline'), 0)

Mobile.tap(findTestObject('Tugas/back_btn_promo'), 0)

Mobile.tap(findTestObject('Tugas/energen/energen_btn_flashsale'), 0)

Mobile.tap(findTestObject('Tugas/energen/btn_quantity_energen'), 0)

Mobile.setText(findTestObject('Tugas/energen/btn_quantity_energen'), 10 + '\\n', 0)

Mobile.tap(findTestObject('Tugas/energen/addtobag_energen_btn'), 0)

Mobile.tap(findTestObject('Tugas/yourbag_btn'), 0)

Mobile.tap(findTestObject('Tugas/panah_your bag'), 0)

Mobile.tap(findTestObject('Tugas/clear_btn'), 0)

Mobile.tap(findTestObject('Tugas/yes_btn'), 0)

Mobile.verifyElementVisible(findTestObject('Tugas/android.widget.TextView - Your shopping bag is waiting for its firstproduct'), 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

