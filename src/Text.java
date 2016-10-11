/**
 * Created by jgarcias on 11/10/16.
 */
public class Text extends  Figure{
    private String text;

    @Override
    void data() {
        super.data();
        System.out.println("Quin text vols que es mostri?");
        text=sc.next();

    }

    public String getText() {
        return text;
    }
}
