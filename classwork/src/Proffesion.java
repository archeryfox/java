public class Proffesion implements IProfession {
    String Type = "Безработный";
    double Salary = 10_000;

    Proffesion(String type, double salary) {
        this.Type = type;
        this.Salary = salary;
    }

    @Override
    public void Work(String type, double salary) {
        if (this.Type != "Безработный") {
            IProfession.super.Work(this.Type, this.Salary);
            System.out.printf("");
        }
    }
}
