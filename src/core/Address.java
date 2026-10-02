package core;
import java.util.Date;

public abstract class Address {

}

abstract class ResidentialAddress extends Address {

}

class StreetAddress1 extends ResidentialAddress {
    int houseNumber;
    String street;
    String barangay;
    String city_municipality;
    String province;
    String zip;
    String country;             // country ID
}

class StreetAddress extends ResidentialAddress {
    int block;
    int lot;

}

enum LGUType {
    CITY,
    MUNICIPALITY
}

abstract class LGU {
    LGUType type;
    String name;
}
class Barangay extends Address {
    String name;


}





