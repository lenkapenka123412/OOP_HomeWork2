import java.util.ArrayList;
import java.util.List;

public class Main {

    // 1. Интерфейс ActorBehavoir, который будет содержать описание возможных действий актора в очереди/магазине

    // 2. Абстрактный класс Actor, который хранит в себе параметры актора, включая состояние готовности сделать
    //заказ и факт получения заказа.
    //
    // Дополнение: для большего понимания, можно сделать методы-геттеры для имени и прочих “персональных данных” abstract

    // 3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir

    // Задание 2
    // Необходимо реализовать строение классов, без конкретной реализации:
    // 1. Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из очереди, принятие/отдача заказа
    // 2. Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей, обновление состояния магазина
    // 3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке список людей в очереди в различных статусах

    // Домашнее задание

    // Реализовать класс Market и все методы, которые он обязан реализовывать. Методы из интерфейса QueueBehaviour,
    // имитируют работу очереди,
    // MarketBehaviour – помещает и удаляет человека из очереди, метод update – обновляет состояние магазина
    // (принимает и отдает заказы).


    public static void main(String[] args) {
        Market market = new Market();

        // Создаем несколько акторов (людей)
        Actor actor1 = new Human("Елена");
        Actor actor2 = new Human("Светлана");
        Actor actor3 = new Human("Андрей");

        // Запускаем акторов в магазин
        market.acceptToMarket(actor1);
        market.acceptToMarket(actor2);
        market.acceptToMarket(actor3);

        // Принимаем акторов в очередь
        market.takeInQueue(actor1);
        market.takeInQueue(actor2);
        market.takeInQueue(actor3);

        // Обновляем состояние магазина
        market.update();

        // Принимаем заказы
        market.takeOrders();

        // Отдаем заказы
        market.giveOrders();

        // Освобождаем актеров из очереди
        market.releaseFromQueue();

        // Освобождаем актеров из магазина
        List<Actor> actors = new ArrayList<>();
        actors.add(actor1);
        actors.add(actor2);
        actors.add(actor3);
        market.releaseFromMarket(actors);
    }
}