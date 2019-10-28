import java.util.ArrayList;

/**
 * @author 文状
 * 用arraylist实现stack
 * 要求入栈、出栈、实现元素大小
 */
public class MyStack {
    private ArrayList list=new ArrayList();
    //判断占是否为空
    public boolean isStackEmpty(){
        return list.isEmpty()?true:false;
    }
    //入栈
    public void push(Object obj){
        list.add(obj);
    }
    //出栈
    public void pop(){
        Object obj=null;
        if(!list.isEmpty()){
            obj=list.get(list.size()-1);
            System.out.println(obj);
            list.remove(obj);
        }else{
            return;
        }
    }
    //获取栈的元素个数
    public int getLength(){
        return list.size();
    }
}
