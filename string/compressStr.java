public class compressStr{
    public static void main(String args[]){
        String str = "aaabbbbccccc";
        //String str = "aaaaabbaaabaaccbcbc";not works non consicutive
        System.out.println(str);
        String comp = "";
        for(int i=0;i<str.length();i++){
            //int count = 0;
            // for(int j=0;j<str.length();j++){
            //     if(str.charAt(i) == str.charAt(j)){
            //         count++;
            //     }
                
            // }
            int count = 1;
            while(i < str.length() -1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            comp = comp+str.charAt(i)+count;
        }
        System.out.println(comp);
    }
}