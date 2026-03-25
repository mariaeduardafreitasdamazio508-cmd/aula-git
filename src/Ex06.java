public class Ex06 {
}

void main() {
    Scanner sc = new Scanner(System.in);
int estudar, horasrestantes, horasextras, estudarmeta;
    estudarmeta = 40;
    IO.println("quantas horas voce estudou hoje");
    estudar = sc.nextInt();

    if (estudar == estudarmeta) {
        IO.println("Voce conseguiu atingir seu objetivo");


    }else if (estudar < estudarmeta) {
        IO.println("Voce não atingiu seu objetivo faltam : ");
        horasrestantes = estudarmeta - estudar;
        IO.println("faltam" + horasrestantes);


    }else{

        IO.println("Voce ultrapassou sua meta: ");
        IO.println(estudar - 40);}}










