package com.ironicz.moments.appengine.datastore;

import static com.googlecode.objectify.ObjectifyService.ofy;

import com.ironicz.moments.entity.IroniczUser;
import com.ironicz.moments.persistence.UserDAO;

/**
 * App engine data store implementation for {@link UserDAO}.
 * 
 * @author Sathish, Arumugam Selvaraj
 */
public class UserDataStore implements UserDAO {
    
    /** (non-Javadoc)
     * @see com.ironicz.moments.persistence.UserDAO#getUserById(java.lang.String)
     */
    @Override
    public IroniczUser getUserById(String identifier) {
        // TODO Auto-generated method stub
        return null;
    }

    /** (non-Javadoc)
     * @see com.ironicz.moments.persistence.UserDAO#getUserByAlias(java.lang.String)
     */
    @Override
    public IroniczUser getUserByAlias(String alias) {
        // TODO Auto-generated method stub
        return null;
    }

    /** (non-Javadoc)
     * @see com.ironicz.moments.persistence.UserDAO#save(com.ironicz.moments.entity.IroniczUser)
     */
    @Override
    public String save(final IroniczUser user) {
        ofy().save().entity(user).now();
        return String.valueOf(user.getId());
    }

    /** (non-Javadoc)
     * @see com.ironicz.moments.persistence.UserDAO#update(com.ironicz.moments.entity.IroniczUser)
     */
    @Override
    public String update(IroniczUser user) {
        return null;
    }

    /** (non-Javadoc)
     * @see com.ironicz.moments.persistence.UserDAO#delete(com.ironicz.moments.entity.IroniczUser)
     */
    @Override
    public void delete(IroniczUser user) {
    }

}
