package ru.yandex.qatools.yandexer;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 11.09.14
 */
@MappedSuperclass
public class Event implements Serializable {

    private String key;

    public Event() {
    }

    public Event(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
