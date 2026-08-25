public class repeatCh {
    public static void main(String args[]){
        String str = "adityad";
        int c=1;
        for(int i=0;i<str.length()-1&&c==1;i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    System.out.println("first repeat char is : "+str.charAt(i));
                    c = 0;
                    break;
                }
            }
        }

    }
}