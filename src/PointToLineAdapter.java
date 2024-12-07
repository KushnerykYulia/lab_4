/**
 * <h1>Клас PointToLineAdapter</h1>
 * <p>
 * Адаптер, який дозволяє використовувати об'єкти типу {@link Point} для
 * реалізації інтерфейсу {@link Composition} і малювання ліній.
 * </p>
 * <h1>Принцип роботи</h1>
 * <p>
 * Адаптер приймає два об'єкти типу {@link Point} як точки початку та кінця лінії.
 * За допомогою методів {@link #setX(double, double)} та {@link #setY(double, double)}
 * координати у сантиметрах, які задаються числами типу double перетворюються у пікселі,
 * які задаються числами типу int (коефіцієнт перетворення: 1 см ≈ 37.795 пікселів).
 * </p>
 * <h1>Опис методів</h1>
 * <ul>
 *     <li>{@link #setX(double, double)} - Перетворює координати X з сантиметрів у пікселі та передає їх точкам.</li>
 *     <li>{@link #setY(double, double)} - Перетворює координати Y з сантиметрів у пікселі та передає їх точкам.</li>
 *     <li>{@link #draw()} - Викликає метод {@link Point#draw()} для обох точок і виводить інформацію про лінію.</li>
 * </ul>
 */
public class PointToLineAdapter implements Composition {
    private Primitive startPoint;
    private Primitive endPoint;
    private double x1, x2, y1, y2;

    /**
     * Конструктор адаптера.
     * @param startPoint об'єкт, що представляє початкову точку.
     * @param endPoint   об'єкт, що представляє кінцеву точку.
     */
    public PointToLineAdapter(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    /**
     * Встановлює координати X для початкової та кінцевої точок лінії.
     * <p>
     * Метод перетворює координати з сантиметрів у пікселі
     * для використання точок як частини лінії. Для перетворення
     * використовується коефіцієнт {@code 37.795}, який відповідає
     * кількості пікселів в одному сантиметрі.
     * </p>
     *
     * @param x1 координата X початкової точки лінії у сантиметрах.
     * @param x2 координата X кінцевої точки лінії у сантиметрах.
     */
    @Override
    public void setX(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
        startPoint.setX((int) (x1 * 37.795));
        endPoint.setX((int) (x2 * 37.795));
    }

    /**
     * Встановлює координати Y для початкової та кінцевої точок лінії.
     * <p>
     * Метод перетворює координати з сантиметрів у пікселі
     * для використання точок як частини лінії. Для перетворення
     * використовується коефіцієнт {@code 37.795}, який відповідає
     * кількості пікселів в одному сантиметрі.
     * </p>
     *
     * @param y1 координата Y початкової точки лінії у сантиметрах
     * @param y2 координата Y кінцевої точки лінії у сантиметрах
     */
    @Override
    public void setY(double y1, double y2) {
        this.y1 = y1;
        this.y2 = y2;
        startPoint.setY((int) (y1 * 37.795));
        endPoint.setY((int) (y2 * 37.795));
    }

    /**
     * Малює лінію, використовуючи її початкову та кінцеву точки.
     * <p>
     * Метод викликає малювання двох точок у пікселях (початкової та кінцевої),
     * а також виводить повідомлення про з'єднання точок з координатами у сантиметрах.
     * </p>
     */
    @Override
    public void draw() {
        startPoint.draw();
        endPoint.draw();
        System.out.println("З'єднано точки (" + x1 + ", " + y1 + ") та (" + x2 + ", " + y2 + ")");
    }
}
