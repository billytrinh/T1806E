package Assignment6;

public abstract class Phone {
    /**
     *
     * @param name
     * @param phone
     */
    public abstract void insertPhone(String name, String  phone);

    /**
     *
     * @param name
     */
    public abstract void removePhone(String name);

    /**
     *
     * @param name
     * @param newphone
     */
    public abstract void updatePhone(String name, String newphone);

    /**
     * @param name
     */
    public abstract void searchPhone(String name);

    /**
     *
     */
    public abstract void sort();

}
