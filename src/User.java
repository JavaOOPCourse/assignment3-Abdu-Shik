public abstract class User {

    // TODO: declare fields
    String name;
    int id;


    // TODO: constructor
    User(String name, int id){
        this.name = name;
        this.id = id;
    }

    // TODO: abstract method manageService(Service s)
    abstract void manageService(Service s);

    // TODO: abstract method useService(Service s)
    abstract void useService(Service s);

}