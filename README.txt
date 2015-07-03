This application is using jdk 1.6 and tomcat 6

After application start send soap services (I have used Firefox poster to send soap service)

<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" 
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xmlns:xsd="http://www.w3.org/2001/XMLSchema">
	<soap:Header>
		<Username>mkyong</Username>
		<Password Type="PasswordText">>password</Password>
	</soap:Header>
	<soap:Body>
		<ns2:HeaderRequest xmlns:ns2="http://prabhat/">
			//use your code
		</ns2:HeaderRequest>
	</soap:Body>
</soap:Envelope>