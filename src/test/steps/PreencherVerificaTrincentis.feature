Feature: Page Tricentis - Preencho campos e valido se foi enviado.

	Scenario: Preencher campos
		Given Que eu estou na pagina Tricentis
		When Preencho os campos da aba Enter Vehicle Data
		When Preencho os campos da aba Enter Enter Insurant Data
		When Preencho os campos da aba Enter Product Data
		When Preencho os campos da aba Select Price Option
		When Preencho os campos da aba Send Quote
		Then Envio o formulario preenchido
		Then Valido se email foi enviado