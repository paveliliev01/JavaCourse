public class OOPMain {
    private String name;

    public OOPMain(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        OOPMain pavel = new OOPMain("Pavel");
        pavel.name = "Faked Pavel";
        System.out.println(pavel.name);
    }
}
