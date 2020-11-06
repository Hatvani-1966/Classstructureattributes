package classstructureattributes;

public class ClientMain {
    public static void main(String[] args) {
        Client x = new Client();
        x.name = "Joe";
        x.year = 1980;
        x.address = "Kocser";
        System.out.println(x.name);
        System.out.println(x.year);
        System.out.println(x.address);

    }
}
