class practice{
  public static void main(String[] args){
    int a = -1;
    if(a > 0){
      System.out.println("aは正の値です。");
      if(a % 2 == 0){
        System.out.println("aは偶然です。");
      }
    }else{
      if(a == 0){
        System.out.println("aは0です。");
      }else{
        System.out.println("aは負の値です。");
      }
    }
  }
}