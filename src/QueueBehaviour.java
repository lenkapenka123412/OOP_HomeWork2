public interface QueueBehaviour {
    void takeInQueue(Actor actor); //встать в очередь
    void takeOrders(); // принять заказ
    void giveOrders(); //отдать заказ
    void releaseFromQueue(); //убрать из очереди
}
