import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Meeting {

    private String name;
    private String date;
    private String startTime;
    private String endTime;
    private String room;
    private ArrayList<People> attendees = new ArrayList<People>();


    private ArrayList<People> meetingList = new ArrayList<People>();

    public Meeting(String name, String date, String startTime, String endTime, String room) {
        this.name = name;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.room = room;
    }


    //get hours and minutes from startTime and endTime
    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }



    public String getDate() {
        return date;
    }

    public void addAttendee(People attendee) {
        meetingList.add(attendee);
    }

    public ArrayList<People> getMeetingList() {
        return meetingList;
    }






    public boolean checkTime(String time){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:m");
        LocalTime start = LocalTime.parse(getStartTime(), formatter);
        LocalTime end = LocalTime.parse(getEndTime(), formatter);
        LocalTime timeToCheck = LocalTime.parse(time, formatter);

        if(start.isBefore(timeToCheck) && end.isAfter(timeToCheck)){
            System.out.println("Time is within constraints");
            return true;
        }
        else{
            System.out.println("Time is not within constraints");
            return false;
        }
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

    public boolean checkAttendees( People people) {

        //if the meeting list contains the people

        for(People p : meetingList) {
            if(p.getName().equals(people.getName()) && p.getEmail().equals(people.getEmail()) && p.getPhone().equals(people.getPhone())) {
                return true;
            }
        }
        return false;
    }

    public boolean joinMeeting(People people) {
        boolean joined = false;
        int hour = LocalDateTime.now().getHour();
        int min = LocalDateTime.now().getMinute();
        String time = hour + ":" + min;
        if (checkAttendees(people)) {
            attendees.add(people);
            if (checkAttendees(people) && checkTime(time)) {
                System.out.println("You have joined the meeting");
                joined = true;
            } else {
                System.out.println("You are not invited to this meeting");
            }

        }
        return joined;
    }


    public String checkAttendance(People people) {
        String attendance = "";
        if(attendees.contains(people)) {
            attendance = "Attended";
        } else {
            attendance = "No attendance";
        }
        return attendance;
    }




    public String notifyAttendee(boolean val) {
        if ( val == true) {

            //method to send notification
            return "Notification sent";
        }
        return "Notification not sent";
    }



    public boolean checkTimeConstraints(Meeting meeting, String startDate, String endDate) {
        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.parse(meeting.getDate());
        LocalDate strDate = LocalDate.parse(startDate);
        LocalDate edDate = LocalDate.parse(endDate);
    if (date.isBefore(now)) {
        System.out.println("Date is before today");
        return false;
    }if (date.isAfter(strDate) && date.isBefore(edDate)) {
            System.out.println("Date is within time constraints");
            return true;
        } else {
            System.out.println("Date is not within time constraints");
            return false;
        }
    }



    @Override
    public String toString() {
        return "Meeting{" +
                "meetingList=" + meetingList +
                '}';
    }



}