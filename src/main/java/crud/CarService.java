package crud;

import Entity.PlayerEntity;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class CarService {

    public EntityManager em = Persistence.createEntityManagerFactory("DEVMODE").createEntityManager();

    public PlayerEntity add(PlayerEntity car){
        em.getTransaction().begin();
        PlayerEntity carFromDB = em.merge(car);
        em.getTransaction().commit();
        return carFromDB;
    }

    public void delete(long id){
        em.remove(get(id));
    }

    public PlayerEntity get(long id){
        return em.find(PlayerEntity.class, id);
    }

    public void update(PlayerEntity car){
        em.getTransaction().begin();
        em.merge(car);
        em.getTransaction().commit();
    }

    public List<PlayerEntity> getAll(){
        TypedQuery<PlayerEntity> namedQuery = em.createNamedQuery("PlayerEntity.getAll", PlayerEntity.class);
        return namedQuery.getResultList();
    }

}
