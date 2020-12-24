package tests.examen.tests;

import org.testng.annotations.Factory;

public class NetflixFactory {
    @Factory
    public Object[] factoryMethod(){
        return new Object[]{
                new prueba_netflix(),
                new prueba_netflix()
        };
    }
}
