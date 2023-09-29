public class BuddyInfo {

    private String name;
    private String address;
    private int phoneNumber;
    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return this.name;
    }

    public static void main(String[] args) {
        BuddyInfo Bob = new BuddyInfo("Bob", "Carleton", 647);
        System.out.println("Hello " + Bob.name + "!");
    }
}
