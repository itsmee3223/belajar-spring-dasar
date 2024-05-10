package belajar.spring.dasar.core.processor;

import belajar.spring.dasar.core.aware.IdAware;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {
    @Override
    public int getOrder() {
        return 2;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof IdAware){
            IdAware idAware = (IdAware) bean;
            idAware.setId("RAMANDA-"+idAware.getId());
        }
        return bean;
    }
}
