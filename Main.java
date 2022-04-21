public class Main
{
    public static String reverse(String x, int length){
        int i = 0;
        String ret = "";
        while(i < length){
            ret = x.charAt(i) + ret;
            i++;
        }
    return ret;
  }
	public static void main(String[] args) {
		String result = reverse("race car", 8);
		System.out.println(result);
 		String result2 = reverse("banana", 6);
 		System.out.println(result2);
 	}
}
