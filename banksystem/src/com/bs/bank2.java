package com.bs;
import java.util.*;

public class bank2 {

    String user_name;
    float user_amount;
    String choice;
    Hashtable<String,Float> data=new Hashtable<String, Float>();

    class  Account {
        String name;
        float balance;
        long acc_Number;

        Account(String name,float balance,long acc_Number) {
            this.name = name;
            this.balance = balance;
            this.acc_Number = acc_Number;
        }
    }

    class ac{
        String n;
        float b;
        long acid;

    ac(String n,float b, long acid){
        this.n=n;
        this.b=b;
        this.acid=acid;
    }}



    ArrayList<Account> list = new ArrayList<Account>();

    ArrayList<Integer> num = new ArrayList<>();



    Scanner input=new Scanner(System.in);
//    bank2(){
//        System.out.println("Herald Bank.");
//    }

    boolean check_account(String name) {
        boolean checked=false;
        for(String i : data.keySet()) {
            if (name.equals(i)) {
                checked = true;
                break;
            }
        }
        return checked;
    }




    void create_account(String name,long an) {
        num.add(1000);


        if (check_account(name)==true) {
            System.out.println("account exists");
        }
        else {
            list.add(new Account(name,0f,an));
            System.out.println(an);

//            System.out.println("account created.\n acc Holder name="+name+"\n total amount="+amount);
        }

    }



    void depositamount(long accNumber,float deposite_amount ,int limit) {
        float ans = 0f;

        if(deposite_amount < 500  ) {
            System.out.println("Minimum deposit is 500");
        } else if(deposite_amount > 50000) {
            System.out.println("Maximum deposit is 50,000");
        } else if(limit >  3 ) {
            System.out.println("Only Three deposits are allowed");
        }

        else {
            for(Account i : list) {
                if(i.acc_Number == accNumber) {
                    i.balance = i.balance + deposite_amount;
                    ans = i.balance ;
                }
            }
            System.out.println(ans);

        }



//        if(check_account(name)) {
//            float previous_amount=data.get(name);
//            data.replace(name, previous_amount+deposite_amount);
//        }
//        else {
//            System.out.println("user not exist");
//        }
    }
    void balance(long acc_id) {
        float bal = 0;
        for (Account i : list) {
            if (i.acc_Number == acc_id) {
                bal = i.balance;

            }
        }
        System.out.println(bal);
    }
    void withdrawn_amount(long acid, float withdrawn_amount, int limit) {
        float res = 0f;
        if(withdrawn_amount < 1000){
            System.out.println("Minimum withdrawal amount is 1000");
        }
        else if(withdrawn_amount > 25000){
            System.out.println("Maximum withdrawal amount is 25000");
        } else if(limit >  3 ) {
            System.out.println("Only Three withdrawals are allowed");
        }
        else{
            for (Account i:list){
                if(i.acc_Number == acid){
                    i.balance = i.balance - withdrawn_amount;
                    res = i.balance;
                }
            }
            System.out.println(res);
        }



//        if (check_account(name)) {
//            if(check_amount(name)>=withdrawn_amount) {
//                data.replace(name,data.get(name)-withdrawn_amount);
//                System.out.println("Transaction successfull. \nThank you for banking with us.");
//            }
//            else {
//                System.out.println("Not enough balance");
//            }
//        }
    }

    private void quit_program() {
        System.exit(0);

    }
    static  long a = 1001;
    static  int limit = 1 ;
    void switchCase(String Case) {

        switch (Case){
            case "create":
                String user_name = input.next();
//                System.out.println("Enter the ammount to deposite");
//                user_amount=input.nextFloat();
                a = a+1;

                create_account(user_name,a);
                break;
            case "deposit":
                long accNumber =input.nextLong();
                user_amount = input.nextFloat();
                depositamount(accNumber,user_amount,limit);
                limit = limit+1;
                break;
            case "balance":
                long acc_id=input.nextLong();
                balance(acc_id);
                break;
            case "withdraw":
                long acid = input.nextLong();
                user_amount=input.nextFloat();
                withdrawn_amount(acid,user_amount,limit);
                limit = limit+1;
                break;

            case "E":

                quit_program();
                break;
            default:

        }
    }
}
