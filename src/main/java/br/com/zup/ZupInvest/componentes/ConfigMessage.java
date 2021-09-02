package br.com.zup.ZupInvest.componentes;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Component;

@Component
public class ConfigMessage {

    @Bean
    public MessageSource messageResource(){
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:erros");
        messageSource.setDefaultEncoding("utf-8");

        return messageSource;
    }

}
