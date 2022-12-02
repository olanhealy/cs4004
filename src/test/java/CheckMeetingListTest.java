
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CheckMeetingListTest {

    @Test
    void sendInvite() {
        Meeting meeting = new Meeting("New", "13/11/2022", "10:00",
                "11:00", "A1");
        CheckMeetingList a = new CheckMeetingList(meeting);

        ArrayList<People> temp = new ArrayList<>();

        meeting.addAttendees(temp);
        String[] email = {"kev@hotmail.com", "olan@hotmail.com","millie@hotmail.com",
                "micheal@hotmail.com","brian@hotmail.com", "john@hotmail.com"};
        assertArrayEquals(a.checkMeetingList(), email);

    }
}