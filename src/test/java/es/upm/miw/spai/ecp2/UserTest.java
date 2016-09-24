package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	private User u;
	
	@Before
	public void before(){
		u = new User(1, "Jorge", "Higuera");
	}

	@Test
	public void testUser() {
		assertEquals(1, u.getNumber());
		assertEquals("Jorge", u.getName());
		assertEquals("Higuera", u.getFamilyName());
	}

	@Test
	public void testFullName() {
		assertEquals("Jorge Higuera", u.fullName());
	}

	@Test
	public void testInitials() {
		assertEquals("J.", u.initials());
	}

}
