import java.util.Stack;
public class Question_1 {
    public static Stack transfer(Stack list1, Stack list2){
        for (int i = 0; i < 5; i++) {
            list1.push(i);
        }
        System.out.println("stack one before popping to Stack Two:"+list1+" Size= "+list1.size());
        while (!list1.isEmpty()){
            list2.push(list1.pop());
        }
        System.out.println("Stack one has popped second stack :"+"Size= "+ list1.size());
        return list2;
    }
    public static void main(String[] args) {
        Stack <Integer> S=new Stack<>();
        Stack <Integer> T=new Stack<>();
        System.out.println(transfer(S,T));

    }
}
