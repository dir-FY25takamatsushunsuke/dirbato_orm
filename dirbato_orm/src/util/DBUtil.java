package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
    private static final String PERSISTENCE_UNIT_NAME = "dirbato_orm";
    private static EntityManagerFactory emf;
    
    public static EntityManager creatEntityManager() {
        return getEntityManagerFactory().createEntityManager();
    }
    
    private static EntityManagerFactory getEntityManagerFactory() {
        if (emf==null) {
            emf=Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        
        return emf;
        }
       
}
