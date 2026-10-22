public class Main{
    public static void main(String[] args){

        String customername="Mave Olive";

        long deposit= 150010;
        double depositasdouble = deposit;
        double interest = depositasdouble * 0.055;
        double finalamount=depositasdouble+interest;
        int finalamountasint=(int) finalamount;
        long roundedamount=Math.round (finalamount);


        System.out.println("Customer Name= " + customername);
        System.out.println("Deposit = " + deposit);
        System.out.println("Interest = " + interest);
        System.out.println("Final amount = " + finalamount);
        System.out.println("Final amount as int = " + finalamountasint);
        System.out.println("Rounded final Amount = " + roundedamount);
    }
}