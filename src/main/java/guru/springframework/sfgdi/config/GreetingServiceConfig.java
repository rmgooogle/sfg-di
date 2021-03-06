package guru.springframework.sfgdi.config;

import com.springframework.pets.DogPetService;
import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.repositories.SpanishGreetingRepository;
import guru.springframework.sfgdi.repositories.SpanishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;


@Configuration
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Profile("dog")
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }

    @Profile({"cat","default"})
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }


    @Bean
    SpanishGreetingRepository spanishGreetingRepository(){
        return new SpanishGreetingRepositoryImpl();
    }

    @Profile({"ES","default"})
    @Bean("i18nService")
    I18nSpanishGreetingService i18nSpanishService(SpanishGreetingRepository spanishGreetingRepository){
        return new I18nSpanishGreetingService(spanishGreetingRepository);
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile({"EN"})
    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjServices propertyInjServices(){
        return new PropertyInjServices();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
