#Selenium WebDriver Testing
#Grupo 7 - Calidad del Software

"""
Francisco Araya Carvajal, 
Andrey Burgos Camacho, 
Kendall Jiménez Gamboa, 
Franz Pfeiffer Guillen, 
José Solorzano Flores
"""
from selenium_stealth import stealth
from selenium import webdriver
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as ex_cond
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains

#Url del Sitio a evaluar.
url = 'https://www.mopt.go.cr/wps/portal/Home/inicio/!ut/p/z1/04_Sj9CPykssy0xPLMnMz0vMAfIjo8ziPQPcDQy9TQx83A3dDA0cAx0NgoNdjYwNjEz0w8EKDHAARwP9KEL6o8BK0PU5BRk5GRsYuPsbYVWAYkVBboRBpqOiIgBXk8By/dz/d5/L2dBISEvZ0FBIS9nQSEh/'

#Ruta donde se descargó el chromedriver.
path = 'D:/Users/Fran/Escritorio/G7-SC405/Proyecto/chromedriver.exe'

#Ambiente de trabajo

try:
    print("Inicia proceso pruebas...")

    option = webdriver.ChromeOptions()
    option.add_argument('--start-maximized')
    option.add_argument('--disable-extensions')

    driver = webdriver.Chrome(path,chrome_options=option)
    driver.get(url)

    stealth(driver,
        languages=["en-US", "en"],
        vendor="Google Inc.",
        platform="Win32",
        webgl_vendor="Intel Inc.",
        renderer="Intel Iris OpenGL Engine",
        fix_hairline=True,
        )

    """
    ID = "id"
    NAME = "name"
    XPATH = "xpath"
    LINK_TEXT = "link text"
    PARTIAL_LINK_TEXT = "partial link text"
    TAG_NAME = "tag name"
    CLASS_NAME = "class name"
    CSS_SELECTOR = "css selector"
    """
    #Uso de métodos para hacer varias funciones más fácilmente
    def action_clicked_byXPATH(xpath_element):
        wait.until(ex_cond.element_to_be_clickable((By.XPATH,xpath_element))).click()


    #Buscar por XPATH (Cuando exista una lista o elementos de una misma clase se usa XPATH)
    wait = WebDriverWait(driver,5) #El 5 es timeout
    element_menu = wait.until(ex_cond.element_to_be_clickable((By.XPATH,'/html/body/div[1]/header/div[2]/div/div/div[1]/nav/ul/li[3]/a')))
    ActionChains(driver).move_to_element(element_menu).perform()

    action_clicked_byXPATH('/html/body/div[1]/header/div[2]/div/div/div[1]/nav/ul/li[3]/ul/li[1]')

    action_clicked_byXPATH('/html/body/div[1]/div/div[3]/div/div[2]/div/div/section/div[2]/ul/li[1]/a')


except Exception as ex:
    print('Ocurrió un error ->', ex)        

                                