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

    public String getName() {
        return name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }


    public boolean getAttendance() {
        return false;
    }


    public boolean isValid(People phoneNumber) {
        boolean expected = false;
        if (phone.length() > 14) {
            phoneNumber.setPhone(phoneNumber.getPhone().replace(" ", ""));
            System.out.println(phoneNumber.getPhone());
        }
        if (phone.length() == 14 && phone.startsWith("+353") && phone.charAt(4) == '0' && phone.charAt(5) == '8') {
            expected = true;
        }
        return expected;
    }



}



