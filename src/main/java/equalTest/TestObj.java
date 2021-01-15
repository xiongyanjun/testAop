package equalTest;

import java.util.Objects;

/**
 * @author : xiongyanjun  Date: 2020/11/30 ProjectName: settleprovisions Version: 1.0
 */
public class TestObj {
    private String name;
    private String id;

    public TestObj(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public TestObj() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestObj testObj = (TestObj) o;
        return Objects.equals(name, testObj.name) &&
                Objects.equals(id, testObj.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
