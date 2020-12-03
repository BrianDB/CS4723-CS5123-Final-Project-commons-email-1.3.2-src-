package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class TestCaseTwo extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	public void testAddCc() throws EmailException {
		System.out.println("Test to add CC address - jyb___");
		testEmail.addCc("a@b.com");
		assertEquals("a@b.com", testEmail.getCcAddresses().get(0).toString());
	}  
	
	/**
     	* testAddBccMultiple
     	* Adds multiple emails to the BccAddress list
     	* Checks if either of those emails are in the list
     	* @throws EmailException
     	*/
    	@Test
    	public void testAddBccMultiple() throws EmailException {
		System.out.println("Test to add multiple BCC addresses - jyb___"); 
        	String [] testEmails = {"a@b.com", "b@c.com"}; 
        	testEmail.addBcc(testEmails);
        	assertEquals("a@b.com", testEmail.getBccAddresses().get(0).toString()); 
        	assertEquals("b@c.com", testEmail.getBccAddresses().get(1).toString()); 
    	}

	/**
     	* testGetMailSessionWithHostName
     	* sets a hostname and gets the mail session, checks for an empty hostname
     	* @throws EmailException
    	*/
    	@Test
    	public void testGetMailSessionWithHostName() throws EmailException {
		System.out.println("Test to get a mail session - jyb___")
        	testEmail.setHostName("utsa.com");
        	testEmail.getMailSession(); 
        	assertFalse(EmailUtils.isEmpty(testEmail.hostName)); 
    	}


}
