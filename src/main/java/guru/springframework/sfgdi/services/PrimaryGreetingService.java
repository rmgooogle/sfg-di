package guru.springframework.sfgdi.services;



public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "HelloWorld form PRIMARY Bean";
    }
}
