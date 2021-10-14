package org.notima.sveawebpayadmin.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;

public class Converter {

	/**
	 * Convert data to XML GregorianCalendar
	 * 
	 * @param date
	 * @return
	 * @throws DatatypeConfigurationException
	 */
	public static XMLGregorianCalendar convert(java.sql.Timestamp date) throws DatatypeConfigurationException {
		
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTimeInMillis(date.getTime());
		cal.set(Calendar.MILLISECOND, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		
		return javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		
	}
	
	
}
