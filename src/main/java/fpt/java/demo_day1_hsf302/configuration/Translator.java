
//package fpt.java.demo_day1_hsf302.configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.i18n.LocaleContextHolder;
//import org.springframework.context.support.ResourceBundleMessageSource;
//import org.springframework.stereotype.Component;
//
//import java.util.Locale;
//
//@Component
//public class Translator {
//
//    public static ResourceBundleMessageSource messageSource;
//
//    @Autowired
//    public Translator(ResourceBundleMessageSource messageSource) {
//        Translator.messageSource = messageSource;
//    }
//
//    public static String toLocale(String msgCode){
//       Locale locale = LocaleContextHolder.getLocale();
//        return messageSource.getMessage(msgCode, null, locale);
//    }
//
//}
