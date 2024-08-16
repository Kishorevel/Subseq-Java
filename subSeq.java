public class subSeq {
    public static void main(String[] args){
        allSubsets("","abc");
    }
    static void allSubsets(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        allSubsets(p+c, up.substring(1)); //Left hand side of recursion tree
        allSubsets(p,up.substring(1)); //Right hand side of recursion tree
    }
}
