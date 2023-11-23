package com.company.project.lesson22;

import java.net.http.WebSocket;

public class Connection {
    Connection connection = new Connection();
    //ACTIVE, CLOSE, CONNECTED, WAITING

    //наблюдатели
    Listener ping = c -> System.out.println("проверка ping");
    Listener emailSender = c -> System.out.println("отправка сообщений " + "на почту");
    Listener longger = new AppLogger();

    //механизм подписки
    connection.addListener(ping);
    connection.addListener(emailSender);
    connection.addListener(logger);

    //изменение состояния объекта, уведомление подписчиков
    connection.changeStatus(Connection.Status.ACTIVE);
    connection.changeStatus(Connection.Status.CLOSE);
}
