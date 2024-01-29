package session03.Model;

public class Contact {
    private String name;
    private String number;
    private final ContactType type;

    public Contact(String name, String number, ContactType type) {
        this.name = name;
        this.number = number;
        this.type = type;
    }

    public ContactType getType() {
        return type;
    }

    private String capitalizeFirstCharacter(String str){
        if(str !=null && !str.isEmpty()){
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }
// encapsulation & polymorphism


    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", type=" + type +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = capitalizeFirstCharacter(name);
    }
// Overload
    public void setNumber(String number) {
        this.number = number;
    }
//    public void setNumber(int number) {
//        this.number = String.valueOf(number);
//    }
//    public void setNumber(int prefix , int number) {
//        this.number = "0" + prefix + number;
//    }
}
