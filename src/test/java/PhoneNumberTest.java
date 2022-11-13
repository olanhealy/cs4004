import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
       var phoneNumber2 = new People("Olan", "ola@gmai.com" , "+353 0868604574");
       var phoneNumber3 = new People("Millie", "millie@gmail.com", "+3540868604574");
        assertEquals(true, phoneNumber.isValid(phoneNumber));
        assertFalse(phoneNumber2.isValid(phoneNumber2));
        assertFalse(phoneNumber3.isValid(phoneNumber3));

        //as this phone number should be valid
    }

  //  @ParameterizedTest
    //@CsvSource(value = {"+3530868604574, TRUE  "})
    //@DisplayName(("More tests on phoneNumberNotValid"))
    //public void phoneNumberNotValid(String phoneNumber) {


      //  boolean valid = people.isValid_(phoneNumber);
        //assertEquals(true, valid);
    //}

    }

