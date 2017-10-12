public class Data implements Comparable<Data> {

    private final int day;
    private final int month;
    private final int year;

    public Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Data o) {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
