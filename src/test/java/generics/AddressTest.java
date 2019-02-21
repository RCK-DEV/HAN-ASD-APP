package generics;

import java.util.Arrays;

public class AddressTest {

    public static void main(String[] arg) {
        Address[] addresses =  new Address[5];
        addresses[0] = new Address("Peachstreet", 33);
        addresses[1] = new Address("Boulevard avenue", 5);
        addresses[2] = new Address("Rockstreet", 4);
        addresses[3] = new Address("Alteredstreet", 11);
        addresses[4] = new Address("Alteredstreet", 12);

        Arrays.sort(addresses);

        System.out.println(Arrays.asList(addresses));

    }
}
