public class People {
    private String name;
    private String email;
    private String phone;

    public People(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public People() {

    }

    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getPhone() {return phone;}


    public boolean getAttendance() {
        return false;
    }


    public boolean isValid() {
        boolean expected = false;
        if (phone.length() == 13 && phone.startsWith("+353")) {
            expected = true;
        }
        return expected;
    }
}
