package ru.yandex.qatools.yandexer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 11.09.14
 */
@Entity
@Table(name = "results")
public class EventResultsCount extends Event {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resultsCount;

    public EventResultsCount() {
    }

    public EventResultsCount(String key, String resultsCount) {
        super(key);
        this.resultsCount = resultsCount;
    }

    public String getResultsCount() {
        return resultsCount;
    }

    public void setResultsCount(String resultsCount) {
        this.resultsCount = resultsCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
