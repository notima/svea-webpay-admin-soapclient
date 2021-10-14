package org.notima.sveawebpayadmin.test;

import org.notima.sveawebpayadmin.AdminService;
import org.notima.sveawebpayadmin.IAdminService;

public class SoapTest {

	protected AdminService		adminService;
	protected IAdminService		adminServicePort;
	
	public SoapTest() {
		
		adminService  = new AdminService(AdminService.WSDL_LOCATION, AdminService.SERVICE);
		adminServicePort = adminService.getAdminSoapService();
		
	}
	
}
