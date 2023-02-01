class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxi=0;
        int sum=0;
        int i=-1;
        map.put(sum,i);
        while(i<arr.length-1){
            i++; 
            sum+=arr[i];
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            else{
                int length=i-map.get(sum);
                if(length>maxi){
                    maxi=length;
                }
            }
        }
        return maxi;
    }
}
