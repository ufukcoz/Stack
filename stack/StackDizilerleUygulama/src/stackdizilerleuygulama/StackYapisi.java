
package stackdizilerleuygulama;

public class StackYapisi {
   
    int dizi[];   //stack
    int indis,size;

    public StackYapisi(int size) {
        this.size = size;
        dizi=new int[size];
        indis=-1;
    }
    void push(int data){
        if(isFull()){
            System.out.println("stack dolu");}
        else{
            indis++;
            dizi[indis]=data;
            System.out.println("eklenen: "+ dizi[indis]);
        }
        
    }
    int pop(){
      if(!isEmpty()){
          return dizi[indis--];
      }  
      else{
          System.out.println("dizi bos!!");
          
      }
      return -1;
    }
   boolean isFull(){
       return indis==size-1;
   } 
   boolean isEmpty(){
       return indis==-1;
   }
}
