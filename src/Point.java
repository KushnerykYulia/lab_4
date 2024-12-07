/**
 * <h1>Клас Point</h1>
 * Клас, який реалізує графічний примітив — точку.
 * <p>Реалізує інтерфейс {@link Primitive}</p>
 * <p>
 * Координати точки задаються в пікселях дійсними числами.
 * В адаптері {@link PointToLineAdapter} ця точка застосовується для малювання лінії.
 * </p>
 * <h1>Опис методів</h1>
 * <ul>
 *     <li>{@link #setX(int)} - Встановлює X-координату точки.</li>
 *     <li>{@link #setY(int)} - Встановлює Y-координату точки.</li>
 *     <li>{@link #draw()} - Виводить повідомлення про намальовану точку
 *     із заданими координатами.</li>
 * </ul>
 *
 * @see Composition
 */
public class Point implements Primitive {
    private int x;
    private int y;

    /**
     * Встановлює координату X точки в пікселях.
     * @param x координата X в пікселях
     */
    @Override
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Встановлює координату Y точки в пікселях.
     * @param y координата Y в пікселях
     */
    @Override
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Малює точку.
     */
    @Override
    public void draw() {
        System.out.println("Намальовано точку з координатами в пікселях (" + x + ", " + y + ")");
    }
}
