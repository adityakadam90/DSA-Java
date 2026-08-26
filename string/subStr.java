// public class subStr {
//     public static void main(String args[]){
//         String str = new String("aditya_kadam");
//         for(int i=0;i<str.length()-1;i++){
//             for(int j=i+1;j<str.length();j++){
//                 // System.out.println(str.charAt(i)+""+str.charAt(j));
//                 System.out.println(str.substring(i, j));
//             }
//             System.out.println();
//         }
//     }
// }

public class subStr{
    public static boolean PaiLon(String str){
        int n = str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = new String("racecar");
        int c = 0;
        for(int i=0;i<str.length();i++){
            String temp = "";
            for(int j=i;j<str.length();j++){
                temp += str.charAt(j);
                c++;
                if(PaiLon(temp)){
                    System.out.println(temp);
                }

            }
            // System.out.println();
        }
        System.out.println(c);
    }
}