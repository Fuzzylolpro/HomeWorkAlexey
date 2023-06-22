package HomeWork.Lesson18;

public class Developer1 {
    private String name = "Anna";
    private String name1 = "Alla";
    private String name3 = "Annapa1";
    private int id = 14;
    private int id1 = 8;

    public String getName1() {
        return name1;
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

    @Override
    public String toString() {
        return "Developer1{" +
                "name='" + name + '\'' +
                '}';
    }
}
