public class opeartions {
    calculator cal;
    public opeartions(calculator cal)
    {
        this.cal=cal;
    }


    public int add(int a,int b)
    {
        return cal.add(a,b)+a*b;
    }
}
