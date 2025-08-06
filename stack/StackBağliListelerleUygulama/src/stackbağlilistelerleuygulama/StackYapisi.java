
package stackbağlilistelerleuygulama;

public class StackYapisi {
   int size ,cnt;
   Node top;    // en üst düğüm

    public StackYapisi(int size) {
        this.size = size;
        cnt=0;
        top=null;
    }
    
    void push(int data){
        Node eleman =new Node(data);
         if(isFull()){
            System.out.println("stack dolu");}
        else{
             if(isEmpty()){
                 top=eleman;
                 System.out.println("ilk eleman eklendi");
             }
             else{
                 eleman.next=top;
                 top=eleman;
                 System.out.println(top.data+" stacke eklendi");
             }
         }
    cnt++;
            }
    void pop(){
        if(isEmpty()){
            System.out.println("stack bos!!");
        }
        else{
            System.out.println(top.data+" cikartildi");
            top=top.next;
            cnt--;
        }
    }
    boolean isFull(){
       return cnt==size;
   } 
   boolean isEmpty(){
       return cnt==0;
   }
   void TopGöster(){
       if(isEmpty()){
            System.out.println("stack bos!!");
        }
        else{
            System.out.println("top : "+top.data ) ;
   }
}     
   void print(){
       if(isEmpty()){
            System.out.println("stack bos!!");
        }
       else{
           Node temp=top;
           System.out.println("stackdeki veriler\n");
           while(temp!=null){
               System.out.println(temp.data);
               temp=temp.next;
           }
           System.out.println("\n");
       }
   }

}

