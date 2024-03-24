import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour{


    private List<Actor> queue = new ArrayList<>();
    private List<Actor> marketActors = new ArrayList<>();
    @Override
    public void acceptToMarket(Actor actor) {
        marketActors.add(actor);
        System.out.println(actor.getName() + " зашел в магазин.");
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        marketActors.removeAll(actorList);
        System.out.println("Акторы " + actorList + " ушли из магазина.");
    }

    @Override
    public void update() {
        System.out.println("Обновление состояния магазина...");
        // Реализация обновления состояния магазина
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " встал в очередь.");
    }

    @Override
    public void takeOrders() {
        System.out.println("Принятие заказов...");
        // Реализация принятия заказов
    }

    @Override
    public void giveOrders() {
        System.out.println("Отдача заказов...");
        // Реализация отдачи заказов
    }

    @Override
    public void releaseFromQueue() {
        if (!queue.isEmpty()) {
            Actor releasedActor = queue.remove(0);
            System.out.println(releasedActor.getName() + " покинул очередь.");
        } else {
            System.out.println("Очередь пуста.");
        }
    }
}

