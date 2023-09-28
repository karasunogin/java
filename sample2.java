class sample2{
  public static void main(String[] args){
    int count1 = 0;
    for (; count1 < 5; count1++){//式１を省略
      System.out.print(count1);
  }
  System.out.println(); //改行
  for (int count2 = 0; count2 < 5;){ //式３を省略
    System.out.print(count2++); //処理分内でカウンタ変数の更新
    }
  }
}

//println()は改行され、print()は改行されない