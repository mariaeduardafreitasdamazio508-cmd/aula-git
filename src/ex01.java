void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("Digite seu nome ");
   String nome = sc.nextLine();


    IO.println("Curso que voce está matriculada");
   String curso = sc.next();

    IO.println("Qual é sua idade");
   int idade = sc.nextInt();

    IO.println("Cadastro finalizado");
    IO.println("Seu nome é " + nome);
    IO.println("Seu curso é " + curso);
    IO.println("Sua idade é  " + idade );
}