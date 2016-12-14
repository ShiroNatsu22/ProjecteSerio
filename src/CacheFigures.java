
import java.util.Hashtable;

/**
 * Created by Joshua on 14/12/2016.
 */
public class CacheFigures {

    private static Hashtable<String, Figure> cache  = new Hashtable<String, Figure>();

    public static Figure getShape(String shapeId) {
        Figure cachedShape = cache.get(shapeId);
        return (Figure) cache.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        cache.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        cache.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        cache.put(rectangle.getId(), rectangle);
    }
}

