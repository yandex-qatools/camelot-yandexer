Yandexer
===

Для сборки приложения требуются:
* JDK >= 1.7
* Maven >= 3.2

Чтобы собрать проект нужно:

1. Склонировать проект
    ```
    git clone https://github.com/camelot-framework/camelot-yandexer.git
    ```

1. Составить конфигурационный файл `yandexer.properties`:

    * **jms.broker.list** - список брокеров, например `(tcp://localhost:61616)?randomize=false&priorityBackup=true`
    * **yandexer.jdbc.url** - URL-адрес подключения к базе данных, например `jdbc:postgresql://localhost:5432/postgres`
    * **yandexer.jdbc.user** - имя пользователя базы данных
    * **yandexer.jdbc.password** - пароль пользователя базы данных

    **PS:** конфигурационный файл должен находиться в корне проекта

1. Собрать проект. Для этого следует выполнить команду
    ```
    mvn clean compile
    ```

1. Запустить проект. Для запуска приложения требуется:
    * PhantomJS >= 1.9.0
    * PostgeSQL 9
    * ActiveMQ

    Далее следует выполнить следующую команду
    ```
    export MAVEN_OPTS="-XX:MaxPermSize=512m -Xmx2048m -Xbootclasspath/a:."
    mvn clean compile camelot-test:run
    ```

1. Открыть `http://localhost:8080/camelot` в браузере.
![](img/camelot-start-page.png)

Дальше следует добавить виджет *Collector* на дашбоард.
![](img/camelot-dashboard-settings.png)
![](img/collector-widget.png)

Теперь можно поискать что-нибудь используя виджет. Количество найденых в Яндексе результатов отобразится ниже.
![](img/collector-widget-results.png)

