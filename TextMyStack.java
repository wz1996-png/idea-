public class TextMyStack {
    public static void main(String[] args){
        MyStack myStack=new MyStack();
        myStack.push("a");
        myStack.push(2);
        myStack.push("123");
        myStack.push("ahu");
        //System.out.println(myStack.getLength());
        while(!myStack.isStackEmpty()){
            myStack.pop();
        }
    }
}
