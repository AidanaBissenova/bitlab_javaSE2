package task2;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Account a1 = new Account(1, "Aidana", "B", 2500);
        Account a2 = new Account(2, "Zhanerke", "Aaa", 1200);
        Account a3 = new Account(1, "DDDa", "fsdgfdB", 7800);
        Account a4 = new Account(2, "TTEZhanerke", "SSSa", 2200);
        ArrayList<Account> accounts1 = new ArrayList<Account>();
        accounts1.add(a1);
        accounts1.add(a2);
        ArrayList<Account> accounts2 = new ArrayList<Account>();
        accounts2.add(a3);
        accounts2.add(a4);
        BankApplication b1 = new BankApplication("Forte", accounts1);
        BankApplication b2 = new BankApplication("Kaspi", accounts2);
        ArrayList<BankApplication> allBanks = new ArrayList<BankApplication>();
        allBanks.add(b1);
        allBanks.add(b2);
        for(int i=0; i<allBanks.size(); i++){
            for(int j=i; j<allBanks.size(); j++) {
                if (allBanks.get(i).getAverageBalance() < allBanks.get(j).getAverageBalance()) {
                    BankApplication temp = allBanks.get(i);
                    allBanks.set(i, allBanks.get(j));
                    allBanks.set(j, temp);
                }

            }

        }
        for (int i=0; i<allBanks.size(); i++) {
            System.out.println(allBanks.get(i).getBankData());
        }
    }
}
