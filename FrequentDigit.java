import java.util.HashMap;
class Main{
  public static int frequentDigit(int [] list){
    HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
    int max = 0;
    int num = 0;
    for(int i = 0; i < list.length; i++){
      if(!count.containsKey(list[i])){
        count.put(list[i],1);
      }
      int value = count.get(list[i]);
      count.replace(list[i], value++);
      if(value > max){
        max = value;
        num = list[i];
      }
    }
  return num;
  }
  public static void main(String[] args) {
    int list[] = {-5,-5,3,3,-5,4,13,-5,11};
      System.out.print(frequentDigit(list));
  }
}