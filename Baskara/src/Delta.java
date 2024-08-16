public class Delta {
    public int a;
    public int b;
    public int c;
    public int Delta;

    public void CalcDelta()
    {
        Delta = (b * b) - 4 * a * c;
        System.out.println("(" + b + " * " + b + ")" + " - 4 * " + a + " * " + c + " = " + Delta + "\n");
    }

    public void Raiz()
    {
        if (Delta < 0)
            System.out.println("Não existe raiz real");
        else if (Delta == 0)
            System.out.println("Existe uma raiz real");
        else
            System.out.println("Existe duas raízes real");
    }

}
