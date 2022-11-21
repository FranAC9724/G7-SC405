
#Selenium WebDriver Testing
#Grupo 7 - Calidad del Software

"""
Francisco Araya Carvajal, 
Andrey Burgos Camacho, 
Kendall Jiménez Gamboa, 
Franz Pfeiffer Guillen, 
José Solorzano Flores
"""

# Import the necessary modules for development 
import time
import unittest
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.firefox.options import Options

# Invoke a new Firefox Instance 
options = Options()
options.binary_location = r'C:\Program Files\Mozilla Firefox\firefox.exe'
ff_driver = webdriver.Firefox(executable_path=r'C:\Users\franz\OneDrive\Escritorio\G7-SC405\geckodriver.exe', options=options)

try:
	# Blocking wait of 30 seconds in order to locate the element 
	ff_driver.implicitly_wait(30)
	ff_driver.maximize_window()

	# Open the Home Page
	ff_driver.get("https://phptravels.org/register.php")

	#def action_send_keys(id,keys):
	#	search_criteria = ff_driver.find_element_by_id(id)
	#	search_criteria.send_keys(str(keys)
	#	return search_criteria

except Exception as ex:
	print('Ocurrió un error -> ',ex)