package com.ironicz.moments.persistence;

import com.googlecode.objectify.ObjectifyService;
import com.ironicz.moments.appengine.datastore.UserDataStore;
import com.ironicz.moments.entity.IroniczUser;

/**
 * @author Sathish, Arumugam Selvaraj
 *
 */
public class DAOFactory {
    
    private static UserDAO userDao;
    
    static {
        ObjectifyService.register(IroniczUser.class);
        ObjectifyService.begin();
    }
    
    private DAOFactory() {
    }
    
    /**
     * Returns appengine datastore instance by default. 
     * 
     * @return {@link UserDAO}.
     */
    public static UserDAO getUserDAO() {
        if(userDao == null) {
            synchronized (DAOFactory.class) {
                userDao = new UserDataStore();
            }
        }
        return userDao;
    }
}
