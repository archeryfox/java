public class Main {
    public static void main(String[] args)
    {
        var bb = new BoardEngineer("Бортпроводником", 34450);
        bb.Work();
        bb.Work(bb.Type,bb.Salary);
    }
}
