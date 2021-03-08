package guru.springframework.sfgdi.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class ConstrGreetContr implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
