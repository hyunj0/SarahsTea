public class Tea implements Drinkable {

    public static final String WHITE_TEA = "White Tea";
    public static final String GREEN_TEA = "Green Tea";
    public static final String OOLONG_TEA = "Oolong Tea";
    public static final String BLACK_TEA = "Black Tea";
    public static final String PUERH_TEA = "Pu'erh Tea";
    public static final String MATE_TEA = "Mate Tea";
    public static final String ROOIBOS_TEA = "Rooibos Tea";
    public static final String HERBAL_TEA = "Herbal Tea";

    private static final int FULL_CUP = 10;
    private static final int EMPTY_CUP = 0;

    private final String teaType;
    private int teaLevel;

    public Tea(String teaType) {
        this.teaType = teaType;
        this.teaLevel = Tea.FULL_CUP;
    }

    public String getTeaType() {
        return this.teaType;
    }

    public int getTeaLevel() {
        return this.teaLevel;
    }

    @Override
    public boolean isEmpty() {
        return this.teaLevel == Tea.EMPTY_CUP;
    }

    @Override
    public void drink() {
        if (this.isEmpty())
            throw new IllegalStateException("You finished the tea! Get a refill!");
        this.teaLevel = this.teaLevel - 1;
    }

    @Override
    public void refill() {
        this.teaLevel = FULL_CUP;
    }

    @Override
    public String toString() {
        return this.teaLevel + " sips remaining of " + this.teaType;
    }
}