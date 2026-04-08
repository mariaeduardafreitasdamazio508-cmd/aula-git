public class Ex07 {
}

void main() {


    Scanner sc = new Scanner(System.in);
    int notafinal, notarestantes, notarextras, notarmeta;


    notarmeta =7;

    IO.println("qual nota voce tirou");
    notafinal = sc.nextInt();

    if (notafinal == notarmeta) {
        IO.println("Voce conseguiu atingir seu objetivo");


    }else if (notarmeta < notarmeta) {
        IO.println("Voce não atingiu seu objetivo faltam : ");
        notarestantes = notarmeta - notafinal;
        IO.println("faltam" + notafinal);


    }else{

        IO.println("Voce ultrapassou sua meta: ");
        IO.println(notafinal - 40);}}


