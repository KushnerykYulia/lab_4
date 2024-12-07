/**
 * <h1 color="green">Основний клас.</h1>
 * <h4 color="yellow">Програму створено з використанням шаблону "Адаптер".</h4>
 * <p>
 * Ця програма моделює систему для малювання графічних примітивів у редакторі
 * векторної графіки. Вона демонструє, як за допомогою шаблону "Адаптер"
 * можна забезпечити використання точок для малювання ліній за умови що для
 * цих об'єктів використовуються різні одиниці вимірювання.
 * </p>
 * <p>
 * Шаблон "Адаптер" використовується для перетворення інтерфейсу одного об'єкта
 * у інтерфейс, який очікує інший об'єкт. У цьому прикладі адаптер
 * {@link PointToLineAdapter} дозволяє використовувати точки
 * ({@link Primitive}) для малювання ліній ({@link Composition}),
 * виконуючи перетворення координат із сантиметрів у пікселі.
 * </p>
 * <h1>Опис роботу класу</h1>
 * <ul>
 *     <li>Створюється точка </li>
 *     <li>Встановлюються координати точки (10, 20) в пікселях</li>
 *     <li>Виводиться текст з повідомленням про малювання точки</li>
 *     <li>Створюється дві точки, які будуть використані для створення лінії</li>
 *     <li>Створюється адаптер для лінії</li>
 *     <li>За допомогою методів {@link PointToLineAdapter#setX(double, double)} та
 *     {@link PointToLineAdapter#setY(double, double)} задаються координати в сантиметрах.</li>
 *     <li>Виводиться текст з повідомленням про малювання лінії</li>
 * </ul>
 *
 * <h5 color="green">Діаграма класів:</h5>
 * <img src="E:\Lab4\d4.png">
 *
 * @see Primitive
 * @see Point
 * @see Composition
 * @see PointToLineAdapter
 *
 * @author Кушнерик Юлія
 */
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.setX(10);
        point1.setY(20);
        point1.draw();

        Point startPoint = new Point();
        Point endPoint = new Point();

        PointToLineAdapter adapter = new PointToLineAdapter(startPoint, endPoint);
        adapter.setX(20.0, 30.0);
        adapter.setY(20.0, 40.0);

        adapter.draw();
    }
}
