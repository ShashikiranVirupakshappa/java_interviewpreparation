package cloning;

public class TypeCastingMain {
    public static void main(String[] args) {
        Object o = new String("shashi");
        StringBuffer sb = (StringBuffer) o;     //classcastexception
    }
}
