package ru.yandex.qatools.yandexer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 16.01.15
 */
@SuppressWarnings("unused")
public class DbComponent {

    private static final Logger LOGGER = LoggerFactory.getLogger(DbComponent.class);

    private static ClassPathXmlApplicationContext CONTEXT;

    private static ResultDao DAO;

    static {
        try {
            CONTEXT = new ClassPathXmlApplicationContext("applicationContext.xml");
            DAO = CONTEXT.getBean(ResultDao.class);
        } catch (Exception e) {
            LOGGER.error("Could not start application context", e);
        }
    }

    public ResultDao getResultDao() {
        return DAO;
    }
}
