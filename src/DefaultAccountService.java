import java.util.*;

public class DefaultAccountService implements  AccountService {

    public void getAccountByCode(List<Account> accounts ,String code){
        for (Account account :accounts){
            if(code.equals(account.getCode())){
                System.out.println("Account found --> code :"+account.getCode()+"  Client : "+account.getClient+"   Amount : "+account.getAmount());
            }
        }
        System.out.println("No Account found for code  test"+code);
    }
}
