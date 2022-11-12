import java.util.ArrayList;

public class Meeting {

    private String name;
    private String date;
    private String startTime;
    private String endTime;
    private String room;
    private People attendees;

    private ArrayList<People> meetingList = new ArrayList<People>();

    public Meeting(String name, String date, String startTime, String endTime, String room) {
        this.name = name;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.room = room;
    }


    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getRoom() {
        return room;
    }
    public ArrayList<People> getMeetingList() {
        return meetingList;
    }

    public String getAttendees() {
        String str = "";

        for (People people : meetingList) {
            str = str+people.getName() + ", ";
            //replace last comma with space by using substring


        }
        return str.substring(0, str.length() - 2);
    }

    public void addAttendees(ArrayList<People> meetingList) {
        this.meetingList = meetingList;
        this.meetingList.add(new People("Kevin", "kev@hotmail.com", "+353 0868604574"));
        this.meetingList.add(new People("Olan", "olan@hotmail.com", "+353 0878604574"));
        this.meetingList.add(new People("Millie", "millie@hotmail.com", "+353 0898604574"));
        this.meetingList.add(new People("Micheal", "micheal@hotmail.com", "+353 0898604574"));
        this.meetingList.add(new People("Brian", "brian@hotmail.com", "+353 0898604574"));
        this.meetingList.add(new People("John", "john@hotmail.com", "+353 0898604574"));

    }



    @Override
    public String toString() {
        return "Meeting{" +
                "meetingList=" + meetingList +
                '}';
    }
}