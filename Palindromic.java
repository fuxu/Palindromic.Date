public class Palindromic {
    static int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private Integer year;
    private Integer month;
    private Integer date;
    public static void main(String[] args) {
        for(int i = 1280; i < 3000; i++) {
            Palindromic p = new Palindromic(i);
            if(p.isValid()) {
                System.out.println(p);
            }
        }
    }
    Palindromic(int year) {
        this.year = new Integer(year);
        StringBuffer sb = new StringBuffer(this.year.toString());
        String md = sb.reverse().toString();
        this.month = new Integer(Integer.parseInt(md.substring(0,2)));
        this.date = new Integer(Integer.parseInt(md.substring(2,4)));
    } 
    boolean leapYear() {
        if(this.year % 100 == 0) {
            return this.year % 400 == 0;
        } else {
            return this.year % 4 == 0;
        }
    }
    boolean isValid() {
        if(this.isValidMonth()) {
            if(2 == this.month) {m[1] = this.leapYear()?29:28;}
            return this.date > 0 && this.date <= m[ month -1 ];
        }
        return false;
    }
    boolean isValidMonth() {
        return this.month < 13 && this.month >0;
    }
    public String toString() {
        return String.format("%1$04d%2$02d%3$02d", this.year, this.month, this.date);
    }
}
