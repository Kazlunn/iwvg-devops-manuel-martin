package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testConstructorEmptyUser() {
        User user = new User();
        assertNotNull(user.getFractions());
        assertTrue(user.getFractions().isEmpty());
    }

    @Test
    void testConstructorUser() {
        User user = new User("1", "Manuel", "Martín Hornillos", new ArrayList<>());
        assertNotNull(user.getId());
        assertNotNull(user.getName());
        assertNotNull(user.getFamilyName());
        assertNotNull(user.getFractions());
        assertEquals("1", user.getId());
        assertEquals("Manuel", user.getName());
        assertEquals("Martín Hornillos", user.getFamilyName());
        assertTrue(user.getFractions().isEmpty());
    }

    @Test
    void testFullnameUser() {
        String fullname = new User("2", "Manuel", "Martín Hornillos", new ArrayList<>()).fullName();
        assertNotNull(fullname);
        assertEquals("Manuel Martín Hornillos", fullname);
    }

    @Test
    void testInitialsUser() {
        String initials = new User("3", "Manuel", "Martín Hornillos", new ArrayList<>()).initials();
        assertNotNull(initials);
        assertEquals("M.", initials);
    }

    @Test
    void testToStringUser() {
        String objectToString = new User("4", "Manuel", "Martín Hornillos", new ArrayList<>()).toString();
        assertNotNull(objectToString);
        assertEquals("User{id='4', name='Manuel', familyName='Martín Hornillos', fractions=[]}", objectToString);
    }

}
