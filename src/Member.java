public class Member {

    private String name;
    private String surname;
    private char sex;
    private int birthday;
    private int year;
    private String yearStr;
    private String monthStr;
    private String dateStr;



    Member(String name, String surname, char sex, int birthday, int year, String yearStr, String monthStr, String dateStr) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this. birthday = birthday;
        this.year = year;
        this.yearStr = yearStr;
        this.monthStr = monthStr;
        this.dateStr = dateStr;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public char getSex() {
        return sex;
    }

    public int getBirthday(){
        return birthday;
    }

    public int getYear(){
        return year;
    }

    public String getYearStr() {
        return yearStr;
    }
    public String getMonthStr() {
        return monthStr;
    }
    public String getDateStr() {
        return dateStr;
    }

}
