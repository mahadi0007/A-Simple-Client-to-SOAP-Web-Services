package clientWS_NC;

import java.math.BigInteger;

import com.soap.ws.client.CapitalCity;
import com.soap.ws.client.CapitalCityResponse;
import com.soap.ws.client.CountryInfoService;
import com.soap.ws.client.CountryInfoServiceSoapType;

public class CapitalConverter {
	public static String getCapital(String inputStr) {
//		BigInteger input_N = new BigInteger(inputStr);
		CountryInfoService NC_service = new CountryInfoService(); //created service object
		CountryInfoServiceSoapType NC_serviceSOAP = NC_service.getCountryInfoServiceSoap(); //create SOAP object (a port of the service)
        String result = NC_serviceSOAP.capitalCity(inputStr);  
        return result;
	}
    
//	public static String convert2dollars(String inputStr) {
//		BigDecimal input_D = new BigDecimal(inputStr);
//		NumberConversion NC_service = new NumberConversion(); //created service object
//        NumberConversionSoapType NC_serviceSOAP = NC_service.getNumberConversionSoap(); //create SOAP object (a port of the service)
//        String result = NC_serviceSOAP.numberToDollars(input_D);  
//        return result;
//	}
}
