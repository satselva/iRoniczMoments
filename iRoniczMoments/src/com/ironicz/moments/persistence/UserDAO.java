package com.ironicz.moments.persistence;

import com.ironicz.moments.entity.IroniczUser;

/**
 * Data access layer for {@link IroniczUser}.
 * i. CRUD operations for User. 
 * ii. get User details By Id.
 * 
 * @author Sathish, Arumugam Selvaraj
 */
public interface UserDAO {
    
    public IroniczUser getUserById(final String identifier);
    
    public IroniczUser getUserByAlias(final String alias);
    
    public String save(final IroniczUser user);
    
    public String update(final IroniczUser user);
    
    public void delete(final IroniczUser user);
}
