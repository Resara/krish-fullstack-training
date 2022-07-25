package LooseCouplingPattern;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Example {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Example.class.getName());
        logger.setLevel(Level.INFO);

        logger.log(Level.INFO,"this is info");
        logger.log(Level.WARNING,"this is warning");
        logger.log(Level.FINE,"this is fine");
        logger.log(Level.SEVERE,"this is serve");
    }
}
