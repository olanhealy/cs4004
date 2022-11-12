import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SpellingErroInSecurity {
    @Test
    @DisplayName("Spelling error in security")
    public void testSecurity() {
        Security securityName = new Security("Security");
        assertEquals("Security", securityName.getSecurity());
        assertFalse(securityName.getSecurity().equals("Securty"));
        assertFalse(securityName.getSecurity().equals("Seciurity"));
        assertFalse(securityName.getSecurity().equals("Secureity"));
        assertFalse(securityName.getSecurity().equals("Securityy"));
        assertFalse(securityName.getSecurity().equals(" Security"));
        assertFalse(securityName.getSecurity().equals("Security "));

    }

}
