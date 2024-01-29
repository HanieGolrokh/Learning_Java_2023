package session03.Model;

import java.security.PrivateKey;

public class BusinessContact extends Contact{
    private String fax;

    public BusinessContact(String name, String number) {
        super(name, number,ContactType.BUSINESS );
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

}
