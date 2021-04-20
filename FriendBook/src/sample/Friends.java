package sample;

public class Friends {
    public static String getFirstname;
    public static String getLastname;
    private String Firstname;
    private String Lastname;

    public Friends(String Firstname, String Lastname){
        this.Firstname = Firstname;
        this.Lastname = Lastname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }
}
