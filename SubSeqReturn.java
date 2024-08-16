public class subSeq {
    public static void main(String[] args){
        System.out.println(subSeqRet("","abc"));
    }
    static ArrayList<String> subSeqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }
        char c = up.charAt(0);
        ArrayList<String> left =  subSeqRet(p+c, up.substring(1)); //Left hand side of recursion tree
        ArrayList<String> right =  subSeqRet(p, up.substring(1)); //Right hand side of recursion tree
        left.addAll(right);
        return left;
    }
}
