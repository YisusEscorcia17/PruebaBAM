#27/06/2022 Jesus escorcia Test BAM
@tag
Feature: Demoqa
	Esta prueba consistirá en automatizar  flujos para la empresa BAM:

	Se debe de ingresar a la opción elements-> e ingresara a text box luego llenar los datos y darle submit
	luego darle click check box y luego expander los nodos, luego buscar la carpeta general, luego de hacer esto
	vamos a radio button y le damos yes, y para finalizar damos web tables y elimar un datos

	@tag
	Scenario: Diligenciar formulario
		Given Abrir el navegador
		When  textBox
		Then seleccionar Box
		Then Seleccionar Radio Button
		And eliminar registro







