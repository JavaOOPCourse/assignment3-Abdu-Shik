public class ConsultationService extends Service
        implements Billable {

    // TODO: constructor
    ConsultationService(String serviceName, int serviceId) {
        super(serviceName,serviceId);
    }

    @Override
    public void performService() {

        // TODO:
        if(!getIsActive()){
            System.out.println("Service is inactive right now. You have to activate it");
            return;
        }

        System.out.println("We have a wide range of possible consulting services to provide. " +
                "Which one do you choose?");
    }

    @Override
    public void generateBill() {

        // TODO:
        System.out.println("*Consultation Service*");
        System.out.println("Total fee for services you have used: ~");
    }
}