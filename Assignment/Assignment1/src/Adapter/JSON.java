package Adapter;

public class JSON {

    public JSON() {
    };

    public JSON(String data) {
    }

    XML convertToXML() {

        return new XML("Stringified JSON data");
    }
}