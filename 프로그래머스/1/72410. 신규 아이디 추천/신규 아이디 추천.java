class Solution {
      public String solution(String new_id) {
        String str = new_id;
        str = str.toLowerCase();
        str = str.replaceAll("[^a-z0-9_.-]", "");
        str = str.replaceAll("[.]{2,}", ".");
        str = str.replaceAll("^[.]|[.]$", "");
        if(str.isEmpty()) str = "a";
        if(str.length()>15){
            str = str.substring(0,15);
        }
        str = str.replaceAll("[.]$", "");
        if(str.length()<=2){
            while(str.length()<3){
                str += str.charAt(str.length()-1);
            }
        }
        return str;
    }
}