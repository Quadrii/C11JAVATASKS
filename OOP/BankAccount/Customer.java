package OOP.BankAccount;

public class Customer {
    private int BVN;
    private double balance;
    private int accountNumber;
    Gender gender;
    private  String name;
    private int age;
    private static int bvnCount = 1;

    public Customer(String name, int age,  Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.BVN = bvnCount;
        bvnCount++;
    }
    public int getMyAccountNumber(){
        return accountNumber;
    }

    public int getMyBVN(){
        return BVN;
    }

    public int getAge(){
        return age;
    }
    @Override
    public String toString() {
        return
                "BVN=" + BVN +
                        ", name='" + name + '\'' +
                        ", age=" + age +
                        ", gender=" + gender;
    }

}
