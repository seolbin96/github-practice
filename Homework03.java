import java.util.HashMap;

public class Homework03 {
    public static void main(String[] args){
        double score[][] = {{4.3,3.6},{4.3,4.1},{4.0,3.9},{4.2,4.3}};
        HashMap<String,Double> map = new HashMap<String,Double>();
        double max = 0;

        for(int i = 0; i< score.length; i++){
            for(int j = 0; j< score[i].length; j++){
                map.put((i+1)+"학년 "+(j+1)+"학기",score[i][j]);
                if(score[i][j]>=max){
                    max = score[i][j];
                }
            }
        }

        for(String Key : map.keySet()){
            Double value = map.get(Key);
            if(value == max){
                System.out.print(Key+" ");
            }
        }
    }
}
