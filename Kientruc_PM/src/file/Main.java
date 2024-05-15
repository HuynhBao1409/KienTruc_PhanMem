package file;

public class Main {
    public static void main(String[] args) {
       AbstractFlie abstractFlie = new Folder("asdad","14/02");
       AbstractFlie a = new Folder("Beo","14/10");
       AbstractFlie ab = new Folder("Buynh","14/10");
       a.add(abstractFlie);
       abstractFlie.add(ab);
        System.out.println(abstractFlie.getPath());
        System.out.println(abstractFlie.getStringTreeFolder());
    }
}
