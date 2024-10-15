package testing;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.soap.ws.client.CapitalCity;
import com.soap.ws.client.CapitalCityResponse;
import com.soap.ws.client.CountryInfoService;
import com.soap.ws.client.CountryInfoServiceSoapType;

public class Capital_testing {

	public static String getCapital(String inputStr) {
		CountryInfoService NC_service = new CountryInfoService(); //created service object
		CountryInfoServiceSoapType NC_serviceSOAP = NC_service.getCountryInfoServiceSoap(); //create SOAP object (a port of the service)
        String result = NC_serviceSOAP.countryIntPhoneCode(inputStr);  
        return result;
	}
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("for 'Finland' capital is: "+ getCapital("Finland"));

	}

}
