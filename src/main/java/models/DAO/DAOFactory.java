package models.DAO;

public abstract class DAOFactory {

    private static DAOFactory daoFactory;

    protected DAOFactory() {

    };

    public abstract UserDAO getUserDAO();

    public abstract RoundDAO getRoundDAO();

    public static DAOFactory getDaoFactory() {
        return daoFactory;
    }

    public static void setDaoFactory(DAOFactory daoFactory) {
        DAOFactory.daoFactory = daoFactory;
    }

}
