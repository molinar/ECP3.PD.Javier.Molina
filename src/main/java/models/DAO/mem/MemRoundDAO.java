package models.DAO.mem;

import models.DAO.RoundDAO;
import models.entities.ModelEntitiesRound;

public class MemRoundDAO extends MemGenericDAO<ModelEntitiesRound, Integer> implements RoundDAO {

    @Override
    protected Integer getID(ModelEntitiesRound round) {
        return round.getId();
    }
}
