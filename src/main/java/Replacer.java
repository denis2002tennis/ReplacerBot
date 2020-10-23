public class Replacer {
    public static void main(String[] args) {

        String string =""
                +"";
        string = string.replaceAll("\t", "\n");

        System.out.println(string);


    }
    public  String replacer(String string){
        string = string.replaceAll("  ", "\n");
        return string;
    }
}