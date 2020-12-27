import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

/*
 * Uruchomienie przeglądarki
 */
WebUI.openBrowser(rawUrl=GlobalVariable.url)
/*
 * Powiększenie okna przeglądarki
 */
WebUI.maximizeWindow()
/*
 * Kliknięcie przycisku zaloguj
 */
WebUI.click(findTestObject('Object Repository/PageStart/button_sing_in'))
/*
 * Wpisanie adresu użytkownika w pole adres e-mail
 */
WebUI.setText(findTestObject('Object Repository/PageLogin/input_email'), GlobalVariable.user_mail)
