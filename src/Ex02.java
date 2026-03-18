static void main() {

Scanner sc = new Scanner(System.in);
    IO.println("nome do cliente");
    String nome = sc.nextLine();


    IO.println("nome do prato escolhido");
    String prato = sc.next();

    IO.println("Valor do prato");
    int valor = sc.nextInt();

    IO.println("informações do prato");
    IO.println("seu nome é" + nome);
    IO.println("seu prato é" + prato);
    IO.println("qual valor é" + valor);
}
