/**
 * 
 */
package com.ironicz.moments.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Entity factory. 
 * DONOT subclass or extend it. 
 * 
 * @author Sathish, Arumugam Selvaraj
 */
public final class EMF {
    private static final EntityManagerFactory emfInstance =
        Persistence.createEntityManagerFactory("transactions-optional");

    private EMF() {
        
    }

    public static EntityManagerFactory get() {
        return emfInstance;
    }
}
