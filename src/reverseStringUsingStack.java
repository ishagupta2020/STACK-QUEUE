import java.util.Stack;
public class reverseStringUsingStack {
    public static String reverse(String str){
        Stack <Character> stack=new Stack<>();
        char arr[]=str.toCharArray();
        for(char i:arr){
            stack.push(i);
        }
        for(int i=0;i<str.length();i++){
           arr[i] =stack.pop();

        }
        return new String(arr);

    }
    public static void main(String[] args) {
        reverseStringUsingStack obj=new reverseStringUsingStack();
        String str="ABCD";
        String result=reverse(str);
        System.out.println(result);

    }
}
