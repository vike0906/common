package excel;

import java.util.Date;

/**
 * @author: lsl
 * @createDate: 2019/9/26
 */
public class Test {
    @ColumnName("ID")
    private String id;
    @ColumnName("姓名")
    private String name;
    @ColumnName("年龄")
    private int age;
    @ColumnName("薪水")
    private Double salary;
    @ColumnName("日期")
    private Date date;

    public Test(){

    }

    public Test(String id, String name, int age, Double salary, Date date) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
