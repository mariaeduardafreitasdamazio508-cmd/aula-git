static void main() {
   Scanner sc = new Scanner(System.in);
int guardar, reaisrestantes, reaisextras, guardameta;

guardameta = 500;
    IO.println("quantos reais voce guardou hoje");
guardar = sc.nextInt();

if (guardar == guardameta) {
    IO.println("Voce conseguiu atingir seu objetivo");


}else if (guardar < guardameta) {
    IO.println("Voce não atingiu seu objetivo faltam : ");
    reaisrestantes = guardameta - guardar;
    IO.println("faltam" + reaisrestantes);


}else{

    IO.println("Voce ultrapassou sua meta: ");
    IO.println(guardar - 500);}}