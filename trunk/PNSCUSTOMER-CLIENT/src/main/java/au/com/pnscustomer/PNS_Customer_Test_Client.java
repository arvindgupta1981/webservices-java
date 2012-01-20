package au.com.pnscustomer;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import sun.misc.BASE64Encoder;



public class PNS_Customer_Test_Client {
	private PNSCustomerRequest request;
	private PNSCustomerResponse response;
	
	public static void main(String[] args) {	
		PNS_Customer_Test_Client pnsCustomerClient=new PNS_Customer_Test_Client();
		pnsCustomerClient.processCustomerRequest();
		
	}

	private void processCustomerRequest() {		
		createPNSCustomerRequest();
		setScreeningTag("Ram001");
		setScreeningStatusAppointment();
		/*setScreeningStatusCancel();*/
		callPNSCustomerService();
		printPNSCustomerResponse();
	}
	
	private void printPNSCustomerResponse(){
		System.out.println("Response Send By PNS Customer Server:\nSender: "+response.getSender());
		System.out.println("Response Tag: "+response.getResponseTag());
		System.out.println("Screening Tag: "+response.getScreeningTag());
		System.out.println("Timestamp: "+response.getTimestamp().toString());
	}
	
	private void callPNSCustomerService() {
		try {
			response= new PnsCustomerService_Service().getPnsCustomerServiceSOAP().pnsCustomer(request);
		} catch (PNSCustomerFaultMessage e) {	
			System.out.println(e.getFaultInfo().getFaultCode());
			e.printStackTrace();
		}
	}
	
	private void createPNSCustomerRequest(){
		request=new PNSCustomerRequest();
		request.setCustomerData(createCustomerData());
		request.setRequestTag("test");		
		request.setSender("Ram");
		
		request.setScreeningData(createScreeningData());		
		GregorianCalendar gc = new GregorianCalendar();
        gc.setTimeInMillis(new Date().getTime());
		try {
			request.setTimestamp(DatatypeFactory.newInstance().newXMLGregorianCalendar(gc));
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}		
	}

	private void setScreeningTag(String tag) {
		request.setScreeningTag(tag);
	}
	
	private static String createCustomerData(){
		String customerData="<ns3:customer xmlns:ns3='http://www.specsavers.nl/pns/customerData'><ns3:customerNumber>112233</ns3:customerNumber><ns3:branchNumber>495</ns3:branchNumber>"+
							"<ns3:namePrefix>H.R.</ns3:namePrefix><ns3:surnamePrefix>"+
							"</ns3:surnamePrefix><ns3:surname>Onrust</ns3:surname><ns3:address><ns3:zipCode>4342AA</ns3:zipCode>"+
							"<ns3:residence>Leusden</ns3:residence><ns3:houseNumber>12</ns3:houseNumber><ns3:country>Nederland</ns3:country>"+
							"<ns3:mobilePhoneNumber>+316123123</ns3:mobilePhoneNumber></ns3:address>"+
							"<ns3:dateOfBirth>1980-11-30T00:00:00.000+01:00</ns3:dateOfBirth><ns3:gender>Man</ns3:gender>"+
							"<ns3:nationIdentityNumber></ns3:nationIdentityNumber><ns3:race>Kaukasisch</ns3:race><ns3:email></ns3:email><ns3:occupation></ns3:occupation><ns3:healthInsuranceCompany></ns3:healthInsuranceCompany><ns3:policyNumber></ns3:policyNumber></ns3:customer>";
	
		return new BASE64Encoder().encode(customerData.getBytes());
	}
	
	private static String createScreeningData(){
		String screeningData="<screening xmlns='http://www.specsavers.nl/pns/screeningData'>" +
								"<anamnese>"+
								"<fuzzySight>true</fuzzySight>"+
								"<ligthFlashes>true</ligthFlashes>"+
								"<spotsInVision>false</spotsInVision>"+
								"<distortedImage>false</distortedImage>"+
								"<highBloodPressure>true</highBloodPressure>"+
								"<glaucoma>true</glaucoma>"+
								"<maculaDegeneration>true</maculaDegeneration>"+
								"<cataract>true</cataract>"+
								"<lazyEye>false</lazyEye>"+
								"<diabetesMellitus>true</diabetesMellitus>"+
								"<checkOphthalmologist>true</checkOphthalmologist>"+
								"<reasonOphthalmologist>XYZReason</reasonOphthalmologist>"+
								"<ophthalmologistName>ABCName</ophthalmologistName>"+
								"<eyeSurgery>true</eyeSurgery>"+
								"<reasonEyeSurgery>XSDReason</reasonEyeSurgery>"+
								"<glaucomaInFamily>true</glaucomaInFamily>"+
								"<maculaDegenerationInFamily>true</maculaDegenerationInFamily>"+
								"<medicineUse>Flaxon</medicineUse>"+
								"<reasonMedicineUse>FRT</reasonMedicineUse>"+
								"<generalPractitionerName>FrEE</generalPractitionerName>"+
								"<generalPractitionerLocation>Noidalocation</generalPractitionerLocation>"+
								"<glassesOrContacts>2</glassesOrContacts>"+
								"<taxingWork>true</taxingWork>"+
								"<taxingHobby>false</taxingHobby>"+
								"<eyeProblems>true</eyeProblems>"+
								"<eyePain>false</eyePain>"+
							"</anamnese>"+
							"<eyeMeasurements>"+
								"<refractionLeft>1.5</refractionLeft>"+
								"<refractionRight>1.0</refractionRight>"+
								"<visusALeft>0.5</visusALeft>"+
								"<visusARight>0.75</visusARight>"+
								"<visusNLeft>2.0</visusNLeft>"+
								"<visusNRight>1.5</visusNRight>"+
								"<eyePressureLeft>1.0</eyePressureLeft>"+
								"<eyePressureRight>1.0</eyePressureRight>"+
							"</eyeMeasurements>"+
							"<timestampScreening>2011-12-28T07:00:23.531Z</timestampScreening>"+
							"<returnEmailAddress>arvind.gupta@jktech.com</returnEmailAddress>" +
							"</screening>";
	
		return new BASE64Encoder().encode(screeningData.getBytes());
	}
	
	private void setScreeningStatusAppointment(){
		request.setScreeningStatus("Appointment");
	}
	
	private void setScreeningStatusReadyForScreening(){
		request.setScreeningStatus("Ready for screening");
	}
	
	private void setScreeningStatusCancel(){
		request.setScreeningStatus("Cancel");
	}

	public PNSCustomerRequest getRequest() {
		return request;
	}

	public PNSCustomerResponse getResponse() {
		return response;
	}

}

//mvn jaxws:wsimport
