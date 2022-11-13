import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneNumberTest {
    private People people;
    void setup() {
        People phoneNumber = new People();
    }

    @Test
    @DisplayName("Can't create an account, phone number appearing not valid")
    public void phoneNumberNotValid() {
       var phoneNumber = new People("Kevin", "kev@gmail.com", "+3530868604574");
        assertEquals(true, phoneNumber.isValid()); //as this phone number should be valid
    }
}
