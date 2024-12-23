package example;

public class TaskAdder {
    /**
     * Добавляет новую задачу в расписание.
     *
     * @param task    Название задачи.
     * @return true, если задача успешно добавлена.
     * @throws IllegalArgumentException если параметры null или некорректны.
     */
    public boolean TaskAdder(String task) {
        if (task == null) {
            throw new IllegalArgumentException("Task must not be null");
        }
        // Логика добавления задачи
        return true;
    }
}
