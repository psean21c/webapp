package spring.basic.beans.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Locale;

public class LocaleConditionCanada implements Condition {

    public boolean matches (ConditionContext context, AnnotatedTypeMetadata metadata) {
        return Locale.getDefault().equals(Locale.CANADA);
    }
}