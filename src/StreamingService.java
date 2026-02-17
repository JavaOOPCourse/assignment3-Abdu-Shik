public class StreamingService extends Service
        implements PremiumFeature {

    // TODO: declare premium field
    boolean premium = false;

    // TODO: constructor
    StreamingService(String serviceName, int serivceId){
        super(serviceName, serivceId);
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
                "Greetings, premium user! You're welcomed to use extended features" :
                "Hello, what will you stream or watch";

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
}