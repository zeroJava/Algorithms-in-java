package leetcode;

public class AddtwoNumbers {

	public static void main(String[] args)
	{
		AddtwoNumbers ad = new AddtwoNumbers();
		
		ListNode l1 = new ListNode(6);
		ListNode l2 = new ListNode(5);
		
		System.out.println("before " + "l1: " + l1 + " " + "l2: " + l2);
		System.out.println(ad.addTwoNumbers(l1, l2));
		System.out.println("after " + "l1: " + l1 + " " + "l2: " + l2);
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode op = new ListNode(0);
        ListNode list = op;
        ListNode lis1 = l1;
        ListNode lis2 = l2;
        
        int val = 0;
        while(lis1 != null || lis2 != null)
        {
            if(lis1 != null)
            {
                val = val + lis1.val;
                lis1 = lis1.next;
            }
            
            if(lis2 != null)
            {
                val = val + lis2.val;
                lis2 = lis2.next;
            }
            
            list.next = new ListNode(val%10);
            list = list.next;
            val /= 10;
        }
        
        if(val==1) 
        {
            list.next=new ListNode(1);
        }
 
        System.out.println(list + " list ");
        System.out.println(op + " op " + op.next);
        return op.next;
        
        //return list;
    }
	
	private static class ListNode 
	{
		public int val;
		public ListNode next;
		
		public ListNode(int x) 
		{ 
			val = x; 
		}
		
		public String toString()
		{
			return val + "";
		}
	}
}
