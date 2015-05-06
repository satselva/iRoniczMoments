package com.ironicz.moments.modules.guice;

import com.google.inject.AbstractModule;
import com.googlecode.objectify.ObjectifyService;
import com.ironicz.moments.appengine.datastore.UserDataStore;
import com.ironicz.moments.entity.IroniczUser;
import com.ironicz.moments.persistence.UserDAO;

/**
 * @author Sathish, Arumugam Selvaraj
 */
public class ServiceModule extends AbstractModule {

    /** (non-Javadoc)
     * @see com.google.inject.AbstractModule#configure()
     */
    @Override
    protected void configure() {
        ObjectifyService.register(IroniczUser.class);
        bind(UserDAO.class).toInstance(new UserDataStore());
    }

}
