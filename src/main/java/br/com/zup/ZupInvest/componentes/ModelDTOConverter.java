package br.com.zup.ZupInvest.componentes;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ModelDTOConverter {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();'x'
    }

}
