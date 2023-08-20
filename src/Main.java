import java.util.List;

public class Main {
    private static List<Integer>integers=List.of(100, 4, 200, 1, 3, 2,5,6,7,8,-1,0);
    public static void main(String[] args) {
        int theLength = findTheLength(integers);
        System.out.println(theLength);

    }
    private static int findTheLength(List<Integer>integers){
        int count=1;
        List<Integer> integerList = integers.stream().sorted().toList();
        for (int i = 0; i < integerList.size(); i++) {
            int number=integerList.get(i+1)-1;
            if (integerList.get(i)==number){
                count++;

            }else {
                break;
            }

        }
        return count;
    }
}