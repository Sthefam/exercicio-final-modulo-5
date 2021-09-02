package br.com.zup.ZupInvest.componentes;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Component
public class ConfigMessage {

    @Bean
    public MessageSource messageResource(){
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:erros");
        messageSource.setDefaultEncoding("utf-8");

        return messageSource;
    }

    @Bean
    public LocalValidatorFactoryBean validator(){
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        bean.setValidationMessageSource(messageResource());

        return bean;
    }

}
