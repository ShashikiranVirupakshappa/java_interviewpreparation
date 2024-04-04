package sealed;

public sealed interface SealedInterface permits  AbstractSealedInterfaceImpl {
    public void method1();
}
