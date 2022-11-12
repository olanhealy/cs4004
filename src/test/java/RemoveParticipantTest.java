import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RemoveParticipantTest {

    @org.junit.jupiter.api.Test
    void removeParticipant() {

        Meeting a = new Meeting("new", "01/01/2001", "10:00",
                "11:00","A");
        RemoveParticipant test = new RemoveParticipant(a);
        People Jerry = new People("Jerry", "a", "a");
        ArrayList<People> b = new ArrayList<People>();
        b.add(Jerry);
        a.addAttendees(b);

        assertTrue(test.removeParticipant(Jerry), "Remove Participant");
    }
}