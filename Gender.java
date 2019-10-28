package lt.berta.god;

public enum Gender {
    FEMALE, MALE;

    // parenkama random lytis;
    public static Gender getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
