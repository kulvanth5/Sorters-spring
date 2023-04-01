package sorters;

public class Sorter {
    
    Strategy strategy;

    public void sort(double arr[],Strategy strategy){
        arr = strategy.sort_strategy(arr);
        System.out.println("using sort(arr,strategy)");
        display(arr);
    }

    public void sort(double arr[]){
        arr = strategy.sort_strategy(arr);
        System.out.println("using sort(arr)");
        display(arr);
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void display(double arr[]){
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    public static void main(String args[]){

        Sorter obj = new Sorter();
        double arr[] = {1,8,6,7,6,13,-55,-5};
        
        obj.sort(arr,new merge());

        obj.setStrategy(new bubble());
        obj.sort(arr);
        // obj.display(arr);

        obj.sort(arr,new Insertion());
        // obj.display(arr);
    }
}