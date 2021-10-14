package org.notima.sveawebpayadmin.test;

import java.util.Calendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Before;
import org.junit.Test;
import org.notima.sveawebpayadmin.GetAccountingReportRequest;
import org.notima.sveawebpayadmin.GetAccountingReportResponse2;
import org.notima.sveawebpayadmin.util.Converter;

public class TestGetAccountingReport extends SoapTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetAccountingReport() throws DatatypeConfigurationException {
		
		java.sql.Timestamp date = new java.sql.Timestamp(Calendar.getInstance().getTimeInMillis());
		
		GetAccountingReportRequest request = new GetAccountingReportRequest();
		request.setClientId(10L);
		request.setAuthentication(null);
		
		XMLGregorianCalendar acctDate = Converter.convert(date);
		
		request.setFromDate(acctDate);
		request.setToDate(acctDate);
		
		GetAccountingReportResponse2 response = adminServicePort.getAccountingReport(request);
		
		
		
	}

}
