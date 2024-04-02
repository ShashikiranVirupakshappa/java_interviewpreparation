public class PersonRecordTest {
    public static void main(String[] args) {
        PersonRecord pr1 = new PersonRecord(1L,"Shashi",35);
        PersonRecord pr2 = new PersonRecord(1L,"Shashi",35);

        //PersonRecord pr3 = new PersonRecord("Raj");

        System.out.println(pr1.equals(pr2)+"\t"+pr1.hashCode()+"\t"+pr2.hashCode());
        System.out.println(pr1==pr2);
        System.out.println(pr2.hashCode());

        System.out.println(pr1.id()+"\t"+pr1.name()+"\t"+pr1.age());
        System.out.println(pr2.id()+"\t"+pr2.name()+"\t"+pr2.age());

    }
}
