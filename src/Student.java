public class Student {

    private Integer age;
    private String name;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (student.getName().equals(getName())) return false;

        return student.getAge().equals(getAge());

    }

    public int hashCode(){
        int result = getName() == null ? 0 : getName().hashCode();
        result = 31 * result + getAge();
        return result;
    }



    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
