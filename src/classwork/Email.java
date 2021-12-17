package classwork;

public class Email {
    private String eMailAddress;

    public String getAddress() {
        return eMailAddress;
    }

    public void setAddress(String address) {
        if (address.length() < 1) {
            System.out.println("invalid input");
        } else if ((address.charAt(address.length() - 4) == '.') && ((address.charAt(address.length() - 9) == '@'))) {
            this.eMailAddress = address;
        }
    }
}
