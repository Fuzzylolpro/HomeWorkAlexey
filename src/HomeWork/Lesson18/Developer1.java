package HomeWork.Lesson18;

import java.util.Objects;

public class Developer1 {
    private String name = "Anna";
    private String name1 = "Alla";
    private String name3 = "Annapa1";
    private int id = 14;
    private int id1 = 8;

    public String getName1() {
        return name1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer1 that = (Developer1) o;
        return id == that.id && id1 == that.id1 && Objects.equals(name, that.name) && Objects.equals(name1, that.name1) && Objects.equals(name3, that.name3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, name1, name3, id, id1);
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public int getId1() {
        return id1;
    }

    @Override
    public String toString() {
        return "Developer1{" +
                "name='" + name + '\'' +
                ", name1='" + name1 + '\'' +
                ", name3='" + name3 + '\'' +
                ", id=" + id +
                ", id1=" + id1 +
                '}';
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
