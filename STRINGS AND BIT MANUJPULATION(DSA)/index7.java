public class index7 {
    public static String compression(String str){
        StringBuilder sb=new StringBuilder();
        Integer count=1;
        for (int i = 0; i < str.length(); i++) {
            count=1;
            while (i<str.length()-1&& str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
                
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);

            }

            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="aaaabbcccdddd";
       System.out.println( compression(str));
    }
    
}
