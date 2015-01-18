package ru.yandex.qatools.yandexer;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 19.01.15
 */
@Repository
public class ResultDao {

    protected EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public void saveResult(EventResultsCount event) {
        getEntityManager().persist(event);
    }
}
