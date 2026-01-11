import java.lang.reflect.Array;
import java.util.ArrayList;

 public class arraylistt {

//     public static int Storewater(ArrayList<Integer> height){
//         int maxWater=0;

//         for(int i =0; i<height.size(); i++){
//             for(int j=i+1; j<height.size(); j++){
//                 int ht=Math.min(height.get(i), height.get(j));
//                 int width=j-i;
//                 int currWater=ht*width;
//                 maxWater=Math.max(maxWater, currWater);
//             }
//         }
//         return maxWater;

//     }

    public static int storewater(ArrayList<Integer> height){
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp), height.get(rp));
            int width=rp-lp;
            int currwater=ht*width;
            maxWater=Math.max(maxWater, currwater);

            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
            
        }
        return maxWater;
    }





    
    public static void main(String[] args) {
        //height={1,8,6,2,5,4,8,3,7}
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storewater(height));

    }
}
