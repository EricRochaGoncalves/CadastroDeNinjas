package dev.java10x.CadastroDeNinjas.Ninjas;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Isso é só um placeholder pra evitar erro no seu projeto, já que o tutorial tá usando
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface NoArsConstructor {
}
