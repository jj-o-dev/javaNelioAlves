package section10a.ex11.entities;

public class Volunteer {
    private double height;
    private String gender;

    public Volunteer(double height, String gender) {
        this.height = height;
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Volunteer{" +
                "height=" + height +
                ", gender=" + gender +
                '}';
    }
}
