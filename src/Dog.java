/**
 *
 */
public class Dog extends Animal {
    private String woofSoud;

    public Dog(String name, String woofSoud) {
        super(name);
        this.woofSoud = woofSoud;
    }

    public String getWoofSoud() {
        return woofSoud;
    }

    public void setWoofSoud(String woofSoud) {
        this.woofSoud = woofSoud;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Dog dog = (Dog) o;

        return woofSoud.equals(dog.woofSoud);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + woofSoud.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "woofSoud='" + woofSoud + '\'' +
                '}';
    }
}
