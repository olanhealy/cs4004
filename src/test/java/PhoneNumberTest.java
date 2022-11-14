import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneNumberTest {




    @Test
    @DisplayName("Can't create an account, phone number appearing not valid")
    public void phoneNumberNotValid() {
        var phoneNumber = new People("Kevin", "kev@gmail.com", "+3530879043214");
        assertEquals(true, phoneNumber.isValid(phoneNumber));




        //as this phone number should be valid
    }

    @Test
    @DisplayName("Test to see if phonne number that doesn't contain an 08- after +353")
    public void phoneNumberNotAn08() {
        var phoneNumber1 = new People("Brian", "brian@gmail.com", "+3530800000000");
        var phoneNumber2 = new People("Pat", "pat@gmail.com", "+3530901234567");
        var phoneNumber3 = new People("Martin", "martin@gmail.com", "+3531895674312");
        var phoneNumber4 = new People("John", "join@gmail.com","+353076543210");
        assertTrue(phoneNumber1.isValid(phoneNumber1));
        assertFalse(phoneNumber2.isValid(phoneNumber1));
        assertFalse(phoneNumber3.isValid(phoneNumber1));
        assertFalse(phoneNumber4.isValid(phoneNumber1));
    }
    @Test
    @DisplayName("Test to see if there is no + at start of number")
    public void phoneNumberNoPlus() {
        var phoneNumber_1 = new People("Brian", "brian@gmail.com", "35308686745671");
        var phoneNumber_2 = new People("Pat", "pat@gmail.com", "-3530879058321");
        assertFalse(phoneNumber_1.isValid(phoneNumber_1));
    }
    @Test
    @DisplayName("Can't create an account, phone number appearing not valid")
    public void phoneNumberInputtedWithSpaces() {
        var phoneNumber8 = new People("Ben", "ben@gmail.com", "+353 0868604574");
        var phoneNumber9 = new People("Paul", "paul@gmail.com", "+353   086860457");
        var phoneNumber10 = new People("John", "john@gmail.com", "+  3 5 3  08 6   87 54 3 2 1");
        var phoneNumber11 = new People("Cian", "Cian@gmail.com", "-353089234  1243");
        assertEquals(true, phoneNumber8.isValid(phoneNumber8));
        assertEquals(false, phoneNumber9.isValid(phoneNumber9));
        assertTrue(phoneNumber8.isValid(phoneNumber8));
        assertFalse(phoneNumber11.isValid(phoneNumber11));
    }
}