package sealed;

public  sealed  abstract class AbstractSealedInterfaceImpl implements SealedInterface permits  SealedInterfaceImpl1,SealedInterfaceImpl2 {
    @Override
    public abstract void method1();
}
