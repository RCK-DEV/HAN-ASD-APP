package generics;

public class Address implements Comparable<Address> {
    private final String street;
    private final int houseNumber;

    public Address(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }

    @Override
    public int compareTo(Address o) {
        int result = street.compareTo(o.street);

        if (result == 0) {
            return  ((Integer) houseNumber).compareTo(o.houseNumber);
        } else {
            return result;
        }
    }
}
