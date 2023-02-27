public interface IProfession {
    String Type = "";
    double Salary = 0;
    default void Work(String type, double salary){
        if (type != "" && salary!=0)
            System.out.printf("Я работаю %s за %s\n", type, salary);
    };
}
