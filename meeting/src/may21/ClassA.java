package may21;

public class ClassA {

    public void calculateMaxDiff(){
        int[] arr = {20,3,4,5,6,7,8};

        int max=0;

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                int diff=(arr[i]-arr[j]);
                int positiveDiff=Math.abs(diff);
                if(positiveDiff>max){
                    max=diff;
                }
            }
        }

        System.out.println("Max difference is: "+max);
    }


}

class ClassB{

    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.calculateMaxDiff();
    }
}

