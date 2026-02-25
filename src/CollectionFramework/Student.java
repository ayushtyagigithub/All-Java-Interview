package CollectionFramework;

import java.util.Objects;

public class Student implements Comparable {
    String name;
    String branch;
    String city;
    int id;

    public Student(String name, String branch, String city, int id) {
        this.name = name;
        this.branch = branch;
        this.city = city;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", city='" + city + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }



    @Override
    public int compareTo(Object o) {
        return this.id-((Student)o).id;
    }
}
