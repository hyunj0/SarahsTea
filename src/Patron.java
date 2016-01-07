public class Patron {

    private final String name;
    private Tea tea;

    public Patron(String name, Tea tea) {
        this.name = name;
        this.tea = tea;
    }

    public String getName() {
        return name;
    }

    public Tea getTea() {
        return tea;
    }

    public void setTea(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String toString() {
        return this.name + " is drinking " + this.tea.getTeaType();
    }
}