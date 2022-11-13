import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneNumberTest {
    private People people;

    void setup() {
        people = new People();
    }

    @Test
    @DisplayName("Can't create an account, phone number appearing not valid")
    public void phoneNumberNotValid() {
        var phoneNumber = new People("Kevin", "kev@gmail.com", "+3530868604574");
        var phoneNumber2 = new People("Olan", "ola@gmai.com", "+353 0868604574");
        var phoneNumber3 = new People("Millie", "millie@gmail.com", "+3540868604574");
        var phoneNumber4 = new People("Micheal", "micheal@gmail.com", "+353 0086860");

        assertEquals(true, phoneNumber.isValid(phoneNumber));
        assertFalse(phoneNumber2.isValid(phoneNumber2));
        assertFalse(phoneNumber3.isValid(phoneNumber3));
        assertEquals(false, phoneNumber4.isValid(phoneNumber4));


        //as this phone number should be valid
    }

    @Test
    @DisplayName("Can't create an account, phone number appearing not valid")
    public void phoneNumberNotA08() {
        var phoneNumber1 = new People("Brian", "brian@gmail.com", "+3530000000000");
        var phoneNumber2 = new People("Pat", "pat@gmail.com", "+3530901234567");
        var phoneNumber3 = new People("Martin", "martin@gmail.com", "+3531895674312");
        assertFalse(phoneNumber1.isValid(phoneNumber1));
        assertFalse(phoneNumber2.isValid(phoneNumber1));
        assertFalse(phoneNumber3.isValid(phoneNumber1));
    }

        @Test
        @DisplayName("Can't create an account, phone number appearing not valid")
        public void phoneNumberWithSpacesA08() {
            var phoneNumber8 = new People("Ben", "ben@gmail.com", "+353 0868604574");
            assertEquals(true, phoneNumber8.isValid(phoneNumber8));


}
}








