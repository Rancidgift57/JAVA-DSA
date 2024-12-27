import java.util.stream.StreamSupport;

public  class Stream{
    public static void main(String[] args){
        
        Stream obj = new Stream();
        //obj.skip("","baccag");
        System.out.println(obj.skipstr("abcapplehyt"));

    }

    public void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }

    public String skipstr(String up){
        if(up.isEmpty()){
            return "";
        }
        
        if(up.startsWith("apple")){
            return skipstr(up.substring(5));
        }
        else{
            return up.charAt(0) + skipstr(up.substring(1));
        }
    } 
}