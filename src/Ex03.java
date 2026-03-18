static void main() {

    Scanner sc = new Scanner(System.in);
    IO.println("nome(nickname) do jogador");
String nome = sc.nextLine();


    IO.println("jogo favorito");
    String jogo = sc .next();

    IO.println("pontuação atual");
    int pontuacao= sc.nextInt();


    IO.println("informações do jogo game");
    IO.println("seu nome é"+nome);
    IO.println("seu jogo favorito é"+ jogo);
    IO.println("pontuação atual do jogo "+ pontuacao);

}
