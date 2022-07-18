package OOP.PhoneBook;

public class Contact {
    private String name;
    private String number;
    private String address;
    private int Id;
    private static int idCount = 1;


    public int getId() {
        return Id;
    }

    public Contact(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.Id = idCount;
        idCount++;
    }


    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.format("""
                Contact Name: %s
                Contact Number: %s
                Contact Address: %s
                """, getName(), getNumber(), getAddress());
    }
}
