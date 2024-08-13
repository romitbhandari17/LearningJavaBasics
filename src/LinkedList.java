public class LinkedList {

    public static void main(String[] args) {
        //int[] a = {4,6,2,8,3,9};
        int[] a = {8,6,2,4,3,9};
        int k=2;
        int[] numRemoved = new int[k];
        int[] numRemovedIdx = new int[k];
        int max=a[0];
        int maxIdx=0;
        int curr = 0;
        boolean break_out = false;
        //int cnt=0;
        for(int j=0;j<k;j++){
            ///cnt++;
            curr=0;
            for( int i=0;i< a.length-1;i++){
                break_out=false;
                for( int m=0;m< numRemovedIdx.length;m++) {
                    if(i==numRemovedIdx[m]){
                        break_out=true;
                        break;
                    }
                }
                if(break_out== true)
                    continue;
                if(a[i] > max){
                    max = a[i];
                    maxIdx = i;
                }
                if (a[i] > a[i+1]){
                    if(a[curr] > a[i+1]){
                        curr = i+1;
                        //break;
                    }

                }else {
                    if (a[i] < max && i < maxIdx) {
                        curr = i;
                        //break;
                    }
                }
            }
            numRemoved[j] = a[curr];
            numRemovedIdx[j]=curr;
        }

        for( int i=0;i< numRemoved.length;i++) {
            System.out.println(numRemoved[i]);
        }
    }

}
