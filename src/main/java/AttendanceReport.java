import java.util.ArrayList;

public class AttendanceReport {
    private ArrayList<Meeting> meeting;
    private String Attendance;
    final String fullAttendance = "Full Attendance";
    final String partialAttendance = "Partial Attendance";
    final String noAttendance = "No Attendance";

    public AttendanceReport() {
        ArrayList<Meeting> meeting = new ArrayList<>();
        this.Attendance = Attendance;
    }

    public String getAttendance() {
        return Attendance;
    }

    public void setAttendance(String attendance) {
        Attendance = attendance;
    }

    //if someone attends the meeting, their attendance is set to full
    public String fullAttendance(People person){
        if(person.getAttendance() == true){
            return fullAttendance;
        }else if(person.getAttendance() == false){
            return partialAttendance;
        }else{
            return noAttendance;
        }
    }
}




