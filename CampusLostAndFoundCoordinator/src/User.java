public class User {

    private String userId;
    private String fullName;
    private String emailAddress;

    public User(String userId, String fullName, String emailAddress) {
        this.userId = userId;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
    }

    public String getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void displayUserInfo() {
        System.out.println("----------------------------");
        System.out.println("USER INFORMATION");
        System.out.println("----------------------------");
        System.out.println("User ID: " + userId);
        System.out.println("Full Name: " + fullName);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("----------------------------");
    }
}
