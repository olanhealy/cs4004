
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SendInviteTest {

    @Test
    void sendInvite() {
        Meeting meeting = new Meeting("New", "13/11/2022", "10:00",
                "11:00", "A1");
        SendInvite a = new SendInvite(meeting);
        People Jimmy = new People("Jimmy", "jimmy@gmail.com", "0821921");
        People Timmy = new People("Timmy", "timmy@gmail.com", "0828329");
        ArrayList<People> temp = new ArrayList<>();
        temp.add(Jimmy);
        temp.add(Timmy);
        meeting.addAttendees(temp);
        String[] email = {"jimmy@gmail.com", "timmy@gmail.com","kev@hotmail.com",
                "olan@hotmail.com","kev@hotmail.com"};
        assertArrayEquals(a.sendInvite(), email);
    }
}