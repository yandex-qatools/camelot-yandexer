package ru.yandex.qatools.yandexer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.yandex.qatools.camelot.api.annotations.Filter;
import ru.yandex.qatools.camelot.api.annotations.OnInit;
import ru.yandex.qatools.camelot.api.annotations.PluginComponent;
import ru.yandex.qatools.camelot.api.annotations.Processor;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 16.01.15
 */
@Filter(instanceOf = EventResultsCount.class)
public class ResultSaver {

    private Logger logger = LoggerFactory.getLogger(ResultSaver.class);

    @PluginComponent
    private DbComponent dbComponent;

    @OnInit
    public void init() {
        logger.info("Start init application context");
    }

    @Processor
    public void save(EventResultsCount event) {
        dbComponent.getResultDao().saveResult(event);
    }
}
