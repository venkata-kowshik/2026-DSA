class Duplicates
{
    public static void main(String args[])
    {
        int arr[]={11,11,3,3,12,2,12};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;i<arr.length;i++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
    
}