package facade;

public class Demo {
    public static void main(String[] args) {
        Facade facade=new Facade(new AuthenticationService(),new AuthorizationService(),new Database());
        facade.executeQuery("Select * from Employees;");
    }
}
