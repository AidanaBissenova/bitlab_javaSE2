package task2;
import java.util.ArrayList;
public class BankApplication {
    String name;
    ArrayList<Account> accounts = new ArrayList<Account>();

    public BankApplication(String name, ArrayList<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account a){
        accounts.add(a);
    }

    public void removeAccount(int i){
        accounts.remove(i);
    }

    public Account getMaxAccount(){
        int id2=0;
        String name2="";
        String surname2="";
        double balance2=-55555555;
        Account a2 = new Account(id2, name2, surname2, balance2);
        for (int i=0; i<accounts.size(); i++){
            if(accounts.get(i).balance>balance2){
                balance2=accounts.get(i).balance;
                id2=accounts.get(i).id;
                name2=accounts.get(i).name;
                surname2=accounts.get(i).surname;
            }
        }
        return a2;
    }

    public double getAverageBalance(){
        double sum_balance = 0;
        for (int i=0; i<accounts.size(); i++){
            sum_balance+=accounts.get(i).balance;
        }
        return sum_balance/accounts.size();
    }

    public double getTotalBalance(){
        double sum_balance = 0;
        for (int i=0; i<accounts.size(); i++){
            sum_balance+=accounts.get(i).balance;
        }
        return sum_balance;
    }

    public int totalAccounts(){
        return accounts.size();
    }

    public String getBankData(){
        return name + " "+ accounts.size()+ " "+ getTotalBalance()+ " "+ getAverageBalance();
    }
}
