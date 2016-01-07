public class Cafe {

    public static void main(String[] args) {
        Tea youthBerry = new Tea(Tea.WHITE_TEA);
        Patron sarah = new Patron("Sarah", youthBerry);

        while (!sarah.getTea().isEmpty()) {
            sarah.getTea().drink();
        }

        Tea magicDragon = new Tea(Tea.HERBAL_TEA);
        sarah.setTea(magicDragon);

        System.out.println(sarah.toString());
    }

}