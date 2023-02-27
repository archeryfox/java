public class Teacher extends Proffesion{
    String Type = "";
    double Salary = 0;
    Teacher(String type, double salary){
        super(type,salary);
    }

    public void Work(){
        new Proffesion(this.Type,this.Salary).Work(this.Type,this.Salary);
        System.out.printf("");
    }
}
