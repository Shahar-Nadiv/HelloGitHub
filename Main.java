public class Main{
  public static void main (String[]args){
  int[] arr  = {32, 5 , 7 , 29, 0 , 11};
    System.out.println(toString.insertionSort(arr));
   
  
  
  
  }
  public static void insertionSort(int[] arr){
    int currentKey;
    int j;
    for(int i = 2; i < arr.length; i++){
      cureentKey = arr[i];
      j = i - 1;
      while(j > 0 && arr[j] > currentKey){
      arr[j+1] = arr[j];
      j--;
      }
      arr[j+1] = currentKey;
    }
  
  }
  
  public static stringBuilder toString(int[] arr){
    stringBuilder str = new stringBuilder();
    for(int i = 0; i < arr.length; i++){
      str.append(arr[i]);
    }
    return str;
  }
}
