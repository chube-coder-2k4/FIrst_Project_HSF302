//package fpt.java.demo_day1_hsf302.configuration;
//
//import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.util.StringUtils;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
//
//import java.util.List;
//import java.util.Locale;
//
//public class LocalResolver extends AcceptHeaderLocaleResolver implements WebMvcConfigurer {
//
//    // This class can be used to customize locale resolution if needed.
//    // Currently, it extends AcceptHeaderLocaleResolver which uses the Accept-Language header
//    // to determine the locale for the request.
//
//    // You can override methods here if you want to provide custom locale resolution logic.
//
//    // For example, you could set a default locale:
//    // @Override
//    // public Locale resolveLocale(HttpServletRequest request) {
//    //     return Locale.ENGLISH; // Default to English
//    // }
//
//    public Locale resolveLocale(HttpServletRequest request) {
//        String languageHeader = request.getHeader("Accept-Language");
//        return StringUtils.hasLength(languageHeader) ? Locale.lookup(Locale.LanguageRange.parse(languageHeader),List.of(new Locale("en"),new Locale("fr")))
//                : Locale.ENGLISH; // Default to English if no header is present
//    }
//}
