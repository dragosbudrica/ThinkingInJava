package typeinfo.exercise20;

public class TestClass {

    private String firstMember;
    private int secondMember;

    public TestClass() {}

    public TestClass(String firstMember, int secondMember) {
        this.firstMember = firstMember;
        this.secondMember = secondMember;
    }

    public String getFirstMember() {
        return firstMember;
    }

    public void setFirstMember(String firstMember) {
        this.firstMember = firstMember;
    }

    public int getSecondMember() {
        return secondMember;
    }

    public void setSecondMember(int secondMember) {
        this.secondMember = secondMember;
    }
}
