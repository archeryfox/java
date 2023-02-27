public class BoardEngineer extends Engineer {
    String Type = null;
    double Salary = 0;
    String Airplane = null;

    /**
     * Конструктор объекта <b color=red>бортинжинер<b/>
     * @param type Должность
     * @param salary Зарплата
     */
    BoardEngineer(String type, double salary) {
        super(type, salary);
    }

    public void Work() {
        if (this.Type != null && this.Salary != 0) {
            new Proffesion(this.Type, this.Salary).Work(this.Type, this.Salary);
            System.out.print(this.Airplane);
        } else {
            System.out.println("Не читай того, что не полетит");
        }
    }
}
