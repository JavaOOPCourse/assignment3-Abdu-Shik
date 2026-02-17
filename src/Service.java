public abstract class Service {

    // TODO: declare private fields
    private String serviceName;
    private int serviceId;
    private boolean isActive = false;


    // TODO: constructor
    Service(String serviceName, int serviceId){
        this.serviceName = serviceName;
        this.serviceId = serviceId;
    }

    // TODO: activateService()
    // should set isActive = true
    // print activation message
    void activateService(){
        if(isActive){
            System.out.println("The service already active.");
            return;
        }
        isActive = true;
        System.out.println("Success. The service is activated");
    }


    // TODO: deactivateService()
    // should set isActive = false
    // print deactivation message
    void deactivateService(){
        if(!isActive){
            System.out.println("The service already inactive.");
            return;
        }
        isActive = false;
        System.out.println("Success. The service is deactivated");
    }


    // TODO: getter for serviceName
    public String getServiceName() {
        return serviceName;
    }


    // TODO: getter for isActive
    public boolean getIsActive(){
        return isActive;
    }

    // TODO: abstract method performService()
    abstract void performService();
}