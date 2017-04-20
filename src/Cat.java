/**
 *
 */
public class Cat extends Animal {
    private String typeCat;

    public Cat(String name, String typeCat) {
        super(name);
        this.typeCat = typeCat;
    }

    public String getTypeCat() {
        return typeCat;
    }

    public void setTypeCat(String typeCat) {
        this.typeCat = typeCat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;

        return typeCat.equals(cat.typeCat);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + typeCat.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "typeCat='" + typeCat + '\'' +
                '}';
    }
}
