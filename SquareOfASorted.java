class SquareOfASorted 
{
    public static void main(String args[])
    {
        int nums[]={2,12,3,4,5,-1 };

        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        for (int i = 0; i < nums.length; i++) 
            {
            for (int j=i+1;j<nums.length;j++)
                {
                    if(nums[i]>nums[j])
                    {
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                    }
            }          
            }
            for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]+" ");
        }
    }
}