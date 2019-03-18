public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    if (data.length <= 1)
      return;
    mergesortH(data, 0, data.length - 1);
    
  }
  private static void mergesortH(int[] data, int lo, int hi){
   if(lo > hi)
     return;
    boolean isEven = (hi - lo + 1) % 2 == 0;
  }

}
