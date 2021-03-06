package models.DAO;

public abstract class DAOFactory {

    private static DAOFactory daoFactory = null;

    protected DAOFactory() {

    };

    public abstract UserDAO getUserDAO();

    public abstract RoundDAO getRoundDAO();

    public static DAOFactory getDaoFactory() {
        assert daoFactory != null;
        return daoFactory;
    }

    public static void setDaoFactory(DAOFactory daoFactory) {
        DAOFactory.daoFactory = daoFactory;
    }

}
