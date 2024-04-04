package serialization;

import java.io.Serializable;

public class SerializeExample implements Serializable {
    private static final long serialVersionUID = 1L;

    public static int x;

    int y;

    public SerializeExample(int y){
        this.y=y;
    }
}
