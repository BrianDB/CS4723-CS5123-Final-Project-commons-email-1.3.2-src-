package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class TestCaseOne extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}

	public void testAddCc() throws EmailException {
		System.out.println("Test to add CC Addresses - jyb___");
		testEmail.addCc("a@b.com");
		assertEquals("a@b.com", testEmail.getCcAddresses().get(0).toString());
	}

	/**
     	* testAddCcMultiple
     	* Adds multiple emails to the CcAddress list
     	* Checks if either of those emails are in the list
     	* @throws EmailException
     	*/
    	public void testAddCcMultiple() throws EmailException {
        	System.out.println("Test to add multiple CC addresses - jyb___"); 
		String [] testEmails = {"a@b.com", "b@c.com"};
        	testEmail.addCc(testEmails);
        	assertEquals("a@b.com", testEmail.getCcAddresses().get(0).toString());
        	assertEquals("b@c.com", testEmail.getCcAddresses().get(1).toString());
    	}


}
