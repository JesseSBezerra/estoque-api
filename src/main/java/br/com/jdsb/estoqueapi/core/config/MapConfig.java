package br.com.jdsb.estoqueapi.core.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapConfig {

    @Bean
    public ModelMapper getMapper(){
        return new ModelMapper();
    }
}
