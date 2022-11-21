#Selenium WebDriver Testing
#Grupo 7 - Calidad del Software

"""
Francisco Araya Carvajal, 
Andrey Burgos Camacho, 
Kendall Jiménez Gamboa, 
Franz Pfeiffer Guillen, 
José Solorzano Flores
"""

from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By

option = webdriver.Edge()
option.add_argument('--start-maximized')
option.add_argument('--disable-extensions')
option.add_experimental_option("detach", True)

path = "C:\Users\kenji\Documents\GitHub\G7-SC405\msedgedriver.exe"
url = 'https://phptravels.org/register.php'
try:
    print("Inicia proceso de pruebas")

    driver = webdriver.Edge(path,options=option)
    driver.implicitly_wait(3)
    driver.get(url)

    def action_send_keys(id,keys):
        element = driver.find_element(By.ID,str(id))
        element.send_keys(str(keys))
        return element

    def action_send_keys_by_class(classe,keys):
        element = driver.find_element(By.CLASS_NAME,str(classe))
        element.send_keys(str(keys))
        return element    
   
    def send_tab_by_class(classe):
        element = driver.find_element(By.XPATH,str(classe))
        element.send_keys(Keys.TAB)
          

    def action_click_by_xpath(XPATH):
        element = driver.find_element(By.XPATH,str(XPATH))
        element.click()
       

    txt_nombre = action_send_keys('inputFirstName','Usuario Prueba')
    txt_nombre.send_keys(Keys.TAB)

    txt_apellido = action_send_keys('inputLastName','Apellido Prueba')
    txt_apellido.send_keys(Keys.TAB)

    txt_correo = action_send_keys('inputEmail','prueba@prueba.com')
    txt_correo.send_keys(Keys.TAB)

    txt_correo.send_keys(Keys.TAB)
    txt_telefono = action_send_keys('inputPhone','+50688888888')
    txt_telefono.send_keys(Keys.TAB)
    
    txt_compañia = action_send_keys('inputCompanyName','Universidad Fidelitas')
    txt_compañia.send_keys(Keys.TAB)

    txt_direccion_1 = action_send_keys('inputAddress1','San José')
    txt_direccion_1.send_keys(Keys.TAB)

    txt_direccion_2 = action_send_keys('inputAddress2','Sede San Pedro')
    txt_direccion_2.send_keys(Keys.TAB)

    txt_ciudad = action_send_keys('inputCity','San Pedro')
    txt_ciudad.send_keys(Keys.TAB)

    txt_provincia = action_send_keys('stateinput','San José')
    txt_provincia.send_keys(Keys.TAB)

    txt_codigo_postal = action_send_keys('inputPostcode','88888')
    txt_codigo_postal.send_keys(Keys.TAB)

    txt_pais = action_send_keys('inputCountry','Costa Rica')
    txt_pais.send_keys(Keys.TAB)

    txt_mobile= action_send_keys('customfield2','11111111')
    txt_mobile.send_keys(Keys.TAB)

    txt_clave = action_send_keys('inputNewPassword1','contraseña1234')
    txt_clave.send_keys(Keys.TAB)

    txt_confirmar_clave = action_send_keys('inputNewPassword2','contraseña1234')
    txt_confirmar_clave.send_keys(Keys.TAB)
    
    btn_generar_contraseña = send_tab_by_class('/html/body/section/div/div[1]/div[2]/div/form/div[2]/div/div/div/div[4]/div/button')
    #btn_yes_no = send_tab_by_class('/html/body/section/div/div[1]/div[2]/div/form/div[3]/div/div/div')
    btn_captcha = action_click_by_xpath('/html/body/section/div/div[1]/div[2]/div/form/div[4]/div/div/div/textarea')
    
    

except Exception as ex:
    print('Ocurrió un error -> ',ex)















