package org.aopannotationsjava;

import org.aopannotationsjava.logging.LogMethod;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        App app = new App();
        app.start();

    }

    @LogMethod(message = "Starting application.")
    public void start() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error while starting application");
        }
        System.out.println("Application started.");
    }

}
