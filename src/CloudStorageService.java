public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    // TODO: declare premium field

    boolean premium = false;

    // TODO: constructor
    CloudStorageService(String serviceName, int serviceId){
        super(serviceName, serviceId);
    }

    @Override
    public void performService() {

        // TODO:
        // check if service is active
        // print different message for premium and normal\
        if(!getIsActive()){
            System.out.println("Service is inactive right now. You have to activate it");
            return;
        }

        String response = premium ?
                "Greetings premium user, you have ~ available out of your 5TB extended space" :
                "Hello, you have ~ available out of your 20GB space";

        System.out.println(response);

    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        if(premium){
            System.out.println("You already are a premium user.");
            return;
        }
        premium = true;
        System.out.println("Congratulations! Yor now have premium membership!");

    }

    @Override
    public void generateBill() {

        // TODO:
        System.out.println("*Cloud Storage*");
        System.out.println("Months used : ~\nMonthly fee: ~\ntTotal: ~");

    }
}