package models.DAO.mem;

import models.DAO.UserDAO;
import models.entities.ModelEntitiesUser;

public class MemUserDAO extends MemGenericDAO<ModelEntitiesUser, Integer> implements UserDAO{

    @Override
    protected Integer getID(ModelEntitiesUser user) {
        return user.getId();
    }

}
