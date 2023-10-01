public class game {
    private Scanner scanner =new Scanner(System.in); //sadece busınıf içinde
  public void start(){
      
      System.out.println("MACERA OYUNUNA HOŞGELDİNİZ.");
      System.out.print("LÜTFEN BİR İSİM GİRİNİZ:");
      String playerName=scanner.nextLine();
      Player player=new Player(playerName);
      System.out.println("Sayın "+player.getName()+" Oyuna Hoşgeldiniz");
      System.out.println("Lütfen Bir Karakter Seçiniz: ");
      System.out.println("*************************");
      player.selectChar();
      System.out.println("Karakter Seçimi:"+scanner.nextLine());
  }
  
}
