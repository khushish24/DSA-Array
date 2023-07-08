import java.util.Arrays;
import java.util.Scanner;
class arrayOperations{
    int[] arr; //instance variable
    int currentSize; //will be just used to keep the track of elements that will come inside
    arrayOperations(int n){
        this.arr=new int[n];
        this.currentSize=0;
    }
    void add(int index,int value){
        // if currentSize is exceeded by index,then it would result in error.
        // we have also provided this condition,to not add the array element dynamically in mid.
        if(currentSize<index){
            throw new RuntimeException("Index can't be greater than currentSize.");
        }
        if(currentSize==arr.length){
            throw new RuntimeException("Array's maximum limit reached.");
        }
        //when we can fix elements.
        for(int i=currentSize-1;i>=index;i--){
            arr[i+1]=arr[i];
            // we now have made the space
        }
        arr[index]=value;
        currentSize++;
    }
    void update(int valueToSearch,int valueToUpdate){
        int up=search(valueToSearch);
        if(up<0){
            System.out.println("Value does not exist to change.");
            return;
        }else{
            arr[up]=valueToUpdate;
            System.out.println("Value Updated.");
        }
    }
    void delete(int index){
        if(currentSize==0){
             throw new RuntimeException("Array doesn't have any element.");
        }
        for(int i=index;i<currentSize;i++){
            arr[i]=arr[i+1];
        }
        arr[currentSize-1]=0; 
        currentSize--;
    }
    int search(int value){
        //following linear search
        for(int i=0;i<currentSize;i++){
            if(value==arr[i]){
                System.out.println("Element Found.");
                return i;
            }
        }
         System.out.println("Element not Found.");
        return -1;
    }
    void sort(){
        Arrays.sort(arr);
        print();
    }
    void maxElement(){
        int max=0;
        for(int i=1;i<currentSize;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        System.out.println(arr[max]);
    }
     void minElement(){
        int min=0;
        for(int i=1;i<currentSize;i++){
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        System.out.println(arr[min]);
    }
    void print(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
public class CRUDArray {
    public static void main(String[] args) {
        arrayOperations obj=new arrayOperations(10);
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1. Add an element.");
            System.out.println("2. Update.");
            System.out.println("3. Delete.");
            System.out.println("4. Print.");
            System.out.println("5.Search.");
            System.out.println("6. Sort.");
            System.out.println("7. Max element.");
            System.out.println("8. Min element.");
            System.out.println("9. Exit.");
            System.out.println("Enter your choice.");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                obj.add(0,100);
                obj.add(1,200);
                obj.add(0,300);
                obj.print();
                break;
                case 2:
                obj.update(100,580);
                obj.print();
                break;
                case 3:
                obj.delete(1);
                obj.print();
                break;
                case 4:
                obj.print();
                break;
                case 5:
                System.out.println(obj.search(300));
                break;
                case 6:
                obj.sort();
                break;
                case 7:
                obj.maxElement();
                break;
                case 8:
                obj.minElement();
                break;
                case 9:
                System.out.println("Exit.");
                return;
            }
            sc.close();
        }

    }
}
