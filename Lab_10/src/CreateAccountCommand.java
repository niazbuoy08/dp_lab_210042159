public class CreateAccountCommand implements ICommand{

    private BankAccount account;

    public CreateAccountCommand(BankAccount account) {
        this.account = account;
    }

    @Override
    public void execute() {

        System.out.println("Account created: " + account.getAccountId());
    }
}
