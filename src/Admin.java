public class Admin extends User {

    // TODO: constructor
    Admin(String name, int id){
        super(name, id);
    }

    @Override
    public void manageService(Service s) {

        // TODO:
        System.out.println("You're verified as admin. What do you want to change?");
    }

    @Override
    public void useService(Service s) {

        // TODO:
        System.out.println("You're an admin. You can use available services");
        s.performService();

    }
}