static void main() {
    Scanner sc = new Scanner(System.in);
    int passos, passosrestantes, passosextras, passometa;

    passometa = 10000;

    IO.println("Digite quantos passos vc deu hoje no total");
    passos = sc.nextInt();

    if (passos == passometa) {
        IO.println("voce atingiu sua meta");


    } else if (passos < passometa) {
        IO.println("Voce não atingiu sua meta falyam");
        passosrestantes = passometa - passos;
        IO.println("faltam" + passosrestantes);

    } else {
        IO.println("Voce ultrapassou sua meta : ");
        IO.println(passos - 10000);


    }
}