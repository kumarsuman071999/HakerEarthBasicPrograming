import java.util.*;
import java.util.Map.Entry;


public class favouriteSinger {
    public static void main(String[] args){

        Scanner s= new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        String[] arr = s.nextLine().split(" ");
        Map<Long,Long> singerCount = new HashMap<>();
        for(String singerStr:arr){
            long singer =Long.parseLong(singerStr);
            singerCount.put(singer,singerCount.getOrDefault(singer,(long)0)+(long)1);

        }

        long maxCount=0;
        for(long count:singerCount.values()){
            maxCount=Math.max(maxCount,count);
        }

        long favouritessingerCount=0;
        for(long count:singerCount.values()){
            if(maxCount==count){
                favouritessingerCount++;

            }
        }

        System.out.println(favouritessingerCount);




    }
}
