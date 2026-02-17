public class Customer extends User {

    // TODO: constructor
    Customer(String name, int id) {
        super(name, id);
    }


    @Override
    public void manageService(Service s) {

        // TODO:
        System.out.println("You do not have access to service management due to restricted rights");

    }

    @Override
    public void useService(Service s) {

        // TODO:
        System.out.println("You're a customer. You can use available services");
        s.performService();
    }
}