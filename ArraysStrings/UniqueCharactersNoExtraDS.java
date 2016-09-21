package ctci.ArraysStrings;

/**
 * Created by sanjanabadam on 7/11/16.
 */
public class UniqueCharactersNoExtraDS {

    public static void main(String args[]){
        String target = "abcdefga";
        int flag = 0;
        for(int i = 0;i<target.length();i++){
            for(int j = i+1;j<target.length();j++){
                if(target.charAt(i) == target.charAt(j)){
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0){
            System.out.println("Unique");
        }
        else
            System.out.println("Not unique");
    }

}
