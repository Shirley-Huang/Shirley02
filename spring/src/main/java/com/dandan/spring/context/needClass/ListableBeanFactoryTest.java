package com.dandan.spring.context.needClass;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

import java.lang.annotation.Annotation;
import java.util.Map;

/**
 * Created by dandan On 七月 27 2019
 */
public class ListableBeanFactoryTest implements ListableBeanFactory {

    public boolean containsBeanDefinition(String s) {
        return false;
    }

    public int getBeanDefinitionCount() {
        return 0;
    }

    public String[] getBeanDefinitionNames() {
        return new String[0];
    }

    public String[] getBeanNamesForType(Class<?> aClass) {
        return new String[0];
    }

    public String[] getBeanNamesForType(Class<?> aClass, boolean b, boolean b1) {
        return new String[0];
    }

    public <T> Map<String, T> getBeansOfType(Class<T> aClass) throws BeansException {
        return null;
    }

    public <T> Map<String, T> getBeansOfType(Class<T> aClass, boolean b, boolean b1) throws BeansException {
        return null;
    }

    public Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> aClass) throws BeansException {
        return null;
    }

    public <A extends Annotation> A findAnnotationOnBean(String s, Class<A> aClass) {
        return null;
    }

    public Object getBean(String s) throws BeansException {
        return null;
    }

    public <T> T getBean(String s, Class<T> aClass) throws BeansException {
        return null;
    }

    public <T> T getBean(Class<T> aClass) throws BeansException {
        return null;
    }

    public Object getBean(String s, Object... objects) throws BeansException {
        return null;
    }

    public boolean containsBean(String s) {
        return false;
    }

    public boolean isSingleton(String s) throws NoSuchBeanDefinitionException {
        return false;
    }

    public boolean isPrototype(String s) throws NoSuchBeanDefinitionException {
        return false;
    }

    public boolean isTypeMatch(String s, Class<?> aClass) throws NoSuchBeanDefinitionException {
        return false;
    }

    public Class<?> getType(String s) throws NoSuchBeanDefinitionException {
        return null;
    }

    public String[] getAliases(String s) {
        return new String[0];
    }

}
